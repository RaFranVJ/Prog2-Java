package com.programación2.prácticas.práctica3;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

/** Ejercicio impropio #2 (6.2 del libro) */

public class BanderaEnWhile extends Ejercicio
{
// Constructor por default
			
public BanderaEnWhile()
{
id = 2;
nombre = "Leer solo caracteres numéricos usando bucle while";

esPropio = false;
}

/** Valida el digito ingresado por el usuario usando el bucle while. */

@Override
		
public void ejecutar(Scanner lector)
{
boolean digito_leido = false; // no se ha leído ningún dato
char car;

while(!digito_leido)
{
car = EntradaDatos.leerValor(lector, "Introduzca un caracter entre 0 y 9", char.class);

digito_leido = ( ('0'<= car) && (car <= '9') );
} 

}

}