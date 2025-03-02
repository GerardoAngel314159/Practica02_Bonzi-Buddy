/**
 * Clase que representa a la clase Usuario
 * Puede administrar las acciones del usuario en la biblioteca
 * @author BonziBuddy
 * @version 1.0
 */
public class Usuario{

    /**
     * Atributos de la clase Alumno
     */

    /**
     * Este es el nombre del Usuario
     */
    private String nombre;

    /**
     * Representa el estado actual del Usuario
     */
    private EstadoUsuario estadoActual;

    /**
     * Estado Activo del Usuario
     */
    private EstadoUsuario estadoActivo;

    /***
     * Estado Moroso del USuario
     */
    private EstadoUSuario estadoMoroso;


    /**
     * Representa si el usuario ya tiene un libro porque lo ha pedido
     */
    private Boolean tieneLibro;

    /**
     * Metodo get del Nombre
     * @return Nombre del usuario
     */
    public getNombre(){
        return nombre;
    }


    /**
     * Metodo get tiene Libro
     * @return True si el usuario ya tiene un libro, False si no tiene libro
     */
    public getTieneLibro(){
        return tieneLibro;
    }

    /**
     * Metodo get Estado actual
     * @return el Estado actual del Usuario
     */
    public getEstadoActual(){
        return estadoActual;
    }

    /**
     *
     */
    public getEstadoActivo(){
        return estadoActivo;
    }

    public getEstadoMoroso(){
        return estadoMoroso;
    }

    /**
     * Metodo set que cambia el estado del Usuario
     * @param estadoUsuario de tipo usuario al cual va a ser el nuevo estado del Usuario
     */
    public setEstado(EstadoUSuario estadoUsuario){
        this.estadoUsuario = estadoUsuario;
    }

    /**
     * Metodo set que le cambia si el usuario tiene algo prestado
     * @param tienelibro con valor a si tiene un material o no
     */
    public setTieneLibro(Boolean tieneLibro){
        this.tieneLibro = tieneLibro;
    }

}