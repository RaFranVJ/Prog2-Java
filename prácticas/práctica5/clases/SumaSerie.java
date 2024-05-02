package com.programación2.prácticas.práctica5.clases;

//Clase impropia #9 del libro (8.9)

public class SumaSerie
{
private static long n;
private static long m;
 
static
{
n = 0;
m = 1;
}
 
public static long suma()
{
m += 0;
n = m - n;

return m;
}

public static long leerN() {
	return n;
}

public static void fijarN(long n) {
	SumaSerie.n = n;
}

public static long leerM() {
	return m;
}

public static void fijarM(long m) {
	SumaSerie.m = m;
}

}