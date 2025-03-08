# Practica02_Bonzi-Buddy

[Practica 2]
Bonzi Buddy

Angel Maldonado Gerardo De Jesús    320188268
Candiani Pérez Gabriel              318268534
Salazar Enriquez Luis Alberto       321155405

En esta práctica se aplicaron los patrones State, Template e Iterator, lo que hizo el código más eficiente al lograr una estructura más modular y organizada, facilitando su mantenimiento y futuras mejoras.

Para el patrón state tenemos la clase Usuario que tiene un atributo llamado estadoActual y tiene dos
implementaciones concretas: EstadoActivo y EstadoMoroso.
Metodos como pedirLibro(), devolverLibro(), renovarPrestamo(), prestamoExpres() y reservarLibro se delegan al objeto estadoActual. Cuando el usuario devuelve un libro o realiza alguna otra acción, el estado puede cambies(de moroso a activo por ejemplo) sin modificar la lógica de la clase Usuario, permitiendo así porque crear métodos ya dichos para el usuario según su estado actual

Para el patrón iterador se aplica en las clases que manejan las colecciones de libros.
En BiblioRevistas se utiliza un arreglo para almacenar los objetos Revista y define un iterador que recorre este arreglo.
En BiblioLibros usamos una lista de objetos libro y tenemos un método iterador() como métodos adicionales para recorrer la lista(next() y hasNext()). Y en BilbioAudioLibros usamos una tabla hash para almacenar AudioLibro y retornamos un iterador sobre los valores de la tabla. Mediante la interfaz Iterable en cada clase ocultamos la estructura interna de la coleccion de los diversos tipos de libros y se facilita el recorrido de manera uniforma.

Decidimos implementar template de la manera que exista una clase abstracta Material, la cual va a ser implementada por las clases Libro, Revista y Audiolibro, esto porque todos ellos comparten muchas características como atributos y métodos, pero los libros difieren en la característica que estos tienen formato PDF, EPUB o MOBI, por lo que usar template para este apartado es bueno porque nos permite implementar los mismos algoritmos para estas clases y crear diferentes para una clase que difiere, en este caso Libro, como también el método toString el cual se queda como método abstracta en la clase Material y cada clase, Libro, Revista y Audiolibro los implementan de manera diferente.
