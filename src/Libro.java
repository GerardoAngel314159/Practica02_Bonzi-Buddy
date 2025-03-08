/**
 * Representa la clase Libro que extiende la clase {@code Material}
 */
public class Libro extends Material{

    /**
     * Construye un objeto de tipo {@code Libro} 
     * 
     * @param nombre del libro
     */

    public Libro( String nombre){
       super(nombre);
    }
    
    /**
     * @return una cadena con los nombres de los Libros
     */
    public String toString(){
        return ("Libro: " + this.getNombre() + this.formato);
    }

}

