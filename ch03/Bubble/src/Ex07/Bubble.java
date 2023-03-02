package Ex07;

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

	// 적군을 맞춘 상태 -> 0번 기본, 1번 적을 가둔 물방울
	private int state;

	private ImageIcon bubble; // 기본 물방울
	private ImageIcon bubbled; // 적을 가둔 물방울
	private ImageIcon bomb; // 터진 물방울

	// 버블은 플레이어에 의존하고있다.
	// 공룡이 있는곳에서 버블이 튀어나가야댐
	private Player player;
	private BackgroundBubbleService backgroundBubbleService;
	
	public Bubble(Player player) {
		this.player = player;
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
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	private void initThread() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				if (player.getpWay() == PlayerWay.LEFT) {
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
		for (int i = 0; i < 400; i++) { // 사거리 400 제한
			x--;
			setLocation(x, y);
			// 왼쪽 벽이면 반복문 멈춰 break;
			if(backgroundBubbleService.leftWall()) {
				break;
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
			if(backgroundBubbleService.rightWall()) {
				break;
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
			if(backgroundBubbleService.topWall()) {
				break;
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
