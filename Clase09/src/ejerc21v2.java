/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Alfredo Delnardo
 */
public class ejerc21v2 {

    /**
     * @param args the command line arguments
     */
    


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int M[][] = new int[10][10];
        int P[][] = new int[3][3];

        System.out.println("Presione enter para continuar");
        leer.nextLine();
        rellenarMatriz(M);

        System.out.println("*** Matriz 10x10 ***");
        escribirMatriz(M);
        System.out.println("");

        System.out.println("*** Buscar Matriz ***");
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P.length; j++) {
                System.out.println("Ingrese pos [" + i + "," + j + "]");
                P[i][j] = leer.nextInt();
            }
        }

        buscarMatriz(M, P);

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
                if (M[i][j] >= 0) {
                    System.out.print(" " + M[i][j] + " ");
                } else {
                    System.out.print(M[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    private static void buscarMatriz(int[][] M, int[][] P) {
        for (int i = 0; i < M.length - P.length + 1; i++) {
            for (int j = 0; j < M.length - P.length + 1; j++) {
                if (coincideSubmatriz(M, P, i, j)) {
                    System.out.println("La submatriz P coincide en la posición [" + i + "," + j + "]");
                    return; 
                }
            }
        }

        System.out.println("La submatriz P no se encuentra en la matriz M.");
    }

    private static boolean coincideSubmatriz(int[][] M, int[][] P, int row, int col) {
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P.length; j++) {
                if (M[row + i][col + j] != P[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
