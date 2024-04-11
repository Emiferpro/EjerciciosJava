public class Ejercicio2 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i <= 100; i++) {
            if ((i % 2) == 0) {
                a = a + i;
            }
        }
        System.out.println("El resultado de la suma de los numeros pares del 1 al 100 es: " + a);
    }
}