package com.programación2.prácticas.práctica5.clases;

import java.time.*;

class Tiempo
{
private int hora, minuto, seg; // datos

// constructor

public Tiempo()
{
}

public void obtenerDef()
{
LocalTime horaActual = LocalTime.now();

hora = horaActual.getHour();
minuto = horaActual.getMinute();
seg = horaActual.getSecond();
}

public void iniciar(int h, int m, int s)
{
hora = h;
minuto = m;
seg = s;
} 


public int leerHora()
{
return hora;
}
 
public int leerMin()
{
return minuto;
}

public int leerSeg()
{
return seg;
}

@Override

public String toString()
{
return String.format("%dh : %dm : %ds", hora, minuto, seg);
}

}