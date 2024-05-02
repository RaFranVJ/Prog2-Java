package com.programación2.prácticas.práctica6.ejercicios;

import java.util.Scanner;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica6.clases.figuras.*;

// Ejercicio impropio #6 (Ejemplo 9.6 del libro)

public class PruebaFigura extends Ejercicio
{

public PruebaFigura()
{
id = 6;
nombre = "Métodos abstractos";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
RectanguloFl r = new RectanguloFl(7.0, 9.0); // objeto Rectángulo
Circulo c = new Circulo (2.0); // objeto Círculo

System.out.println("El área del rectangulo es " +
r.calcularArea() + "\t el perímetro " + r.perimetro() );
	 
System.out.println("El área del círculo es " +
c.calcularArea() + "\t el perímetro " + c.perimetro() );
}

}