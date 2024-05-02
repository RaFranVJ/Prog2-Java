/**
 * 
 */
package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio impropio #21 (6.21 del libro) */

public class LeerDistancia extends Ejercicio {

/** ctor base */
	
public LeerDistancia()
{
id = 21;
nombre = "Explorar tabla de clasificaciones";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{

for(int i = 1; i <= 25; i++)
{
int d = leerDistancia(i);

if(d == 0) // salida de bucle
break;

System.out.printf("Distancia: %d\n", d);
}

}

private int leerDistancia(int base)
{
return base - 25;
}

}