import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        long a = sc.nextInt();
        sc.close();
        long result = a;
        for (long i = a; i >= 2; i--) {
            result = (result * (i - 1));
        }
        System.out.println("El factorial de " + a + " es " + result);
    }
}
