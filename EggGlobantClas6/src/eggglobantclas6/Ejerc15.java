/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggglobantclas6;

import java.util.Scanner;

/**
 *
 * @author Alfredo Delnardo
 */
public class Ejerc15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cualquier valor y presione la tecla enter para iniciar: ");
        scanner.nextLine();

        int[] numeros = new int[100];

        // Rellenar el vector con los 100 primeros números enteros
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Mostrar los números en orden descendente
        for (int i = 99; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

