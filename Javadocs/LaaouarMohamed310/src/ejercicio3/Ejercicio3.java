package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int POSICION = 10;
        double[] numero = new double[POSICION];

        System.out.println("Dame un número");
        numero[0] = teclado.nextDouble();

        double max = numero[0];
        double min = numero[0];

        for (int contador = 1; contador < POSICION; contador++) {
            System.out.println("Dame un número");
            numero[contador] = teclado.nextDouble();

            max = Math.max(max, numero[contador]);
            min = Math.min(min, numero[contador]);
        }

        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);
    }
}
