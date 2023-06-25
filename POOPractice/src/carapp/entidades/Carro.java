/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carapp.entidades;

/**
 *
 * @author Alfredo Delnardo
 */
public class Carro {

    private String nombre;
    private String marca;
    private String tipo;
    private int anio;
    private int kms;
    private String color;
    private double motor;
    private boolean dirHid;

    private int costo;

    public Carro() {

        this.costo = 1000;

    }

    public Carro(String marca, String nombre, int anio) {
        this.marca = marca;
        this.nombre = nombre;
        this.anio = anio;
        this.costo = 1000;

    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
        this.costo = 1000;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAño(int anio) {
        this.anio = anio;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public void setDirHid(boolean dirHid) {
        this.dirHid = dirHid;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAnio() {
        return anio;
    }

    public int getKms() {
        return kms;
    }

    public String getColor() {
        return color;
    }

    public double getMotor() {
        return motor;
    }

    public boolean isDirHid() {
        return dirHid;
    }
    
    /**
     * Funcion para valorar el auto segun el Km
     * @param valorarKms
     * @return costo 
     */

    public int costear(int valorarKms) {

        /*
        costo = costo-valorarkms
        es lo mismo que: costo -=valorarKms
         */
        if (valorarKms < 100000) {

            costo = costo + 1000;
        } else if ((valorarKms >= 100000) && (valorarKms < 150000)) {
            costo = costo + 500;

        } else {

            costo = costo - 100;
        }
        return costo;

    }

    @Override
    public String toString() {
        return "Carro{" + "nombre=" + nombre + ", marca=" + marca + ", tipo=" + tipo + ", anio=" + anio + ", kms=" + kms + ", color=" + color + ", motor=" + motor + ", dirHid=" + dirHid + ", costo=" + costo + '}';
    }

   

}
