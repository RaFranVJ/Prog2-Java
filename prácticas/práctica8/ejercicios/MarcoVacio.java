package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;
import javax.swing.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #1 (Ejemplo 20.1 del libro)

public class MarcoVacio extends Ejercicio
{
// ctor

public MarcoVacio()
{
id = 1;
nombre = "Creación de un marco vacío";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
MarcoSencillo marco = new MarcoSencillo();

marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
marco.setVisible(true);
}

}