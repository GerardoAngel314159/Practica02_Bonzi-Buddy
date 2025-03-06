/**
 * Clase que representa al estado moroso de un usuario en la biblioteca
 * Esta clase administra sus acciones del usuario cuando es moroso
 */
public class EstadoMoroso implements EstadoUsuario{

    /**
     * Representa al usuario
     */
    Usuario usuario;

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
        usuario.setTieneLibro(false);
        material.setEstaLibre(true);
        usuario.setEstado( usuario.getEstadoActivo());
        System.out.println("Has entregado el material a la biblioteca, por lo que su estado a sido cambiado a usuario Activo");;
    }

    public void prestamoExpress(Material material){
        System.out.println("Lo sentimos, eres un usuario Moroso, por lo que no puede pedir ningun material de forma express hasta que devuleva el libro actual");
    }

    public  void renovarPrestamo(Material material){

    }

    }

