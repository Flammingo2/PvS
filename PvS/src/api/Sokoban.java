package api;

import java.util.Arrays;

public class Sokoban {

	public Sokoban() {
		// TODO Auto-generated constructor stub
	}
	
	//returns position of player on board handed over
	public static Pair<Integer, Integer> findPlayer(char[][] board) {
		 for(int x = 0; x < (board[0].length); x++) {
			 for(int y = 0; y < (board[1].length); y++) {
				 if(board[x][y] == '@') {
					 return new Pair<Integer, Integer>(x,y);
				 }
			 }
		 }
		 return new Pair<Integer,Integer>(null, null);
	}
	
	//moves player one field up if possible and returns true, if not possible board remains unchanged and false is returned
	public static boolean move(char[][] board, int direction) {
		//get position of player
		Pair<Integer,Integer> posPlayer = findPlayer(board);
		int xPlayer = posPlayer.getFirst();
		int yPlayer = posPlayer.getSecond();
		
		//1: north, 2: east, 3: south, 4: west
		int x1Step = 0;
		int y1Step = 0;
		int x2Step = 0;
		int y2Step = 0;
		switch (direction) {
		case 1:
			x1Step = xPlayer-1;
			y1Step = yPlayer;
			x2Step = xPlayer-2;
			y2Step = yPlayer;
			break;
		case 2:
			x1Step = xPlayer;
			y1Step = yPlayer+1;
			x2Step = xPlayer;
			y2Step = yPlayer+2;
			break;
		case 3:
			x1Step = xPlayer+1;
			y1Step = yPlayer;
			x2Step = xPlayer+2;
			y2Step = yPlayer;
			break;
		case 4:
			x1Step = xPlayer;
			y1Step = yPlayer-1;
			x2Step = xPlayer;
			y2Step = yPlayer-2;
			break;
		}
		
		//check if player can move (either free field or box with free field above)
		if(board[x1Step][y1Step] == '.') {
			//update player position
			board[xPlayer][yPlayer] = '.';
			board[x1Step][y1Step] = '@';
			return true;
		}else if (board[x1Step][y1Step] == '$' &&
				 board[x2Step][y2Step] == '.') {
			//update player position and box position
			board[xPlayer][yPlayer] = '.';
			board[x1Step][y1Step] = '@';
			board[x2Step][y2Step] = '$';
			return true;
		}else {
			return false;
		}	
	}
	
	
//	//moves player one field up if possible and returns true, if not possible board remains unchanged and false is returned
//	public boolean moveNorth(char[][] board) {
//		//get position of player
//		Pair<Integer,Integer> posPlayer = findPlayer(board);
//		//check if player can go north (either free field or box with free field above)
//		if(board[posPlayer.getFirst()][posPlayer.getSecond()-1] == '.') {
//			//update player position
//			board[posPlayer.getFirst()][posPlayer.getSecond()] = '.';
//			board[posPlayer.getFirst()][posPlayer.getSecond()-1] = '@';
//			return true;
//		}else if (board[posPlayer.getFirst()][posPlayer.getSecond()-1] == '#' &&
//				 board[posPlayer.getFirst()][posPlayer.getSecond()-2] == '.') {
//			//update player position and box position
//			board[posPlayer.getFirst()][posPlayer.getSecond()] = '.';
//			board[posPlayer.getFirst()][posPlayer.getSecond()-1] = '@';
//			board[posPlayer.getFirst()][posPlayer.getSecond()-2] = '#';
//			return true;
//		}else {
//			return false;
//		}
//		
//	}
	
	//Returns string portraying the current board
	public static String sokobanToString(char[][] board) {
		String string = "board: \n";
		for(int i = 0; i < board.length; i++) {
			string = string + Arrays.toString(board[i]).replace(",", "").replace(" ", "").replace("[", "").replace("]", "") + "\n";
		}
		return string;
	}
	
	

}
