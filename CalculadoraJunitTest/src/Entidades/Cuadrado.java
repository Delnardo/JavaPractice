/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Alfredo Delnardo
 */
public class Cuadrado {

    //atributos
    private double largo;
    private double ancho;
    private String color;
    private boolean active;

    public Cuadrado() {
    }

    public Cuadrado(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
        this.color = "amarillo";
        this.active = true;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "largo=" + largo + ", ancho=" + ancho + ", color=" + color + ", active=" + active + '}';
    }
    
    
}
