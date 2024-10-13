package catalogo.Ficcion;

public class Thriller extends Ficcion{
    public Thriller(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"", "Thriller");
    }

    @Override
    public String toString() {
        return "Thriller: " + super.toString();
    }


}
