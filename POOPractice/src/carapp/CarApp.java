/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carapp;

import carapp.entidades.Carro;
import carapp.servicios.ServicioCar;
import java.util.Scanner;

/**
 *
 * @author Alfredo Delnardo
 */
public class CarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Carro c001 = new Carro("VW", "Gol G4", 2008);

//        c001.nombre = "Gol G4";
//        c001.color = "blanco";
//        c001.marca = "VW";
//        c001.motor = 1.8;
//        c001.tipo = "sedan";
//        c001.kms = 115000;
//        c001.dirHid = true;
        c001.setNombre("Gol G4");
        System.out.println("Ingrese kilometraje del auto");
        c001.setKms(leer.nextInt());
        
        c001.costear(c001.getKms());

        System.out.println(c001.getMarca() + " " + c001.getNombre() + " Año " + c001.getAnio());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(c001);
        System.out.println("--------------------------------------------------------------------------------");
        
        ServicioCar SC=new ServicioCar();
        
        Carro c002= SC.crearCarro();
        System.out.println(c002.toString());

//    public String nombre;
//    public String marca;
//    public String tipo;
//    public int año;
//    public int kms;
//    public String color;
//    public double motor;
//    public boolean dirHid;
    }

}
