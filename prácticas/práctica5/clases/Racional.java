package com.programación2.prácticas.práctica5.clases;

/** Representa un número racional. */

public class Racional
{
/** El numerador del número racional. */

private int numerador;

/** El denominador del número racional. */

private int denominador;

/** Crea una nueva instacia de la clase 'Racional' */

public Racional()
{
numerador = 0;
denominador = 1;
}

/** Crea una nueva instacia de la clase 'Racional'

@param num El numerador.
@param den El denominador. */

public Racional(int num, int den)
{
// Si el valor del denomerador es 0, invertir los valores

if(den == 0)
{
numerador = 0;
denominador = 1;
}

// De lo contrario, asignar los valores tal cual

else
{
numerador = num;
denominador = den;
}

}

public Racional(Racional r2)
{
numerador = r2.numerador;
denominador = r2.denominador;
}

public int leerN() { return numerador; }
public int leerD() { return denominador; }

public void fijar (int n, int d)
{
numerador = n;
denominador = d;
}

/** Obtiene un representante en base al racional actual.
@return El representante del racional. */

public Racional representante()
{
// Obtiene un valor mínimo si el numerador del racional es 0

if(numerador == 0)
return new Racional(0, 1);

int mcd = calcularMCD(Math.abs(numerador), Math.abs(denominador) );
Racional res = new Racional(numerador / mcd, denominador / mcd);

// Si el valor del denominador es menor es 0, los valores del racional se vuelven negativos

if(denominador < 0)
{
res.numerador = -res.numerador;
res.denominador = -res.denominador;
}
        
return res;
}

/** Suma el racional actual con otro racional.

@param r El racional que se le va a sumar al actual.

@return La suma de los racionales. */

public Racional sumar(Racional r)
{
Racional suma = new Racional(0, 1);

suma.numerador = this.numerador * r.denominador + this.denominador * r.numerador;
suma.denominador = this.denominador * r.denominador;

return suma.representante();
}

/** Resta el racional actual con otro racional.

@param r El racional que se le va a restar al actual.

@return La resta de los racionales. */

public Racional restar(Racional r)
{
Racional resta = new Racional(0, 1);

resta.numerador = this.numerador * r.denominador - this.denominador * r.numerador;
resta.denominador = this.denominador * r.denominador;

return resta.representante();
}

/** Multiplica el racional actual con otro racional.

@param r El racional que se le va a multiplicar al actual.

@return El producto de los racionales. */

public Racional multiplicar(Racional r)
{
Racional prod = new Racional(0,1);

prod.numerador = this.numerador * r.numerador;
prod.denominador = this.denominador * r.denominador;

return prod.representante();
}

/** Divide el racional actual con otro racional.

@param r El racional que se le va a dividir al actual.

@return La división de los racionales. */

public Racional dividir(Racional r)
{
Racional div = new Racional(0,1);

div.numerador = this.numerador * r.denominador;
div.denominador = this.denominador * r.numerador;

if(div.denominador == 0)
System.out.println("\n\u221E Imposible dividir entre cero.");

return div.representante();
}

/** Calcula el máximo común divisor entre un numerador y un denominador dado

@param num El numerador.
@param den El denominador.

@return La división de los racionales. */

public static int calcularMCD(int num, int den)
{
// Invierte el valor de los parámetros si el num es menor que el den
	
if(num < den)
{
int aux = num;

num = den; 
den = aux;
}
 
while(den > 0)
{
int aux = num % den;

num = den;
den = aux;
}

return num;
}

/** Obtiene un string que representa el racional actual.
@return El racional en formato string. */

@Override
    
public String toString()
{
return String.valueOf(numerador) + "/" + String.valueOf(denominador);
}

    @Override
    public int hashCode()
    {
        Racional representante = representante();
        int hash = 7;
        hash = 83 * hash + representante.numerador;
        hash = 83 * hash + representante.denominador;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Racional other = (Racional) obj;
        return numerador*other.denominador == denominador*other.numerador;
    }

public void mostrar()
{
System.out.println(this.toString() );
}

}