package catalogo;

import catalogo.Ficcion.*;
import catalogo.NoFiccion.*;
import java.util.HashMap;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

public class Rutina extends Exception {

  public Rutina(String mensaje) {
    super(mensaje);
  }

  public static void peliculasPreAgregadas(HashMap<String, Pelicula> catalogo) {
    // Agregar películas al catálogo
    catalogo.put(
      "steve jobs",
      new Biografia("Steve Jobs", "Joshua Michael Stern", 7.2, 2015)
    );
    catalogo.put(
      "nuestro planeta",
      new Documental("Nuestro planeta", "David Attenborough", 8.0, 2019)
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
      new Historica("Schindler's List", "Steven Spielberg", 8.9, 1993)
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
      new Docudrama("The Social Network", "David Fincher", 7.7, 2010)
    );
    catalogo.put(
      "inside job",
      new Reportaje("Inside Job", "Charles Ferguson", 8.2, 2010)
    );
  }

  public static void agregarAlCatalogo(HashMap<String, Pelicula> catalogo) {
    String titulo = JOptionPane.showInputDialog(
      null,
      "Digite el título de la película:"
    );
    String director = JOptionPane.showInputDialog(
      null,
      "Digite el director de la película:"
    );
    double calificacionIMDb = Double.parseDouble(
      JOptionPane.showInputDialog(
        null,
        "Digite la calificación IMDb de la película:"
      )
    );
    int year = Integer.parseInt(
      JOptionPane.showInputDialog(null, "Digite el año de la película:")
    );

    //[x] Me falta agregar Género y Subgénero que están en Ficción/No Ficción

    String genero = JOptionPane.showInputDialog(
      null,
      "Digite el género de la película (Ficción/No Ficción): "
    );
    String subGenero = JOptionPane.showInputDialog(
      null,
      "Digite el subgénero de la película: "
    );
    
    Ficcion ficcion = new Ficcion(
      titulo,
      director,
      calificacionIMDb,
      year,
      genero,
      subGenero
    );
    catalogo.put(titulo.toLowerCase(), ficcion);
    NoFiccion noFiccion = new NoFiccion(
      titulo,
      director,
      calificacionIMDb,
      year,
      genero,
      subGenero
    );
    catalogo.put(titulo.toLowerCase(), noFiccion);
  }

  // Método para mostrar el catálogo completo de películas
  public static void mostrarCatalogo(HashMap<String, Pelicula> catalogo) {

    StringBuilder sb = new StringBuilder();
    try {
      for (Pelicula pelicula : catalogo.values()) {
        sb.append(pelicula.toString()).append("\n");
      }
      JOptionPane.showMessageDialog(
        null,
        "\n" + "Catálogo de Películas:" + "\n" + sb.toString(),
        "Catálogo",
        JOptionPane.INFORMATION_MESSAGE);
    } catch (NullPointerException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("El catálogo está vacío.");
    }
  }

  // ----------------------------------------------------------------

  public static void buscarPorTitulo(
    HashMap<String, Pelicula> catalogo,
    String busquedaTitulo
  ) {
    boolean encontrado = false;

    try {
      for (Pelicula pelicula : catalogo.values()) {
        if (pelicula.getTitulo().equalsIgnoreCase(busquedaTitulo)) {
          if (!encontrado) {
            JOptionPane.showConfirmDialog(null,"\n" + "Película encontrada:" + "\n");
            encontrado = true;
          }
          JOptionPane.showMessageDialog(null, pelicula.toString());
                }
      }
      if (!encontrado) {
        JOptionPane.showMessageDialog(null, "\n" + "Película NO encontrada" + "\n" + JOptionPane.WARNING_MESSAGE);
      }
    } catch (NullPointerException t) {
      System.out.println("Error: " + t.getMessage());
    } catch (Exception t) {
      System.out.println("Película NO encontrada");
    } finally {}
  }

  public static void buscarPorDirector(
    HashMap<String, Pelicula> catalogo,
    String busquedaDirector
  ) {
    boolean encontrado = false;

    try {
      for (Pelicula pelicula : catalogo.values()) {
        if (pelicula.getDirector().equalsIgnoreCase(busquedaDirector)) {
          if (!encontrado) {
            JOptionPane.showMessageDialog(null, "\n" + "Director(a) encontrad(a):" + "\n");
            encontrado = true;
          }
          JOptionPane.showMessageDialog(null, pelicula.toString());
        }
      }
      if (!encontrado) {
        JOptionPane.showMessageDialog(null, "No se encontraron películas por el director: " + busquedaDirector);
      }
    } catch (NoSuchElementException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (NullPointerException t) {
      System.out.println("Error: " + t.getMessage());
    } catch (Exception t) {
      System.out.println("Director NO encontrado");
    } finally {}
  }

  public static void buscarPorGenero(
    HashMap<String, Pelicula> catalogo,
    String busquedaGenero
  ) {
    boolean encontrado = false;


    try {
      for (Pelicula pelicula : catalogo.values()) {
        if (pelicula.getGenero().equalsIgnoreCase(busquedaGenero)) {
          if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Películas encontradas:" + "\n");
            encontrado = true;
          }
          JOptionPane.showMessageDialog(null, pelicula.toString());
        }
      }
      if (!encontrado) {
        JOptionPane.showMessageDialog(null,
          "No se encontraron películas para el género: " + busquedaGenero
        );
      }
    } catch (NullPointerException t) {
      System.out.println("Error: " + t.getMessage());
    } catch (Exception t) {
      System.out.println("Ocurrió un error inesperado: " + t.getMessage());
    } finally {}
  }

  public static void buscarPorSubGenero(
    HashMap<String, Pelicula> catalogo,
    String busquedaSubGenero
  ) {
    boolean encontrado = false;

    try {
      for (Pelicula pelicula : catalogo.values()) {
        if (pelicula.getSubGenero().equalsIgnoreCase(busquedaSubGenero)) {
          if (!encontrado) {
            encontrado = true;
          }
          JOptionPane.showMessageDialog(null,"Películas encontradas:" + "\n" + pelicula.toString());
        }
      }
      if (!encontrado) {
        JOptionPane.showMessageDialog(null, 
          "No se encontraron películas para el género: " + busquedaSubGenero
        );
      }
    } catch (NullPointerException t) {
      System.out.println("Error: " + t.getMessage());
    } catch (Exception t) {
      System.out.println("Ocurrió un error inesperado: " + t.getMessage());
    } finally {}
  }
}
//Cambios
// [ ] Agregar excepciones a los métodos restantes con try/catch
// [ ] Agregar scrolldown para el catalogo/ mostrar catalogo 
