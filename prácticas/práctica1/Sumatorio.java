package com.programación2.prácticas.práctica1;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio impropio #2

public class Sumatorio extends Ejercicio
{
// Constructor por default

public Sumatorio()
{
id = 2;
nombre = "Suma de dos números";

esPropio = false;
}

@Override

// Calcula la suma de dos números

public void ejecutar(Scanner lector)
{
// Capturar y mostrar el primer número ingresado

int x = EntradaDatos.leerValor(lector, "Ingresa un valor", int.class);

// Capturar y mostrar el segundo número ingresado

int y = EntradaDatos.leerValor(lector, "Ingresa otro valor", int.class);

int suma = x + y;
System.out.printf("%d + %d = %d", x, y, suma);
}

}