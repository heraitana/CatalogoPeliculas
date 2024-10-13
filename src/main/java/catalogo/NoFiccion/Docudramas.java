package catalogo.NoFiccion;

public class Docudramas extends NoFiccion{
    public Docudramas(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"", "Docudramas");
    }
    @Override
    public String toString() {
        return "Docudrama: " + super.toString();
    }

}
