package catalogo.NoFiccion;

public class Biografia extends NoFiccion{
    public Biografia(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"",  "Biografía");
    }

    @Override
    public String toString() {
        return "Biografía: " + super.toString();
    }

    public void mostrarTriggerWarning() {
        System.out.println("Considera cómo este contenido refleja luchas existenciales y la búsqueda de significado.");
    }

    public  void traducidoDel(){
        System.out.println("Este libro ha sido traducido al español de Alemán.");
    }

}