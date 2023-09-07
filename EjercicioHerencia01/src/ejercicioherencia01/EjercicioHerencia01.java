
package ejercicioherencia01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;


/**
 * @author Alfredo Delnardo
 */
public class EjercicioHerencia01 {

    public static void main(String[] args) {
        // Crear instancias de animales
        Animal miPerro = new Perro("Max", 5, "Labrador");
        Animal miGato = new Gato("Whiskers", 3, "Siamese");
        Animal miCaballo = new Caballo("Spirit", 8, "Pura Sangre");

        // Llamar al método para mostrar cómo se alimenta cada animal
        miPerro.alimentarse();
        miGato.alimentarse();
        miCaballo.alimentarse();
    }
}

