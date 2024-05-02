package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica6.clases.figuras.*;

// Ejercicio impropio #1 (Ejemplo 9.1 del libro)

public class PruebaRetorno extends Ejercicio
{

public PruebaRetorno()
{
id = 1;
nombre = "Retorno de un método";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
RectanguloFl r = new RectanguloFl(3.0, 7.0);
System.out.println(" El área es " + r.calcularArea() );
}

}