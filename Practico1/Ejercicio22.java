import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Generando array aleatorio");
        final int[] result = {0};
        for (int i = 0; i < n; i++) {
            numeros.add(new Random().nextInt(-1000, 1000));
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();
        numeros.forEach((i) -> {
            result[0] = result[0] + i;
        });
        result[0] = result[0] / numeros.size();
        System.out.println("El promedio entre los elementos del array es: " + result[0]);
    }
}
