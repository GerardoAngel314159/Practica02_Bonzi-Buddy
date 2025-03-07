public interface EstadoUsuario{

    /**
     * Metodo que hace que el usuario pueda pedir un libro
     * @param material de tipo Material que el usuario va a pedir
     */
    public void pedirLibro(Material material);

    /**
     * Hace que el usuario pueda devolver el material que ha pedido prestado
     * @param material de tipo material que el usuario quiere devolver
     */
    public void devolverLibro (Material material);

    /**
     * Hace que el usuario pueda renovar el prestado de su material cada 5 dias 
     */
    public void renovarPrestamo ();

    /**
     * Metodo que hace que el usuario que el usuario pueda pedir un libro solo por 7 dias 
     * @param material de tipo Material que el usuario va a pedir prestado
     */
    public void prestamoExpress(Material material);

    /**
     * Metodo que hace que el usuario pueda reservar un material en caso de que ya lo tiene alguien mas 
     * @param material de tipo material que se va a reservar para el usuario
     */
    public void reservarLibro(Material material);
}