package Fibonnaci;

public class FibonacciIterative {

	  public static int fibonacci(int n) {
	        
	        if (n < 0) {
	            throw new IllegalArgumentException("N deve ser >= 0");
	        }

	        
	        if (n == 0) return 0;

	        
	        if (n == 1) return 1;

	   
	        int a = 0, b = 1;

	        
	        for (int i = 2; i <= n; i++) {
	            int temp = b;
	            b = a + b; 
	            a = temp; 
	        }

	        return b; 
	    }
}
