import java.util.Scanner;

public class Practica02BonziBuddy{
    public static void main(String[] args) {
        Categoria categoria;
        int opcion1;
        int opcion2;
        String eleccion1;
        String eleccion2; 
        Usuario visitante = new Usuario(":p");

        int fueRentado;

        Usuario luis = new Usuario("Luis");
        Usuario gera = new Usuario("Gera");
        Usuario gabo = new Usuario("Gabo");

        Distribuidor distribuidor = new Distribuidor();
        BiblioLibros librosCiencia = distribuidor.getLibrosCiencia();
        BiblioLibros librosNovelas = distribuidor.getLibrosNovelas();
        BiblioLibros librosComedia = distribuidor.getLibrosNovelas();
        BiblioRevistas revistasRomance = distribuidor.getRevistasRomance();
        BiblioRevistas revistasPokemon = distribuidor.getRevistasPokemon();
        BiblioRevistas revistasChisme = distribuidor.getRevistasCotilleo();
        BiblioAudiolibros audioHitorias = distribuidor.getAudioHistorias();
        BiblioAudiolibros audioCanciones = distribuidor.getAudioCanciones();
        BiblioAudiolibros audioPodcast = distribuidor.getAudioPodcast();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la biblioteca digital\nDisfruta de libre renta pero devuelve tu material en tiempo");
        do { 
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
                    System.out.println("Libros:\n\t1) Historias \n\t2) Canciones \n\t3) Podcast");
                    eleccion2 = sc.nextLine();
                    opcion2 = Integer.parseInt(eleccion2);

                    switch (opcion2) {
                        case 1:
                            for (Material material : librosCiencia) {
                                imp(material.toString() + " ¿Deseas rentarlo? 1)sí 2)no");
                                eleccion2 = sc.nextLine();
                                opcion2 = Integer.parseInt(eleccion2);
                                if (opcion2 == 1){
                                    visitante.pedirLibro(material);
                                    break;
                                }

                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                        default:
                            throw new AssertionError();
                    }
                    
                    break;
                case 2:
                    visitante.liberarMaterial();
                    break;                
                default:
                    throw new AssertionError();
            }
            if (opcion1 == 4) break;
        } while (true);
        
        // System.out.println("Buen día María, ¿que prefieres checar hoy?");       
        
        // do{
        // System.out.println("1. Revistas \n2. Libros\n3. Salir");
        // String opcionUsuario = sc.nextLine();
        // String rent;
        // opcion = Integer.parseInt(opcionUsuario);

        // switch (opcion){
        //     case 1:
        //         for (Revista revista : revistas) {
        //             System.out.println(revista.toString());
        //             System.out.println("Deseas rentarlo? 1)Sí 2)No");
        //             opcionUsuario = sc.nextLine();
        //             rent = sc.nextLine();
        //             fueRentado = Integer.parseInt(rent);

        //             if (fueRentado == 1){
        //                 luis.pedirLibro(revista);
        //             }
        //         }   
        //         break;
        //     case 2:
        //         for (Libro libro : libros) {
        //             System.out.println(libro.toString());
        //             System.out.println("Deseas rentarlo? 1)Sí 2)No");
        //             opcionUsuario = sc.nextLine();
        //             rent = sc.nextLine();
        //             fueRentado = Integer.parseInt(rent);

        //             if (fueRentado == 1){
        //                 luis.pedirLibro(libro);
        //             }
        //         }
        //         break;
        //     default:   
        //         break;             
        // }
        // }while (opcion!= 3); 

        // // Timer timer = new Timer();
        // // TimerTask timerTask = new TimerTask() {
            
        // //     int days = 0;
        // //     @Override
        // //     public void run(){
        // //         if (days < 5){
        // //             System.out.println("Haz rentado el libro por " + days + " días");
        // //             days++;
        // //         }
        // //         else {
        // //             System.out.println("Ya haz rentado el libro por " + days + " dias\nPor favor devuelvelo");
        // //             timer.cancel();
        // //         }
        // //     }
        // // };
        // // timer.scheduleAtFixedRate(timerTask, 0, 1);
    }

    public static void imp(String mensaje){
        System.out.println(mensaje);
    }
}