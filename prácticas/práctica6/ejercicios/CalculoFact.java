package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica6.clases.*;

// Ejercicio impropio #2 (Ejemplo 9.2 del libro)

public class CalculoFact extends Ejercicio
{

public CalculoFact()
{
id = 2;
nombre = "Llamada a un método";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
final int M = 15;

for(int n = 1; n <= M; n++)
System.out.println(n + "! = " + Matem.factorial(n) );

}

}