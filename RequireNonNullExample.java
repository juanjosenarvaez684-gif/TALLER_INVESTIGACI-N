import java.util.Objects;
import java.util.Scanner;

public class RequireNonNullExample {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un nombre: ");
        String nombre = entrada.nextLine();

        if (nombre.isBlank()) {
            nombre = null;
        }

        // Código tradicional
        /*
        if(nombre == null){
            throw new NullPointerException("El nombre no puede ser nulo.");
        }
        */

        // Forma abreviada
        Objects.requireNonNull(nombre, "El nombre no puede ser nulo.");

        System.out.println("Nombre ingresado: " + nombre);

    }

}