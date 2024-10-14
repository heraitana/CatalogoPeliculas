package catalogo;

public class Pelicula {

  private String titulo;
  private String director;
  private double calificacionIMDb;
  private int year;

  public Pelicula() {}

  public Pelicula(
    String titulo,
    String director,
    double calificacionIMDb,
    int year
  ) {
    this.titulo = titulo;
    this.director = director;
    this.calificacionIMDb = calificacionIMDb;
    this.year = year;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDirector() {
    return this.director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public double getCalificacionIMDb() {
    return this.calificacionIMDb;
  }

  public void setCalificacionIMDb(double calificacionIMDb) {
    this.calificacionIMDb = calificacionIMDb;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getGenero() {
    return "Pelicula";
  }


  public String getSubGenero() {
    return "";
  }



  @Override
  public String toString() {
    return (
      "Título: " +
      getTitulo() +
      ",\n" +
      "  Director: " +
      getDirector() +
      ",\n" +
      "  Calificación IMDb: " +
      getCalificacionIMDb() +
      ",\n" +
      "  Año: " +
      getYear() +
      ",\n" +
      "  Tipo: " +
      getGenero() +
      ",\n" +
      "  Subgénero: " +
      getSubGenero()
    );
  }
}
