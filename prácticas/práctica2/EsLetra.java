package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio impropio #10 (Ejemplo 5.10 del libro)

public class EsLetra extends Ejercicio
{
// Constructor por default
	
public EsLetra()
{
id = 10;
nombre = "Verificar si un caracter es una letra (Ejemplo 5.10)";

esPropio = false;
}

@Override

// Verifica que el caracter ingresado por el usuario sea una letra o no

public void ejecutar(Scanner lector)
{
char car = EntradaDatos.leerValor(lector, "Ingresa un caracter", char.class);

switch(car) 
{
case 'a': case 'A':
case 'e': case 'E':
case 'i': case 'I':
case 'o': case 'O':
case 'u': case 'U':
		 
System.out.println(car + " es una vocal");
break;
	 
default:
System.out.println(car + " no es una vocal");
break;
}

}

}
