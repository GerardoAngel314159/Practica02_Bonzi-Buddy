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
    private EstadoUsuario estadoMoroso;

    /**
     * representa al material que el usuario rento 
     */
    private Material rentado;

    /**
     * Representa si el usuario ya tiene un libro porque lo ha pedido
     */
    private boolean tieneLibro;

    /**
     * Constructor de la clase 
     * @param nombre Nombre del usuario
     */
    public Usuario(String nombre){
        estadoActivo = new EstadoActivo(this);
        estadoMoroso = new EstadoMoroso(this);
        this.nombre = nombre;
        tieneLibro = false;
        rentado = null;

    }
    /**
     * Metodo get del Nombre
     * @return Nombre del usuario
     */
    public String getNombre(){
        return nombre;
    }

    public Material getMaterial(){
        return rentado;
    }

    public void setMaterial(Material material){
        rentado = material;
        tieneLibro = true;
        material.setUsuario(this);
    }

    public void liberarMaterial(){
        if (rentado == null){
            System.out.println(nombre + " no ha rentado ningun material");
        } else {
            rentado.liberaMaterial();
            rentado = null;
        }
    }
    /**
     * Metodo get tiene Libro
     * @return True si el usuario ya tiene un libro, False si no tiene libro
     */
    public boolean getTieneLibro(){
        return tieneLibro;
    }

    /**
     * Metodo get Estado actual
     * @return el Estado actual del Usuario
     */
    public EstadoUsuario getEstadoActual(){
        return estadoActual;
    }

    /**
     * Obtiene el estado actual del EstadoActivo
     * @return estadoActivo 
     */
    public EstadoUsuario getEstadoActivo(){
        return estadoActivo;
    }

    /**
     * Obtiene el estado actual del EstadoMoroso
     * @¶eturn estadoMoroso
     */
    public EstadoUsuario getEstadoMoroso(){
        return estadoMoroso;
    }

    /**
     * Metodo set que cambia el estado del Usuario
     * @param estadoUsuario de tipo usuario al cual va a ser el nuevo estado del Usuario
     */
    public void setEstado(EstadoUsuario estadoUsuario){
        estadoActual = estadoUsuario;
    }

    /**
     * Metodo set que le cambia si el usuario tiene algo prestado
     * @param tienelibro con valor a si tiene un material o no
     */
    public void resetTieneLibro(){
        tieneLibro = false;
    }

    /**
     * Hace que el usuario pueda pedir un libro  por 15 dias 
     * @param material que el usuario quiere pedir prestado 
     */
    public void pedirLibro(Material material){
        estadoActual.pedirLibro(material);
    }

    /**
     * Metodo que hace que el usuario devuelva un material que ha pedido prestado
     * @param material el cual el usuario va a devolver 
     */
    public void devolverLibro (Material material){
        estadoActual.devolverLibro(material);;
    }

    /**
     * Metodo que renueva el prestamo cuando piden prestado normal cada 5 dias 
     */
    public void renovarPrestamo (){
        estadoActual.renovarPrestamo();
    }

    /**
     * Hace que los Usuarios pueda pedir algun material de forma express, por 7 dias 
     */
    public void prestamoExpress(Material material){
        estadoActual.prestamoExpress(material);
    }
    
    /**
     * Hace que el material que quiere el usuario lo pueda reserva, esto en caso de que alguien lo pidio antes 
     */
    public void reservarLibro(Material material){
        estadoActual.reservarLibro(material);
    }

}