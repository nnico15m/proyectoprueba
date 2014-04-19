package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.holamundo.Mundo;
import ar.edu.utn.frba.tadp.holamundo.Recepcionista;

@SuppressWarnings("all")
public class RecepcionistaClasico extends Recepcionista {
  public String armarSaludo(final Mundo mundo) {
    String _nombre = mundo.getNombre();
    return ("Hola" + _nombre);
  }
}
