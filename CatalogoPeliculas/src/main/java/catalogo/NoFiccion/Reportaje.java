package catalogo.NoFiccion;


public class Reportaje extends NoFiccion{
    public Reportaje(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"", "Reportajes");
    }


    @Override
    public String toString() {
        return "Reportajes: " + super.toString();
    }

public void mostrarTriggerWarning() {
    System.out.println("Advertencia: Este documental contiene discusiones detalladas sobre corrupción financiera y sus devastadoras consecuencias.");
}


public void mostrarAdvertencia() {
    System.out.println("Advertencia: El contenido puede resultar perturbador para personas afectadas por la crisis financiera del 2008.");
}


public void mostrarAdvertenciaEdad() {
    System.out.println("Advertencia: Recomendado para mayores de 13 años debido a la complejidad de los temas.");
}




    
}
