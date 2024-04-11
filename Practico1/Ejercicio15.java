import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int number = sc.nextInt();
        int a = Math.abs(number);
        sc.close();
        char[] array = String.valueOf(a).toCharArray();
        int result = 0;
        for (char i : array) {
            result = result + Integer.parseInt(String.valueOf(i));
        }
        System.out.println("La suma entre los caracteres del numero " + number + " es igual a " + result);
    }
}
