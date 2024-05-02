package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;
import javax.swing.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #8 (Ejemplo 20.8 del libro)

public class GestionarCompMarco extends Ejercicio
{
// ctor

public GestionarCompMarco()
{
id = 8;
nombre = "Gestionar componentes de un marco";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
GestorDeMarcos m = new GestorDeMarcos();

m.setSize(200, 300);
m.setLocation(20, 200);
m.setResizable(false);
m.setVisible(true);
m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

}