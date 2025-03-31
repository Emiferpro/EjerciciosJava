import java.util.Scanner;

/// # Tabla de multiplicar
///
/// Objetivo: Aprender a usar bucles y operaciones matemáticas en Java.
///
/// ## Pasos:
/// 1. Pedirle un numero al usuario
/// 2. Usar un bucle for para multiplicar el numero desde el 1 al 10
/// 3. Mostrar cada resultado en pantalla
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = sc.nextInt();
        sc.close();
        System.out.println("La tabla de multiplicar del numero " + a + " es:");
        for (int i = 1; i <=10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}
