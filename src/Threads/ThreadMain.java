package Threads;

public class ThreadMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
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
		});
		t1.start();
	}

}
