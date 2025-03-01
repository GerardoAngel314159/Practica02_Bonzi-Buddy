public class Usuario{

    /**
     * Atributos de la clase Alumno
     */

    

    private String nombre;
    private EstadoUsuario estadoActual;
    private EstadoUsuario estadoActivo;
    private EstadoUSuario estadoMoroso;
    private Boolean tieneLibro;

    public getNombre(){
        return nombre;
    }

    public getTieneLibro(){
        return tieneLibro;
    }

    public getEstadoActual(){
        return estadoActual;
    }

    public getEstadoActivo(){
        return estadoActivo;
    }

    public getEstadoMoroso(){
        return estadoMoroso;
    }

    public setEstado(EstadoUSuario estadoUsuario){
        this.estadoUsuario = estadoUsuario;
    }

    public setTieneLibro(Boolean tieneLibro){
        this.tieneLibro = tieneLibro;
    }

}