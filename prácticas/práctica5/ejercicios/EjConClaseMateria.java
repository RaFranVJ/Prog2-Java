
package com.programación2.prácticas.práctica5.ejercicios;

import java.time.*;
import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio propio #2. */

public class EjConClaseMateria extends Ejercicio
{
/** ctor Base */

public EjConClaseMateria()
{
id = 2;
nombre = "Declaración de la clase \"Materia\" ";
		        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
Materia ma = new Materia("Estadística", "Juan Perez", LocalTime.NOON, 4);

ma.mostrarInfo();
}

}