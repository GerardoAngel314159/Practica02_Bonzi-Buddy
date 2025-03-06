public class Audiolibro extends Material{
    
    public Audiolibro(String nombre){
        super(nombre);
    }

    public String toString(){
        return ("Audiolibro: " + this.getNombre());
    } 

}
