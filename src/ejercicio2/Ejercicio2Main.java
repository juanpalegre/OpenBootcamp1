package ejercicio2;

import java.util.Scanner;

public class Ejercicio2Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precio = teclado.nextDouble();
        System.out.println("El precio de su producto con IVA es: " + calcularIva(precio));

    }

    private static double calcularIva(double precio) {
        return precio * 1.21;
    }

}
