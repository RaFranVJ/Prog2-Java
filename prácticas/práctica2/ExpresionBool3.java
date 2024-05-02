package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio impropio #4 (Ejemplo 4.8 del libro)

public class ExpresionBool3 extends Ejercicio
{
// Constructor por default
	
public ExpresionBool3()
{
id = 4;
nombre = "Evaluar varias expresiones booleanas (Ejemplo 4.8)";

esPropio = false;
}

@Override

// Evalua dos expresiones booleanas usando el operador &

public void ejecutar(Scanner lector)
{
// Evaluar la expresión a

int n = EntradaDatos.leerValor(lector, "Ingresa un valor para n", int.class);

boolean rango = (n > -100) && (n < 100);
System.out.println("¿Está n entre -100 y 100? " + rango);

// Evaluar la expresión b

char car = EntradaDatos.leerValor(lector, "Ingresa un caracter", char.class);

boolean esLetra = ( (car >= 'A') && (car <= 'Z') ) || ( (car >= 'a') && (car <= 'z') );
System.out.println("¿Es una letra el caracter ingresado? " + esLetra);
}
		    
}