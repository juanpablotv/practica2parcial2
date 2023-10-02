import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
       try( Scanner scanner = new Scanner(System.in)){

            // Introducir por teclado el tamaño de un arreglo de entero
            System.out.print("Ingrese el tamaño del arreglo: ");
            int tamano = scanner.nextInt();

            //  Declarar y construir un arreglo 
            int[] arreglo = new int[tamano];

            // Introducir por teclado los valores enteros del arreglo
            System.out.println("Ingrese los valores del arreglo:");
            for (int i = 0; i < tamano; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                arreglo[i] = scanner.nextInt();
            }

        // se tiene que encontrar en el arreglo lo siguiente
            // el valor máximo en un arreglo
            int maximo = arreglo[0];
            for (int i = 1; i < tamano; i++) {
                if (arreglo[i] > maximo) {
                    maximo = arreglo[i];
                }
            }

            // el valor más pequeño
            int minimo = arreglo[0];
            for (int i = 1; i < tamano; i++) {
                if (arreglo[i] < minimo) {
                    minimo = arreglo[i];
                }
            }

            // valores impares 
            int impares = 0;
            for (int i = 0; i < tamano; i++) {
                if (arreglo[i] % 2 != 0) {
                    impares++;
                }
            }

            // valores pares 
            int pares = tamano - impares;

            // Mostrar resultados
            System.out.println("El valor máximo en el arreglo es: " + maximo);
            System.out.println("El valor mínimo en el arreglo es: " + minimo);
            System.out.println("Cantidad de valores impares en el arreglo: " + impares);
            System.out.println("Cantidad de valores pares en el arreglo: " + pares);
        }
    }

}
