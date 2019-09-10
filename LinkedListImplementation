
public class LinkedListImplementation {
	
	Node head;
	
	Node tail;
	
	//Adds an element to linkedList
	
	public void add(int data) {
		
		Node n = new Node(data);
		 
		if(head == null) {
			
			head = n;
			
			head.next = null;
			
			tail =head;
			
		}
		
		else {
			
					
			 tail.next = n;
			
			tail = tail.next;
			
		}
	}
	
	//Prints all elements of linkedList
	
	public void printElements() {
		
		if(head == null) return;
		
		Node temp = head;
		
		while(temp!=null) {
			
			System.out.println(temp.data); 
			
			temp = temp.next;
		}
	}
	
	//Removes first element from the list
	
	public void removeFirst() {
		
		if(head == null) return;
		
		head = head.next;
		
	}
	
	//Removes last element from the list
	
	public void removeLast() {
		
		Node temp = head;
		
		if(head == null) return;
		
		if(head.next == null) {
			
			head = null;
		}
		
		else {
		
		
	while(temp.next.next!=null) {
		
		temp = temp.next;
	}
	
	temp.next = null;
	
		}
		
	}
	
	
	
	public static void main(String args[]) {
		
		LinkedListImplementation linkedList = new LinkedListImplementation();
		
		linkedList.add(1); //Adding first element to the linkedList
		linkedList.add(2);//Adding second element to the LinkedList
		linkedList.add(3);//Adding second element to the LinkedList
		linkedList.printElements();
		
	  	
		
	}

}
