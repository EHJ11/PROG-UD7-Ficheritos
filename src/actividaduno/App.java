package actividaduno;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;
        int longitudMinima = 30;

        do {
            System.out.print("Introduce un texto (mínimo 30 caracteres): ");
            texto = scanner.nextLine();
            int caracteresFaltan = longitudMinima - texto.length();

            if (caracteresFaltan > 0) {
                System.out.println("Te faltan " + caracteresFaltan + " caracteres.");
            }
        } while (texto.length() < longitudMinima);

        String textoFormateado = texto.toUpperCase().replace(" ", "_");

        String nombreFichero = "actividad1_texto.txt";

        try (FileWriter writer = new FileWriter(nombreFichero)) {
            writer.write(textoFormateado);
            System.out.println("Texto formateado guardado en " + nombreFichero);
        } catch (IOException e) {
            System.err.println("Error al guardar el fichero: " + e.getMessage());
        }

        scanner.close();
    }
}
