
public class StackImplementation {
	
	Node top;
	
	
	//Adding an element to the stack
	public void push(int data) {
		
		
		Node n = new Node(data);
		
		if(top == null) {
			
			top = n;
			
			top.next = null;
		}
		else {
			
			n.next = top;
			
			top = n;
			
		}	
			
		}
	
	// Removing an element from the stack
	public int pop() {
		
		if(top == null) {
			
			return 0;
		}
		
		int temp = top.data;
		
		top = top.next;
		
		return temp;
		
	}
	
	// Prints the top element from the stack
	
	public void peek() {
		
		System.out.println(top.data);
	}
	
	public static void main(String args[]) {
		
		StackImplementation stack = new StackImplementation();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.peek();
		System.out.println(stack.pop());
		stack.peek();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.peek();
		
	}
		
	}


