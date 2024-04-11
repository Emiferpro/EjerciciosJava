import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        String str = sc.nextLine();
        sc.close();
        String num2 = "";
        for (int i = 0; i < str.length(); i++) {
            num2 = str.charAt(i) + num2;
        }
        System.out.println(str);
        System.out.println(num2);
        if (str.equals(num2)) {
            System.out.println("El numero " + str + " es palindromo");
        } else { System.out.println("El numero " + str + " no es palindromo"); }
    }
}
