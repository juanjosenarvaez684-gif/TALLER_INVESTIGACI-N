import java.util.Scanner;

public class VarargsExample {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos números desea sumar?: ");
        int cantidad = entrada.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("La suma es: " + sumar(numeros));

    }

    // Código tradicional
    /*
    public static int sumar(int[] numeros) {

        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }
    */

    // Forma abreviada con Varargs
    public static int sumar(int... numeros) {

        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }

}