import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio30 {
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
        int resultP = 0;
        int resultI = 0;
        for (int i = 0; i <= numeros.size() - 1; i++) {
            if ((i % 2) == 0) {
                resultP = resultP + numeros.get(i);
            } else { resultI = resultI + numeros.get(i); }
        }
        System.out.println("El resultado de las sumas de los valores en indices impares es: " + resultI);
        System.out.println("El resultado de las sumas de los valores en indices pares es: " + resultP);
    }
}
