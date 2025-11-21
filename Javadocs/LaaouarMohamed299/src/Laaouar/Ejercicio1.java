package Laaouar;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroTeclado;
        int contador = 0;

        // Primero contamos cuántos números válidos introduce el usuario
        System.out.println("Dame un número entre 1 y 100 (0 para terminar):");
        numeroTeclado = teclado.nextInt();

        while (numeroTeclado != 0) {
            if (numeroTeclado >= 1 && numeroTeclado <= 100) {
                contador++;
            } else {
                System.out.println("Número fuera de rango, ignorado.");
            }

            System.out.println("Dame otro número (0 para terminar):");
            numeroTeclado = teclado.nextInt();
        }

        // Creamos un array con el tamaño de números válidos
        int[] numeros = new int[contador];

        // Segunda pasada: llenamos el array
        System.out.println("\nAhora introduce los " + contador + " números válidos otra vez:");
        for (int i = 0; i < contador; i++) {
            int num;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                num = teclado.nextInt();
                if (num < 1 || num > 100) {
                    System.out.println("Debe estar entre 1 y 100.");
                }
            } while (num < 1 || num > 100);

            numeros[i] = num;
        }

        // Arrays para contar y sumar por decenas
        int[] contadorDecenas = new int[10];
        int[] sumaDecenas = new int[10];

        // Clasificamos los números por decena
        for (int num : numeros) {
            int indice = (num - 1) / 10;
            contadorDecenas[indice]++;
            sumaDecenas[indice] += num;
        }

        // Mostramos resultados
        System.out.println("\n--- Resultados por decena ---");
        for (int i = 0; i < 10; i++) {
            int desde = i * 10 + 1;
            int hasta = (i + 1) * 10;

            System.out.print("Decena " + desde + "-" + hasta + ": ");
            if (contadorDecenas[i] > 0) {
                double media = (double) sumaDecenas[i] / contadorDecenas[i];
                System.out.printf("%d números, media = %.2f%n", contadorDecenas[i], media);
            } else {
                System.out.println("0 números, media = -");
            }
        }

        teclado.close();
    }
}
