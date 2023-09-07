/*
 *Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejerc10arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Alfredo Delnardo
 */
public class Ejerc10Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rand = new Random();

        double[] arrayA = new double[50];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = rand.nextDouble() * 20;
            System.out.println("arrayA - Pos " + (i + 1) + ": " + arrayA[i]);
        }
        Arrays.sort(arrayA);
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("arrayA - Pos " + (i + 1) + ": " + arrayA[i]);
        }
        System.out.println("-------------------------------------------------");
        double[] arrayB = new double[20];
        for (int i = 0; i < 10; i++) {
            arrayB[i] = arrayA[i];
            System.out.println("arrayB - Pos " + (i + 1) + ": " + arrayB[i]);
        }
        for (int i = 10; i < 20; i++) {
            arrayB[i] = 0.5;
            System.out.println("arrayB - Pos " + (i + 1) + ": " + arrayB[i]);
        }

    }

}
