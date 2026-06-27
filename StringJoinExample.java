import java.util.Scanner;

public class StringJoinExample {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = entrada.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = entrada.nextLine();

        System.out.print("Ingrese el tercer nombre: ");
        String nombre3 = entrada.nextLine();

        // Código tradicional
        /*
        String nombres = nombre1 + ", " + nombre2 + ", " + nombre3;
        */

        // Forma abreviada
        String nombres = String.join(", ", nombre1, nombre2, nombre3);

        System.out.println("Nombres unidos: " + nombres);

    }

}