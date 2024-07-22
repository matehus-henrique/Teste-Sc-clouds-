package NúmerosPrimos;

import java.util.ArrayList;
import java.util.List;

public class PrimoLinear {

	public List<Integer> encontrarPrimosLinear(int N) {
        
        if (N <= 1) throw new IllegalArgumentException("N deve ser maior que 1");
        
        
        List<Integer> primos = new ArrayList<>();
        
        
        for (int i = 2; i <= N; i++) {
            
            if (UtilPrimos.ePrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }
}
