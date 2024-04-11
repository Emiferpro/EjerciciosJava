import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio33 {
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
        boolean esPrimo;
        int a;
        int primo = 0;
        for (int i = 0; i < numeros.size(); i++) {
            esPrimo = true;
            a = Math.abs(numeros.get(i));
            if (a <= 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(a); j++) {
                    if (a % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                primo = numeros.get(i);
                break;
            }
        }
        if (primo != 0) {
            System.out.println("El primer numero primo del array es: " + primo);
        } else { System.out.println("No hay numeros primos en el array"); }
    }
}
