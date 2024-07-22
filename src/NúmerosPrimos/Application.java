package NúmerosPrimos;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
        int N = 10; 
        PrimoLinear primoLinear = new PrimoLinear();
        List<Integer> primosLinear = primoLinear.encontrarPrimosLinear(N);
        System.out.println("Primos até " + N + " Linear: " + primosLinear);

        
        PrimoRecursivo primoRecursivo = new PrimoRecursivo();
        List<Integer> primosRecursivo = primoRecursivo.encontrarPrimosRecursivo(N);
        System.out.println("Primos até " + N + " Recursivo: " + primosRecursivo);
	}

}
