/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cuadrado;

/**
 *
 * @author Alfredo Delnardo
 */
public class Calculos {
    
    public double calcularArea(Cuadrado c){
        return c.getAncho()*c.getLargo();
        
    }
    
    public double calcularPerimetro(Cuadrado c){
        return (c.getAncho()+c.getLargo())*2;
        
    }
    
}
