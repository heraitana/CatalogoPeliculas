package catalogo.Ficcion;

public class CienciaFiccion extends Ficcion{
    public CienciaFiccion(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"",  "CienciaFiccion");
    }

    @Override
    public String toString() {
        return "Ciencia Ficción: " + super.toString();
    }

    @Override
    public String getSubGenero() {
        return "Ciencia Ficción";
    }
    public void mostrarTriggerWarning() {
        System.out.println("Advertencia: Esta película contiene luces estroboscópicas que pueden afectar a personas sensibles.");
    }

}
