package catalogo.NoFiccion;
import catalogo.Pelicula;

public class NoFiccion extends Pelicula {
    private String genero;
    private String subGenero;

    public NoFiccion() {
        super();
    }
    public NoFiccion(String titulo, String director, double calificacionIMDb, int year, String genero, String subGenero) {
        super(titulo, director, calificacionIMDb, year);
        this.genero = "No Ficcion";
        this.subGenero = subGenero;
    }


    public NoFiccion(String genero) {
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


    public void mostrarInformacion() {
        System.out.println("Película de no ficción: ");
        super.toString();
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
