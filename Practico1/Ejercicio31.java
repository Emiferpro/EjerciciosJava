import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio31 {
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
        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        int temp;
        for (Integer i : numeros) {
            if (frecuencia.containsKey(i)) {
                temp = frecuencia.get(i) + 1;
                frecuencia.replace(i, temp);
            } else {
                frecuencia.put(i, 1);
            }
        }
        int[] biggestV = { Integer.MIN_VALUE };
        int[] biggestK = { Integer.MIN_VALUE };
        HashMap<Integer, Integer> numerosNoTanRepetidos = new HashMap<>();
        frecuencia.forEach((k, v) -> {
            if (v > biggestV[0]) {
                biggestV[0] = v;
                biggestK[0] = k;
            } 
        });
        frecuencia.forEach((k, v) -> {
            if (v == biggestV[0]) {  numerosNoTanRepetidos.put(k, v); }
        });
        numerosNoTanRepetidos.forEach((k, v) -> {
            if (v > biggestV[0]) {
                biggestV[0] = v;
                biggestK[0] = k;
            }
        });
        if (numerosNoTanRepetidos.size() == 1) {
            System.out.println("El numero que mas se repite es " + biggestK[0] + ", se repitio en total "
                    + biggestV[0] + " veces");
        } else if (numerosNoTanRepetidos.size() >= 2 && biggestV[0] > 1) {
            System.out.println("Hay varios numeros que se repiten " + biggestV[0] + " veces, estos son: ");
            numerosNoTanRepetidos.forEach((k, v) -> {
                System.out.print(k + " ");
            });
        } else if (numerosNoTanRepetidos.size() >= 2 && biggestV[0] == 1) {
            System.out.println("Hay varios numeros que se repiten " + biggestV[0] + " vez, estos son: ");
            numerosNoTanRepetidos.forEach((k, v) -> {
                System.out.print(k + " ");
            });
        }
    }
}
