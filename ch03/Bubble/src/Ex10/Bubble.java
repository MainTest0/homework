package Ex10;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bubble extends JLabel implements Moveable {

	// 버블의 위치 상태
	private int x;
	private int y;

	// 버블의 움직임 방향 상태
	private boolean left;
	private boolean right;
	private boolean up;

	private int state;

	private ImageIcon bubble; // 기본 물방울
	private ImageIcon bubbled; // 적을 가둔 물방울
	private ImageIcon bomb; // 터진 물방울

	private BubbleFrame mContext; // 적군 범위값
	// 버블은 플레이어에 의존하고있다.
	// 공룡이 있는곳에서 버블이 튀어나가야댐

	private BackgroundBubbleService backgroundBubbleService;

	public Bubble(BubbleFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
		backgroundBubbleService = new BackgroundBubbleService(this);

		initThread();

	}

	private void initData() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");
		left = false;
		right = false;
		up = false;
		state = 0;
	}

	private void setInitLayout() {
		// 플레이어가 있는 위치에 태어나야 한다.
		x = mContext.getPlayer().getX();
		y = mContext.getPlayer().getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	private void initThread() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				if (mContext.getPlayer().getpWay() == PlayerWay.LEFT) {
					// 왼쪽 방향을 보고 있다.
					left();
				} else {
					// 오른쪽 방향을 보고 있다.
					right();
				}
			}
		}).start();
	}

	@Override
	public void left() {
		left = true;
		for (int i = 0; i < 200; i++) { // 사거리 400 제한
			x--;
			setLocation(x, y);
			// 왼쪽 벽이면 반복문 멈춰 break;
			if (backgroundBubbleService.leftWall()) {
				break;
			}
			// 적군이 맞았는지 안맞았는지 감지
			// 범위값 계산해서 +든 -든 절대값을 구해서 처리하고싶다.
			// 적군의 x와 y좌표를 알아야한다.
			// 프레임이 플레이어를 태어나게한다. 버블은 플레이어가 태어나게한다.
			// 버블에다가 적군의 주소값을 가지고 와야한다.
			// 적군의 주소값은 프레임에 만들어놓음
			// 플레이어가 버블을 태어나게할 때 적군의 주소값을 전달
			// 적군을 주소값을 주려면 프레임에서 플에이어로 플레이어에서 버블로 줘야함

			System.out.println("적군 x 위치" + mContext.getEnemy().getX());
			// 절대값 계산
			// 물방울의 x좌표 값이 현재 90 이고
			// 적군의 x좌표 값이 현재 150이다. - 물방울과 적군의 차이값은 60이다. - 안만난 상태
			// 물방울 x좌표값이 100이다. - 차이값은 50이다 - 만났다로 칠거임
			if (Math.abs(x - mContext.getEnemy().getX()) < 10 
					&& Math.abs(y - mContext.getEnemy().getY()) < 50) {
				if (mContext.getEnemy().getState() == 0) {	// 물방울이 적을 지나가면 적이 메모리상에서 사라지게함
					crash();
				}
			}

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void right() {
		right = true;
		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			if (backgroundBubbleService.rightWall()) {
				break;
			}
			if (Math.abs(x - mContext.getEnemy().getX()) < 10 && Math.abs(y - mContext.getEnemy().getY()) < 50) {
				// 적군이 살아있는 상태에만 crash() 호출 시킬 예정
				if (mContext.getEnemy().getState() == 0) {	// 살아있는 상태
					crash();
				}
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void up() {
		up = true;
		while (up) {
			y--;
			setLocation(x, y);
			if (backgroundBubbleService.topWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of while
		clearBubble();
	}

	// 메서드 이름을 지정할 때는 동사, 목적어 이런식으로 이름짓기
	private void clearBubble() {
		try {
			Thread.sleep(2000);
			setIcon(bomb);
			// 0.5초 후 그림 지우기
			Thread.sleep(500);
			setIcon(null);
			// repaint(); // 전부 다시 그려서 부하가 크다.
			// 다른 방법
			// this.setVisible(false); // 화면에만 안보이고 메모리에는 남아있다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void crash() {
		// 0이 살아있는 상태 1이 죽은상태로 만들거임
		mContext.getEnemy().setState(1);
		state = 1;
		setIcon(bubbled);
		// heap 메모리에서는 아직 남아있다. ( 자바에 가비지 컬렉터가 알아서 제거해준다.)
		mContext.remove(mContext.getEnemy());
		mContext.repaint();
	}

}// end of class
