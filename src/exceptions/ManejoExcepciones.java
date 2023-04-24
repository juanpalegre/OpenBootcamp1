package exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManejoExcepciones {

    public static void main(String[] args) {
        // Aritmethic Exception
        int dividendo = 10;
        int divisor = 0;

        try {
            int resultado = dividendo / divisor;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero");
        }

        // OutOfBoundsException
        int[] arreglo = new int[6];

        try {
            arreglo[8] = 5;
            System.out.println(arreglo[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El índice está fuera de los límites del arreglo");
        }

        // FileNotFound
        try {
            File archivo = new File("archivo.txt");
            Scanner scanner = new Scanner(archivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
    }
}

