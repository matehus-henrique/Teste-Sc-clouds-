package NúmerosPrimos;

import java.util.ArrayList;
import java.util.List;

public class PrimoRecursivo {
	

   
    private void encontrarPrimosRecursivoAuxiliar(int atual, int N, List<Integer> primos) {
        
        if (atual > N) return;
        
        if (UtilPrimos.ePrimo(atual)) {
            primos.add(atual); 
        }
        
        
        encontrarPrimosRecursivoAuxiliar(atual + 1, N, primos);
    }

    public List<Integer> encontrarPrimosRecursivo(int N) {
    
        if (N <= 1) throw new IllegalArgumentException("N deve ser maior que 1");
        
       
        List<Integer> primos = new ArrayList<>();
        encontrarPrimosRecursivoAuxiliar(2, N, primos);
        return primos;
    }

}
