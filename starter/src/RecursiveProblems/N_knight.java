package RecursiveProblems;

import java.util.Scanner;

public class N_knight {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		boolean[][] board=new boolean[row][row];
			System.out.println(countN_knight(board, 0));
			printNknight(board, 0, "");
	}
	   private static boolean isItSafe(boolean[][] board, int row, int col) {
	        if (isValidPosition(row - 2, col - 1, board.length) && board[row - 2][col - 1]) {
	            return false;
	        } else if (isValidPosition(row - 2, col + 1, board.length) && board[row - 2][col + 1]) {
	            return false;
	        } else if (isValidPosition(row - 1, col - 2, board.length) && board[row - 1][col - 2]) {
	            return false;
	        } else if (isValidPosition(row - 1, col + 2, board.length) && board[row - 1][col + 2]) {
	            return false;
	        } else if (isValidPosition(row + 1, col - 2, board.length) && board[row + 1][col - 2]) {
	            return false;
	        } else if (isValidPosition(row + 1, col + 2, board.length) && board[row + 1][col + 2]) {
	            return false;
	        } else if (isValidPosition(row + 2, col - 1, board.length) && board[row + 2][col - 1]) {
	            return false;
	        } else if (isValidPosition(row + 2, col + 1, board.length) && board[row + 2][col + 1]) {
	            return false;
	        }

	        return true;
	    }
	   public static boolean isValidPosition(int row, int col, int N) {
	        return row >= 0 && row < N && col >= 0 && col < N;
	    }
	public static int countN_knight(boolean[][] board, int row) {
		int count=0;
		if(board.length==row) {
			return 1;
		}
	  for(int col=0;col<board[row].length ;col++) {
		  if(isItSafe(board, row, col)) {
			  board[row][col]=true;
		    count=count+ countN_knight(board, row+1);
		    board[row][col]=false;
		  }
	  }
	  return count;
	  
	  }
public static void printNknight(boolean[][]board,int row,String result) {
		
		if(board.length==row) {
			System.out.println(result);
			return;
		}
	  for(int col=0;col<board[row].length ;col++) {
		  if(isItSafe(board, row, col)) {
			  board[row][col]=true;
		     printNknight(board, row+1,result+"{"+(row)+"-"+(col)+"} ");
		    board[row][col]=false;
		  }
	  }
	  
	}
}
