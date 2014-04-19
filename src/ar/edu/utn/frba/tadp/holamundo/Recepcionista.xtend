package ar.edu.utn.frba.tadp.holamundo

abstract class Recepcionista {
	def saludar(Mundo unMundo){
		
	System::out.println(armarSaludo(unMundo)) // Imprime por pantalla el mensaje
	}
	def String armarSaludo(Mundo mundo) //Metodo abstracto lo definen las subclases
		
		
		}