import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];
        System.out.println("Ingrese 8 números:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array original: " + Arrays.toString(a));
        int u = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = u;
        System.out.println("Array rotado: " + Arrays.toString(a));
    }
}
