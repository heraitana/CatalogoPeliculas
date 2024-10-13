package catalogo.Ficcion;
import catalogo.Pelicula;

public class Ficcion extends Pelicula {
    private String genero;
    private String subGenero;

    public Ficcion() {
        super();
    }
    public Ficcion(String titulo, String director, double calificacionIMDb, int year, String genero, String subGenero) {
        super(titulo, director, calificacionIMDb, year);
        this.genero = "Ficcion";
        this.subGenero = subGenero;

    }

    public Ficcion(String genero) {
        this.genero = genero;
    }
    
    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getSubGenero() {
        return this.subGenero;
    }
    public void setSubGenero(String subGenero) {
        this.subGenero = subGenero;
    }

  

    @Override
    public String toString() {
        return "\n" +
            " Titulo: " + getTitulo() + "\n" +
            " Director: " + getDirector() + "\n" +
            " Calificacion IMDB: " + getCalificacionIMDb() + "\n" +
            " Año: " + getYear() + "\n" +
            " Género: " + getGenero() + "\n" +
            " Subgénero: " + getSubGenero() + "\n";
    }

}
