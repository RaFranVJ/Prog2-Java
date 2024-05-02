
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio impropio #2 (8.2 del libro). */

public class DeclaraciónDeClases2 extends Ejercicio
{
/** ctor Base */

public DeclaraciónDeClases2()
{
id = 2;
nombre = "Declaración de la clase \"Edad\" ";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
Edad miEdad = new Edad();

miEdad.iniciar(4, 20, 30);

System.out.printf("Edad del niño: %d\n", miEdad.leerHijo() ); 
System.out.printf("Edad de la madre: %d\n", miEdad.leerMadre() ); 
System.out.printf("Edad del padre: %d\n", miEdad.leerPadre() ); 
}

}