package com.programación2.prácticas.práctica1;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

public class ConvertirDeCaF extends Ejercicio
{
// Constructor por default

public ConvertirDeCaF()
{
id = 2;
nombre = "Convertir temperatura de C° a F°";

esPropio = true;
}

// Convierte la temperatura ingresada de Celsius a Fahrenheit

@Override

public void ejecutar(Scanner lector)
{
double celsius = EntradaDatos.leerValor(lector, "Ingresa la temperatura en Celsius", double.class);

double fahrenheit = (celsius * 9 / 5) + 32;
System.out.println("La temperatura en F° es: " + fahrenheit);
}

}