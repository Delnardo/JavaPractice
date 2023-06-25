/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carapp.servicios;

import carapp.entidades.Carro;
import java.util.Scanner;

/**
 *
 * @author Alfredo Delnardo
 */
public class ServicioCar {

    private Scanner read = new Scanner(System.in);

    public Carro crearCarro() {
        System.out.println("Ingrese nombre del carro");
        String nombre=read.next();
        System.out.println("Ingrese marca del carro");
        String marca=read.next();
        System.out.println("Ingrese año del carro");
        int anio=read.nextInt();
        return new Carro(marca, nombre, anio);
        
        
        
    }
}
