package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.programación2.Ejercicio;

public class CalcularInteres extends Ejercicio {

/** ctor base */

public CalcularInteres()
{
id = 20;
nombre = "Calcular interés";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
int años = 0;
int saldo = 10000;

int pago = 3000;
int limite = 150000;

double tasaInteres = 15;

while(años <= 50 && saldo < limite)
{
saldo += pago;
double interes = saldo * tasaInteres / 100;

saldo += interes;

if(saldo < limite)
{
años++;

System.out.printf("* Año laboral #%d\n\n", años);

System.out.printf("Tu saldo actual: RD$ %d\n", saldo);

System.out.printf("El interés este año es de RD$ %.2f\n\n", interes);
}

}

}

}