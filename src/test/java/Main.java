package src.test.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void ordenamientoArreglos(Character[] letras, int[] apariciones) {
        for (int j = letras.length - 1; j > 0; j--) {
            for (int k = 0; k < j; k++) {
                if (k + 1 <= j && apariciones[k] < apariciones[k + 1]) {
                    Character aux = letras[k];
                    int iux = apariciones[k];
                    letras[k] = letras[k + 1];
                    apariciones[k] = apariciones[k + 1];
                    letras[k + 1] = aux;
                    apariciones[k + 1] = iux;
                }
            }
        }
    }
    public static void main(String[] args) {
        /*se llama la clase scanner para ingresar el dato*/
        Map<Character, Integer> caracteres = new HashMap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String cadena = sc.nextLine();
        /*se extrae cada posicion de cada letra*/
        for (char c : cadena.toCharArray()) {
            caracteres.put(c, caracteres.containsKey(c) ? caracteres.get(c) + 1 : 1);
        }
        Character[] letras = new Character[caracteres.size()];
        int[] apariciones = new int[letras.length];
        caracteres.keySet().toArray(letras);
        /*se realiza la comparacion de la candidad de veces que aparece una letra*/
        for (int j = 0; j < apariciones.length; j++) {
            apariciones[j] = caracteres.get(letras[j]);
        }
        ordenamientoArreglos(letras, apariciones);
        System.out.println("Las letras de la frase \"" + cadena + "\" se repiten así:");
        /*se imprime las letras repitas*/
        for (int j = 0; j < apariciones.length; j++) {
            if(apariciones[j]>1){
                System.out.println(letras[j] + ": " + apariciones[j]);
            }
        }
    }
}