import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Esta clase representa una biblioteca de libos
 * Tiene la coleccion de objetos {@link Libro} utilizando una lista
 * Usamos la interfaz {@code Uterable} para permitir la iteracion sobre los libros
 */
public class BiblioLibros implements Iterable<Libro> {

    /**
     * Lista que almacena los libros
     */
    private List<Libro> libros;

    /**
     * Constructor que inicializa la lista
     */
    public BiblioLibros() {
        libros = new ArrayList<>();
    }

    /**
     * @param libro el objeto {@code Libro} a agregar
     */
    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Retorna un iterador que recorre la coleccion de libros
     * 
     * @return un objeto de {@link Libro}
     */
    @Override
    public Iterator<Libro> iterator() {
        return libros.iterator();
    }
}