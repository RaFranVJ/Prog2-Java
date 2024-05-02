package com.programación2.prácticas.práctica5.clases;

// Clase impropia #2 del libro (8.2)

public class Edad
{
// Datos
	
private int edadHijo, edadMadre, edadPadre;

// método especial: constructor

public Edad()
{
} 

// métodos

public void iniciar(int h, int e, int p)
{
edadHijo = h;
edadMadre = e;

edadPadre = p;
}

public int leerHijo()
{
return edadHijo;
}

public int leerMadre()
{
return edadMadre;
}
 
public int leerPadre()
{
return edadPadre;
}

}