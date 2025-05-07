import java.util.Scanner;

public class Ejercicio8Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2;

        do {
            System.out.println("\n---- Menú de operaciones ----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                // Pedir los dos números solo si no elige salir
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + sumar(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + restar(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + multiplicar(num1, num2));
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: no se puede dividir por cero.");
                        } else {
                            System.out.println("Resultado: " + dividir(num1, num2));
                        }
                        break;
                }
            } else if (opcion != 0) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
        sc.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
