package com.programación2.prácticas.práctica8.ejercicios;

import java.io.*;
import java.util.*;
import javax.swing.*;

import com.programación2.*;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #12 (Ejemplo 20.12 del libro)

public class DesplegarDatosEnMarco extends Ejercicio
{
// ctor

public DesplegarDatosEnMarco()
{
id = 12;
nombre = "Desplegar datos de un archivo usando JTextArea";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
MarcoArchivo marco = new MarcoArchivo();

// Se crea un objeto File asociado a un archivo de texto
File s = UtilidadMenus.obtenerSistemaDeArchivos(true, lector);

JTextArea area = new JTextArea();

area.setColumns(30); // número de columnas a utilizar
area.setRows(20);
area.setLineWrap(true); // salto automático de línea
area.setWrapStyleWord(true); // salto de línea sin cortar palabra

// crea el scroll asociado al área de texto
JScrollPane desplaz = new JScrollPane(area);

String cd;

// se crea un flujo de lectura

BufferedReader en = null;

try
{
en = new BufferedReader( new InputStreamReader( new FileInputStream(s) ) );
} 

catch (FileNotFoundException e)
{
e.printStackTrace();
}

try
{
// bucle de lectura del flujo; termina al devolver null.  Cada línea se pone en el área de texto.

while( (cd = en.readLine() ) != null)
area.append(cd + "\n");

} 

catch (IOException e)
{
e.printStackTrace();
}

// se añade al marco el scroll 

marco.add(desplaz); 
marco.pack();
marco.setVisible(true);
marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

}