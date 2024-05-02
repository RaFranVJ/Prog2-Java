package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;
import javax.swing.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #3 (Ejemplo 20.3 del libro)

public class DelimMarcoPorBordes extends Ejercicio
{
// ctor

public DelimMarcoPorBordes()
{
id = 3;
nombre = "Delimitar marco por bordes (BorderLayout)";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
MarcoBorder miMarco = new MarcoBorder();

miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

}