package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #2 (Ejemplo 20.2 del libro)

public class MarcoGrafico extends Ejercicio
{
// ctor

public MarcoGrafico()
{
id = 2;
nombre = "Creación de un marco gráfico con Strings";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
MarcoConCadena marco = new MarcoConCadena("Marco gráfico");
marco.setVisible(true);
}

}