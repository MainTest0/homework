package Ex06;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	
	// 플레이어의 방향 상태(enum 타입 사용 데이터의 범주화)
	private PlayerWay pWay;

	// 플레이어에 현재 움직임 상태를 기록
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;

	// 플레이어에 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	// setter 메서드 만들기 left, right

	public Player() {
		initData();
		setInitLayout();
	}

	public PlayerWay getpWay() {
		return pWay;
	}

	public void setpWay(PlayerWay pWay) {
		this.pWay = pWay;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	// setter method
	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public boolean isLeft() {
		return left;
	}

	public boolean isRight() {
		return right;
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");

		left = false;
		right = false;
		up = false;
		down = false;
		leftWallCrash = false;
		rightWallCrash = false;
		pWay = PlayerWay.RIGHT;
	}

	private void setInitLayout() {
		x = 500;
		y = 535;
		// 좌표기반, 라벨에 크기를 지정해야 한다.
		setSize(50, 50);
		setLocation(x, y);
		// JLabel 에 아이콘을 셋팅하는 메서드
		setIcon(playerR);
	}

	@Override
	public void left() {
		pWay = PlayerWay.LEFT;
		left = true;
		// 한번 키보드 왼쪽 방향키를 누르면
		// 쓰레드 생성이 된다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (left) {
					setIcon(playerL);
					x = x - SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
	}

	@Override
	public void right() {
		pWay = PlayerWay.RIGHT;
		right = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (right) {
					setIcon(playerR);
					x = x + SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
	}

	@Override
	public void up() {
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y - JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(4);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for

				up = false;
				down();

			}
		}).start();
	}

	@Override
	public void down() {

		down = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (down) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(4);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					down = false;
				}
			}
		}).start();

		// 상태값 다둘 때는 상황이 변하면 초기화 처리를 잘하자 !!
		// 상태값을 다룰 때는 상황이 변하면 초기화 처리를 잘 해줘야한다.
		// 대각선 이동이 되는 이유
		// 큐라는 개념이 있는데 큐(queue)란?
		// 왼쪽 화살표를 3번 눌렀는데 입력한 값이 이벤트 큐라는곳에 쌓인다
		// 중간에 이벤트 루프라는 녀석이있다. 반복을 돌면서 큐에 값이 있으면 처리해준다(이벤트 핸들링)
		// 맨처음 들어온녀석이 먼저 나간다. FIFO(First In First Out)
		// 쓰레드를 만들지 않았을 때는
		// 대각선 이동할 때 왼쪽누르고 오른쪽 누르게된다. 이벤트 루프에서 처리하는건 하나씩하는데
		// 이게 빠르게 되면서 마치 대각선으로 가는것처럼 보이게 해준다.
		// EventLoop, EnvetQueue

	}

}
