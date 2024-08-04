package com.snake;

import javax.swing.JFrame;

public class Snake {

	public static void main(String[] args) {
		int boardWidth = 600;
		int boardHeight = boardWidth;
		
		JFrame snakeFrame = new JFrame("Snake game");
		snakeFrame.setVisible(true);
		snakeFrame.setSize(boardWidth, boardHeight);
		snakeFrame.setLocationRelativeTo(null);
		snakeFrame.setResizable(false);
		snakeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
		snakeFrame.add(snakeGame); 
		snakeFrame.pack();
		snakeGame.requestFocus();
	}

}
