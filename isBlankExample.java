import java.util.Scanner;

public class IsBlankExample {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = entrada.nextLine();

        // Código tradicional
        /*
        if(texto.trim().isEmpty()){

            System.out.println("La cadena está vacía.");

        }else{

            System.out.println("La cadena tiene contenido.");

        }
        */

        // Forma abreviada
        if (texto.isBlank()) {

            System.out.println("La cadena está vacía.");

        } else {

            System.out.println("La cadena tiene contenido.");

        }

    }

}