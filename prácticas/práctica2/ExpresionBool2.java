package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio impropio #3 (Ejemplo 4.7 del libro)

public class ExpresionBool2 extends Ejercicio
{
// Constructor por default
	
public ExpresionBool2()
{
id = 3;
nombre = "Expresión booleana II: { n != 0 y x < 1 ÷ n } => (Ejemplo 4.7)";

esPropio = false;
}
	
// Evalua una expresión booleana que usa el operador lógico AND (&)

public void ejecutar(Scanner lector)
{
int n = EntradaDatos.leerValor(lector, "Ingresa un valor para n", int.class);

int x = EntradaDatos.leerValor(lector, "Ingresa un valor para X", int.class);

boolean resultado = (n != 0) && (x < 1.0/n);
System.out.println("n es diferente de 0 y x menor es que 1 ÷ n: " + resultado);
}
 
}