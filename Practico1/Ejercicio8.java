import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String a = sc.nextLine();
        sc.close();
        char[] array = a.toCharArray();
        int result = 0;
        for (char i : array) {
            result = result + Integer.parseInt(String.valueOf(i));
        }
        System.out.println("La suma entre los caracteres del numero " + a + " es igual a " + result);
    }
}