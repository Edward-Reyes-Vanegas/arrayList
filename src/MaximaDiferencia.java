import java.util.ArrayList;
import java.util.List;
public class MaximaDiferencia{

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(15);
        a.add(3);
        a.add(6);
        a.add(10);
        int maxDif = -1;
        int n = a.size();
        int minVal = a.get(0);
        for (int j = 1; j < n; j++) {
            int val = a.get(j);
            if (val > minVal) {
                maxDif = Math.max(maxDif, val - minVal);
            } else {
                minVal = val;
            }
        }
        System.out.println("EL MAXIMO DE ESTE ARREGLO ES:   "+maxDif);
    }

}