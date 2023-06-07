/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggglobantclas7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alfredo Delnardo
 */
public class Ejerc18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[4][4];

        System.out.println("Presione enter para continuar");
        leer.nextLine();
        rellenarMatriz(matriz);
        
        System.out.println("*** Matriz Original ***");
        escribirMatriz(matriz);
        System.out.println("");
        
        System.out.println("*** Matriz traspuesta ***");
        trasponerMatriz(matriz);
        System.out.println(""
                + "");

    }

    private static void rellenarMatriz(int[][] matriz) {
        Random aleatorio = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
            }
        }
    }

    private static void escribirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

    private static void trasponerMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
    }

}
