import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Practica02BonziBuddy{
    public static void main(String[] args) {
        Categoria categoria;
        int opcion;

        int[] array = {1,2,3};
        for (int numero : array){
            System.out.println(numero);
        }

        System.out.println("Bienvenido a la biblioteca digital\nDisfruta de libre renta pero devuelve tu material en tiempo");
        Usuario maria = new Usuario("maria");
        BiblioLibros libros = new BiblioLibros();
        BiblioRevistas revistas = new BiblioRevistas(10);
        BiblioAudiolibros audiolibros = new BiblioAudiolibros();
        Scanner sc = new Scanner(System.in);

        libros.addLibro(new Libro("Don Quijote"));
        libros.addLibro(new Libro ("El gato con botas"));
        libros.addLibro(new Libro("Cenicienta"));

        revistas.addRevista(new Revista("Cotilleo"));
        revistas.addRevista(new Revista("Doce Corazones"));
        revistas.addRevista(new Revista("Amor picante"));

        System.out.println("Buen día María, ¿que prefieres checar hoy?");
        System.out.println("1. Libros\n2. Revistas");
        String opcionUsuario = sc.nextLine();
        opcion = Integer.parseInt(opcionUsuario);

        switch (opcion){
            case 1:

            do { 
                for (Revista revista : revistas) {
                    System.out.println(revista.getNombre());
                    System.out.println("Deseas rentarlo? 1)Sí 2)No");
                    opcionUsuario = sc.nextLine();
                }              
            } while (true);
            case 2:
                return;
            default:
        }




        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            
            int days = 0;
            @Override
            public void run(){
                if (days < 5){
                    System.out.println("Haz rentado el libro por " + days + " días");
                    days++;
                }
                else {
                    System.out.println("Ya haz rentado el libro por " + days + " dias\nPor favor devuelvelo");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }
}