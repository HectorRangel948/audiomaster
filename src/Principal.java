import com.alura.audiomaster.modelos.*;

public class Principal {
    public static void main(String[] args) {
        Cancion nuevaCancion = new Cancion();
        nuevaCancion.setTitulo("Oracle");
        nuevaCancion.setNombreArtista("Héctor");
        nuevaCancion.setDuracionEnMinutos(5);

        Cancion nuevaCancion2 = new Cancion();
        nuevaCancion2.setTitulo("Java");
        nuevaCancion2.setNombreArtista("Rangel");
        nuevaCancion2.setDuracionEnMinutos(6);

        Album nuevoAlbum = new Album();
        nuevoAlbum.setNombre("ONE");
        nuevoAlbum.agregarCancion(nuevaCancion);
        nuevoAlbum.agregarCancion(nuevaCancion2);
        nuevoAlbum.agregarCancion(nuevaCancion2);
        nuevaCancion.setAlbum(nuevoAlbum.getNombre());
        nuevaCancion2.setAlbum(nuevoAlbum.getNombre());

        Podcast podcast = new Podcast();
        podcast.setNombre("Oracle");
        podcast.setAnfitrion("Alura");

        Episodio episodio = new Episodio();
        episodio.setTitulo("Sobre Java");
        episodio.setNumeroEpisodio(1);
        episodio.setDescripcion("POO en Java");
        episodio.setPodcast(podcast.getNombre());
        episodio.setDuracionEnMinutos(50);
        podcast.agregarEpisodio(episodio);

        for(int i=0; i<3550;i++){
            nuevaCancion.reproducir();
            nuevaCancion.meGusta();
        }
        System.out.println(nuevaCancion.toString());
        nuevaCancion.clasificar();

        for(int i=0; i<1150;i++){
            nuevaCancion2.reproducir();
            nuevaCancion2.meGusta();
        }
        System.out.println(nuevaCancion2.toString());
        nuevaCancion2.clasificar();

        for(int i=0; i<550;i++){
            episodio.reproducir();
            episodio.meGusta();
        }
        System.out.println(episodio.toString());
        episodio.clasificar();

    }

}

/*
* Falta agregar lógica e implementación de podcast
* Agregar Inteface tal vez con calificación
* */