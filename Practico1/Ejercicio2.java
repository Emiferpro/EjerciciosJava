import java.util.Scanner;

/// # Contar cuántas vocales hay en una palabra
///
/// Objetivo: Aprender a recorrer cadenas de texto, comparar caracteres y usar estructuras de control en Java.
///
/// ## Pasos:
/// 1. Pedir al usuario que escriba una palabra o frase
/// 2. Recorrer cada letra de la palabra usando for
/// 3. Verificar si cada letra es una vocal
/// 4. Mostar el total de vocales encontradas


public class Ejercicio2 {
    public static void main(String[] args) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra");
        String word = sc.nextLine();
        char[] w = word.toCharArray();
        for (char c : w) {
            switch (c) {
                case 'a':
                    a += 1;
                    break;
                case 'e':
                    e += 1;
                    break;
                case 'i':
                    i += 1;
                    break;
                case 'o':
                    o += 1;
                    break;
                case 'u':
                    u += 1;
                    break;
            }
        }
        System.out.println("Cantidad de A: " + a);
        System.out.println("Cantidad de E: " + e);
        System.out.println("Cantidad de I: " + i);
        System.out.println("Cantidad de O: " + o);
        System.out.println("Cantidad de U: " + u);

    }
}
