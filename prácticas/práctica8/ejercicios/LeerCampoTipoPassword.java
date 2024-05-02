package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;
import javax.swing.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #11 (Ejemplo 20.11 del libro)

public class LeerCampoTipoPassword extends Ejercicio
{
// ctor

public LeerCampoTipoPassword()
{
id = 11;
nombre = "Leer contraseña usando JPasswordField";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
MarcoPassword marco = new MarcoPassword("Marco con password");

marco.setVisible(true);
	 
marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

}