import java.util.Stack;

public class MinStack {
	
	Stack<Integer> stack =  new Stack<Integer>();
	
	Stack<Integer> stackMin =  new Stack<Integer>();
	
	public void push(int data) {
		
		if(stack.empty()&&stackMin.empty()) {
			
			stack.push(data);
			stackMin.push(data);
		}
		else {
			
			stack.push(data);
			
			if(data<stackMin.peek()) {
				
				stackMin.push(data);
			}
			
		}
		
	}
	
	public void pop() {
		
		if(!stack.empty()) {
			
		int temp =stack.pop();
			
		if(temp == stackMin.peek()) {
			
			stackMin.pop();
		}
		
		
		}
		
	}
	
	public int min() {
		
	    int temp = stackMin.peek();
	    
	    return temp;
	}
	
	
		
	

public static void main(String args[]) {
	
	MinStack getStackMin =  new MinStack();
	
	
	getStackMin.push(10);
	getStackMin.push(8);
	getStackMin.push(12);
	getStackMin.push(7);
	getStackMin.push(2);
	System.out.println("The Min element in the stack is:" +getStackMin.min());
	getStackMin.pop();
	System.out.println("The Min element in the stack is:" +getStackMin.min());

}

}
