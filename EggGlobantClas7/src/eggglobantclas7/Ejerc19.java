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
public class Ejerc19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int matrizAT[][] = new int[3][3];

        System.out.println("Presione enter para continuar");
        leer.nextLine();
        rellenarMatriz(matriz);

        System.out.println("*** Matriz Original ***");
        escribirMatriz(matriz);
        System.out.println("");

        System.out.println("*** Matriz traspuesta ***");
        trasponerMatriz(matriz, matrizAT);
        System.out.println("");

        System.out.println("");
        boolean matrizAntiSimetrica = verificarMatriz(matriz, matrizAT);
        if (matrizAntiSimetrica) {
            System.out.println("** La matriz ES antisimétrica. **");
        } else {
            System.out.println("** La matriz NO es antisimétrica. **");
        }

    }

    private static void rellenarMatriz(int[][] matriz) {
        Random aleatorio = new Random();
        Scanner leerNum = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese pos [" + i + "," + j + "]");
                matriz[i][j] = leerNum.nextInt(); //aleatorio.nextInt(18) - 9
            }
        }
    }

    private static void escribirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] >= 0) {
                    System.out.print(" " + matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }

    }

    private static void trasponerMatriz(int[][] matriz, int[][] matrizAT) {
        for (int i = 0; i < matrizAT.length; i++) {
            for (int j = 0; j < matrizAT.length; j++) {
                matrizAT[i][j] = matriz[j][i];
                if (matrizAT[i][j] >= 0) {
                    System.out.print(" " + matrizAT[i][j] + " ");
                } else {
                    System.out.print(matrizAT[i][j] + " ");
                }
            }
            System.out.println("");
        }

    }

    private static boolean verificarMatriz(int[][] matriz, int[][] matrizAT) {
        for (int i = 0; i < matrizAT.length; i++) {
            for (int j = 0; j < matrizAT.length; j++) {
                if (matriz[i][j] != -matrizAT[i][j]) {
                    return false;
                }

            }

        }
        return true;
    }

}
