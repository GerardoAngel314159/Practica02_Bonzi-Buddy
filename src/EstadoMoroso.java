/**
 * Clase que representa al estado moroso de un usuario en la biblioteca
 * Esta clase administra sus acciones del usuario cuando es moroso
 */
public class EstadoMoroso implements EstadoUsuario{

    /**
     * Representa al usuario
     */
    private Usuario usuario;

    public EstadoMoroso(Usuario usuario){
        this.usuario = usuario;
    }
    /**
     * Metodo pedirLibro que solo imprime un mensaje al usuario donde le dice que no puede pedir ningun libro prestado porque es moroso
     * @param material que el usuario quiere pedir prestado
     */
    public void pedirLibro(Material material){

        System.out.println("Lo sentimos actualmente eres un usuario Moroso, por lo que no puedes pedir algun material nuevo hasta devolver lo que ha pedido");
    }

    /**
     * Metodo devolver que hace que el usuario devuelva un material, hace que el usuario ya no tenga un material, el material este libre
     * finalmente hace que el usuario sea activo de nuveo
     */
    public void devolverLibro(Material material){
        usuario.resetTieneLibro();
        material.setEstaLibre(true);
        usuario.setEstado( usuario.getEstadoActivo());
        System.out.println("Has entregado el material a la biblioteca, por lo que su estado a sido cambiado a usuario Activo");;
    }

    /**
     * Metodo que le dice al usuario moroso que no puede solicitar el prestamo expres 
     * 
     * @param material el libro que el usuario quiere pedir prestado
     */
    public void prestamoExpress(Material material){
        System.out.println("Lo sentimos, eres un usuario Moroso por lo que no puede pedir ningun material de forma express" 
        + " hasta que devuleva el libro actual");
    }

    /**
     * Metodo que le dice al usuario que no puede renovar un pestamo sindo un usuario moroso
     */
    public void renovarPrestamo(){
        System.out.println("No puedes renovar un prestamo siendo un usuario Moroso, devuelve el producto a la brevedad");
    }

    /**
     * Metodo que le dice al usuario que no puede reservar un libro siendo usuario moroso
     * 
     * @param material el libro que el usuario quiere reservar
     */
    public void reservarLibro(Material material){
        System.out.println("Lo sentimos, eres un usuario Moroso por lo que no podrás reservar ningun libro hasta devolver el tuyo");
    }

}

