import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = sc.nextInt();
        System.out.println("Ingrese un numero");
        int b = sc.nextInt();
        sc.close();
        if ((a == b) && (a % 2) != 0) {
            System.out.println("El unico numero impar en ese rango es: " + a);
            System.exit(0);
        } else if (a == b) {
            System.out.println("El numero ingresado es par");
            System.exit(0);
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a < b) {
            System.out.println("Los numeros impares entre " + a + " y " + b + " son:");
            for (int i = a; i <= b; i++) {
                if ((i % 2) != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
