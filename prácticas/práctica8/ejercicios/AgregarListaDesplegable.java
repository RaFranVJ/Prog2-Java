package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;
import javax.swing.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #10 (Ejemplo 20.10 del libro)

public class AgregarListaDesplegable extends Ejercicio
{
// ctor

public AgregarListaDesplegable()
{
id = 10;
nombre = "Agregar lista desplegable al panel de un marco";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
JFrame marco = new MarcoConListaDesplegable();

marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

}