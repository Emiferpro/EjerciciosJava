import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int choice = sc.nextInt();
        sc.close();
        switch (choice) {
            case 1:
                System.out.println("Hola, soy la opcion 1");
                break;
            case 2:
                System.out.println("Hola, soy la opcion 2");
                break;
            case 3:
                System.out.println("Hola, soy la opcion 3");
                break;
            case 4:
                System.out.println("Hola, soy la opcion 4");
                break;
            case 5:
                System.out.println("Hola, soy la opcion 5");
                break;
            default:
            System.out.println("Los números deben ser entre 1 y 5");
                break;
        }
    }
}
