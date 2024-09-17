package com.mycompany.tributacion;

import java.util.Scanner;

public class Tributacion {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Preguntar la edad del usuario
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        // Preguntar los ingresos mensuales del usuario
        System.out.print("Introduce tus ingresos mensuales en euros: ");
        double ingresos = scanner.nextDouble();

        // Verificar si el usuario debe tributar
        if (edad > 16 && ingresos >= 1000) {
            System.out.println("Debes tributar.");
        } else {
            System.out.println("No debes tributar.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}