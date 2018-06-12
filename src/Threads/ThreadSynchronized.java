package Threads;

public class ThreadSynchronized {
	private static int count = 0;
	public static synchronized void addCount() {
		count++;
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10000;i++) {
					addCount();
				}
			}
			});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10000;i++) {
					addCount();
				}
			}
			});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
		}
	

}
