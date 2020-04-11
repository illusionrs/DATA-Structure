import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Sort(arr,0,0);
         for(int i=0;i<n;i++)
        	 System.out.print(arr[i]+" ");
	}
	public static int[] Sort(int[] arr,int min,int i) {
		
		
		if(i==arr.length-1) {
			return arr ;
		}
		min=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[min]>arr[j])
			{
				min=j;
			}
		}
		if(i!=min) {
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		  return Sort(arr,min,i+1);
	}
}
