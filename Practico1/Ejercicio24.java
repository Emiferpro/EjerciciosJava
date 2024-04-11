import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio24 {
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
        numeros.sort(Comparator.naturalOrder());
        int big = numeros.get(numeros.size() - 2);
        System.out.println("El segundo numero mas grande del array es " + big);
    }
}
