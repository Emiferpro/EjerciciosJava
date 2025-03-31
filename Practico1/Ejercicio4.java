import java.util.Arrays;

/// # Ordenar un Arreglo (Método Burbuja)
///
/// Objetivo: Aprender a ordenar datos en un arreglo usando un algoritmo de ordenamiento simple.
///
/// ## Pasos:
/// 1. Crear un arreglo con números desordenados.
/// 2. Usar un doble bucle `for` para comparar los valores y ordenarlos.
/// 3. Intercambiar los valores cuando el orden no sea el correcto.
/// 4. Mostrar el arreglo ordenado en pantalla.


public class Ejercicio4 {
        public static void main(String[] args) {
            int[] array = {5, 3, 8, 6, 2, 7, 4, 1, 1443, 45552, 25252, 0, 121, -100};

            bubbleSort(array);

            System.out.println("Array ordenado: " + Arrays.toString(array));
        }

        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean intercambio;

            for (int i = 0; i < n - 1; i++) {
                intercambio = false;

                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        intercambio = true;
                    }
                }

                if (!intercambio) {
                    break;
                }
            }
        }
}

