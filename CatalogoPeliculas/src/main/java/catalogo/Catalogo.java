package catalogo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Catalogo {

  public static void main(String[] args) throws IOException {
    HashMap<String, Pelicula> catalogo = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    int opcionMenu = 0;

    while (opcionMenu != 5) {
      String textoMenu =
        """
            === Menú del Catálogo de Películas ===
            1. Cargar Películas
            2. Mostrar Catálogo
            3. Agregar Nuevas Película al Catálogo
            4. Buscar Películas
            5. Salir
            Seleccione una opción: 
           """;

      opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(textoMenu));

      switch (opcionMenu) {
        case 1:
          Rutina.peliculasPreAgregadas(catalogo);
          break;
        case 2:
          JOptionPane.showMessageDialog(null, "Catalogo de Películas: ");

          Rutina.mostrarCatalogo(catalogo);
          break;
        case 3:
          JOptionPane.showMessageDialog(
            null,
            "Agregar Nuevas Película al Catálogo: "
          );
          Rutina.agregarAlCatalogo(catalogo);
          break;
        case 4:
          // Entra al submenú de agregar película
          int opcionSubMenu = 0;
          while (opcionSubMenu != 5) {
            String textoSubMenu =
              """
                              === Submenú de Agregar Película ===
                              1. Buscar Película por Título
                              2. Buscar Película por Director
                              3. Buscar Película por Género
                              4. Buscar Película por Subgénero
                              5. Volver al Menú Principal
                              """;

            opcionSubMenu =
              Integer.parseInt(JOptionPane.showInputDialog(textoSubMenu));

            switch (opcionSubMenu) {
              case 1:
                String busquedaTitulo = JOptionPane.showInputDialog(
                  "Ingrese el título de la película a buscar:"
                );
                Rutina.buscarPorTitulo(catalogo, busquedaTitulo);
                break;
              case 2:
                String busquedaDirector = JOptionPane.showInputDialog(
                  "Ingrese el nombre del director a buscar:"
                );
                Rutina.buscarPorDirector(catalogo, busquedaDirector);
                break;
              case 3:
                // Opciones de géneros
                String[] opcionesGenero = { "Ficción", "No Ficción" };

                String busquedaGenero = (String) JOptionPane.showInputDialog(
                  null,
                  null,
                  "Selecciona un genero: ",
                  JOptionPane.QUESTION_MESSAGE,
                  null,
                  opcionesGenero,
                  opcionesGenero[0]
                );

                Rutina.buscarPorGenero(catalogo, busquedaGenero);
                break;
              case 4:
                String[] opcionesSubGenero = {
                  "Acción",
                  "Animación",
                  "Aventura",
                  "Ciencia Ficción",
                  "Comedia",
                  "Drama",
                  "Fantasía",
                  "Romance",
                  "Terror",
                  "Thriller",
                  "Biografía",
                  "Docudrama",
                  "Histórica",
                  "Reportaje",
                };

                String busquedaSubGenero = (String) JOptionPane.showInputDialog(
                  null,
                  null,
                  "Selecciona un subgenero: ",
                  JOptionPane.QUESTION_MESSAGE,
                  null,
                  opcionesSubGenero,
                  opcionesSubGenero[0]
                );
                Rutina.buscarPorSubGenero(catalogo, busquedaSubGenero);
                break;
              case 5:
                JOptionPane.showMessageDialog(
                  null,
                  "Volviendo al menú principal..."
                );
                break;
              default:
                JOptionPane.showMessageDialog(
                  null,
                  "Opción no válida. Intente de nuevo."
                );
                break;
            }
          }
        case 5:
          System.out.println("Saliendo del programa...");
          break;
        default:
          JOptionPane.showMessageDialog(
            null,
            "Opción no válida. Intente de nuevo."
          );
          break;
      }
    }
    scanner.close();
  }
}
