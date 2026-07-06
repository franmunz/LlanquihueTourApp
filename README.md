# Llanquihue Tour App

Es una aplicación desarrollada en Java que permite gestionar información relacionada con servicios turísticos de la zona de Los Lagos.

El sistema permite cargar datos desde un archivo .txt, administrar tours, clientes, guías y operadores turísticos, además de realizar búsquedas y filtros sobre los tours disponibles.
El proyecto fue desarrollado aplicando conceptos de Programación Orientada a Objetos (POO), manejo de archivos y organización por paquetes.

## Estructura del proyecto

LlanquihueTourApp
│
├── src
│ └── main
│  └── java
│   └── llanquihue.tour
│   │
│   ├── data
│   │ └── GestorDatos.java
│   │ └── GestorServicios.java
│   │
│   ├── main
│   │ └── Main.java
│   │
│   └── model
│   │ ├── Cliente.java
│   │ ├── Direccion.java
│   │ ├── Guia.java
│   │ ├── Operador.java
│   │ ├── Persona.java
│   │ ├── Tour.java
│   │ ├── ServicioTuristico.java 
│   │ ├── RutaGastronomica.java
│   │ ├── PaseoLacustre.java 
│   │ └── ExcursionCultural.java
│   │ 
│   └── util
│     └── Validacion.java
│  
├── datos.txt
│
├── pom.xml
└── README.md

## Funcionalidades principales

### Gestión de Tours

Permite almacenar información de tours:

- Nombre del tour
- Lugar donde se realiza
- Precio

**Ejemplo:**

- Tour Cultural, Puerto Varas, 20000

### Gestión de Personas

El sistema utiliza una clase base Persona, desde donde heredan:

- Cliente
- Guía
- Operador

Cada persona posee:

- Nombre
- RUT
- Direccion

### Clientes

Permite registrar clientes asociados a un tour adquirido.

**Ejemplo:**

- Nombre: Ana Torres
- Rut: 17557831-5
- Tour adquirido: Ruta Gastronómica

### Guías

Permite registrar guías turísticos indicando su especialidad.

**Ejemplo:**

- Nombre Guia: Pedro Diaz
- Especialidad: Turismo Aventura

### Operadores

Permite registrar empresas o personas encargadas de entregar servicios turísticos.

**Ejemplo:**

- Nombre Operador: PatagonTours
- Tipo de Servicio: Alojamiento

### Carga de datos

Los datos se almacenan en un archivo: datos.txt

El formato utilizado es:

- TIPO;dato1;dato2;dato3

**Ejemplo:**

- TOUR;City Tour;Puerto Varas;15000

## Funciones de búsqueda y filtrado

El sistema permite:

- Buscar tour por nombre
- Filtrar tour por lugar
- Filtrar tour por precio máximo

## Actualización del programa

El objetivo de esta semana fue implementar una jerarquía de clases utilizando herencia simple en Java para representar los distintos servicios turísticos que ofrece la agencia Llanquihue Tour.

## Clases creadas

### ServicioTuristico

Se crea como una superclase para obtener nombre y duración de horas.

### RutaGastronomica

Representa un recorrido gastronómico. Hereda de `ServicioTuristico` y agrega el atributo `numeroDeParadas`, que indica la cantidad de lugares gastronómicos que se visitan durante el recorrido.

**Ejemplo:**

- Nombre: Ruta del Salmón
- Duración: 4 horas
- Número de paradas: 5

### PaseoLacustre

Representa un paseo por un lago. Hereda de `ServicioTuristico` y agrega el atributo `tipoEmbarcacion`, que indica el medio de transporte utilizado en el recorrido.

**Ejemplo:**

- Nombre: Lago Llanquihue
- Duración: 2 horas
- Tipo de embarcación: Catamarán

### ExcursionCultural

Representa una excursión enfocada en lugares históricos o culturales. Hereda de `ServicioTuristico` y agrega el atributo `lugarHistorico`, que identifica el sitio principal que se visita.

**Ejemplo:**

- Nombre: Museo Colonial Alemán
- Duración: 2 horas
- Lugar histórico: Frutillar

### GestorServicios

Se encarga de crear las instancias de los distintos servicios turísticos y mostrarlas mediante el método `mostrarServicios()`.

## Ejecución del programa

1. Ejecutar la clase:

- Main.java

2. El programa carga automáticamente:

- datos.txt

3. Muestra:

- Tours disponibles
- Clientes registrados
- Guías
- Operadores
- Resultados de filtros
- Búsquedas
- Servicios turisticos

## Actualización del programa

Se realizó nuevamente una actualización en el programa, donde modificamos las clases de los servicios turísticos, incorporando el método `mostrarInformacion()`, que es sobrescrito por cada subclase.
También se utilizó una colección `List<ServicioTuristico>` para almacenar distintos tipos de servicios y recorrerlos de forma polimórfica mediante un bucle `for-each`.

## Clases modificadas

### ServicioTuristico

Superclase que contiene los atributos comunes (`nombre` y `duracionHoras`) y el método `mostrarInformacion()`, utilizado como base para el polimorfismo.

### RutaGastronomica

Hereda de `ServicioTuristico` y sobrescribe el método `mostrarInformacion()` para mostrar la información de una ruta gastronómica.

### PaseoLacustre

Hereda de `ServicioTuristico` y sobrescribe el método `mostrarInformacion()` para mostrar la información de un paseo lacustre.

### ExcursionCultural

Hereda de `ServicioTuristico` y sobrescribe el método `mostrarInformacion()` para mostrar la información de una excursión cultural.

### GestorServicios

Administra una colección `List<ServicioTuristico>`, crea instancias de los distintos servicios turísticos y las recorre utilizando polimorfismo.

### Main

Clase principal que ejecuta el programa y llama a `GestorServicios` para mostrar la información de los servicios turísticos.

## Conceptos aplicados

- Herencia simple.
- Polimorfismo.
- Sobrescritura de métodos (`@Override`).
- Colecciones genéricas (`List` y `ArrayList`).
- Recorrido de colecciones mediante `for-each`.

## Instrucciones para ejecutar el programa

1. Abrir el proyecto **LlanquihueTourApp** en IntelliJ IDEA.
2. Verificar que el archivo `datos.txt` se encuentre en la carpeta correspondiente del proyecto.
3. Ejecutar la clase `Main.java`.
4. El programa cargará los datos existentes y mostrará los servicios turísticos almacenados en la colección utilizando polimorfismo.

