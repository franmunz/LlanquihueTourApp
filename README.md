# Llanquihue Tour App

Es una aplicación desarrollada en Java para la gestión de información de la agencia de turismo "Llanquihue Tour"

El sistema permite leer datos almacenados en un archivo de texto (`tours.txt`), crear objetos de tipo `Tour`, almacenarlos en una colección `ArrayList` y mostrar la información de los tours registrados, además de realizar filtros según sus características.

## Funcionamiento

El programa realiza las siguientes acciones:

1. Lee la información desde el archivo `tours.txt`.
2. Separa los datos utilizando el carácter `;`.
3. Crea objetos `Tour` con la información obtenida.
4. Almacena los objetos en un `ArrayList`.
5. Muestra todos los tours registrados.
6. Filtra los tours según una condición determinada.

## Estructura del proyecto

LlanquihueTourApp
│
├── src
│ └── main
│ ├── java
│ │ └── llanquihue.tour
│ │
│ │ ├── data
│ │ │ └── GestorDatos.java
│ │ │
│ │ ├── main
│ │ │ └── Main.java
│ │ │
│ │ └── model
│ │ └── Tour.java
│ │
│ └── resources
│ └── tours.txt
│
├── pom.xml
└── README.md

## Formato del archivo tours.txt

Los datos se almacenan separados por punto y coma: Nombre del tour;Tipo;Precio

## Instrucciones para ejecutar

1. Clonar o descargar este repositorio.
2. Abrir el proyecto utilizando IntelliJ IDEA.
3. Verificar que Java esté correctamente configurado.
4. Ejecutar la clase principal: Main.java