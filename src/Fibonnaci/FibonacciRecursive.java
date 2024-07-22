package Fibonnaci;

public class FibonacciRecursive {
	  public static int fibonacci(int n) {
	     
	        if (n < 0) {
	            throw new IllegalArgumentException("N deve ser >= 0");
	        }

	       
	        if (n == 0) return 0;
	        
	        
	        if (n == 1) return 1;

	       
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

}
