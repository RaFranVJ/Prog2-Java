package com.programación2.prácticas.práctica5.clases;

// Clase impropia #6 (8.6)

public class Rectangulo
{
private int izdo;

private int superior;

private int dcha;
	 
private int inferior;

// constructor

public Rectangulo(int iz, int sr, int d, int inf) 
{
izdo = iz;
superior = sr;

dcha = d;
inferior = inf;
}

// definiciones de otros métodos miembro


public int leerIzq()
{
return izdo;
}

public int leerSup()
{
return superior;
}

public int leerDcha()
{
return dcha;
}

public int leerInf()
{
return inferior;
}

}