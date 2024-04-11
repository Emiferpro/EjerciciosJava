import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = sc.nextInt();
        sc.close();
        if ((a % 2) == 0) {
            System.out.println("El numero " + a + " es par");
        } else { System.out.println("El numero " + a + " es impar"); }
    }
}
