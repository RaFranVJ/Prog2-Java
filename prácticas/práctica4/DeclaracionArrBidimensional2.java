
package com.programación2.prácticas.práctica4;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

/** Ejercicio impropio #7 (10.7 del libro). */

public class DeclaracionArrBidimensional2 extends Ejercicio
{
/** ctor Base */

public DeclaracionArrBidimensional2()
{
id = 7;
nombre = "Declaración de arreglos bidimensionales con distintas filas";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
Double [][]gr = new Double[3][]; 

System.out.println("* Tabla \"gr\": \n");

gr[0] = new Double[3];
gr[1] = new Double[6];
gr[2] = new Double[5];

SalidaDatos.imprimirArrComoTabla(gr, true);

Integer [][]pres = new Integer[4][]; 

pres[0] = new Integer[] { 1, 3, 5, 7 }; // 4
pres[1] = new Integer[] { 2, 6, 8 }; // 3
pres[2] = new Integer[] { 9, 11 };
pres[3] = new Integer[] { 10 };

System.out.println("* Tabla \"pres\": \n");

SalidaDatos.imprimirArrComoTabla(pres, false);
}

}