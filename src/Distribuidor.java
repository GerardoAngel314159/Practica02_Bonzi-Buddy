
/**
 * La clase Distribuidor se encarga de generar colecciones de libros
 * organizados por categorias tematicas
 */
public class Distribuidor {

    /**
     * Constructor vacio de la Distribuidor
     */
    public Distribuidor(){
    }

    /**
     * Genera una biblioteca de libros de comedia
     * 
     * @return un objeto BliblioLibros con libros de comedia
     */
    public BiblioLibros getLibrosComedia(){
        BiblioLibros libros = new BiblioLibros();
        libros.addLibro(new Libro("La divina Comedia"));
        libros.addLibro(new Libro("Chistes canijos"));
        libros.addLibro(new Libro("Chistes de Franco Escamilla"));
        return libros;
    }

    /**
     * Genera una biblioteca de libros de ciencia
     * 
     * @return un objeto BliblioLibros con libros de ciencia
     */
    public BiblioLibros getLibrosCiencia(){
        BiblioLibros libros = new BiblioLibros();
        libros.addLibro(new Libro("Calculo II"));
        libros.addLibro(new Libro("Física para fisicos"));
        libros.addLibro(new Libro("¿Los actuarios deberían estar en la fac?(tesis)"));
        return libros;
    }

    /**
     * Genera una biblioteca de novelas
     * 
     * @return un objeto BliblioLibros con novelas
     */
    public BiblioLibros getLibrosNovelas(){
        BiblioLibros libros = new BiblioLibros(); 
        libros.addLibro(new Libro("Harry Potter"));
        libros.addLibro(new Libro("Divergente"));
        libros.addLibro(new Libro("Los juegos del hambre"));
        return libros;
    }

    /**
     * Genera una biblioteca de audiolibros de tipo podcast.
     *
     * @return un objeto BiblioAudiolibros con audiolibros de podcast.
     */
    public BiblioAudiolibros getAudioPodcast(){
        BiblioAudiolibros audiolibros = new BiblioAudiolibros();        
        audiolibros.addAudiolibro("Ricos hablan de pobreza", new Audiolibro("Ricos hablan de pobreza"));
        audiolibros.addAudiolibro("La pizza con piña", new Audiolibro("La pizza con piña"));
        audiolibros.addAudiolibro("Las alucinas", new Audiolibro("Las alucinas"));
        return audiolibros;
    }
    
    /**
     * Genera una biblioteca de audiolibros de historias.
     *
     * @return un objeto BiblioAudiolibros con audiolibros de historias.
     */
    public BiblioAudiolibros getAudioHistorias(){
        BiblioAudiolibros audiolibros = new BiblioAudiolibros();        
        audiolibros.limpiaBiblioteca();
        audiolibros.addAudiolibro("La liebre y la tortuga", new Audiolibro("La liebre y la tortuga"));
        audiolibros.addAudiolibro("De majikarp a gyarados", new Audiolibro("De majikarp a gyarados"));
        audiolibros.addAudiolibro("El hombre que engaño al diablo", new Audiolibro("El hombre que engaño al diablo"));

        return audiolibros;
    }

    /**
     * Genera una biblioteca de canciones.
     *
     * @return un objeto BiblioAudiolibros con canciones.
     */
    public BiblioAudiolibros getAudioCanciones(){
        BiblioAudiolibros audiolibros = new BiblioAudiolibros();        
        audiolibros.limpiaBiblioteca();
        audiolibros.addAudiolibro("Corazon de melon", new Audiolibro("Corazon de melon"));
        audiolibros.addAudiolibro("Vaquero", new Audiolibro("Vaquero"));
        audiolibros.addAudiolibro("Chicharron", new Audiolibro("Chicharron"));

        return audiolibros;
    }
    
    /**
     * Genera una biblioteca de revistas de cotilleo.
     *
     * @return un objeto BiblioRevistas con revistas de cotilleo.
     */
    public BiblioRevistas getRevistasCotilleo(){
        BiblioRevistas revistas = new BiblioRevistas(20);        
        revistas.addRevista(new Revista("Joshua tiene dientes ficticios"));
        revistas.addRevista(new Revista("Diez celebridades que son pelonas"));
        revistas.addRevista(new Revista("El fin de Emma y Andrew"));

        return revistas;
    }

    /**
    * Genera una biblioteca de revistas de romance.
    *
    * @return un objeto BiblioRevistas con revistas de romance.
    */
    public BiblioRevistas getRevistasRomance(){
        BiblioRevistas revistas = new BiblioRevistas(20);                
        revistas.addRevista(new Revista("Como cocinar para tu pareja"));
        revistas.addRevista(new Revista("Cinco ideas para tu aniversario"));
        revistas.addRevista(new Revista("Como enamorar a tu crush"));

        return revistas;
    }

    /**
     * Genera una biblioteca de revistas de temática "Pokémon".
     *
     * @return un objeto BiblioRevistas con revistas de "Pokémon".
     */
    public BiblioRevistas getRevistasPokemon(){
        BiblioRevistas revistas = new BiblioRevistas(20);        
        revistas.addRevista(new Revista("Los pseudolegendarios de cada region"));
        revistas.addRevista(new Revista("El sufrimiento de machamp"));
        revistas.addRevista(new Revista("¿Por qué todos elijen a charmander?"));
        return revistas;
    }
}
