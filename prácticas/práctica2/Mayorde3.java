package com.programación2.prácticas.práctica2;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

// Ejercicio impropio #9 (Ejemplo 5.9 del libro)

public class Mayorde3 extends Ejercicio
{
// Constructor por default
	
public Mayorde3()
{
id = 9;
nombre = "Encontrar el mayor número real entre 3 (Ejemplo 5.9)";

esPropio = false;
}

@Override

// Compara tres números reales y muestra cual es el mayor de todos

public void ejecutar(Scanner lector)
{
double x = EntradaDatos.leerValor(lector, "Introduzca primer número real", double.class);

double y = EntradaDatos.leerValor(lector, "Introduzca segundo número real", double.class);

double z = EntradaDatos.leerValor(lector, "Introduzca tercer número real", double.class);
 
double mayor;
 
if(x > y)
if(x > z)
mayor = x;

else
mayor = z;
 
else if(y > z)
mayor = y;
 
else
mayor = z;
 
System.out.println("El mayor es " + mayor);
}

}
