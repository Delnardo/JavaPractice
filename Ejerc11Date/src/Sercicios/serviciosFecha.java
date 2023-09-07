/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sercicios;

import Entidades.Fechas;
import java.util.Scanner;

/**
 *
 * @author Alfredo Delnardo
 */
public class serviciosFecha {
    Scanner leer=new Scanner(System.in);
    Fechas fecha=new Fechas();
    
    public void crearFecha(){
        System.out.println("Ingrese dia");
        fecha.setDia(leer.nextInt());
        System.out.println("Ingrese mes");
        fecha.setMes(leer.nextInt());
        System.out.println("Ingrese Año");
        fecha.setAnio(leer.nextInt());
        
    }
    
}
