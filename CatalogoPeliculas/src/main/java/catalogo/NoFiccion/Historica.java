package catalogo.NoFiccion;

public class Historica extends NoFiccion {
    public Historica(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"" ,"Históricas");
    }

    @Override
    public String toString() {
        return "Historícas: " + super.toString();
    }

    @Override
    public String getSubGenero() {
        return "Históricas";
    }
    
    public void mostrarTriggerWarning() {
        System.out.println("Advertencia de contenido: Este libro de historia incluye temas sensibles como violencia, guerra, genocidio y opresión.");
    }
    
}
