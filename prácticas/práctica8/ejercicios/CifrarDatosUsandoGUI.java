package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio propio #1 (prática final)

public class CifrarDatosUsandoGUI extends Ejercicio
{
// ctor

public CifrarDatosUsandoGUI()
{
id = 1;
nombre = "Aplicación para cifrar datos";

esPropio = true;
}

@Override
	
public void ejecutar(Scanner lector)
{
MarcoCifrarDatos marco = new MarcoCifrarDatos();

marco.setVisible(true);
marco.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
}

}