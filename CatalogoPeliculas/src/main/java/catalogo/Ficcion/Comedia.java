package catalogo.Ficcion;

public class Comedia extends Ficcion{
    public Comedia(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"", "Comedia");
    }

    @Override
    public String toString() {
        return "Comedia: " + super.toString();
    }




}
