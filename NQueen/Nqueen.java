import java.util.Scanner;

public class Nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[][] arr=new int[n][n];
		
		System.out.print(Solve(arr,0,n));
		

	}
	public static boolean Safe(int[][] arr,int i,int j,int n) {
		
		// for all upper columns
		for(int row=0;row<i;row++)
		{
			if(arr[row][j]==1)
				return false;
		}
		
		// for left diagonal
		
		int x=i;
		int y=j;
		
		while(x>=0 && y>=0) {
			if(arr[x][y]==1)
				return false;
			
			x--;
			y--;
		}
		
		//for right diagnoal
		
		x=i;
		y=j;
		while(x>=0 && y<n) {
			
			if(arr[x][y]==1)
				return false;
			x--;
			y++;
		}
		
		return true;
		
	}
	
	public static boolean Solve(int[][] arr,int i,int n) {
		
		if(i==n) {
			
			
			for(int x=0;x<n;x++) {
				for(int y=0;y<n;y++) {
					if(arr[x][y]==1)
						System.out.print("Q ");
					else
						System.out.print("_ ");
				}
				System.out.println();
			}
			System.out.println();
			
			return true;
		}
		for(int j=0;j<n;j++) {
			
			if(Safe(arr,i,j,n)) {// if it will be true then it will assign it 1
				arr[i][j]=1;
				
				/*boolean notp=Solve(arr,i+1,n);
				
				if(notp) {
					return true;
				}*/
				Solve(arr,i+1,n);
				arr[i][j]=0;
			}
			//If not possible for next queen to keep then what;
			
			
		}
		
		return false;
		
	}

}
