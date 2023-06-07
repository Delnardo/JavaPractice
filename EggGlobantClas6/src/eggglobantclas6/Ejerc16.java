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
public class Ejerc16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();
        
        int[] vector = generarVectorAleatorio(n);

        System.out.print("Ingrese un número a buscar en el vector: ");
        int numeroBuscado = scanner.nextInt();

        int indiceEncontrado = buscarNumero(vector, numeroBuscado);

        if (indiceEncontrado != -1) {
            System.out.println("El número " + numeroBuscado + " se encuentra en el índice [" + indiceEncontrado + "] del vector.");

            if (esRepetido(vector, numeroBuscado)) {
                System.out.println("El número " + numeroBuscado + " se encuentra repetido en el vector.");
            }
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el vector.");
        }
    }

    public static int[] generarVectorAleatorio(int n) {
        int[] vector = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(100); // Genera números aleatorios entre 0 y 99
            System.out.print("- " + vector[i]);
        }
        System.out.println("");
        return vector;
    }

    public static int buscarNumero(int[] vector, int numero) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    public static boolean esRepetido(int[] vector, int numero) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                contador++;
                
            }
        }
        return contador > 1;
    }
}