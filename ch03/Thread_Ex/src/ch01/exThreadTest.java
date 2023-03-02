package ch01;

public class exThreadTest {

	public static void main(String[] args) {
		WorkerClass wc = new WorkerClass();
		WorkerClass wc1 = new WorkerClass();
		System.out.println("-------시작-------------");
		wc.run();
		wc1.start();
		System.out.println("-------종료-------------");
	}
}

class WorkerClass extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}