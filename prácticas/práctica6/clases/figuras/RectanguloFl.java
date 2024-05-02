package com.programación2.prácticas.práctica6.clases.figuras;

// Clase impropia #1 (9.1)

public class RectanguloFl extends Figura
{
private double base, altura;
 
public RectanguloFl(double b, double h)
{
base = b; 
altura = h;
}

@Override

public double calcularArea()
{
return base * altura;
}

@Override

public double perimetro()
{
return base * 2 + altura * 2;
}

}