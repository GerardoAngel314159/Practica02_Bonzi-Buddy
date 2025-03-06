import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase que representa la niblioteca de revistas
 * Tiene y administra una coleccion de objetos {@link Revista}
 * 
 */
public class BiblioRevistas implements Iterable<Revista> {

    /**\
     * Arreglo que almacena las revistas
     */
    private Revista[] revistas;

    /**
     * Numero de revistas agregadas (actualmente)
     */
    private int count;

    /**
     * Constructor que inicializa el arreglo de revistas con la capacidad querida
     * 
     * @param capacidad la cantidad maxima querida de revistas
     */
    public BiblioRevistas(int capacidad) {
        revistas = new Revista[capacidad];
        count = 0;
    }

    /**
     * Agrega una revista a la biblioteca
     * @param revista el objeto a agregar
     */
    public void addRevista(Revista revista) {
        if (count < revistas.length) {
            revistas[count++] = revista;
        } else {
            System.out.println("No se puede agregar más revistas.");
        }
    }

    /**
     * Retorna un iterador para recorrer las revistas
     * 
     * @return un objeto de {@link Revista}
     */
    @Override
    public Iterator<Revista> iterator() {
        return new Iterator<Revista>() {
            private int index = 0;
            
            /**
             * checa si existen mas revistas en el arreglo
             */
            @Override
            public boolean hasNext() {
                return index < count;
            }

            /**
            * Retorna la siguiente revista en la coleccion
            * 
            * @return la siguiente revista
            * @throws NosuchElementException si no hay mas revistas para rettornar
            */
            @Override
            public Revista next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return revistas[index++];
            }
        };
    }
}