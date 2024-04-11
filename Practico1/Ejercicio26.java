import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Generando array aleatorio");
        for (int i = 0; i < n; i++) {
            numeros.add(new Random().nextInt(-1000, 1000));
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();
        int diferencia;
        int diferenciaMaxima = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.size() - 1; i++) {
            diferencia = Math.abs(numeros.get(i) - numeros.get(i + 1));
            if (diferencia > diferenciaMaxima) {
                diferenciaMaxima = diferencia;
            }
        }
        System.out.println("La mayor diferencia entre numeros es: " + diferenciaMaxima);
    }
}
