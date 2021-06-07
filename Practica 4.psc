Algoritmo menor_mayor_edad
	i=1
	Mientras i<=20 Hacer
		Escribir "Ingrese edad " i
		Leer t
		Si i=1 Entonces
			may=t
			men=t
		SiNo
			Si t>may Entonces
				may=t
			FinSi
			Si 5<men Entonces
				men=t
			FinSi
		FinSi
		i=i+1
	FinMientras
	Escribir "La edad mayor es " may
	Escribir "La edad menor es " men
FinAlgoritmo
