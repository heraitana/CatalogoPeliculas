package catalogo.Ficcion;
 

public class Romance extends Ficcion {
    public Romance(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year, "", "Romance");
    }

    @Override
    public String toString() {
        return "Romance: " + super.toString();
    }

    public void mostrarAdvertenciaRealidad() {
        System.out.println("Advertencia: Esta película es una obra de ficción y no se basa en hechos reales.");
    }
  
    
}
