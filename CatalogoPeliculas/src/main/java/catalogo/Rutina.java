package catalogo;

import catalogo.Ficcion.Ficcion;
import catalogo.NoFiccion.NoFiccion;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Rutina extends Exception {

  public Rutina(String mensaje) {
    super(mensaje);
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
      "Digite el género de la película (Ficción/No Ficción):"
    );
    String subGenero = JOptionPane.showInputDialog(
      null,
      "Digite el subgénero de la película:"
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
    try {
      System.out.println("Catálogo de películas: ");
      for (Pelicula pelicula : catalogo.values()) {
        System.out.println(pelicula.toString());
      }
    } catch (NullPointerException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("El catálogo está vacío.");
    }
  }

  // ----------------------------------------------------------------

  public static void mostrarCatalogo(Pelicula[] catalogo) {
    try {
      System.out.println("Catálogo de películas:");
      for (Pelicula pelicula : catalogo) {
        if (pelicula != null) System.out.println(pelicula.toString());
      }
    } catch (NullPointerException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void buscarPorTitulo(
    HashMap<String, Pelicula> catalogo,
    String titulo
  ) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingrese el título de la película a buscar:");
    String busquedaTitulo = scan.nextLine();
    boolean encontrado = false;

    try {
      for (Pelicula pelicula : catalogo.values()) {
        if (pelicula.getTitulo().equalsIgnoreCase(busquedaTitulo)) {
          if (!encontrado) {
            System.out.println("\n" + "Película encontrada:" + "\n");
            encontrado = true;
          }
          System.out.println(pelicula.toString());
        }
      }
      if (!encontrado) {
        System.out.println("Película NO encontrada");
      }
    } catch (NullPointerException t) {
      System.out.println("Error: " + t.getMessage());
    } catch (Exception t) {
      System.out.println("Película NO encontrada");
    } finally {
      scan.close();
    }
  }

  public static void buscarPorDirector(
    HashMap<String, Pelicula> catalogo,
    String director
  ) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese el nombre del director a buscar:");
    String busquedaDirector = scan.nextLine();
    boolean encontrado = false;

    try {
      for (Pelicula pelicula : catalogo.values()) {
        if (pelicula.getDirector().equalsIgnoreCase(busquedaDirector)) {
          if (!encontrado) {
            System.out.println("\n" + "Director(a) encontrad(a):" + "\n");
            encontrado = true;
          }
          System.out.println(pelicula.toString());
        }
      }
      if (!encontrado) {
        System.out.println(
          "No se encontraron películas por el director: " + busquedaDirector
        );
      }
    } catch (NoSuchElementException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (NullPointerException t) {
      System.out.println("Error: " + t.getMessage());
    } catch (Exception t) {
      System.out.println("Director NO encontrado");
    } finally {
      scan.close();
    }
  }

  public static void buscarPorGenero(
    HashMap<String, Pelicula> catalogo,
    String genero
  ) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese el género a buscar:");
    String busquedaGenero = scan.nextLine();
    boolean encontrado = false;

    try {
      for (Pelicula pelicula : catalogo.values()) {
        if (pelicula.getGenero().equalsIgnoreCase(busquedaGenero)) {
          if (!encontrado) {
            System.out.println("\n" + "Películas encontradas:" + "\n");
            encontrado = true;
          }
          System.out.println(pelicula.toString());
        }
      }
      if (!encontrado) {
        System.out.println(
          "No se encontraron películas para el género: " + busquedaGenero
        );
      }
    } catch (NullPointerException t) {
      System.out.println("Error: " + t.getMessage());
    } catch (Exception t) {
      System.out.println("Ocurrió un error inesperado: " + t.getMessage());
    } finally {
      scan.close();
    }
  }

  public void mostrarInformacion() {
    System.out.println("Película de ficción: ");
    super.toString();
  }
}
//Cambios
// [ ] Agregar excepciones a los métodos restantes con try/catch
