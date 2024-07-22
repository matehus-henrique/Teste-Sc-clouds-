package Fibonnaci;

public class Program {

	public static void main(String[] args) {
		
		 int n = 6; 

	        
	        int resultadoRecursivo = FibonacciRecursive.fibonacci(n);
	        System.out.println("Fibonacci recursivo de " + n + " é: " + resultadoRecursivo);

	        
	        int resultadoIterativo = FibonacciIterative.fibonacci(n);
	        System.out.println("Fibonacci iterativo de " + n + " é: " + resultadoIterativo);
	    
	}

}
