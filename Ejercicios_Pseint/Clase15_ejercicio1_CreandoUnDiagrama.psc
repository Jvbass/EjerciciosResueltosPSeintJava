Algoritmo CreandoUnDiagrama
	Definir a Como Entero
	Definir b Como Entero
	
	a = 0
	b = 0
	
	Escribir "Ingrese primer numero"
	leer a
	Escribir "Ingrese segundo numero"
	leer b
	
	Si a = b Entonces
		Escribir "Ingrese numeros distintos"
		Escribir "Ingrese primer numero"
		leer a
		Escribir "Ingrese segundo numero"
		leer b
	FinSi
	
	Si a > b Entonces
		Escribir "El primer numero es mayor"
	SiNo
		Escribir "El segundo numero es mayor"
	FinSi

FinAlgoritmo
