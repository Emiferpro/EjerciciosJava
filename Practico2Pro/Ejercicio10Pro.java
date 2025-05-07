import java.util.Scanner;

public class Ejercicio10Pro {
    protected static String defaultPassword = "abc123";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tries = 3;
        do {
            System.out.printf("Ingresa una contraseña ( Te quedan %d intentos ): ", tries);
            String password = sc.nextLine();
            if (password.equals(defaultPassword)) {
                System.out.println("Bienvenido");
                tries = -1;
            } else {
                System.out.println(tries == 1 ? "Incorrecto. Saliendo del programa." : "Incorrecto. Intenta de nuevo.");
                tries--;
            }
        } while (tries > 0);
        sc.close();
    }
}
