import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Simulamos un sistema de biblioteca digital donde los usuarios pueden pedir matrial prestado.
 * Permite realizar préstamos normales, express, renovaciones y devoluciones.
 * El sistema avanza por días y lleva un registro del tiempo de préstamo.
 */
public class Practica02BonziBuddy{

     /**
     * Método main que ejecuta la simulación de la biblioteca digital.
     * 
     * @param args
     */
    public static void main(String[] args) {

        //Variables del sistema
        int dia = 0;
        int opcion1;
        int opcion2;
        String eleccion1;
        String eleccion2; 
        Usuario visitante = new Usuario(":p");
        Scanner sc = new Scanner(System.in);
        
        //Usuarios
        Usuario luis = new Usuario("Luis");
        Usuario gera = new Usuario("Gera");
        Usuario gabo = new Usuario("Gabo");

        //Distribuidor que nos manda el material
        Distribuidor distribuidor = new Distribuidor();
        BiblioLibros librosCiencia = distribuidor.getLibrosCiencia();
        BiblioLibros librosNovelas = distribuidor.getLibrosNovelas();
        BiblioLibros librosComedia = distribuidor.getLibrosComedia();
        BiblioRevistas revistasRomance = distribuidor.getRevistasRomance();
        BiblioRevistas revistasPokemon = distribuidor.getRevistasPokemon();
        BiblioRevistas revistasChisme = distribuidor.getRevistasCotilleo();
        BiblioAudiolibros audioHitorias = distribuidor.getAudioHistorias();
        BiblioAudiolibros audioCanciones = distribuidor.getAudioCanciones();
        BiblioAudiolibros audioPodcast = distribuidor.getAudioPodcast();

        //Lista del material prestado
        List<Material> prestados = new ArrayList<>();

        System.out.println("Bienvenido a la biblioteca digital\nDisfruta de libre renta pero devuelve tu material en tiempo");

        //Simulacion del sistema de la biblioteca
        do { 
            System.out.println("Dia " + dia);
            System.out.println("\n¿Quien nos visita hoy? \n1) Luis \n2) Gabo \n3) Gera \n4) Salir Del Sistema");
            eleccion1 = sc.nextLine();
            opcion1 = Integer.parseInt(eleccion1);
            
            //Seleccion del usuario
            switch (opcion1){
                case 1:
                    visitante = luis;
                    break;
                case 2:
                    visitante = gabo;
                    break;
                case 3:
                    visitante = gera;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Elije una opcion válida");
            } 

            //opciones de acciones de los usuarios
            if (opcion1 == 4) break;
            System.out.println("\nHola " + visitante.getNombre() + "!! Que quieres hacer hoy?");
            System.out.println("\n1) Rentar Libro \n2) Devolver libro \n3) Salir por hoy");
            eleccion2 = sc.nextLine();
            opcion2 = Integer.parseInt(eleccion2);

            //Accion segun el tipo de material seleccionado
            switch (opcion2) {
                case 1:
                    System.out.println("\nSelecciona la categoría de tu preferencia");
                    System.out.println("Libros:\n\t1) Ciencias \n\t2) Novelas \n\t3) Comedia");
                    System.out.println("Revistas:\n\t1) Romance \n\t2) Cotilleo \n\t3) Pokemon");
                    System.out.println("Audiolibros:\n\t1) Historias \n\t2) Canciones \n\t3) Podcast");
                    eleccion2 = sc.nextLine();
                    opcion2 = Integer.parseInt(eleccion2);

                    switch (opcion2) {
                        case 1:
                            recorrerLibros(librosCiencia, visitante);
                            break;
                        case 2:
                            recorrerLibros(librosNovelas, visitante);
                            break;
                        case 3:
                            recorrerLibros(librosComedia, visitante);
                            break;
                        case 4:
                            recorrerRevistas(revistasRomance, visitante);
                            break;
                        case 5:
                            recorrerRevistas(revistasChisme, visitante);
                            break;
                        case 6:
                            recorrerRevistas(revistasPokemon, visitante);
                            break;
                        case 7:
                            recorrerAudiolibros(audioHitorias, visitante);
                            break;
                        case 8:
                            recorrerAudiolibros(audioCanciones, visitante);
                            break;
                        case 9:
                            recorrerAudiolibros(audioPodcast, visitante);
                            break;
                        default:
                            System.out.println("por favor elije una opcion valida");
                    }
                    
                    break;
                case 2:
                    //Devolver material
                    visitante.liberarMaterial();
                    break;                
                default:
                    throw new AssertionError();
            }

            //Fin del dia (Aumenta el tiempo de prestamo)
            finDelDia(prestados);
            dia++;
            
            if (opcion1 == 4) break;
        } while (true);
    }

