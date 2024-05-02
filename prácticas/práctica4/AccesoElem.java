
package com.programación2.prácticas.práctica4;

import java.util.*;
import com.programación2.*;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio impropio #3 (10.3 del libro). */

public class AccesoElem extends Ejercicio
{
/** ctor Base */

public AccesoElem()
{
id = 3;
nombre = "Acceso a diferentes elementos de diferentes arreglos";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
Integer[] mes = new Integer[12];

Float [] salarios = new Float[25];

mes[4] = 5;
System.out.printf("El elemento #15 de [salario] es: %s\n", salarios[mes[4] * 3] ); 

final int MX = 20;

Racional []ra = new Racional[MX];

System.out.printf("El elemento #15 de [ra] es: %s\n", ra[MX - 4] ); 
}

}