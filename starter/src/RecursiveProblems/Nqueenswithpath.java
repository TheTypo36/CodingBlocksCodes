package RecursiveProblems;

import java.util.*;

public class Nqueenswithpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=row;
		boolean[][] board=new boolean[row][col];
		printNQueens(board, 0, "");
		System.out.println();
		System.out.println(countNQueens(board, 0));
		
	}
	public static void printNQueens(boolean[][]board,int row,String result) {
		
		if(board.length==row) {
			System.out.print(result);
			return;
		}
	  for(int col=0;col<board[row].length ;col++) {
		  if(isItSafe(board, row, col)) {
			  board[row][col]=true;
		     printNQueens(board, row+1,result+"{"+(row+1)+"-"+(col+1)+"} ");
		    board[row][col]=false;
		  }
	  }
	  
	}
	public static int countNQueens(boolean[][] board, int row) {
		int count=0;
		if(board.length==row) {
			return 1;
		}
	  for(int col=0;col<board[row].length ;col++) {
		  if(isItSafe(board, row, col)) {
			  board[row][col]=true;
		    count=count+ countNQueens(board, row+1);
		    board[row][col]=false;
		  }
	  }
	  return count;
	  
	  }
	public static boolean isItSafe(boolean[][] board, int row, int col) {
		int i,j;
		for( i=row;i>=0;i--) {
			if(board[i][col]==true) {
				return false;
			}
		}
			for( i=row, j=col;i>=0&&j>=0;i--,j--) {
				if(board[i][j]==true) {
					return  false;
				}
			}
			for(i=row,j=col;i>=0&&j<board.length ;i--,j++) {
				if(board[i][j]==true) {
					return  false;
				}
			}
			return true;
			
		
	}

}


