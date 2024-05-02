package com.programación2.prácticas.práctica1;

import java.util.Scanner;

import com.programación2.Ejercicio;

// Ejercicio impropio #8 (Ejemplo 3.3 del libro)

public class DeclaracionVars extends Ejercicio
{
// Constructor por default

public DeclaracionVars()
{
id = 8;
nombre = "Declaración de variables (Ejemplo 3.3)";

esPropio = false;
}

@Override

// Muestra el valor de las variables declaradas dentro del método

public void ejecutar(Scanner lector)
{
int x, y1; // Declara las variables x e y1

// Ahora, inicializalas con valores diferentes

x = 75;
y1 = 89;

int y2 = 50; // Declara la variable y2 inicializándola a 50
System.out.println(x + "," + y1 + "," + y2);
}

}