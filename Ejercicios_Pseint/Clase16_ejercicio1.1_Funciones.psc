Algoritmo Funciones
	Definir cantidadEuros Como Real
	Definir moneda Como Caracter
	
	Hacer
	Escribir "Ingrese la cantidad de Euros que desea convertir"
	Leer cantidadEuros
	
	Escribir "Ingrese la moneda a la que desea convertir (yen, libra, dolar)"
	Leer moneda
	Hasta Que cantidadEuros > 0 y moneda = "yen" o moneda = "libra" o moneda = "dolar" 
	
	convertirMoneda(cantidadEuros, moneda)
	
FinAlgoritmo

Funcion convertirMoneda(cantidadEuros, moneda)
	Definir cambio Como Real
	
	Si moneda = "yen" Entonces
		cambio = cantidadEuros * 129.852
		Escribir cantidadEuros, " euro equivalen a ", cambio," yen Japones"
	FinSi
	Si moneda = "dolar" Entonces
		cambio = cantidadEuros * 1.28611
		Escribir cantidadEuros, " euro equivalen a ", cambio," dolares"
	FinSi
	Si moneda = "libra" Entonces
		cambio = cantidadEuros * 0.86
		Escribir cantidadEuros, " euro equivalen a ", cambio," libras"
	FinSi
	
FinFuncion

