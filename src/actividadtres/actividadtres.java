package actividadtres;

import java.io.*;

public class actividadtres {
    public static void main(String[] args) {
        String ficheroUno = "actividad1_texto.txt"; // fichero de la actividad 1
        String ficheroDos = "actividad2_texto.txt"; // fichero de la actividad 2
        String ficheroFusion = "actividad3_fusion.txt"; // fichero resultado

        try {
            String contenidoUno = leerFichero(ficheroUno);

            String contenidoDos = leerFichero(ficheroDos);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroFusion))) {
                writer.write("- Contenido del Fichero Uno: " + contenidoUno + "\n");
                writer.write("- Contenido del Fichero Dos: " + contenidoDos + "\n");
                writer.write("\n---\nFirmado por: TuNombreAqui\n");
            }

            System.out.println("Fichero fusionado creado: " + ficheroFusion);

        } catch (IOException e) {
            System.err.println("Error en la operación: " + e.getMessage());
        }
    }

    private static String leerFichero(String nombreFichero) throws IOException {
        StringBuilder contenido = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        }

        if (contenido.length() > 0) {
            contenido.setLength(contenido.length() - 1);
        }

        return contenido.toString();
    }
}
