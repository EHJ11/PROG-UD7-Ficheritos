package actividaddos;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String nombreFichero = "actividad2_texto.txt";
        String texto = "Hola, pibe.";

        try (FileWriter writer = new FileWriter(nombreFichero)) {
            writer.write(texto);
            System.out.println("Texto escrito en el fichero: " + nombreFichero);
        } catch (IOException e) {
            System.err.println("Error escribiendo el fichero: " + e.getMessage());
            return;
        }

        try (FileReader reader = new FileReader(nombreFichero)) {
            int caracter;
            StringBuilder resultado = new StringBuilder();

            while ((caracter = reader.read()) != -1) {
                char c = (char) caracter;
                resultado.append(c).append("_").append(caracter).append(", ");
            }

            if (resultado.length() > 2) {
                resultado.setLength(resultado.length() - 2);
            }

            System.out.println(resultado.toString());

        } catch (IOException e) {
            System.err.println("Error leyendo el fichero: " + e.getMessage());
        }
    }
}
