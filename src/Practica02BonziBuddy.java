import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practica02BonziBuddy{
    public static void main(String[] args) {
        int dia = 0;
        int opcion1;
        int opcion2;
        String eleccion1;
        String eleccion2; 
        Usuario visitante = new Usuario(":p");
        Scanner sc = new Scanner(System.in);
        
        Usuario luis = new Usuario("Luis");
        Usuario gera = new Usuario("Gera");
        Usuario gabo = new Usuario("Gabo");

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

        List<Material> prestados = new ArrayList<>();

        System.out.println("Bienvenido a la biblioteca digital\nDisfruta de libre renta pero devuelve tu material en tiempo");
        do { 
            System.out.println("Dia " + dia);
            System.out.println("\n¿Quien nos visita hoy? \n1) Luis \n2) Gabo \n3) Gera \n4) Salir Del Sistema");
            eleccion1 = sc.nextLine();
            opcion1 = Integer.parseInt(eleccion1);
            
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

            if (opcion1 == 4) break;
            System.out.println("\nHola " + visitante.getNombre() + "!! Que quieres hacer hoy?");
            System.out.println("\n1) Rentar Libro \n2) Devolver libro \n3) Salir por hoy");
            eleccion2 = sc.nextLine();
            opcion2 = Integer.parseInt(eleccion2);


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
                    visitante.liberarMaterial();
                    break;                
                default:
                    throw new AssertionError();
            }

            finDelDia(prestados);
            dia++;
            
            if (opcion1 == 4) break;
        } while (true);
    }

    public static void imp(String mensaje){
        System.out.println(mensaje);
    }

    public static void finDelDia(List<Material> lista){
        for (Material mat : lista) {
            mat.aumentaTiemproPrestado();
        }
    }

    public static void recorrerLibros(BiblioLibros libros, Usuario visitante){
        Scanner sc = new Scanner(System.in);
        int opcion;
        String eleccion;
        for (Material material : libros) {
            imp(material.toString() + " ¿Deseas rentarlo? 1)sí 2)no");
            eleccion = sc.nextLine();
            opcion = Integer.parseInt(eleccion);
            if (opcion == 1){
                visitante.pedirLibro(material);
                break;
            }
        }
    }

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