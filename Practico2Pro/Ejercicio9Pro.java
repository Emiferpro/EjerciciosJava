import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9Pro {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambio = true;
                }
            }

            if (!intercambio) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        System.out.println("Ingrese 6 numeros");
        for(int i = 0; i < a.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        sc.close();
        bubbleSort(a);
        System.out.println("Array ordenado: " + Arrays.toString(a));
    }
}
