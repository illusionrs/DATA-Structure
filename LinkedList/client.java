package LinkedList;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();

//		list.addFirst(20);
//		list.addFirst(10);

		    list.addLast(3);
	        list.addLast(4);
	        list.addLast(5);
	        list.addLast(6);
	        list.addLast(7);
	        list.addLast(8);
	        list.display();
	        list.removeAt(4);
		
		//2  1  2  1  1  2  0  1  0
//
//		list.addAt(2, 30);
//		list.addAt(0, 5);
//		list.addAt(6, 60);
//		list.display();

//		list.removeFirst();
//
//		list.removeLast();
//		list.removeAt(3);

		//list.display();
//
//		list.reversePR();
//		list.display();
//		 list.reversePI();
//		 list.display();

		//st.display();
		list.display();
		list.bubbleSort();
		list.display();
//
//		System.out.println(list.mid());
////
//		list.addLast(60);
//		list.addLast(70);
////
//		list.display();
//		list.createCycle();
//		System.out.println(list.detectCycle());
////
//		list.breakCycle();
////
//		list.display();
//		System.out.println(list.detectCycle());
////
//		list.reversePR();
//		list.display();
////		
////		
//		list.mergeSort();
//		list.display();

	}

}
