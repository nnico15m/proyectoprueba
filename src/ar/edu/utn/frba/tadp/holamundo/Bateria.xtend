package ar.edu.utn.frba.tadp.holamundo


// Clase que sirve para demostrar como funcionan los getter y los setter

class Bateria {
	int energia
	
	def getEnergia(){ // hago un getter del atributo energia, sirve para poder devolver el valor
		
		this.energia
		
	}


	def setEnergia(int energia){// hago un getter del atributo energia,sirve para agregarle un valor 
		
		this.energia = energia
		
	}

}