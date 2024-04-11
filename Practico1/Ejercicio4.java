import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int limite = scanner.nextInt();
        scanner.close();

        System.out.println("Números primos menores o iguales a " + limite + ":");

        for (int numero = 2; numero <= limite; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
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
