package catalogo;

import catalogo.Ficcion.*;
import catalogo.NoFiccion.*;
import java.io.IOException;
import java.util.HashMap;

public class Catalogo {

  public static void main(String[] args) throws IOException {
    // HashMap para almacenar el catálogo de películas
    HashMap<String, Pelicula> catalogo = new HashMap<>();

    // Agregar películas al catálogo
    catalogo.put(
      "steve jobs",
      new Biografia("Steve Jobs", "Joshua Michael Stern", 7.2, 2015)
    );
    catalogo.put(
      "nuestro planeta",
      new Documentales("Nuestro planeta", "David Attenborough", 8.0, 2019)
    );
    catalogo.put(
      "el diario de una pasion",
      new Romance("El diario de una pasión", "Nick Cassavetes", 9.0, 2024)
    );
    catalogo.put(
      "interstellar",
      new CienciaFiccion("Interstellar", "Christopher Nolan", 10.0, 2018)
    );
    catalogo.put(
      "mad max: fury road",
      new Accion("Mad Max: Fury Road", "George Miller", 7.0, 2015)
    );
    catalogo.put(
      "schindler's list",
      new Historicas("Schindler's List", "Steven Spielberg", 8.9, 1993)
    );
    catalogo.put("seven", new Thriller("Seven", "David Fincher", 8.6, 1995));
    catalogo.put(
      "toy story",
      new Animacion("Toy Story", "John Lasseter", 8.3, 1995)
    );
    catalogo.put(
      "indiana jones",
      new Aventura("Indiana Jones", "Steven Spielberg", 8.4, 1981)
    );
    catalogo.put(
      "superbad",
      new Comedia("Superbad", "Greg Mottola", 7.6, 2007)
    );
    catalogo.put(
      "el padrino",
      new Drama("El Padrino", "Francis Ford Coppola", 9.2, 1972)
    );
    catalogo.put(
      "el señor de los anillos",
      new Fantasia("El Señor de los Anillos", "Peter Jackson", 8.8, 2001)
    );
    catalogo.put(
      "el exorcista",
      new Terror("El Exorcista", "William Friedkin", 8.0, 1973)
    );
    catalogo.put(
      "the social network",
      new Docudramas("The Social Network", "David Fincher", 7.7, 2010)
    );
    catalogo.put(
      "inside job",
      new Reportajes("Inside Job", "Charles Ferguson", 8.2, 2010)
    );

    //Menú

    //Opción 1 - Mostrar Catalogo

    Rutinas.agregarAlCatalogo(catalogo);
    //Opción 2 - Mostrar Catalogo

    Rutinas.mostrarCatalogo(catalogo);

    //Opción 3 Búsqueda -
    //SubMenu 1
    //Opción 1 - Buscar Película por título
    Rutinas.buscarPorTitulo(catalogo, null);
    //Opción 2 - Buscar película por director
    Rutinas.buscarPorDirector(catalogo, null);
    //Opción 3 - Mostrar películas por género
    Rutinas.buscarPorGenero(catalogo, null);
  }
}
// Preguntas
// Scanner, uno por try, catch?
// scan close - al final de todos los scanners o al final de cada uno?
//----------------------------------------------------------------
//Cambios
//[x]Tipo a Género
//[x]Agregar Subgénero
