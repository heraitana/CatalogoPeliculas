package catalogo.Ficcion;

public class Fantasia extends Ficcion {
    public Fantasia(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"", "Fantasía");
    }
    @Override
    public String toString() {
        return "Fantasia: " + super.toString();
    }

}