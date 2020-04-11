import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[] arr=new int[n];
		int[] arr1=new int[m];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int j=0;j<m;j++)
			arr1[j]=sc.nextInt();
		
		int[] sol=new int[n+m];
		
		int i=0,j=0,k=0;
		while(i<n && j<m) {
			
			if(arr[i]<=arr1[j]) {
				sol[k]=arr[i];
				i++;
				k++;
			}
			else {
				sol[k]=arr1[j];
				j++;
				k++;
			}
			
		}
		while(i<n) {
			sol[k]=arr[i];
			k++;
			i++;
		}
		while(j<m) {
			sol[k]=arr1[j];
			k++;
			j++;
		}
		
		for(i=0;i<n+m;i++)
			System.out.println(sol[i]);
		
	}
	
}
