# Llanquihue Tour App

Es una aplicación desarrollada en Java que permite gestionar información relacionada con servicios turísticos de la zona de Llanquihue.

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
│   │ └── Tour.java
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

Ejemplo:

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

Ejemplo:

- Nombre: Ana Torres
- Rut: 17557831-5
- Tour adquirido: Ruta Gastronómica

### Guías

Permite registrar guías turísticos indicando su especialidad.

Ejemplo:

- Nombre Guia: Pedro Diaz
- Especialidad: Turismo Aventura

### Operadores

Permite registrar empresas o personas encargadas de entregar servicios turísticos.

Ejemplo:

- Nombre Operador: PatagonTours
- Tipo de Servicio: Alojamiento

### Carga de datos

Los datos se almacenan en un archivo: datos.txt

El formato utilizado es:

- TIPO;dato1;dato2;dato3

Ejemplo:

- TOUR;City Tour;Puerto Varas;15000

## Funciones de búsqueda y filtrado

El sistema permite:

- Buscar tour por nombre
- Filtrar tour por lugar
- Filtrar tour por precio máximo

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