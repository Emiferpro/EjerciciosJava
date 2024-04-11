import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = sc.nextInt();
        System.out.println("Ingrese un numero");
        int b = sc.nextInt();
        sc.close();
        if ((a == b) && esPrimo(a)) {
            System.out.println("El unico numero primo en ese rango es: " + a);
            System.exit(0);
        } else if (a == b) {
            System.out.println("El numero ingresado no es primo");
            System.exit(0);
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a < b) {
            System.out.println("Los numeros primos entre " + a + " y " + b + " son:");
            for (int i = a; i <= b; i++) {
                if (esPrimo(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
