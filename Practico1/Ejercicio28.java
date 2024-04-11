import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {
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
        long result = 1;
        for(int i = 0; i <= numeros.size() - 1; i++) {
            result = result * numeros.get(i);
        }
        System.out.println("El resultado del producto de todos los numeros del array es: " + result);
    }
}
