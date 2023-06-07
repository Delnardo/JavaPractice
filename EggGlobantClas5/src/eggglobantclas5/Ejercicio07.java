/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package eggglobantclas5;

import java.util.Scanner;

/**
 *
 * @author Alfredo Delnardo
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        
        if (frase.endsWith("eureka")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