    /**
     * Imprime el mensaje correspondiente
     * 
     * @param mensaje
     */
    public static void imp(String mensaje){
        System.out.println(mensaje);
    }

    /**
     * Simula el avance del tiempo
     * 
     * @param lista Lista de materiales prestados durante el dia
     */
    public static void finDelDia(List<Material> lista){
        for (Material mat : lista) {
            mat.aumentaTiemproPrestado();
        }
    }   

    /**
     * Permite recorrer la lista de libros de alguna categoria y poder pedir un prestamo
     * 
     * @param libros
     * @param visitante
     */
    public static void recorrerLibros(BiblioLibros libros, Usuario visitante){
        Scanner sc = new Scanner(System.in);
        int opcion;
        String eleccion;
        for (Material material : libros) {
            imp(material.toString() + " ¿Deseas rentarlo? 1)sí 2)no");
            eleccion = sc.nextLine();
            opcion = Integer.parseInt(eleccion);
            if (opcion == 1){
<<<<<<< HEAD

                if (material.getEstaLibre()){
                    imp("elija su formato de libro \n1)PDF \n2)MOBI \n3) EPUB");
                    eleccion = sc.nextLine();
                    opcion = Integer.parseInt(eleccion);
    
                    switch (opcion) {
                        case 1:
                            material.setFormato(".PDF");
                            break;
                        case 2:
                            material.setFormato(".MOBI");
                            break;
                        case 3:
                            material.setFormato(".EPUB");
                            break;
                        default:                        
                            break;
                    }
                    
                    prestados.add(material);
                    if (tipoDeRenta == 1)visitante.pedirLibro(material);
                    else visitante.prestamoExpress(material);
                }

=======
                visitante.pedirLibro(material);
>>>>>>> 9f3ede96a7d87be5648e7bbbe889267ae11c940e
                break;
            }
        }
    }

    /**
     * Permite recorrer la lista de Revistas de alguna categoria y poder pedir prestada alguna
     * 
     * @param revistas revistas disponibles para prestamo
     * @param visitante El usuario que interactua con la biblioteca
     */
    public static void recorrerRevistas(BiblioRevistas revistas, Usuario visitante){
        Scanner sc = new Scanner(System.in);
        int opcion;
        String eleccion;
        for (Material material : revistas) {
            imp(material.toString() + " ¿Deseas rentarlo? 1)sí 2)no");
            eleccion = sc.nextLine();
            opcion = Integer.parseInt(eleccion);
            if (opcion == 1){
                visitante.pedirLibro(material);
                break;
            }
        }
    }

    /**
     * permite recorrerlos audioLibros de una categoria y poder pedir prestado uno
     * 
     * @param audiolibros audioLibros disponibles
     * @param visitante El usuario que interactua con la biblioteca
     */
    public static void recorrerAudiolibros(BiblioAudiolibros audiolibros, Usuario visitante){
        Scanner sc = new Scanner(System.in);
        int opcion;
        String eleccion;
        for (Material material : audiolibros) {
            imp(material.toString() + " ¿Deseas rentarlo? 1)sí 2)no");
            eleccion = sc.nextLine();
            opcion = Integer.parseInt(eleccion);
            if (opcion == 1){
                visitante.pedirLibro(material);
                break;
            }
        }
    }
}