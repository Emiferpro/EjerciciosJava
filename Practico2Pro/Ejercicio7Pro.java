import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7Pro {
    private static int[] a = new int[15];
    private static int[] p = new int[0];
    private static int[] np = new int[0];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 15 numeros");
        for(int i = 0; i < a.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int s = sc.nextInt();
            a[i] = s;
            if (s % 2 == 0 || s == 0) {
                numeroPar(s);
            } else {
                numeroImpar(s);
            }
        }
        System.out.println("Array de pares: " + Arrays.toString(p));
        System.out.println("Array de impares: " + Arrays.toString(np));
        sc.close();
    }

    private static void numeroPar(int s) {
        p = Arrays.copyOf(p, p.length + 1);
        p[p.length - 1] = s;
    }

    private static void numeroImpar(int s) {
        np = Arrays.copyOf(np, np.length + 1);
        np[np.length - 1] = s;
    }
}
