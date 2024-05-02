
package com.programación2.prácticas.práctica4;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

/** Ejercicio impropio #6 (10.6 del libro). */

public class DeclaracionArrBidimensional extends Ejercicio
{
/** ctor Base */

public DeclaracionArrBidimensional()
{
id = 6;
nombre = "Declaración de arreglos bidimensionales";
		        
esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
Double tb[][] = { { 1.5, -2.5 }, { 5.0, -0.0, 1.5 } };

System.out.println("* Tabla \"tb\": \n");

SalidaDatos.imprimirArrComoTabla(tb, false);

// Otra forma de declarar Arreglos de 2D o más

Integer tabla1[][] =
{
	
{ 51, 52, 53 },
{ 54, 55, 56 }

};

System.out.println("* Tabla 1: \n");

SalidaDatos.imprimirArrComoTabla(tabla1, true);

Integer tabla2[][] = 
{

{ 1, 2, 3, 4 },
{ 5, 6, 7, 8 },
{ 9, 10, 11, 12 }
	
};

System.out.println("* Tabla 2: \n");

SalidaDatos.imprimirArrComoTabla(tabla2, true);
}

}