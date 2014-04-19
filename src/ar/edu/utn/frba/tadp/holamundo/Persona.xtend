package ar.edu.utn.frba.tadp.holamundo

class Persona {
	String nombre
	
	
	
	new(){
		super() //Ejecuta el constructor de la super clase
				// esto se hace por deefecto, no hace falta incluirlo
		}
	
	
	
	new(String nombre){ 		
		this.nombre = nombre
		}



 def getNombre(){
 	
 	this.nombre
 }




def setNombre(String nombre){
	
	this.nombre = nombre
	
	
	}
}
