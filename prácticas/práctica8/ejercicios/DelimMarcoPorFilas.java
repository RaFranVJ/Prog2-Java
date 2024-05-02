package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;
import javax.swing.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #4 (Ejemplo 20.4 del libro)

public class DelimMarcoPorFilas extends Ejercicio
{
// ctor

public DelimMarcoPorFilas()
{
id = 4;
nombre = "Delimitar marco por filas (FlowLayout)";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
MarcoFlow miMarco = new MarcoFlow();

miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

}