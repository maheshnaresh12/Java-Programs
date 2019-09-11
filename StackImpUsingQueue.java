import java.util.LinkedList;
import java.util.Queue;

public class StackImpUsingQueue {
	
	Queue<Integer> queue = new LinkedList<>();
	
	Queue<Integer> queue1 = new LinkedList<>();
	
	
	public void push(int data) {
		
		queue.add(data);
		
	}
	
	public void pop() {
		
		if (queue.size()==0) return;
		
		while(queue.size() !=1) {
			
			int temp = queue.peek();
			
			queue1.add(temp);
			
			queue.remove();
			
		}
		
		if(queue.size() ==1) {
			
		int temp = queue.peek();
				
		System.out.println("The removed element is "+temp);	
		
			queue.remove();
		}
		
		queue = queue1;
		
		queue1.clear();
		
		
		}
		
	
	
	public int peek() {
		
		int temp = queue.peek();
		
		return temp;
	}
	
	public static void main(String args[]) {
		
		StackImpUsingQueue stack = new StackImpUsingQueue();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.push(5);
		stack.pop();
		
	}

}
