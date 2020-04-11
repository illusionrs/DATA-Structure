import java.util.*;
public class Sudoku {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] board=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				board[i][j]=sc.nextInt();
		}
		boolean[][] fixedcells=new boolean[n][n];
	    fixedTF(board,fixedcells,n);
	    if(Sol(board,fixedcells,0,0,n))
	    {
	    	printBoard(board);
	    }

	}
	public static void printBoard(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static boolean Sol(int[][] board,boolean[][] fixedcells,int row,int col,int n) {
		
		if(row==n)
			return true;
		if(col==n)
			return Sol(board,fixedcells,row+1,0,n);
		
		if(fixedcells[row][col])
			return Sol(board,fixedcells,row,col+1,n);	
		
			for(int i=0;i<=n;i++) {
			if(canplace(board,row,col,n,i))
			{
				board[row][col]=i;
				boolean chck=Sol(board,fixedcells,row,col+1,n);
				if(chck)
					return true;
				else
					board[row][col]=0;
			}
			
			}
		
		return false;
	}
	public static boolean canplace(int[][] board,int row,int col,int n,int setnum) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == setnum) {
				return false;
			}
			if (board[row][i] == setnum) {
				return false;
			}
		}

		// check number present in cells
		int sqrtN = (int) Math.sqrt(board.length);
		int startRow = (row / sqrtN) * sqrtN;
		int startCol = (col / sqrtN) * sqrtN;
		for (int i = startRow; i < startRow + sqrtN; i++) {
			for (int j = startCol; j < startCol + sqrtN; j++) {
				if (board[i][j] == setnum) {
					return false;
				}
			}
		}

		return true;
	}

	
	public static void fixedTF(int[][] board,boolean[][] cells,int n){
		
		for(int i=0;i<n;i++ ) {
			for(int j=0;j<n;j++)
				if(board[i][j]!=0)
				  cells[i][j]=true;
		}
		
		
	}
}

