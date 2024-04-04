//Escribir un algoritmo que almacene la cadena
//de caracteres "contraseña" en una variable,
//luego pregunte al usuario por la contraseña e
//imprima por pantalla si la contraseña
//introducida por el usuario coincide con la
//guardada en la variable (sin tener en cuenta
//mayúsculas y minúsculas).*/

Algoritmo ContraseñaIncorrecta
	Definir contrasena Como Caracter
	contrasena = "Moe1985"
	Escribir "Ingrese su contraseña"
	Leer passUser
	Si (contrasena == passUser) Entonces
		Escribir "Contraseña correcta"
	SiNo
		Escribir "Contraseña incorrecta"
	FinSi
FinAlgoritmo
