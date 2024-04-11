import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = sc.nextInt();
        sc.close();
        System.out.println("La tabla de multiplicar del numero " + a + " es:");
        for (int i = 1; i <=10; i++) {
            System.out.println(a + "x" + i + " = " + (a * i));
        }
    }
}
