import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practica02BonziBuddy{
    public static void main(String[] args) {        

        int dia = 1;
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
            System.out.println("\nDia " + dia);

                System.out.println("Material prestado: ");
            for (Material mat : prestados) {
                System.out.println(mat.toString()+ " dias prestado: " + mat.getTiempoPrestado());
            }

            System.out.println("\n¿Quien nos visita hoy? \n1) Luis \n2) Gabo \n3) Gera \n4) Ir al dia siguiente \n5) Salir Del Sistema ");
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
                    finDelDia(prestados);
                    dia++;
                    continue;
                case 5:
                    break;
                default:
                    System.out.println("Elije una opcion válida");
                    continue;
            }
            if (opcion1 == 5) break;
            System.out.println("\nHola " + visitante.getNombre() + "!! Que quieres hacer hoy?");
            System.out.println("\n1) Prestamo normal \n2) Prestamo express \n3) Devolver libro \n4) Salir por hoy");
            eleccion2 = sc.nextLine();
            opcion2 = Integer.parseInt(eleccion2);

            switch (opcion2) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    prestados.remove(visitante.getMaterial());
                    visitante.liberarMaterial();
                    break;                
                default:
                    break;
            }

            if ((opcion2 !=1) && (opcion2 != 2)){
                finDelDia(prestados);
                dia++;
                continue;
            }
            
            if ((opcion2 !=1) && (opcion2 != 2)) break;

            System.out.println("\nSelecciona la categoría de tu preferencia");
            System.out.println("Libros:\n\t1) Ciencias \n\t2) Novelas \n\t3) Comedia");
            System.out.println("Revistas:\n\t4) Romance \n\t5) Cotilleo \n\t6) Pokemon");
            System.out.println("Audiolibros:\n\t7) Historias \n\t8) Canciones \n\t9) Podcast");
            eleccion2 = sc.nextLine();
            opcion2 = Integer.parseInt(eleccion2);
            
            int tipoDeRenta = opcion2;

            switch (opcion2) {
                case 1:
                    recorrerLibros(librosCiencia, visitante, prestados, tipoDeRenta);
                    break;
                case 2:
                    recorrerLibros(librosNovelas, visitante, prestados, tipoDeRenta);
                    break;
                case 3:
                    recorrerLibros(librosComedia, visitante, prestados, tipoDeRenta);
                    break;
                case 4:
                    recorrerRevistas(revistasRomance, visitante, prestados, tipoDeRenta);
                    break;
                case 5:
                    recorrerRevistas(revistasChisme, visitante, prestados, tipoDeRenta);
                    break;
                case 6:
                    recorrerRevistas(revistasPokemon, visitante, prestados, tipoDeRenta);
                    break;
                case 7:
                    recorrerAudiolibros(audioHitorias, visitante, prestados, tipoDeRenta);
                    break;
                case 8:
                    recorrerAudiolibros(audioCanciones, visitante, prestados, tipoDeRenta);
                    break;
                case 9:
                    recorrerAudiolibros(audioPodcast, visitante, prestados, tipoDeRenta);
                    break;
                default:
                    System.out.println("por favor elije una opcion valida");
            }

            finDelDia(prestados);
            dia++;

        } while (true);
    }



    public static void prestamo(int opcion){

    }

    public static void imp(String mensaje){
        System.out.println(mensaje);
    }

    public static void finDelDia(List<Material> lista){
        for (Material mat : lista) {
            mat.aumentaTiemproPrestado();
        }
    }

    public static void recorrerLibros(BiblioLibros libros, Usuario visitante, List<Material> prestados, int tipoDeRenta){
        Scanner sc = new Scanner(System.in);
        int opcion;
        String eleccion;
        for (Material material : libros) {
            imp(material.toString() + " ¿Deseas rentarlo? 1)sí 2)no");
            eleccion = sc.nextLine();
            opcion = Integer.parseInt(eleccion);
            if (opcion == 1){
                if (material.getEstaLibre()) prestados.add(material);
                if (tipoDeRenta == 1)visitante.pedirLibro(material);
                else visitante.prestamoExpress(material);
                break;
            }
        }
    }

    public static void recorrerRevistas(BiblioRevistas revistas, Usuario visitante, List<Material> prestados, int tipoDeRenta){
        Scanner sc = new Scanner(System.in);
        int opcion;
        String eleccion;
        for (Material material : revistas) {
            imp(material.toString() + " ¿Deseas rentarlo? 1)sí 2)no");
            eleccion = sc.nextLine();
            opcion = Integer.parseInt(eleccion);
            if (opcion == 1){
                if (material.getEstaLibre()) prestados.add(material);
                if (tipoDeRenta == 1)visitante.pedirLibro(material);
                else visitante.prestamoExpress(material);                
                break;
            }
        }
    }

    public static void recorrerAudiolibros(BiblioAudiolibros audiolibros, Usuario visitante, List<Material> prestados, int tipoDeRenta){
        Scanner sc = new Scanner(System.in);
        int opcion;
        String eleccion;
        for (Material material : audiolibros) {
            imp(material.toString() + " ¿Deseas rentarlo? 1)sí 2)no");
            eleccion = sc.nextLine();
            opcion = Integer.parseInt(eleccion);
            if (opcion == 1){
                if (material.getEstaLibre()) prestados.add(material);
                if (tipoDeRenta == 1)visitante.pedirLibro(material);
                else visitante.prestamoExpress(material);                
                break;
            }
        }
    }

}