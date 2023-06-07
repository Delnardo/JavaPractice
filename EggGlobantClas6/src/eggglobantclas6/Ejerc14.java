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
public class Ejerc14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros a convertir: ");
        double cantidadEuros = scanner.nextDouble();

        System.out.print("Ingrese la moneda a la que desea convertir (libras = lib, dólares = usd o yenes = yns): ");
        String moneda = scanner.next();

        convertirMoneda(cantidadEuros, moneda);
    }

    public static void convertirMoneda(double cantidadEuros, String moneda) {
        double conversion = 0.0;
        String nombreMoneda = "";

        switch (moneda) {
            case "lib":
                conversion = cantidadEuros * 0.86;
                nombreMoneda = "libras";
                break;
            case "usd":
                conversion = cantidadEuros * 1.28611;
                nombreMoneda = "dólares";
                break;
            case "yns":
                conversion = cantidadEuros * 129.852;
                nombreMoneda = "yenes";
                break;
            default:
                System.out.println("Moneda no válida");
                return;
        }

        System.out.println(cantidadEuros + " euros equivale a " + conversion + " " + nombreMoneda);
    }
}