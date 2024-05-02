package com.programación2.prácticas.práctica2;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

public class ParidadNumero extends Ejercicio
{
// Constructor por default
	
public ParidadNumero()
{
id = 1;
nombre = "Número par o impar";

esPropio = true;
}

@Override

// Verifica si un número es par o impar

public void ejecutar(Scanner lector)
{
int numero = EntradaDatos.leerValor(lector, "Ingresa un número", int.class);

// Condición 1: si el residuo de la división entre 2 da 0, entonces el número es par

if(numero % 2 == 0)
System.out.println("El número es par.");
  
 // Condición 2: de lo contrario, el número es impar
    
else
System.out.println("El número es impar.");

}
  
}