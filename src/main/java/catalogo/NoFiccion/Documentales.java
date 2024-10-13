package catalogo.NoFiccion;


public class Documentales extends NoFiccion {
    public Documentales(String titulo, String director, double calificacionIMDb, int year) {
        super(titulo, director, calificacionIMDb, year,"", "Documentales");
    }


    @Override
    public String toString() {
        return "Documentales: " + super.toString();
    }

}
