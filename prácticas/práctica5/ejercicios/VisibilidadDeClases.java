
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.soporte.*;

/** Ejercicio impropio #3 (8.3 del libro). */

public class VisibilidadDeClases extends Ejercicio
{
/** ctor Base */

public VisibilidadDeClases()
{
id = 3;
nombre = "Declaraciónn de clases con diferentes visibilidades";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
Marco m = new Marco();

m.poner();

System.out.println("Tu foto enmarcada: " + m.t); 
}

}