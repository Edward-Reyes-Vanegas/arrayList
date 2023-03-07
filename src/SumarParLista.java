
import java.util.*;
public class SumarParLista {
    public static boolean existeParSuma(List<Integer> A, int K) {
        Collections.sort(A); // ordenar la lista
        int i = 0, j = A.size() - 1;
        while (i < j) {
            int sum = A.get(i) + A.get(j);
            if (sum == K) {
                return true;
            } else if (sum > K) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(3, 5, 2, 8, 11, 7);
        int K = 10;
        boolean existe = existeParSuma(A, K);
        if (existe) {
            System.out.println("Existe un par de elementos en la lista que suman " + K);
        } else {
            System.out.println("No existe un par de elementos en la lista que sumen " + K);
        }
    }


}


