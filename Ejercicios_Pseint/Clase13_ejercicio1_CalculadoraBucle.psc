//Realizar un algoritmo que pida dos n�meros enteros positivos por teclado y
//muestre por pantalla el siguiente men� de opciones de operaciones que se pueden realizar con
//los n�meros ingresados. El usuario deber� elegir una opci�n y el programa deber� mostrar el
//resultado por pantalla, y luego volver a mostrar el men� de opciones para elegir otra
//operaci�n. Si la opci�n elegida es la n�mero 5 (salir), se debe detener la ejecuci�n.
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
Algoritmo CalculadoraBucle
	
	Mientras operador <> 5 Hacer
	Escribir "Ingrese primer numero"
	Leer num1
	Escribir "Ingrese segundo numero"
	Leer num2
	
	Escribir "Elija una opcion"
	Escribir "1 Sumar"
	Escribir "2 Restar"
	Escribir "3 Multiplicar"
	Escribir "4 Dividir"
	Escribir "5 Salir"
	Leer operador
		Segun operador Hacer
			1:
				Escribir "Resultado Suma: ", num1 + num2
			2:
				Escribir "Resultado Resta: ", num1 - num2
			3:
				Escribir "Resultado Multiplicacion: ", num1 * num2
			4:
				Escribir "Resultado Division: ", num1 / num2
			5:
				Escribir "Saliendo..."
			De Otro Modo:
				Escribir "No existe esa opcion"
		Fin Segun
	Fin Mientras
	
FinAlgoritmo
