package com.alura.audiomaster.modelos;

import java.util.ArrayList;
import java.util.List;

public class Podcast{
    private String nombre;
    private String anfitrion;
    private List<Episodio> episodios = new ArrayList<>();

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getAnfitrion() {
        return anfitrion;
    }
    public void setAnfitrion(String anfitrion) {
        this.anfitrion = anfitrion;
    }

    public void agregarEpisodio(Episodio episodio){
        this.episodios.add(episodio);
    }

    public void getEpisodios(){
        this.episodios.forEach((episodio)->{
            System.out.println(episodio.getTitulo());
        });
    }

    @Override
    public String toString(){
        String descripcion=
                "Podcast: "+getNombre() + "\n"+
                "Anfitrion: "+getAnfitrion() + "\n"
                ;
        return descripcion;
    }

}
