package Threads;

class ThreadExtendDemo extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThreadExtend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExtendDemo threadExtendDemo = new ThreadExtendDemo();
		threadExtendDemo.start();
		ThreadExtendDemo threadExtendDemo1 = new ThreadExtendDemo();
		threadExtendDemo1.start();
	}

}
