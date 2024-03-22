Algoritmo Superliga
	Definir pg, pe, pp, ppg, ppe, ptotal Como Entero
	
	Escribir "Ingrese cantidad de partidos ganados"
	leer pg
	
	Escribir "Ingrese cantidad de partidos empatados"
	leer pe
	
	Escribir "Ingrese cantidad de partidos perdidos"
	leer pp
	
	ppg = pg * 3
	ppe = pe
	
	ptotal = ppg + pe
	
	Si (ptotal = 0 ) Entonces
		Escribir "Tu equipo no sumo ningun punto en esta temporada, te sugiero cambiarte de equipo"
		
	SiNo
		Escribir "Tu equipo favorito sumo: ", ptotal , " puntos"
		
	FinSi
	
FinAlgoritmo
