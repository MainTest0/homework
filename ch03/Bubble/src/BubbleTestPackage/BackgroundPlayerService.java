package BubbleTestPackage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일 경로 확인");
		}
	}

	@Override
	public void run() {
		while (true) {
			Color leftColor = new Color(image.getRGB(player.getX()+5, player.getY()+25));
			Color rightColor = new Color(image.getRGB(player.getX()+60, player.getY()+25));

			int bottomColorLeft = image.getRGB(player.getX()+10, player.getY()+50);
			int bottomColorRight = image.getRGB(player.getX()+55, player.getY()+50);

			if (bottomColorLeft + bottomColorRight != 2) {
				player.setDown(false);
			} else {
				if (!player.isUp() && !player.isDown()) {
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
