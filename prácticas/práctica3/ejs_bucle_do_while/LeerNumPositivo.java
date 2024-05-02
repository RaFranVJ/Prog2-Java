/**
 * 
 */
package com.programación2.prácticas.práctica3.ejs_bucle_do_while;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio propio #1 usando el bucle do-while */

public class LeerNumPositivo extends Ejercicio
{
/** ctor Base */

public LeerNumPositivo()
{
id = 1;
nombre = "Leer un número positivo";
				        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
int numero;

do
{
System.out.print("Introduce un número que sea mayor que 0: ");
numero = lector.nextInt();

System.out.println();
} 

while(numero <= 0);

System.out.println("El número que seleccionaste: " + numero);
}

}