package catalogo.Ficcion;

public class Accion extends Ficcion{
    public Accion(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"", "Acción");
    }

    
    @Override
    public String toString() {
        return "Acción: " + super.toString();
    }
   


}
