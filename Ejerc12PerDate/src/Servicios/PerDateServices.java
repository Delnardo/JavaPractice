/*
 * 
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Alfredo Delnardo
 */
public class PerDateServices {

    Scanner leer = new Scanner(System.in);
    //Persona per = new Persona();
    public void crearPersona(Persona per) {
        

        System.out.println("----------- Hola.! -------------");
        System.out.println("Ingrese tu nombre: ");
        per.setNombre(leer.nextLine());

        System.out.println("Ok, ahora ingresa tu fecha de nacimiento");
        int dia, mes, anio;

        System.out.println("Ingrese dia");
        dia = leer.nextInt();
        System.out.println("Ingrese mes");
        mes = leer.nextInt();
        System.out.println("Ingrese Año");
        anio = leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        per.setFechaNacimiento(fecha);

    }

    public void calcularEdad(Persona per) {
        Date fechaActual = new Date();
        
        
        System.out.println(per.getNombre() + " tiene: "+ (fechaActual.getYear() - per.getFechaNacimiento().getYear()) + " Años");
        //public int calcularEdad(){
        //LocalDate hoy = LocalDate.now();
        //Period periodo = Period.between(persona.getFechaNacimiento(), hoy);
        //return periodo.getYears();
        //} de esta manera se usa localDate,pero todas las variables deben ser del tipo localDate

        
    }
    
    public boolean menorQue(int edad,Persona per){
        boolean mnr=false;
        Date fechaActual = new Date();
        if (edad<(fechaActual.getYear() - per.getFechaNacimiento().getYear())) {
            mnr=true;  
        }
        return mnr;
        
    }

}
