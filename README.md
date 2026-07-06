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


