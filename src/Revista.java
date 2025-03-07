/**
 * Es la clase Revista que extiende la clase {@code Material}
 */
public class Revista extends Material{

    /**
     * Construye un objeto de tipo {@code Revista}
     * 
     * @param nombre de la revista
     */
    public Revista(String nombre){
        super(nombre);
    }
    
    /**
     * @return Una lista de los nombres de las Revistas
     */
    public String toString(){
        return ("Revista: " + this.getNombre());
    }
}