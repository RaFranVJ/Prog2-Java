package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

// Ejercicio impropio #8 (Ejemplo 9.8 del libro)

public class DemoRacional extends Ejercicio
{

public DemoRacional()
{
id = 8;
nombre = "Sobrecarga de parámetros en un constructor";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
Racional r1,r2,r3;

r1 = new Racional(); // crea número racional 0/1
r2 = new Racional(1,5); // crea número racional 1/5
r1 = new Racional(r2); // crea racional igual que r2
	 
r3 = r2.sumar(r1);

System.out.print("r1 = "); r1.mostrar();
System.out.print("r2 = "); r2.mostrar();
System.out.print("r1 + r2 = "); r3.mostrar();
}

}