
import java.util.Scanner;

/**
 * Clase que representa el estado Activo de los usarios de la biblioteca 
 * Esta clase Administra las acciones que puede realizar las acciones cuando el usuario tiene un estado activo
 */
public class EstadoActivo implements EstadoUsuario{

    /**
     * Representa al Usuario
     */
    private Usuario usuario;
    /**
     * Metodo que hace que un usuario pida prestado un material.
     * Verifica si el Usuario tiene algun material primero, si no tiene algo prestado se le da el libro, en otro caso se le niega
     * @param material el material que el usuario va a pedir prestado
     * 
     */

     public EstadoActivo(Usuario usuario){
        this.usuario = usuario;
    }

    /**
     * Permite al usuario pedir un libro prestado
     * 
     * <p>
     * Si el usuario no tiene un libro prestado y el libro esta libre 
     * se le da el libro al usuario y se imprime un mensaje confirmando el prestamo
     * Si el libro no esta disponible, se le pregunta al usuario si lo quiere reservar
     * en caso de que sea asi, se procede a reservar el libro
     * <p>
     * 
     * @param material el libro que quiere el usuario
     */
    public void pedirLibro(Material material){
        rentar(material, 5);
    }

    private void rentar(Material material, int limite){

        if(!usuario.getTieneLibro()){
            if (material.getEstaLibre()){
                usuario.setMaterial(material);
                material.setLimite(limite);

                System.out.println("\n"+ usuario.getNombre() + " ha rentado " + material.getNombre());
            } else{

                Scanner sc = new  Scanner(System.in);

                System.out.println("El libro ya se encuentra rentado por " + material.getRentado().getNombre() +" Deseas reservarlo? 1)Si 2)no");
                String eleccion = sc.nextLine();
                int opcion = Integer.parseInt(eleccion);
                if (opcion == 1) this.reservarLibro(material);
            }
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
        if(!usuario.getTieneLibro()){
            usuario.liberarMaterial();
            System.out.println("Has devuelto el libro" + material.getNombre());
        } else{
            System.out.println("No puede devolver algun material si no tiene uno prestado :)");
        }
    }

    /**
     *Metodo que hace un usuario pueda pedir un material solo por 7 dias 
     *@param material de tipo Material es cual el usuario quiere pedir prestado
     */
    public void prestamoExpress(Material material){
        rentar(material, 7);
    }

    /**
     * Metodo que permite a al usuario renovar su prestamo del libro si aun esta dentro del limite de prestamos
     * No permite renovar si ya llegaste al limite de prestamos o es fue un prestamo expres
     */
    public void renovarPrestamo(){
        Material material = usuario.getMaterial();
        if (usuario.getTieneLibro()) {
            if (material.getLimite() != 7 && material.getLimite()<=10){
                material.aumentaLimite();
                System.out.println(usuario.getNombre() + " ha extendido su renta, ahora su límite son " 
                + usuario.getMaterial().getLimite() + " dias");
            }
            else {
                System.out.println("Ya ha excedido el limite de renovaciones"
                + " por favor regrese el libro en cuanto llegue a su fecha límite");
            }
        } else {
            System.out.println("No tienes libro que renovar");
        }
    }

    /**
     * Metodo que permite al usuario reservar un libro si no esta disponible
     * Si esta disponible, se recomienda que lo rente directamente 
     * Si ya esta reservado, se informa que el libro no esta disponible
     * 
     * @param material el libro que el usuario quiere reservar
     */
    public void reservarLibro(Material material){
        if(material.getEstaLibre()){
            System.out.println("El artículo está ya disponible, puede rentar sin necesidad de reservar");
        } else if (material.getReservado() != null){
            System.out.println("El libro se encuentra ocupado y reservado");
        } else {
            material.setReservado(usuario);
            System.out.println(usuario.getNombre() + " ha reservado " + material.toString());
        }
    }
}