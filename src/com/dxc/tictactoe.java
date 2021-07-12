package com.dxc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class tictactoe {
	
	static List<Integer> userList = new ArrayList<Integer>();
	static List<Integer> cpuList = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = {
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}
		};
		printTicTacToe(board);
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter your placement (1-9)");
			int num = scan.nextInt();
			while (userList.contains(num) || cpuList.contains(num) || num<1 || num>9) {
				System.out.println("Invalid Number! Enter a number (1-9)");
				num = scan.nextInt();
			}
			System.out.println(num);
			playerTurn(num, board, "USER");
			printTicTacToe(board);
			String winnerResults = checkWinner();
			if (winnerResults.length() > 0) {
				System.out.println(winnerResults);
				break;
			}
			
			Random rand = new Random();
			int cpuNum = rand.nextInt(9) + 1;
			while (userList.contains(cpuNum) || cpuList.contains(cpuNum)) {
				cpuNum = rand.nextInt(9) + 1;
			}
			System.out.println(cpuNum);
			playerTurn(cpuNum, board, "CPU");
			printTicTacToe(board);
			winnerResults = checkWinner();
			if (winnerResults.length() > 0) {
				System.out.println(winnerResults);
				break;
			}
		}
		scan.close();
		
	}
	
	public static void playerTurn(int num, char[][]board, String player) {
		char letter = 'X';
		if (player.equals("USER")) {
			letter = 'X';
			userList.add(num);
		} else if (player.equals("CPU")){
			letter = 'O';
			cpuList.add(num);
		}
		switch(num) {
		case 1:
			board[0][0] = letter;
			break;
		case 2:
			board[0][2] = letter;
			break;
		case 3:
			board[0][4] = letter;
			break;
		case 4:
			board[2][0] = letter;
			break;
		case 5:
			board[2][2] = letter;
			break;
		case 6:
			board[2][4] = letter;
			break;
		case 7:
			board[4][0] = letter;
			break;
		case 8:
			board[4][2] = letter;
			break;
		case 9:
			board[4][4] = letter;
			break;
		
		}
		
	}

	private static void printTicTacToe(char[][] board) {
		// TODO Auto-generated method stub
		
		for (char[] row: board) {
			for (char l : row) {
				System.out.print(l);
			}
			System.out.println();
		}
		
	}
	
	private static String checkWinner() {
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List botRow = Arrays.asList(7,8,9);
		List leftCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rightCol = Arrays.asList(3,6,9);
		List diag1 = Arrays.asList(1,5,9);
		List diag2 = Arrays.asList(3,5,7);
		
		List<List> winningList = new ArrayList<List>();
		winningList.add(topRow);
		winningList.add(midRow);
		winningList.add(botRow);
		winningList.add(leftCol);
		winningList.add(midCol);
		winningList.add(rightCol);
		winningList.add(diag1);
		winningList.add(diag2);
		
		for(List l : winningList) {
			if (userList.containsAll(l)) {
				return "User won!";
			} else if (cpuList.containsAll(l)){
				return "CPU won!";
			}
		}
		if (userList.size() + cpuList.size() == 9) {
			return "Game tie";
		}
		
		return "";
	}
	
	

}
