import java.util.Hashtable;
import java.util.Iterator;

/**
 * Clase que representa una biblioteca de audioLibros
 * Tiene y Administra una coleccion de objetos {@link AudioLibro} utilizando una tabla de hash
 * Implementa la interfaz {@code Iterable} para iterar los audioLibros
 */
public class BiblioAudiolibros implements Iterable<Audiolibro> {

    /**
     * Tabla de hash para almacenar los audioLibros
     */
    private Hashtable<String, Audiolibro> audiolibros;

    /**
     * Constructor que inicializa la tabla de hash de los audioLibros
     */
    public BiblioAudiolibros() {
        audiolibros = new Hashtable<>();
    }

    /**
     * Agrega un audioLibro a la biblioteca
     * 
     * @param clave la cable asociada al audioLibro 
     * @param audiolibro el objeto a agregar
     */
    // public void addMaterial(Audiolibro audiolibro){
    //     addAudiolibro(audiolibro.getNombre(), audiolibro);
    // }

    public void addAudiolibro(String clave, Audiolibro audiolibro) {
        audiolibros.put(clave, audiolibro);
    }

    /**
     * Retorna un iterador que recorre los audioLibros
     * 
     * @return un objeto de {@link AudioLibros}
     */
    @Override
    public Iterator<Audiolibro> iterator() {
        return audiolibros.values().iterator();
    }

}