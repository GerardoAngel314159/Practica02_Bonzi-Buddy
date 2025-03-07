/**
 * Representa la clase AudioLibro que extiende de {@code Material}.
 */
public class Audiolibro extends Material{
    
    /**
     * Contruye un objeto de tipo {@code AudioLibro}
     * @param nombre
     */
    public Audiolibro(String nombre){
        super(nombre);
    }

    /**
     * @return cadena con los nobres de los AudioLibros
     */
    public String toString(){
        return ("Audiolibro: " + this.getNombre());
    } 

}
