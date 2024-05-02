package com.programación2.prácticas.práctica5.clases.soporte;

// Segunda clase del ejercicio impropio #3 (8.3)

public class Marco
{
private double p;

public String t;

public Marco() 
{
}

public void poner()
{
Foto u = new Foto("Paloma");

p = u.mtd();

t = "**" + u.q + "**";
}

public double leerP()
{
return p;
}

public void fijarP(double p)
{
this.p = p;
}

}