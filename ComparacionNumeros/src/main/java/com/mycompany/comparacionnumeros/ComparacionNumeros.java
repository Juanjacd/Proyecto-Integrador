
package com.mycompany.comparacionnumeros;

import java.util.Scanner;

public class ComparacionNumeros {

    public static void main(String[] args) {
       // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca tres números enteros
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        // Variables para almacenar el mayor, intermedio y menor
        int mayor, intermedio, menor;

        // Comparaciones para determinar el mayor, intermedio y menor
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                intermedio = num2;
                menor = num3;
            } else {
                intermedio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                intermedio = num1;
                menor = num3;
            } else {
                intermedio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                intermedio = num1;
                menor = num2;
            } else {
                intermedio = num2;
                menor = num1;
            }
        }

        // Mostrar los resultados
        System.out.println("Mayor: " + mayor);
        System.out.println("Intermedio: " + intermedio);
        System.out.println("Menor: " + menor);

        // Cerrar el scanner
        scanner.close();
    }
}