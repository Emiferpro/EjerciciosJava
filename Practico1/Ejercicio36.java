import java.util.Scanner;

public class Ejercicio36 {
    private static Scanner sc = new Scanner(System.in);
    private static int a;

    public static void main(String[] args) {
        int contador = 0;
        int resultadoP = 0;
        int resultadoI = 0;
        while (getNumber() != 0) {
            if (a > 100) {
                if ((a % 2) == 0) {
                    resultadoP = resultadoP + a;
                } else if ((a % 2) != 0) {
                    resultadoI = resultadoI + a;
                }
            } else if (a <= 100) {
                contador++;
            }
        } 
        System.out.println("La suma de los números pares mayores que 100 es: " + resultadoP);
        System.out.println("La suma de los números impares mayores que 100 es: " + resultadoI);
        System.out.println("La cantidad de números menores que 100 es: " + contador);
    }

    public static int getNumber() {
        System.out.println("Ingrese un numero");
        a = sc.nextInt();
        return a;
    }
}
