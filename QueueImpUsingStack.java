import java.util.Stack;

public class QueueImpUsingStack {
	
	Stack<Integer> stack1 = new Stack<Integer>();
	
	Stack<Integer> stack2 = new Stack<Integer>();
	
	
	public void add(int data) {
		
		stack1.push(data);
		
	}
	
	public void remove() {
		
		if (stack1.size()==0) return;
		
		while(stack1.size()!=0) {
			
			int temp = stack1.peek();
			
			stack2.push(temp);
			
			stack1.pop();
			
		}
		
		if(stack1.size() ==0) {
			
		int temp = stack1.peek();
				
		System.out.println("The removed element is "+temp);	
		
			stack1.pop();
		}
		
		stack1 = stack2;
		
		stack2.clear();
		
		
		}
		
	
	
	public int peek() {
		
		int temp = stack1.peek();
		
		return temp;
	}
	
	public static void main(String args[]) {
		
		QueueImpUsingStack queue = new QueueImpUsingStack();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.peek());
		queue.add(5);
		queue.remove();
		
	}

}

