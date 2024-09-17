
package com.mycompany.verificarcontrasena;

import java.util.Scanner;

public class Verificarcontrasena {

    public static void main(String[] args) {
     // Almacenar la contraseña en una variable
        String contrasenaGuardada = "MiContraseñaSegura";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Preguntar al usuario por la contraseña
        System.out.print("Introduce la contraseña: ");
        String contrasenaIntroducida = scanner.nextLine();

        // Comparar las contraseñas sin tener en cuenta mayúsculas y minúsculas
        if (contrasenaGuardada.equalsIgnoreCase(contrasenaIntroducida)) {
            System.out.println("¡La contraseña es correcta!");
        } else {
            System.out.println("La contraseña es incorrecta.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
