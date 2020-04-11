import java.util.Scanner;
import java.util.ArrayList;
//It will print only distinct substring

public class AllSub {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();

		String s=sc.nextLine();
		String s1="";
		
		Print(s,0,1,al);
	}
	public static void Print(String s,int i,int j,ArrayList al) {
		
		if(i==s.length()) {
			return ;
		}
		if(j<=s.length()) {
			
			if(al.contains(s.substring(i,j))==false) {
			 System.out.println(s.substring(i,j));
			     al.add(s.substring(i,j));
			  }
			 Print(s,i,j+1,al);
		}
		Print(s,i+1,i+1,al);
	}

}
