import java.util.InputMismatchException;
import java.util.Scanner;

/// # Invertir el orden de un arreglo
///
/// Objetivo: Aprender a manipular arreglos, intercambiar posiciones y recorrerlos en orden inverso.
///
/// ## Pasos:
/// 1. Pedir al usuario cuántos números quiere ingresar.
/// 2. Guardar los números en un arreglo.
/// 3. Crear un bucle para mostrar el arreglo original.
/// 4. Usar otro bucle para mostrar los valores en orden inverso.

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        while (t <= 0) {
            try {
                System.out.print("Ingrese la cantidad de numeros: ");
                t = sc.nextInt();
            }  catch (InputMismatchException e) {
                System.out.println("Debe ingresar un numero valido");
                sc.nextLine();
            }
        }
        int[] a = new int[t];
        for (int i = 0; i < a.length; i++) {
            while (true) {
                System.out.print("Ingrese un numero para la posicion " + (i + 1) + ": ");
                try {
                    a[i] = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese un NUMERO valido");
                    sc.nextLine();
                }

            }
        }
        sc.close();
        System.out.print("Array invertido: ");
        for (int i = a.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(a[i]);
                System.out.println(" ");
            } else {
                System.out.print(a[i] + ", ");
            }

        }
    }
}
