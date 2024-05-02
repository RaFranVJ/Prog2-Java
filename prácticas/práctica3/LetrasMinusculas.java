/**
 * 
 */
package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio impropio #13 (6.13 del libro) */

public class LetrasMinusculas extends Ejercicio {

/** Crea una nueva instancia de 'LetrasMinusculas' */

public LetrasMinusculas()
{
id = 13;
nombre = "Mostrar las letras en minúsculas";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
char car = 'a';

do
{ 
System.out.print(car + " ");
car++;
} 

while (car <= 'z'); 
}

}