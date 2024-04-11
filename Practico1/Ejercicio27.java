import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio27 {
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
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(Integer i : numeros) {
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }
        System.out.println("Tamaño del nuevo array: " + uniqueList.size());
        System.out.println("Array sin numeros repetidos: ");
        for (Integer i : uniqueList) {
            System.out.print(i + " ");
        }
    }
}
