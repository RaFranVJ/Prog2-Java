
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio impropio #6 (8.6 del libro). */

public class CtorsDeUnaClase extends Ejercicio
{
/** ctor Base */

public CtorsDeUnaClase()
{
id = 6;
nombre = "Constructores de una clase";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
Rectangulo rect = new Rectangulo(25, 25, 75, 75);

System.out.println("====== Rectángulo ======"); 

System.out.printf("Longitud del lado izquierdo: %d\n", rect.leerIzq() ); 
System.out.printf("Longitud del lado superior: %d\n", rect.leerSup() ); 
System.out.printf("Longitud del lado derecho: %d\n", rect.leerDcha() ); 
System.out.printf("Longitud del lado inferior: %d\n", rect.leerInf() ); 
}

}