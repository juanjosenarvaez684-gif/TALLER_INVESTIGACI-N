import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourcesExample {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo: ");
        String archivo = entrada.nextLine();

        // Código tradicional
        /*
        BufferedReader lector = null;

        try {

            lector = new BufferedReader(new FileReader(archivo));
            System.out.println(lector.readLine());

        } finally {

            if (lector != null) {
                lector.close();
            }

        }
        */

        // Forma abreviada
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {

            System.out.println("Primera línea:");
            System.out.println(lector.readLine());

        } catch (IOException e) {

            System.out.println("No fue posible abrir el archivo.");

        }

    }

}