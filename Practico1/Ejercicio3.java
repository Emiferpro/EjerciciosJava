import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.err.println("Ingrese un numero");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        boolean esPrimo = true;

        if (a <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(a + " es primo.");
        } else {
            System.out.println(a + " no es primo.");
        }
    }
}
