
public class QueueImplementation {
	
	Node first;
	Node last;
	
	public void add(int data) {
		
		Node n = new Node(data);
		
		if(first == null) {
			
			first = n;
			last = first;
			
		}
		else {
			
			last.next = n;
			
			last =n;
			
		}
		
		
			
		}
	public int remove() {
		
		if(first == null) {
			
			return 0;
		}
		
		if(first.next == null) {
			
		int temp = first.data;	
			
			first =null;
			
			return temp;
			
		}
		else {
			int temp = first.data;
			
			first = first.next;
			
			return temp;
		}
		
		
		
		
	}
	
	public void peek() {
		
		
		if(first == null) return;
		
		int temp = first.data;
		
		System.out.println(temp);
		
		
	}
	
	public static void main(String args[]) {
		
		QueueImplementation queue = new QueueImplementation();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.peek();
		System.out.println("removed element:" +queue.remove());
		System.out.println("removed element:" +queue.remove());
		queue.peek();
		System.out.println("removed element:" +queue.remove());
		queue.peek();
		queue.add(1);
		queue.peek();
		
		
		
		
	}
		
	}
	


