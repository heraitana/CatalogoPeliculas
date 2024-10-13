# CatalogoPeliculas

## Descripción
CatalogoPeliculas es un sistema de gestión de catálogos de películas que utiliza principios de programación orientada a objetos como herencia, polimorfismo, manejo de excepciones y colecciones.

## Estructura del Proyecto

### Herencia

- **Clase Principal:**
  - `Catalogo`

- **Clase Base (Superclase):**
  - `Pelicula`

- **Clases Derivadas (Subclase):**
  - **De Ficción:**
    - `Ficcion`
      - `Accion`
      - `Animacion`
      - `Aventura`
      - `CienciaFiccion`
      - `Comedia`
      - `Drama`
      - `Fantasia`
      - `Romance`
      - `Terror`
      - `Thriller`
      
  - **De No Ficción:**
    - `NoFiccion`
      - `Biografia`
      - `Docudrama`
      - `Historica`
      - `Reportaje`

### Polimorfismo

- **Clase Abstracta:**
  - `Advertencia`

- **Uso del Polimorfismo en Clases Derivadas:**
  - **Ficción:**
    - `CienciaFiccion`
    - `Romance`
    - `Terror`
  
  - **No Ficción:**
    - `Biografia`
    - `Historica`
    - `Reportaje`

> **Definición Abstract:** Promueve la reutilización de código y la organización.

### Excepciones

- **Clase Rutina:** Manejo de excepciones utilizando bloques `try/catch` en cada método.

### Colecciones

- **HashMap:**
  - **Qué es:** Un HashMap guarda pares de claves y valores.
  - **Rápido:** Busca y guarda datos de manera eficiente.
  - **Desordenado:** No mantiene el orden de los elementos.
  - **Acepta Null:** Puede contener claves o valores que sean `null`.

## Contribuciones
Las contribuciones son bienvenidas. Si deseas contribuir, por favor abre un issue o envía un pull request.
