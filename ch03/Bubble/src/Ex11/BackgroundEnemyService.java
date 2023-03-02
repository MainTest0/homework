package Ex11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

// 메인 화면에 그림 그려 주고 있고, 키보드 이벤트 리스너 받고있음 -바쁨
// 백그라운드에서 계속 player의 움직임을 관찰하는 녀석의 기능을 줄거임
public class BackgroundEnemyService implements Runnable {

	private BufferedImage image;
	private Enemy enemy;
	
	private int JUMPCOUNT = 0;
	private int FIRST = 0;	//바닥도착 여부 확인( 0이면 도착 꼭대기면 1번)
	private int BOTTOMCOLOR;

	public BackgroundEnemyService(Enemy enemy) {
		this.enemy = enemy;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스객체에 사용하는 이미지 경로 및 파일명 확인!");
		}
	}

	@Override
	public void run() {
		// enemy가 살아있을 때에만 while문을 돌림
		while (enemy.getState() == 0) {
			// 색상 확인
			// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고
			// 오른쪽으로 갈 때는 역시나 기준 좌표 지점을 보정해야 한다.

			// 기준 왼쪽, // 기준 오른쪽
			Color leftColor = new Color(image.getRGB(enemy.getX() + 5, enemy.getY() + 25));
			Color rightColor = new Color(image.getRGB(enemy.getX() + 60, enemy.getY() + 25));

			// 바닥 충돌 감지 기능
			// Color bottomColorleft = new Color(image.getRGB(player.getX() + 10,
			// player.getY() + 60));
			int bottomColorleft = image.getRGB(enemy.getX() + 10, enemy.getY() + 50);
			// -655356, -1677696 -1
			int bottomColorRight = image.getRGB(enemy.getX() + 55, enemy.getY() + 50);
			System.out.println("bottomColorLeft : " +bottomColorleft);
			System.out.println("bottomColorRight : " +bottomColorRight);
			// -1이 공중인 상태 -1 + -1 = 파란색도 아니고 빨간색도 아니다 -> 공중에 뜬상태 down으로 떨궈줌
			if(bottomColorleft + bottomColorRight != -2) {
				enemy.setDown(true);
			} else {
				enemy.setLeft(false);
				enemy.setDown(true);
			}

			// 외벽 충돌 확인
			// 꼭대기 도착
			//if()
				
			// 오른쪽 구석
				
			// 왼쪽 구석
			
		} // end of while
	}// end of run

}
