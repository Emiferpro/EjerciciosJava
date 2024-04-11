import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Comparator;

public class Ejercicio19 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Generando array aleatorio");
        for (int i = 0; i < n; i++) {
            numeros.add(new Random().nextInt(1, 1000));
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();
        numeros.sort(Comparator.naturalOrder());
        System.out.println("El numero mas grande en el array es: " + numeros.getLast());
    }
}
