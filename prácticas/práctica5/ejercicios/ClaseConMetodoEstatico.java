
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio impropio #9 (8.9 del libro). */

public class ClaseConMetodoEstatico extends Ejercicio
{
/** ctor Base */

public ClaseConMetodoEstatico()
{
id = 9;
nombre = "Clase con método estático";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
long s = SumaSerie.suma();

System.out.printf("La suma de la serie (%d, %d) es [ %d ]", SumaSerie.leerN(), SumaSerie.leerM(), s); 
}

}