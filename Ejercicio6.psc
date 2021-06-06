Algoritmo Ejercicio6
	Definir edad, sumaEM, sumaEN, contaM, contaMe Como Entero
	definir prome1, prome2 Como Real
	Para i<-1 Hasta 100 Con Paso 1 Hacer
		Escribir "Ingrese su edad"
		leer edad
		
		Si edad >= 25 Entonces
			sumaEM <- sumaEM+edad
			contaM <- contaM +1
		SiNo
			sumaEN <- sumaEN+edad
			contaMe <- contaMe+1
		Fin Si
	Fin Para
	prome1 <- sumaEM/contaM
	prome2 <- sumaEN/contaMe
	
	Escribir "promedio de los mayores de 25: " prome1
	Escribir "Promedio de los menores de 25: ", prome2
FinAlgoritmo
