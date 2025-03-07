import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

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

    int position = 0;

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

    

    /**
    * Metodo que hace que la lista avance al siguiente elemento desde la posicion actual
    */
     public Material next(){
        if (this.hasNext()){
        Material libro = libros.get(position);
        position++;
        return libro;
        }else{
            throw new NoSuchElementException();
        }
     }

     /**
      * Metodo que verifica si hay mas elementos en la lista
      * @return boolean con valor a True si hay mas elementos en la lista desde la posicion actual, en otro caso False
      */
     public boolean hasNext (){
         if(position <libros.size()){
             return true;
         }else{
             return false;
         }

    }
}
