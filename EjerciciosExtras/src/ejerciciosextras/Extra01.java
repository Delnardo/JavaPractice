/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    *
    *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    *usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejerciciosextras;

import java.util.Scanner;
import java.math.*;

/**
 *
 * @author Alfredo Delnardo
 */
public class Extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double min;

        Scanner read = new Scanner(System.in);

        System.out.println("*** Ingrese cantidad de minutos para convertir en Dias ***");

        min = read.nextInt();

        calcularDias(min);

    }

    private static void calcularDias(double min) {

        double hrs = min / 60;
        double Days = hrs / 24;
        double DaysRes;
        DaysRes = Math.floor(Days);
        double hrsRes = (Days - DaysRes) * 24;

        System.out.println("-> " + min + " minutos, son: " + DaysRes + " Dias, con " + (Math.floor(hrsRes*100)/100) + " horas");

    }

}
