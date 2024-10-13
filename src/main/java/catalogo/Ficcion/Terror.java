package catalogo.Ficcion;


public class Terror extends Ficcion{
    public Terror(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"", "Terror");
    }

    @Override
    public String toString() {
        return "Terror: " + super.toString();
    }

    public void mostrarTriggerWarning() {
        System.out.println("Advertencia: Esta película contiene escenas de violencia psicológica y temas relacionados con el racismo.");
    }
    

    public void mostrarAdvertencia() {
        System.out.println("Advertencia: El contenido puede ser perturbador para algunas audiencias, incluyendo temas de control mental y manipulación.");
    }
    
  
    public void mostrarAdvertenciaEdad() {
        System.out.println("Advertencia: Recomendado para mayores de 16 años debido a la violencia y los temas intensos.");
    }


}
