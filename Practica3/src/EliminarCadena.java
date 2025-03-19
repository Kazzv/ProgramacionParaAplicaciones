import java.io.*;
import java.nio.file.*;

public class EliminarCadena {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java EliminarCadena <cadena> <archivo>");
            return;
        }

        String cadena = args[0];
        String archivo = args[1];

        try {
            Path path = Paths.get(archivo);
            String contenido = new String(Files.readAllBytes(path));
            contenido = contenido.replace(cadena, "");
            Files.write(path, contenido.getBytes());
            System.out.println("Todas las apariciones de '" + cadena + "' han sido eliminadas del archivo.");
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}