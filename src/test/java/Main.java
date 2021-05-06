package src.test.java;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    String texto = "";
    char [] letras;

    int mayorRepeticion = 0;
    char letraMasRepetida = 0;

    System.out.println("Escribe una frase: ");

    texto = lector.nextLine();
    letras = texto.toCharArray();

    for(int i=0; i<letras.length; i++){

        char letraActual = letras[i];
        int contador = 0;

        for (int j =0; j<letras.length; j++){
            if (letras[j] == letraActual)
                contador++;
        }

        if(mayorRepeticion < contador)
        {
            mayorRepeticion = contador;
            letraMasRepetida = letraActual;
        }
    }

    System.out.println(letraMasRepetida +": Se repite "+mayorRepeticion);

}
}
