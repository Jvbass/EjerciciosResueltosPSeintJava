//Escribir un algoritmo que almacene la cadena
//de caracteres "contrase�a" en una variable,
//luego pregunte al usuario por la contrase�a e
//imprima por pantalla si la contrase�a
//introducida por el usuario coincide con la
//guardada en la variable (sin tener en cuenta
//may�sculas y min�sculas).*/

Algoritmo Contrase�aIncorrecta
	Definir contrasena Como Caracter
	contrasena = "Moe1985"
	Escribir "Ingrese su contrase�a"
	Leer passUser
	Si (contrasena == passUser) Entonces
		Escribir "Contrase�a correcta"
	SiNo
		Escribir "Contrase�a incorrecta"
	FinSi
FinAlgoritmo
