import java.io.*;

public class ContadorCaracteres {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java ContadorArchivo <archivo>");
            return;
        }

        String archivo = args[0];
        int caracteres = 0, palabras = 0, lineas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                lineas++;
                caracteres += linea.length();
                palabras += linea.split("\\s+").length; // Separar palabras por espacios
            }

            System.out.println("El archivo tiene:");
            System.out.println(caracteres + " caracteres");
            System.out.println(palabras + " palabras");
            System.out.println(lineas + " lineas");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
