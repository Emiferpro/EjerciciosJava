import java.util.InputMismatchException;
import java.util.Scanner;

/// # Determinar si un número está en un arreglo
///
/// Objetivo: Aprender a buscar elementos dentro de un arreglo usando un bucle y estructura condicional.
///
/// ## Pasos:
/// 1. Pedir al usuario cuántos números quiere ingresar.
/// 2. Crear un arreglo para guardar esos números.
/// 3. Pedir al usuario un número adicional que se desea buscar en el arreglo.
/// 4. Usar un bucle para recorrer el arreglo y verificar si el número está presente.
/// 5. Mostrar un mensaje indicando si el número fue encontrado o no en el arreglo.

public class Ejercicio8 {
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
        System.out.print("Ingrese el numero que desea buscar: ");
        int b;
        while (true) {
            try {
                b = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un NUMERO valido");
                sc.nextLine();
            }

        }
        for (int i : a) {
            if (b == i) {
                System.out.println("Se encontró el numero en el array");
                System.exit(0);
            }
        }
        System.out.println("No se encontro el numero en el array");
    }
}
