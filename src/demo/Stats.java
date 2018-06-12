package demo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
public class Stats {
    public static class StatisticsAggregatorImpl implements StatisticsAggregator {

        private ConcurrentHashMap<String, ArrayList<Double>> symbolPriceHash = new ConcurrentHashMap<>();

        private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

        private WriteLock writeLock = lock.writeLock();

        private ReadLock readLock = lock.readLock();

        @Override
        public void putNewPrice(String symbol, double price) {
            try {
                writeLock.lock();
                ArrayList<Double> array = symbolPriceHash.get(symbol);
                if (array == null) {
                    array = new ArrayList<Double>();
                    symbolPriceHash.put(symbol, array);
                }
                array.add(price);
            } finally {
                writeLock.unlock();
            }
        }



        @Override
        public int getTickCount(String symbol) {
            readLock.lock();
            try {
                return (symbolPriceHash.get(symbol)).size();
            } finally {
                readLock.unlock();
            }
        }


        @Override
        public double getAveragePrice(String symbol) {
            readLock.lock();
            try {
                double x= (symbolPriceHash.get(symbol)).stream()
                                                    .reduce(Double::sum)
                                                    .get();
                int y=getTickCount(symbol);
                return x/y;
            } finally {
                readLock.unlock();
            }
        }
 }
////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////
public interface StatisticsAggregator {
// This is an input. Make note of this price.
public void putNewPrice(String symbol, double price);
// Get the average price
public double getAveragePrice(String symbol);
// Get the total number of prices recorded
public int getTickCount(String symbol);
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
while (scanner.hasNext()) {
final StatisticsAggregator stats = new StatisticsAggregatorImpl();
final Set<String> symbols = new TreeSet<>();
String line = scanner.nextLine();
String[] inputs = line.split(",");
int threads = Integer.parseInt(inputs[0]);
ExecutorService pool = Executors.newFixedThreadPool(threads);
for (int i = 1; i < inputs.length; ++i) {
String[] tokens = inputs[i].split(" ");
final String symbol = tokens[0];
symbols.add(symbol);
final double price = Double.parseDouble(tokens[1]);
pool.submit(new Runnable() {
@Override
public void run() {
stats.putNewPrice(symbol, price);
}
});
}
pool.shutdown();
try {
pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
} catch (InterruptedException e) {
e.printStackTrace();
}
for (String symbol : symbols) {
System.out.println(
String.format("%s %.4f %d", symbol, stats.getAveragePrice(symbol), stats.getTickCount(symbol)));
}
}
scanner.close();
}
}