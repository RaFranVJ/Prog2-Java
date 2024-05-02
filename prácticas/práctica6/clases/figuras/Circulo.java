package com.programación2.prácticas.práctica6.clases.figuras;

public class Circulo extends Figura
{
private double radio;

public Circulo(double r)
{
this.radio = r;
}

@Override

public double perimetro()
{
return 2 * Math.PI * radio;
}

@Override

public double calcularArea()
{
return 2 * radio;
}

}
