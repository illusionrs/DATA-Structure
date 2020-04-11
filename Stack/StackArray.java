
public class StackArray {
	
	
	private int[] data;
	int tos;
	
	StackArray(int cap) throws Exception
	{
		if(cap<=0)
			throw new Exception("Invalid size");
		this.data=new int[cap];
		this.tos=-1;
		
	}
	public int size()
	{
		return this.tos+1;
	}
	public boolean isEmpty()
	{
		return this.size()==0;
	}
	public void Push(int d) throws Exception
	{
		if(this.size()==this.data.length)
			throw new Exception("Overflow");
		this.tos++;
		this.data[tos]=d;
	}
	public int Pop() throws Exception
	{
		if(this.isEmpty())
			throw new Exception("underflow");
		int d=this.data[this.tos];
		this.data[this.tos]=0;
		tos--;
		return d;
	}
	public int Peek() throws Exception
	{
		if(this.isEmpty())
			throw new Exception("underflow");
		return this.data[this.tos];
		
	}
	
	public void Display()
	{
		for(int i=this.tos;i>=0;i--)
			System.out.print(this.data[i]+" ");
	}
	public void Reverse()
	{
		int i=0;
		int j=this.tos;
		while(i<j)
		{
			int t=this.data[i];
			this.data[i]=this.data[j];
			this.data[j]=t;
			i++;
			j--;
		}
	}

	public static void main(String[] args) throws Exception {
		StackArray ob =new StackArray(5);
		ob.Push(5);
		ob.Push(6);
		ob.Push(4);
		ob.Push(7);
		ob.Push(3);
		ob.Display();
		ob.Pop();
		System.out.println();
		ob.Display();
		ob.Reverse();
		ob.Push(3);
		System.out.println();
		ob.Display();

	}

}
