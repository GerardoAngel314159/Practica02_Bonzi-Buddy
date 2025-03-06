public class Libro extends Material{

    public Libro( String nombre){
       super(nombre);
    }
    
    public String toString(){
        return ("Libro: " + this.getNombre());
    }
    /**
     * Metodo que hace que la lista avance al siguiente elemento desde la posicion actual
     */
    // public Material next(){
    //     Material libro = libros.get(position);
    //     position++;
    //     return libro;
    // }

    // /**
    //  * Metodo que verifica si hay mas elementos en la lista
    //  * @return boolean con valor a True si hay mas elementos en la lista desde la posicion actual, en otro caso False
    //  */
    // public boolean hasNext (){
    //     if(position <libros.size()){
    //         return true;
    //     }else{
    //         return false;
    //     }
}

