package QueueArray;

public class QueueArray {
	private int[] data;
	private int size;
	private int front;
	public QueueArray(int cap)
	{
		data=new int[cap];
		this.front=0;
		this.size=0;
	}
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return this.size()==0;
	}
	
	public void enqueue(int val) throws Exception {
		if(this.size()==this.data.length) {
			throw new Exception("Queue is full");
		}
		int a=(this.front+this.size)%this.data.length;
		this.data[a]=val;
		this.size++;
				
	}
	public int dequeue() throws Exception{
    	if(this.size()==0) {
    		throw new Exception("Queue is Empty");
    	}
    	
    	int rv=this.data[this.front];
    	this.data[this.front]=0;
    	this.front=(this.front+1)%this.data.length;
    	this.size--;
    	return rv;
    }
	public void display() {
    	for(int i=0;i<this.size;i++) {
    		int ai=(this.front+i)%this.data.length;
    		System.out.print(this.data[ai]+"=>");
    	}
    	
    	System.out.println("END");
    }
	public int getFront() {
		return this.data[this.front];
	}
	public static void reverseQueue(QueueArray queue) throws Exception{ 
		
		// Write your Code here
		if(queue.isEmpty())
		return;
		int d=queue.getFront();
		queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(d);
	     	
		
	} 

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueArray q=new QueueArray(3);
		
		
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.display();
	       

	}

}
