package catalogo.Ficcion;

public class Drama extends Ficcion {

  public Drama(
    String titulo,
    String director,
    double calificacionIMDb,
    int year
  ) {
    super(titulo, director, calificacionIMDb, year, "", "Drama");
  }

  @Override
  public String toString() {
    return "Drama: " + super.toString();
  }

  @Override
  public String getSubGenero() {
    return "Drama";
  }
}
