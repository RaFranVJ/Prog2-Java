package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio #7 (ejemplo 5.5 del libro)

public class MayorNumero extends Ejercicio
{
// Constructor por default
	
public MayorNumero()
{
id = 7;
nombre = "Mostrar el número mayor (Ejemplo 5.5)";

esPropio = false;
}

@Override

// Verifica cual de los dos números ingresados es mayor

public void ejecutar(Scanner lector)
{
int n1 = EntradaDatos.leerValor(lector, "Introduzca primer entero", int.class);

int n2 = EntradaDatos.leerValor(lector, "Introduzca segundo entero", int.class);

if(n1 > n2)
System.out.println(" El mayor es " + n1);

else
System.out.println(" El mayor es " + n2);

}

}