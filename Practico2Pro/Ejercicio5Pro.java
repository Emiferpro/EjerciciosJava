import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        System.out.println("Ingrese 7 numeros");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        int[] arrOrdenado = a.clone();
        Arrays.sort(arrOrdenado);
        int[] arrInvertido = arrOrdenado.clone();
        for (int i = 0; i < arrOrdenado.length; i++) {
            arrInvertido[i] = arrOrdenado[arrOrdenado.length - 1 - i];
        }
        if (Arrays.equals(a, arrOrdenado)) {
            System.out.println("El array está ordenado");
        } else if (Arrays.equals(a, arrInvertido)) {
            System.out.println("El array está al revés (orden decreciente)");
        } else {
            System.out.println("El array está desordenado");
        }
        sc.close();
    }
}
