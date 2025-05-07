import java.util.Scanner;

public class Ejercicio3Pro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaramos las matrices
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matrizResultado = new int[3][3];
        
        // Solicitar valores para la primera matriz
        System.out.println("Ingrese los valores para la primera matriz 3x3:");
        ingresarMatriz(matriz1, scanner);
        
        // Solicitar valores para la segunda matriz
        System.out.println("\nIngrese los valores para la segunda matriz 3x3:");
        ingresarMatriz(matriz2, scanner);
        
        // Sumar las matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        // Mostrar las matrices y el resultado
        System.out.println("\nMatriz 1:");
        mostrarMatriz(matriz1);
        
        System.out.println("\nMatriz 2:");
        mostrarMatriz(matriz2);
        
        System.out.println("\nMatriz Resultado (Suma):");
        mostrarMatriz(matrizResultado);
        
        scanner.close();
    }
    
    // Método para ingresar valores en una matriz
    public static void ingresarMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    
    // Método para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
