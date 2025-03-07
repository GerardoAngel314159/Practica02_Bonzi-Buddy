public class Libro extends Material{

    public Libro( String nombre){
       super(nombre);
    }
    
    public String toString(){
        return ("Libro: " + this.getNombre());
    }

}

