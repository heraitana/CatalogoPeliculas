package catalogo.NoFiccion;

public class Historicas extends NoFiccion {
    public Historicas(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"" ,"Históricas");
    }

    @Override
    public String toString() {
        return "Historícas: " + super.toString();
    }
    
    public void mostrarTriggerWarning() {
        System.out.println("Advertencia de contenido: Este libro de historia incluye temas sensibles como violencia, guerra, genocidio y opresión.");
    }
    
}
