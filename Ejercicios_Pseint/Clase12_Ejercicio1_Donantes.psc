//En este ejercicio se requiere crear un
//algoritmo que diga si una persona puede
//donar sangre o no, bas�ndose en las
//siguientes condiciones:
//* Si tiene entre 18 y 65 a�os y pesa 50 kg o
//m�s, puede donar.
//?* Si tiene menos de 18 o m�s de 65, no
//puede donar.
//* Si est� en el rango de edad pero pesa
//menos de 50 kg, no puede donar.
Algoritmo Donantes
	Escribir "Ingrese su edad"
	Leer edad
	Escribir "Ingrese su peso"
	Leer peso
	
	Si ( edad >= 18 Y edad <= 65) Entonces
		Si (Peso >= 50) Entonces
			Escribir "Puede donar sangre"
		SiNo
			Escribir "No puede donar sangre, peso insuficiente"
		FinSi
	SiNo
		Escribir "No puede donar sangre, edad fuera de rango"
	FinSi
	
FinAlgoritmo
