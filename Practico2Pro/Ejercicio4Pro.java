import java.util.Scanner;

public class Ejercicio4Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        int maxSize = 0;
        int maxSizeIndex = -1;
        for(int i = 0; i < words.length; i++) {
            String word = sc.nextLine();
            words[i] = word;
            maxSizeIndex = word.length() >= maxSize ? i : maxSizeIndex;
            maxSize = word.length() >= maxSize ? word.length() : maxSize;
        }
        sc.close();
        System.out.println("La palabra con la mayor cantidad de letras que ha ingresado es " + words[maxSizeIndex] + " con " + maxSize + " letras");
    }
}
