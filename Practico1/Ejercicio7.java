import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        final int[] result = {0};
        ArrayList<Integer> divisores = new ArrayList<>();
        for (int i = (a - 1); i >= 1; i--) {
            if ((a % i) == 0) {
                divisores.add(i);
            }
        }
        divisores.forEach( (i) -> {
            result[0] = result[0] + i;
        });
        if (result[0] == a) {
            System.out.println("El numero " + a + " es un numero perfecto");
        } else { System.out.println("El numero " + a + " no es un numero perfecto");}
    }
}
