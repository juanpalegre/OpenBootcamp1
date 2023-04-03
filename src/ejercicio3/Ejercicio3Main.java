package ejercicio3;

import java.util.ArrayList;

public class Ejercicio3Main {

    //El ejercicio solicita crear un bucle que permita concatenar texto e imprima el resultado final por consola

    public static void main(String[] args) {

        String[] texto = {"Uno", "dos", "tres", "cuatro", "cinco"};
        concatenarTexto(texto);
    }

    public static void concatenarTexto(String[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }

    }

}
