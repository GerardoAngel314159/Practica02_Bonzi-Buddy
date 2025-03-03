/**
 * Clase que representa el estado Activo de los usarios de la biblioteca 
 * Esta clase Administra las acciones que puede realizar las acciones cuando el usuario tiene un estado activo
 */
public class EstadoActivo implements EstadoUSuario{

    /**
     * Representa al Usuario
     */
    Usuario usario;

    /**
     * Metodo que hace que un usuario pida prestado un material.
     * Verifica si el Usuario tiene algun material primero, si no tiene algo prestado se le da el libro, en otro caso se le niega
     * @param material el material que el usuario va a pedir prestado
     * 
     */
    public void pedirLibro(Material material){
        if(getTieneLibro()== False){
            this.setTieneLibro(True);
            material.setEstaLibre(False);
            //linea que es por 15 dias 
        }else{
            System.out.println("No puedes pedir otro libro porque ya pediste prestado 1 material");
        }
    }

    /**
     * Metodo que hace que el usuario devuelva un material a la biblioteca
     * Verifica que el usuario tenga algun material prestado para poder devolver
     * en otro caso no imprime un mensaje de error.
     */
    public void devolverLibro(Material material){
        if(getTieneLibro == True){
        this.setTieneLIbro(False);
        material.setEstaLibre(True);
        System.out.println("Has devuelto el libro" + material.getNombre());
        }else{
            System.out.println("No puede devolver algun material si no tiene uno prestado :)");
        }
    }
    
    //public void renovarPrestamo(Material material){
    //    if (material.getEstado() == Prestado ){
    //    
    //    }
    //}

    public void prestamoExpress(Material material){
         if(getTieneLibro()== False){
        this.setTieneLibro(True);
        material.setEstaLibre(False);
        //linea que solo es por 7 dias 
        }else{
            System.out.println("No puedes pedir otro libro porque ya pediste prestado 1 libro");
        }
    }
}