package ar.edu.utn.frba.tadp.holamundo;

import ar.edu.utn.frba.tadp.holamundo.Mundo;

@SuppressWarnings("all")
public abstract class Recepcionista {
  public void saludar(final Mundo unMundo) {
    String _armarSaludo = this.armarSaludo(unMundo);
    System.out.println(_armarSaludo);
  }
  
  public abstract String armarSaludo(final Mundo mundo);
}
