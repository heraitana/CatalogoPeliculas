package catalogo.NoFiccion;

public class Docudrama extends NoFiccion{
    public Docudrama(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"", "Docudramas");
    }
    @Override
    public String toString() {
        return "Docudrama: " + super.toString();
    }

    @Override
    public String getSubGenero() {
        return "Docudramas";
    }

}
