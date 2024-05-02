
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio propio #3. */

public class EjConClaseMascota extends Ejercicio
{
/** ctor Base */

public EjConClaseMascota()
{
id = 3;
nombre = "Diferentes instancias de la clase \"Mascota\" ";
		        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
Mascota miPerro = new Mascota("Perro", "Timmy", "Puddle", 3);
miPerro.mostrarInfo();

Mascota miGato = new Mascota("Gato", "Gary", "Angora", 5);
miGato.mostrarInfo();
}

}