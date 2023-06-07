/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggglobantclas6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alfredo Delnardo
 */
public class Ejerc17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        int[] vector = generarVectorAleatorio(n);

        int[] conteoDigitos = contarDigitos(vector);

        for (int i = 0; i < conteoDigitos.length; i++) {
            System.out.println("Cantidad de números con " + (i + 1) + " dígito(s): " + conteoDigitos[i]);
        }
    }

    public static int[] generarVectorAleatorio(int n) {
        int[] vector = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(100000); // Genera números aleatorios entre 0 y 99999
            System.out.print(" -" + vector[i]);
        }
        System.out.println("");
        return vector;
    }

    public static int[] contarDigitos(int[] vector) {
        int[] conteoDigitos = new int[5];

        for (int numero : vector) {
            int digitos = obtenerCantidadDigitos(numero);
            if (digitos >= 1 && digitos <= 5) {
                conteoDigitos[digitos - 1]++;
            }
        }

        return conteoDigitos;
    }

    public static int obtenerCantidadDigitos(int numero) {
        if (numero == 0) {
            return 1;
        }

        int contador = 0;
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }
        return contador;
    }
}