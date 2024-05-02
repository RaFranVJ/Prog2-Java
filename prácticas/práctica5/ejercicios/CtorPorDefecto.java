
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio impropio #7 (8.7 del libro). */

public class CtorPorDefecto extends Ejercicio
{
/** ctor Base */

public CtorPorDefecto()
{
id = 7;
nombre = "Constructor por defecto de una clase";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
Punto p1 = new Punto();

System.out.println("====== Punto en el plano ======"); 

System.out.printf("Coordenada X	: %d\n", p1.leerX() ); 
System.out.printf("Coordenada Y: %d\n", p1.leerY() ); 
}

}