
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio impropio #1 (8.1 del libro). */

public class DeclaraciónDeClases extends Ejercicio
{
/** ctor Base */

public DeclaraciónDeClases()
{
id = 1;
nombre = "Declaración de la clase \"Punto\" ";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
Punto p = new Punto();

p.fijarX (100);

System.out.println(" Coordenada x es " + p.leerX() ); 
}

}