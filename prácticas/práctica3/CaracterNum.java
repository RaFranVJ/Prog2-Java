package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

/** Ejercicio impropio #11 (6.11 del libro) */

public class CaracterNum extends Ejercicio
{
/** Crea una nueva instancia de 'CaracterNum' */
	
public CaracterNum()
{
id = 11;
nombre = "Leer solo caracteres numéricos usando do-while";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
char digito;

do
digito = EntradaDatos.leerValor(lector, "Introduzca un dígito (0-9)", char.class);

while( (digito < '0') || (digito > '9') );
}

}