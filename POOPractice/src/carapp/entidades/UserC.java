/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carapp.entidades;

import java.util.Date;

/**
 *
 * @author Alfredo Delnardo
 */
public class UserC {

    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String ciudad;

    public UserC() {

    }

    public UserC(String nombre, String apellido, int dni, Date nacimiento, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.ciudad = ciudad;
    }

}
