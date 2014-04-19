package ar.edu.utn.frba.tadp.holamundo

class RecepcionistaClasico extends Recepcionista { // Aca esta subclase de Recepcionista define su propio armarsaludo
	
	override armarSaludo(Mundo mundo){
		
		"Hola" + mundo.getNombre()
	}
	
	
	
}