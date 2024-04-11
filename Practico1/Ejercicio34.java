import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Generando arrays aleatorios");
        for (int i = 0; i < n; i++) {
            numeros.add(new Random().nextInt(-1000, 1000));
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            numeros2.add(new Random().nextInt(-1000, 1000));
            System.out.print(numeros2.get(i) + " ");
        }
        System.out.println();
        ArrayList<Integer> fusionados = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fusionados.add(numeros.get(i));
            fusionados.add(numeros2.get(i));
        }
        fusionados.sort(Comparator.naturalOrder());
        System.out.println("Arrays fusionados y ordenados: ");
        for (int i = 0; i < fusionados.size(); i++) {
            System.out.print(fusionados.get(i) + " ");
        }

    }
}
