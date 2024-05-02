
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio impropio #4 (8.4 del libro). */

public class MetodosDeUnaClase extends Ejercicio
{
/** ctor Base */

public MetodosDeUnaClase()
{
id = 4;
nombre = "Métodos de una clase";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
Racional r = new Racional();

r.fijar(8, 5);

r.mostrar();
}

}