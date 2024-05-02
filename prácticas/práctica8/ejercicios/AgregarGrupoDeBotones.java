package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;
import javax.swing.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #9 (Ejemplo 20.9 del libro)

public class AgregarGrupoDeBotones extends Ejercicio
{
// ctor

public AgregarGrupoDeBotones()
{
id = 9;
nombre = "Agregar grupo de botones al panel de un marco";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
JFrame marco = new MarcoConBotones();

marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

}