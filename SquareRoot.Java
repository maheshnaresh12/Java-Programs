
public class SquareRoot {
	
	static void root(int n, int start,int end) {
		
		int mid = (start+end)/2;
		
		
		if(mid*mid == n) {
			System.out.println(mid) ;
		}
		
		 if(mid*mid > n) {
			
			root(n,start,mid);
			
			
		}
		 if(mid*mid < n) {
        	
			root(n,mid+1,end);
			
		}
		
		  
	}
		

	
	public static void main(String args[]) {
		
		int n =256;
		int start =0;
		int end =n;
		
		SquareRoot sqroot = new SquareRoot();
		
		sqroot.root(n, start, end);
	}

}
