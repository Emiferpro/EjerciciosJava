import java.util.Scanner;

public class Ejercicio35 {
    private static Scanner sc = new Scanner(System.in);
    private static int a;

    public static void main(String[] args) {
        int resultado = 0;
        while (getNumber() != 0) {
            if ((a % 5) == 0) {
                resultado = resultado + a;
            }
        }
        System.out.println("El resultado de la suma de los multiplos de 5 que se han ingresado es " + resultado);
    }

    public static int getNumber() {
        System.out.println("Ingrese un numero");
        a = sc.nextInt();
        return a;
    }
}
