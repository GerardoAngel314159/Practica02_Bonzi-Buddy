public class Revista extends Material{

    public Revista(String nombre){
        super(nombre);
    }
    
    public String toString(){
        return ("Revista: " + this.getNombre());
    }
}