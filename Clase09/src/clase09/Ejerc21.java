/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase09;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alfredo Delnardo
 */
public class Ejerc21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int M[][] = new int[3][3];
        int P[][] = new int[3][3];
        

        System.out.println("Presione enter para continuar");
        leer.nextLine();
        rellenarMatriz(M);
        
        System.out.println("*** Matriz Original ***");
        escribirMatriz(M);
        System.out.println("");
        
        System.out.println("*** Matriz traspuesta ***");
        trasponerMatriz(M);
        System.out.println(""
                + "");

    }

    private static void rellenarMatriz(int[][] M) {
        Random aleatorio = new Random();
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = aleatorio.nextInt(10);
            }
        }
    }

    private static void escribirMatriz(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }

    }

    private static void trasponerMatriz(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print(M[j][i] + " ");
            }
            System.out.println("");
        }
    }

}
