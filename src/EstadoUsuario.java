public interface EstadoUsuario{
    public void pedirLibro(Material material);
    public void devolverLibro (Material material);
    public void renovarPrestamo ();
    public void prestamoExpress(Material material);
    public void reservarLibro(Material material);
}