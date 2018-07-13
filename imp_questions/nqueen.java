package imp_questions;

public class nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] arr = new boolean[4][4];
//		arr[0][1] = true;
//		arr[1][3] = true;
//		arr[2][0] = true;

		//System.out.println(isitsafetoplacequeen(3, 2, arr));
int ans=		nqueenscount(arr, 0, "");
	System.out.println(ans);
	}

	public static boolean isitsafetoplacequeen(int row, int col, boolean[][] board) {
		// vertically up
		int rows = row;
		int cols = col;
		while (rows >= 0) {
			if (board[rows][cols]) {
				// System.out.println("vertically up"+rows+" "+cols);
				return false;
			}

			rows--;
		}
		rows = row;
		cols = col;
		// diagonal left
		while (rows >= 0 && cols >= 0) {
			if (board[rows][cols]) {
				// System.out.println("diagonal left");
				return false;
			}

			rows--;
			cols--;
		}
		// diagonal right
		rows = row;
		cols = col;
		while (rows >= 0 && cols < board[0].length) {
			if (board[rows][cols]) {
				// System.out.println("diagonal right");
				return false;
			}

			rows--;
			cols++;
		}
		return true;
	}
	public static void nqueens(boolean board[][],int row,String ans) {
		//base case
		if(board.length==row) {
			System.out.println( ans);
			return ;
		}
		//
		for(int col = 0;col<board[0].length;col++) {

			if(isitsafetoplacequeen(row, col, board)) {
			   board[row][col]=true;
			   nqueens(board, row+1, ans+ "["+row +" "+ col+"]   ");
			   board[row][col]=false;
		   }
		}
		
	}
	 
	public static int nqueenscount(boolean board[][],int row,String ans) {
		//base case
		if(board.length==row) {
			System.out.println( ans);
			return 1 ;
		}
		int count = 0;
		for(int col = 0;col<board[0].length;col++) {
count=0;
			if(isitsafetoplacequeen(row, col, board)) {
			   board[row][col]=true;
			 int ansp=  nqueenscount(board, row+1, ans+ "["+row +" "+ col+"]   ");
			   board[row][col]=false;
		   count+=ansp;
			}
		}
		return count;
	}
	 

}
