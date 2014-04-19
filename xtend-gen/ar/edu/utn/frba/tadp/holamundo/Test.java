package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.holamundo.Bateria;
import ar.edu.utn.frba.tadp.holamundo.Mundo;
import ar.edu.utn.frba.tadp.holamundo.Persona;
import ar.edu.utn.frba.tadp.holamundo.RecepcionistaClasico;

@SuppressWarnings("all")
public class Test {
  public static void main(final String[] args) {
    Mundo mundo = new Mundo();
    Bateria bateria = new Bateria();
    Persona persona = new Persona();
    RecepcionistaClasico _recepcionistaClasico = new RecepcionistaClasico();
    _recepcionistaClasico.saludar(mundo);
    bateria.setEnergia(100);
    persona.setNombre("juan");
    int _energia = bateria.getEnergia();
    System.out.println(_energia);
    String _nombre = persona.getNombre();
    System.out.println(_nombre);
  }
}
