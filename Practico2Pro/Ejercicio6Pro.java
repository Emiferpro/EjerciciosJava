import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6Pro {
    private static void printHashMap(HashMap<Integer, Integer> h) {
        Object[] keys = h.keySet().toArray();
        Object[] values = h.values().toArray();
        for(int i = 0; i < h.size(); i++) {
            System.out.printf("El numero %d se repite %d veces\n", keys[i], values[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Numero , Veces que se repite
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        int[] a = new int[10];
        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int s = sc.nextInt();
            a[i] = s;
            if (h.containsKey(s)) {
                h.replace(s, h.get(s) + 1);
            } else {
                h.put(s, 1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (h.get(a[i]) == 1) {
                h.remove(a[i]);
            } 
        }
        sc.close();
        if (h.size() > 0) {
            System.out.printf("Hay un total de %d numeros repetidos\n", h.size());
            printHashMap(h);
        } else {
            System.out.println("No hay repetidos");
        }
    }
}
