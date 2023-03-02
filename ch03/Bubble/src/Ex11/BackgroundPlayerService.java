package Ex11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

// 메인 화면에 그림 그려 주고 있고, 키보드 이벤트 리스너 받고있음 -바쁨
// 백그라운드에서 계속 player의 움직임을 관찰하는 녀석의 기능을 줄거임
public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스객체에 사용하는 이미지 경로 및 파일명 확인!");
		}
	}

	@Override
	public void run() {
		while (true) {
			// 색상 확인
			// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고
			// 오른쪽으로 갈 때는 역시나 기준 좌표 지점을 보정해야 한다.

			// 기준 왼쪽, // 기준 오른쪽
			Color leftColor = new Color(image.getRGB(player.getX() + 5, player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));

			// 바닥 충돌 감지 기능
			// Color bottomColorleft = new Color(image.getRGB(player.getX() + 10,
			// player.getY() + 60));
			int bottomColorleft = image.getRGB(player.getX() + 10, player.getY() + 50);
			System.out.println(bottomColorleft);
			// -655356, -1677696 -1
			int bottomColorRight = image.getRGB(player.getX() + 55, player.getY() + 50);
			// 하얀색이 아니면 바닥이다.
			if (bottomColorleft + bottomColorRight != -2) {
				player.setDown(false);
				// 바닥이면 isDown --> true
			} else {
				// 점프하는 순간 bottomColorLeft -> -1이 된다.
				// 위 화살표를 누르면 현재 65번 반복 돌면서 y값을 -해서
				// 이미지를 위로 올리고 있고 현재 y 좌표에서 + 130 좌표 올리고 -> down메서드 호출
				// 올라가는 동시에 위 + 위 + 위 누르면 계속 쓰레드가 생성되서 65*3번 반복하게 된다.
				if (!player.isUp() && !player.isDown()) {
					// 다운 메서드가 한번 호출 되야한다.
					player.down();
				}
			}

			if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				player.setRight(false);
				player.setRightWallCrash(true);
			} else if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				player.setLeft(false);
				player.setLeftWallCrash(true);
			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}

		} // end of while
	}

}
