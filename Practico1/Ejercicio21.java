import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numerosPares = new ArrayList<>();
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
        numeros.forEach((i) -> {
            if ((Math.abs(i) % 2) == 0) {
                numerosPares.add(i);
            }
        });
        System.out.println("Los numeros pares del array son: ");
        for (int i = 0; i < numerosPares.size(); i++) {
            System.out.print(numerosPares.get(i) + " ");
        }
    }
}
