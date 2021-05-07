package src.test.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*se invoca la clase scanner para guardar un dato digitado*/
        Scanner lector = new Scanner(System.in);
        String texto = "";
        char [] letras;
        /*Se inicializan las variables que guardaran el contador de letras repetidas y la letra repetida*/
        int mayorRepeticion = 0;
        char letraMasRepetida = 0;
        /*Se asigna a una variable la frase digitada*/
        System.out.println("Escribe una frase: ");
        texto = lector.nextLine();
        letras = texto.toCharArray();
        /*Se recorre la frase dependiendo de la cantidad de letras identificadas*/
        for(int i=0; i<letras.length; i++){

            char letraActual = letras[i];
            int contador = 0;
        /*Se almacena la cantidad de veces que esta una letra y se recorre la frase*/
            for (int j =0; j<letras.length; j++){
                if (letras[j] == letraActual)
                    contador++;
            }
        /*Se compara la letra repetida con la que se almacena en el contador */
            if(mayorRepeticion < contador)
            {
                mayorRepeticion = contador;
                letraMasRepetida = letraActual;
            }
        }

        System.out.println(letraMasRepetida +": Se repite "+mayorRepeticion);

    }
}

