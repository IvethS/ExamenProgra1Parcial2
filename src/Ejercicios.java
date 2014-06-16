
import java.util.Scanner;
public class Ejercicios
{	
	//devuelve true si numero es multiplo de 3, de lo contrario devuelve false
	//2 puntos
	static boolean esMultiploDeTres(int num)
	{
		//aqui esto lo que hace es que todo lo numeros que sean divisibles entre 
		//3 va devolver verdadero, si no devolvera que es falso;
		//Codigo utilizado con ayuda de la Tarea
		 if(num%3==0)
	           return true;
	        else
	            return false;
	}
	
	//devuelve el numero menor entre a, b o c
	//3 puntos
	static int getMenor(int a, int b, int c)
	{
		//Aqui lo que hace es ver las variables, y luego devuelve la que sea de menor
		//como pueden observar realice primero compara y luego devuelve el menor
		 if(a < b)
	           if(a<c)
	              return a;
	           else
	              return c;
	        else if(b<c)
	              return b;
	                else
	              return c;
	}
	
	//devuelve el promedio los elementos de un arreglo
	//5 puntos
	static int getPromedio(int arreglo[])
	{
		//aqui lo que hace es calcular el promedio, declaramos la variable que nos permita
		//almacenar los valores luego recorre todos los valores con el for, luego
		//hace la suma y lo divide en la cantidad del arreglo
		//y nos da como resultado
		
	       int suma=0;
	 
	 
	    for(int i=0;i<arreglo.length;i++){
	 
	    suma=suma+arreglo[i];	
	 
	    }
	    suma=suma/arreglo.length;
	 
	    return suma;
	}
	
	//Realizar una funcion con las siguientes indicaciones:
	//Si el parametro recibido es "Honduras" devolvera "Tegucigalpa"
	//Si el parametro recibido es "Francia" devolvera "Paris"
	//Si el parametro recibido es "Inglaterra" devolvera "Londres"
	static String getCapital(String pais)
	{
		 return "";
	}
	
	//realizarla siguiente funcion recurisva:
	
	/* Pseudocodigo*/
	//funcionRecursiva(num)
	//  si num == 0
	//    devolver 0
	//  fin si
	//  devolver num + funcionRecursiva(num-1)
	
	/*Notacion matematica*/
	//funcionRecusriva(num) = num + funcionRecursiva(num-1)
	//Donde funcionRecursiva(0) = 0
	
	//1 punto oro extra
	static int funcionRecursiva(int num)
	{
		//aqui se declara la variable, luego hace la comparacion, si es 0 nos devolvera
		//como respuesta 0, de lo contrario hara la operacion matematica
		//y nos data como resultado la respuesta
		//esta funcion la realice con ayuda de Kevin.
		int respuesta;
			if (num == 0)
			{
				respuesta=0;
			}
			else
			{
				respuesta = num +funcionRecursiva(num -1);
			}
		return respuesta;
	}
	
	public static void main(String args[])
	{
		
	}
}
