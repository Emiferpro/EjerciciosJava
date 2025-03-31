import java.util.Scanner;

/// # Contar cuántos números pares hay en un arreglo
///
/// Objetivo: Aprender a recorrer un arreglo, aplicar una estructura condicional para
/// identificar números pares y contar cuántos hay.
///
/// ## Pasos:
/// 1. Pedir al usuario cuántos números quiere ingresar.
/// 2. Crear un arreglo de enteros (`int[]`) para almacenar los números.
/// 3. Usar un bucle `for` para llenar el arreglo con los números ingresados.
/// 4. Recorrer el arreglo y contar cuántos son pares (`num % 2 == 0`).
/// 5. Mostrar el resultado en pantalla.



public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        while (true) {
            try {
                System.out.print("Introduce el tamaño del array: ");
                a = new int[sc.nextInt()];
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Introduce un numero valido");
                sc.nextLine();
            }
        }
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            while (true) {
                try {
                    System.out.print("Introduce un valor: ");
                    a[i] = sc.nextInt();
                    if (a[i] % 2 == 0) {
                        contador++;
                    }
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Introduce un valor valido");
                    sc.nextLine();
                }
            }
        }
        sc.close();
        System.out.println("La cantidad de numeros pares en el array es: " + contador);
    }
}
