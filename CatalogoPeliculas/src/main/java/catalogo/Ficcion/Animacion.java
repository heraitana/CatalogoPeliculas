package catalogo.Ficcion;

public class Animacion extends Ficcion{
    public Animacion(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"", "Animación");
    }

    
    @Override
    public String toString() {
        return "Animación: " + super.toString();
    }

    @Override
    public String getSubGenero() {
        return "Animación";
    }

}
