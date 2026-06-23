![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

## 🧠 Evaluación – Desarrollo Orientado a Objetos I 

👤 Autor del proyecto

Nombre completo: Sergio Sandoval Valenzuela

Carrera: Analista Programador

Sede: Santiago Online

# 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación de la asignatura Desarrollo Orientado a Objetos I.

El sistema desarrollado en Java permite gestionar información de tours turísticos de la empresa Llanquihue Tour, cargando datos desde un archivo de texto y almacenándolos en una colección dinámica mediante el uso de objetos.

La aplicación implementa conceptos fundamentales de Programación Orientada a Objetos (POO), tales como:

-Encapsulamiento.

-Constructores.

-Getters y Setters.

-Sobrescritura de métodos mediante toString().

-Manejo de archivos de texto.

-Uso de colecciones ArrayList.

-Estructuras de control (if y while).

-Manejo de excepciones mediante try-catch.

-El sistema permite mostrar el listado completo de tours y filtrar aquellos pertenecientes a la categoría Familiar.


# 🧱 Estructura general del proyecto

```text
src/
├── ui/
│   └── Main.java
├── model/
│   └── Tour.java
├── data/
│   └── GestorDatos.java
└── resources/
    └── tours.txt
```

#  Descripción de paquetes:

## 📁 ui

Contiene la clase principal Main, encargada de ejecutar la aplicación y mostrar los resultados por consola.

## 📁 model

Contiene la clase Tour, que representa cada tour turístico mediante atributos, constructor, getters, setters y método toString().

## 📁 data

 Contiene la clase GestorDatos, responsable de la lectura del archivo tours.txt y la creación de objetos Tour.

## 📁 resources

Contiene el archivo de texto tours.txt, donde se almacenan los datos utilizados por el sistema.


# ⚙️ Instrucciones para clonar y ejecutar el proyecto

  -Clonar el repositorio
  
  -git clone https://github.com/sergiosandovalv/llanquihue-tour.git
  
  -Abrir el proyecto
  
  -Abrir NetBeans IDE.
  
  -Seleccionar File → Open Project.
  
  -Buscar la carpeta del proyecto clonado.
  
  -Abrir el proyecto.
  
  -Ejecutar la aplicación
  
  -Verificar que el archivo tours.txt se encuentre disponible en la carpeta resources.
  
  -Ejecutar la clase Main.java ubicada en el paquete ui.
  
  -El sistema cargará los tours desde el archivo de texto.
  
  -Se mostrará el listado completo de tours.
  
  -Posteriormente se visualizarán únicamente los tours de tipo Familiar.



# 📄 Resultado esperado

El sistema mostrará por consola:

-Todos los tours cargados desde el archivo.

-Los tours filtrados por categoría Familiar.
