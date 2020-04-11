
public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sol(0,0,2,2,"");
        SolD(0,0,2,2,"");

	}
	
	public static void Sol(int cr,int cc, int er,int ec,String s) {
		
		if(cr==er && cc==ec) {
			System.out.println(s);
			return;
		}
		if(cr>er || cc>ec) {
			return;
		}
		Sol(cr+1,cc,er,ec,s+"H");
		Sol(cr,cc+1,er,ec,s+"V");// this is for only if we travel horizontal and diagonal
	}
    public static void SolD(int cr,int cc, int er,int ec,String s) {
		
		if(cr==er && cc==ec) {
			System.out.println(s);
			return;
		}
		if(cr>er || cc>ec) {
			return;
		}
		SolD(cr,cc+1,er,ec,s+"H");
		SolD(cr+1,cc,er,ec,s+"V");
		SolD(cr+1,cc+1,er,ec,s+"D");// this for when we can move horizontal,diagonal 
	                               	//and vertical
    }

}
