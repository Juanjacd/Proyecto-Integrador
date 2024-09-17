

package com.mycompany.calificaciondatos;

import java.util.Random;


public class CalificacionDatos {

    public static void main(String[] args) {
         // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Simular el lanzamiento de tres dados
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int dado3 = random.nextInt(6) + 1;

        // Mostrar los valores de los dados
        System.out.println("Resultado de los dados:");
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Dado 3: " + dado3);

        // Contar la cantidad de "seis" obtenidos
        int cantidadSeis = 0;

        if (dado1 == 6) {
            cantidadSeis++;
        }
        if (dado2 == 6) {
            cantidadSeis++;
        }
        if (dado3 == 6) {
            cantidadSeis++;
        }

        // Evaluar el puntaje según la cantidad de seis obtenidos
        if (cantidadSeis == 3) {
            System.out.println("¡Excelente! Obtuviste tres seises.");
        } else if (cantidadSeis == 2) {
            System.out.println("¡Muy bien! Obtuviste dos seises.");
        } else if (cantidadSeis == 1) {
            System.out.println("Regular. Obtuviste un seis.");
        } else {
            System.out.println("Mal. No obtuviste ningún seis.");
        }
    }
}
   
