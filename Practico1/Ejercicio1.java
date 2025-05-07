import java.util.InputMismatchException;
import java.util.Scanner;

/// # Calcular el promedio de números en un arreglo
///
/// Objetivo: Aprender a usar arreglos, bucles y operaciones matemáticas básicas en Java
///
/// ## Pasos:
/// 1. Pedir al usuario cuántos números quiere ingresar
/// 2. Crear un arreglo para almacenar esos números
/// 3. Usar un bucle for para llenar el arreglo con los números ingresados por el usuario
/// 4. Sumar todos los valores del arreglo para calcular el total
/// 5. Dividir la suma total entre la cantidad de números para obtener el promedio
/// 6. Mostrar el resultado en pantalla
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        while (t == 0) {
            try {
                System.out.println("Ingrese la cantidad de numeros: ");
                t = sc.nextInt();
            }  catch (InputMismatchException e) {
                System.out.println("Debe ingresar un numero valido");
                sc.nextLine();
            }
        }
        double[] a = new double[t];
        for (int i = 0; i < a.length; i++) {
            while (true) {
                System.out.println("Ingrese un numero para la posicion " + (i + 1) + ": ");
                try {
                    a[i] = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese un NUMERO valido");
                    sc.nextLine();
                }

            }
        }
        double suma = 0;
        for (double j : a) {
            suma += j;
        }
        double promedio = suma / a.length;
        System.out.println("El promedio es: " + promedio);
        sc.close();
    }
}
