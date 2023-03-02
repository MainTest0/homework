package Ex11;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 별 5개짜리 main을 가지는 클래스는 프로그램에 사용하는 참조 변수를 다 할 수 있다.
public class BubbleFrame extends JFrame {

	// this=주소값을 변수에 잠시 담아두는 것
	private BubbleFrame mContext = this;

	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();

		// player 메모리에 올라간 상태이다.
		// 약속 : run 메서드안에 동작을 처리한다.
		new Thread(new BackgroundPlayerService(player)).start();
		new Thread(new BackgroundEnemyService(enemy)).start();
	}

	public Player getPlayer() {
		return player;
	}

	public Enemy getEnemy() {
		return enemy;
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);
		setSize(1000, 640);

		// 1. 부모의 주소값을 자식 객체한테 던져주기 -> 부모의 기능을 호출할 수 있다.
		// 2. 콜백 메서드를 활용해서 구현할 수 있다.
		player = new Player(mContext);
		// 적군 생성
		enemy = new Enemy();
	}

	private void setInitLayout() {
		setLayout(null); // 좌표 기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);

		add(enemy);
		add(player);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 누르는만큼 빨라짐(버그)
					// 여러번 누르더라도 한번만 호출되게 방어적 코드 작성
					if (!player.isLeft() && player.isLeftWallCrash() == false) { // (player.isLeft() == false)랑 같은코드
						player.left();
					}
					break;
				case KeyEvent.VK_RIGHT:
					if (!player.isRight() && player.isRightWallCrash() == false) {
						player.right();
					}
					break; // 세미콜론
				case KeyEvent.VK_UP:
					// 플레이어가 up이 false일 때 수행시키고 싶다.
					// 플레이어가 down이 false일 때 수행시키고 싶다.
					if (!player.isUp() && !player.isDown()) {
						player.up();
					}
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				case KeyEvent.VK_SPACE:
					player.attack();
					// 1번 기본 물방울
					// 지울게요 Bubble bubble = new Bubble(player);
					// player attack 하면 버블 나오는걸로 바꾸고싶음
					// 지울게요 add(bubble);
					break;
				}
			}// end of pressed

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽 버튼을 떼면 player는 멈춰야 해
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					// 오른쪽 버튼을 떼면 player는 멈춰야 해
					player.setRight(false);
					break;
				}
			}

		});

	}

// ***** 자바 프로그램 중 메인 함수를 가지는 클래스는
// 프로그램에서 사용하는 모든 참조값을 접근 할 수 있다.

	public static void main(String[] args) {
		new BubbleFrame();
	} // end of main
} // end of class
