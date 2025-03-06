/**
 * Clase abstracta que representa a los materiales que maneja la biblioteca
 * De esta clase heredan los libro, audiolibros y revistas 
 */
abstract class Material{

    /**
     * Atributos de la clase 
     */


    /**
     * representa a el nombre del material
     */
    protected String nombre;

    /**
     * Representa a si el material esta libre para ser prestado o no
     * Cuando es True no lo tiene alguien prestado
     * False cuando alguien lo tiene en su posesion porque lo pidio prestado
     */
    protected Boolean estaLibre;
    protected int tiempoPrestado;
    protected Usuario rentado;
    protected Usuario reservado;
    protected int limite;

    public Material(String nombre){
        this.nombre = nombre;
        estaLibre = true;
        tiempoPrestado = 0;
        rentado = null;
        reservado = null;
        limite = 5;
    } 

    public String getNombre(){
        return nombre;
    }

    public Boolean getEstaLibre(){
        return estaLibre;
    }

    public void setEstaLibre(Boolean estaLibre){
        this.estaLibre = estaLibre;
    }

    public int getTiempoPrestado(){
        return tiempoPrestado;
    }

    public void setTiempoPrestado(int i){
        tiempoPrestado = i; 
    }

    public void aumentaTiemproPrestado(){
        tiempoPrestado++;
    }

    public Usuario getRentado(){
        return rentado;
    }

    public void setUsuario(Usuario usuario){
        rentado = usuario;
        estaLibre = false;
    }

    public void liberaMaterial(){
        rentado = null;
        estaLibre = true;
    }

    public void setReservado(Usuario reservante){
        reservado = reservante;
    }

    public Usuario getReservado(){
        return reservado;
    }

    public int getLimite(){
        return limite;
    }


    public void setLimite(int limite){
        this.limite = limite;
    }

    public void aumentaLimite(){
        limite+= 5;
    }

    public abstract String toString();
}

