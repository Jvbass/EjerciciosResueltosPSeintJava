Algoritmo Vectores
	Definir suma, n Como Entero
		
	Escribir "Ingrese cantidad de numeros a sumar"
	leer n
	Dimension vector[n]
	
	Para i<-1 Hasta n Hacer
		Escribir "Ingrese el numero ",i," :" 
		Leer vector[i]
		suma = suma + vector[i]
	FinPara
	Escribir "La suma total de los ", n, " numeros ingresados es: ", suma
	
FinAlgoritmo
