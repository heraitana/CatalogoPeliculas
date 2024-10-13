package catalogo.Ficcion;

public class Aventura extends Ficcion{
    public Aventura(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"",  "Aventura");
    }


    @Override
    public String toString() {
        return "Aventura: " + super.toString();
    }


}
