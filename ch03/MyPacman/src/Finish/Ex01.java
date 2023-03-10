package Finish;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex01 extends JFrame{
	
	private BackgroundMap backgroundMap;
	private int mapHeight;
	private int mapWidth;
	private double squareHeight;
	private double squareWidth;
	private final int W = 1;
	private final int F = 2;
	private int[][] back = {
			{W,	W,	W,	W,	W,	W	,	W,	W,	W,	W,	W,	W,	W,	W,	W,	W},	
			{W,	F,		F,		F,		F,		F,		F,		W,	W,	F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		W,	W,	F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		W,	W,	F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		W,	W,	F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		W,	W,	F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		W,	W,	F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		W,	W,	F,		F,		F,		F,		F,		F,		W},	
			{W,	F,		F,		F,		F,		F,		F,		W,	W,	F,		F,		F,		F,		F,		F,		W},	
			{W,	W,	W,	W,	W,	W,	W,	W,	W,	W,	W,	W,	W,	W,	W,	W}
	};
	
	public Ex01() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("배경 찍어보기");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mapHeight = 770;
		mapWidth = 740;
		squareHeight = mapHeight / 16;
		squareWidth = mapWidth / 16;
		backgroundMap = new BackgroundMap();
	}
	
	private void setInitLayout() {
		add(backgroundMap);
		setResizable(false);
		setVisible(true);
	}
	
	class BackgroundMap extends JPanel {
		private Image wall = new ImageIcon("images/wall.png").getImage();
		private Image food = new ImageIcon("images/seed.png").getImage();
		private Image backMap = new ImageIcon("images/backgroundMap.png").getImage();
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(backMap, 0, 0, null);
			for(int i = 0; i < back.length; i++) {
				for(int j = 0; j < back[i].length; j++) {
					if(back[i][j] == W) {
						g.drawImage(wall, 49*j, 51*i, null);
					} else if(back[i][j] == F) {
						g.drawImage(food, 50 * j, 52 * i, null);
//						System.out.println(50 * j + "zz" + 52 * i);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
