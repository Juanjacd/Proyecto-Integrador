
package com.mycompany.evaluacionempleado;

import java.util.Scanner;

public class EvaluacionEmpleado {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Preguntar la puntuación del empleado
        System.out.print("Introduce tu puntuación de evaluación: ");
        double puntuacion = scanner.nextDouble();

        // Definir la base del dinero por puntuación
        double baseDinero = 2400;

        // Inicializar variables para el nivel de rendimiento y el dinero
        String nivelRendimiento;
        double dinero;

        // Evaluar la puntuación
        if (puntuacion == 0.0) {
            nivelRendimiento = "Inaceptable";
            dinero = baseDinero * puntuacion;
        } else if (puntuacion == 0.4) {
            nivelRendimiento = "Aceptable";
            dinero = baseDinero * puntuacion;
        } else if (puntuacion >= 0.6) {
            nivelRendimiento = "Meritorio";
            dinero = baseDinero * puntuacion;
        } else {
            nivelRendimiento = "Puntuación no válida";
            dinero = 0.0;
        }

        // Mostrar el nivel de rendimiento y la cantidad de dinero que recibirá
        if (nivelRendimiento.equals("Puntuación no válida")) {
            System.out.println(nivelRendimiento);
        } else {
            System.out.println("Nivel de rendimiento: " + nivelRendimiento);
            System.out.println("Cantidad de dinero obtenida: " + dinero + " €");
        }

        // Cerrar el scanner
        scanner.close();
    }
}