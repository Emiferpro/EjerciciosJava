import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxI = -1;
        int minI = -1;
        for(int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un numero para la posicion " + (i + 1));
            int s = sc.nextInt();
            a[i] = s;
            // ahorremos ciclos del cpu al meter todo esto en un mismo bucle
            minI = s <= min ? i : minI;
            min = s <= min ? s : min;
            maxI = s >= max ? i : maxI;
            max = s >= max ? s : max;
        }
        System.out.println("Array original: " + Arrays.toString(a));
        if (minI != -1 && maxI != -1) {
            int temp = a[minI];
            a[minI] = a[maxI];
            a[maxI] = temp;
        }
        System.out.println("Array modificado: " + Arrays.toString(a));
        sc.close();
    }
}