import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numerosDiv3 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Generando array aleatorio");
        for (int i = 0; i < n; i++) {
            numeros.add(new Random().nextInt(-1000, 1000));
            System.out.print(numeros.get(i) + " ");
        }
        numeros.forEach((i) -> {
            if ((i % 3) == 0) {
                numerosDiv3.add(i);
            }
        });
        System.out.println();
        System.out.println("Los numeros divisibles entre tres del array son: ");
        numerosDiv3.forEach((i) -> {
            System.out.print(i + " ");
        });
    }
}
