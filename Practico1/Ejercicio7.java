import java.util.InputMismatchException;
import java.util.Scanner;

/// # Encontrar el número mayor en un arreglo
///
/// Objetivo: Aprender a recorrer un arreglo y comparar valores para encontrar el número más grande.
///
/// ## Pasos:
/// 1. Pedir al usuario cuántos números quiere ingresar.
/// 2. Crear un arreglo para guardar los números.
/// 3. Usar un bucle `for` para llenar el arreglo.
/// 4. Inicializar una variable `mayor` con el primer número y compararlo con el resto.
/// 5. Mostrar el número mayor en pantalla.

public class Ejercicio7 {
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
        int mayor = Integer.MIN_VALUE;
        int[] a = new int[t];
        for (int i = 0; i < a.length; i++) {
            while (true) {
                System.out.print("Ingrese un numero para la posicion " + (i + 1) + ": ");
                try {
                    a[i] = sc.nextInt();
                    if (a[i] > mayor) {
                        mayor = a[i];
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese un NUMERO valido");
                    sc.nextLine();
                }

            }
        }
        sc.close();
        System.out.println("Mayor: " + mayor);
    }
}
