
package Entidades;

/**
 *
 * @author Alfredo Delnardo
 */
public class Animal {
    
    // Clase Animal (clase padre)
    
    private String nombre;
    private String alimento;
    private int edad;
    private String raza;

    // Constructor
    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    // Método para mostrar cómo se alimenta el animal
    public void alimentarse() {
        System.out.println(nombre + " se alimenta de " + alimento);
    }

    
}
