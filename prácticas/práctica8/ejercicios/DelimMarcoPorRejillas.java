package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;
import javax.swing.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #5 (Ejemplo 20.5 del libro)

public class DelimMarcoPorRejillas extends Ejercicio
{
// ctor

public DelimMarcoPorRejillas()
{
id = 5;
nombre = "Delimitar marco por rejillas (GridLayout)";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
MarcoGrid miMarco = new MarcoGrid();

miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

}