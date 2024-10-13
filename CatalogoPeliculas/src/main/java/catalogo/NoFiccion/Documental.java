package catalogo.NoFiccion;


public class Documental extends NoFiccion {
    public Documental(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"", "Documentales");
    }


    @Override
    public String toString() {
        return "Documentales: " + super.toString();
    }

}
