
import java.util.Scanner;

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
    protected boolean estaLibre;

    
    /**
     * Representa el tiempo por el cual el material va a ser prestado
     */
    protected int tiempoPrestado;

    /**
     * Representa al usuario al que se le fue prestado el material
     */
    protected Usuario rentado;

    /**
     * Representa al usuario que se le va a reservar el material
     */
    protected Usuario reservado;

    protected String formato;
    /**
     * Representa a el numero de dias que es prestado el Material
     */
    protected int limite;

    /**
     * Metodo constructor de la clase 
     * @param nombre del material
     */
    public Material(String nombre){
        this.nombre = nombre;
        estaLibre = true;
        tiempoPrestado = 0;
        rentado = null;
        reservado = null;
        formato= "";
        limite = 5;
    } 

    /**
     * Obtiene el nombre del material
     * @return String con valor al nombre del materiañ
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Metodo que da el valor de EstaLibre
     * @return boolean true, si el material no lo tiene alguien prestado,
     *  false si alguien lo tiene prestado
     * 
     */
    public boolean getEstaLibre(){
        return estaLibre;
    }

    /**
     * Metodo que cambia el valor de estaLibre
     * @param estaLibre con valor true o false
     */
    public void setEstaLibre(boolean estaLibre){
        this.estaLibre = estaLibre;
    }

    /**
     * Da el tiempo que esta siendo prestado el material
     * @return int con valor al tiempo que fue prestado el material
     */
    public int getTiempoPrestado(){
        return tiempoPrestado;
    }

    /**
     * cambia el tiempor prestado por el valor recibido
     * @param i el nuevo tiempo de tipo int
     */
    public void setTiempoPrestado(int i){
        tiempoPrestado = i; 
    }

    /**
     * Le incrementa 1 al TiempoPrestado
     */
    public void aumentaTiemproPrestado(){
        if (tiempoPrestado >limite){
            System.out.println("\n" + rentado.getNombre() + " ha excedido su renta, Ahora se encuentra en estado moroso");
            rentado.setEstado(rentado.getEstadoMoroso());        
        }
        tiempoPrestado++;
    }

    /**
     * Obtiene el usuario al que le fue rentado el material
     * @return uuario de Tipo usuario 
     */
    public Usuario getRentado(){
        return rentado;
    }

    /**
     * cambia rentado al usuario que pidio prestado el material por el usuario recibido y cambia que el atributo de estaLibre a falso (porque fue prestado)
     *  @param usuario de tipo Usuario al cual se le fue prestado el material
     */
    public void setUsuario(Usuario usuario){
        rentado = usuario;
        estaLibre = false;
    }

    /**
     * cambia el usuario al que se le presto el material a vacio y
     * cambia estaLibre a true 
     */
    public void liberaMaterial(){
        if (rentado != null){
            rentado.setEstado(rentado.getEstadoActivo());
            System.out.println("Gracias por devolver el material " + rentado.getNombre() + " vuelve pronto :)");
        }    
        rentado = null;
        estaLibre = true;
        tiempoPrestado = 0;
        if (reservado != null ){           
        this.notificar();
        }

    }

    /**
    * Notifica al usuario que había reservado el libro de que este ha sido liberado.
    * 
    * <p>
    * Muestra un mensaje informando que el libro está disponible y pregunta al usuario 
    * si desea rentarlo. Si el usuario elige "sí", se invoca el método {@code pedirLibro}
    * del usuario reservado, pasándole el material actual. 
    * Finalmente, se cancela la reserva.
    * </p>
    */
       public void notificar(){
        Scanner sc = new Scanner(System.in);
        String eleccion;
        int opcion;
        System.out.println(this.getNombre() + " ha sido liberado");
        System.out.println(reservado.getNombre() + "\nHabias reservado, Deseas rentarlo? 1)si 2)no" );
        eleccion = sc.nextLine();
        opcion = Integer.parseInt(eleccion);
        if (opcion== 1) reservado.pedirLibro(this);
        reservado = null;
    }
    
    public void setFormato(String formato){
        this.formato = formato;
    }

    public String getFormato(){
        return formato;
    }

    /**
     * reserva el material al usuario que lo quiere reservar
     * @param reservante de tipo Usuario 
     */

    public void setReservado(Usuario reservante){
        reservado = reservante;
    }

    /**
     * Obtiene el usuario al cual se le reservo el Material
     * @return Usuario que reservo el material
     */
    public Usuario getReservado(){
        return reservado;
    }

    public void aumentaLimite(){
        limite+=5;
    }
    /**
     * Obtiene el limite de tiempo de dias que se reservo el material
     * @return int con valor al limite de dias del prestamo
     */
    public int getLimite(){
        return limite;
    }

    /**
     * Cambia el limite de dias del prestamo 
     * @param limite de tipo int con valor al nuevo limite de dias
     */
    public void setLimite(int limite){
        this.limite = limite;
        System.out.println("\nel limite para devolver este libro es " +limite);

    }

    /**
     * Metodo toString que las clases implementaran
     */
    public abstract String toString();
}

