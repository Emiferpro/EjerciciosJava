import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio25 {
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
        ArrayList<Integer> numerosSorted = new ArrayList<>(numeros);
        numerosSorted.sort(Comparator.naturalOrder());
        if (numeros.equals(numerosSorted)) {
            System.out.println("La lista esta ordenada de manera ascendente");
        } else {
            System.out.println("La lista esta desordenada");
        }
    } 
}
