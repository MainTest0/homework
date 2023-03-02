package ch01;

//쓰레드를 만드는 방법
//1. 상속을 활용한 방법(작업자 만들어 보기)
class Worker extends Thread {

	public String name;

	public Worker(String name) {
		this.name = name;
	}

	// 쓰레드를 상속한 클래스이다. 즉 Worker는 Thread이기도 하다 - 다형성

	// 약속 부분
	// start 메서드를 통해서 쓰레드한테 일 시작해라고 명령을 줄 수 있다.
	// 그러면 쓰레드는 run안에 있는 부분을 수행 시킨다. - 라고 약속 되어있다

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Worker : " + name + " : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// end of run
	
	

}