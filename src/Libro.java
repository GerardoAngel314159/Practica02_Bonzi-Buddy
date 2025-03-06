import java.util.ArrayList;

public class Libro extends Material{
    ArrayList<Material> libros;
    int position = 0;

    public Libro(ArrayList<Material> libros){
        this.libros = libros;
    }
    
    /**
     * Metodo que hace que la lista avance al siguiente elemento desde la posicion actual
     */
    public Material next(){
        Material libro = libros.get(position);
        position++;
        return libro;
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
