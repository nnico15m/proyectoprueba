package ar.edu.utn.frba.tadp.holamundo;

@SuppressWarnings("all")
public class Persona {
  private String nombre;
  
  public Persona() {
    super();
  }
  
  public Persona(final String nombre) {
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public String setNombre(final String nombre) {
    return this.nombre = nombre;
  }
}
