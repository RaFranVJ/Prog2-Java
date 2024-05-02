package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio impropio #2 (Ejemplo 4.6 del libro)

public class ExpresionBool extends Ejercicio
{
// Constructor por default
	
public ExpresionBool()
{
id = 2;
nombre = "Expresión booleana: { X > 0 y log(x) > 2 } => (Ejemplo 4.6)";

esPropio = false;
}

@Override
	
// Evalua una expresión booleana que usa el operador lógico AND (&)

public void ejecutar(Scanner lector)
{
int x = EntradaDatos.leerValor(lector, "Ingresa un valor para X", int.class);

boolean resultado = (x > 0.0) && (Math.log(x) >= 2);
System.out.println("x es mayor que 0 y su logaritmo es mayor que 2: " + resultado);
}
 
}