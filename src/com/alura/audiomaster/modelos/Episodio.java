package com.alura.audiomaster.modelos;

import com.alura.audiomaster.clasificacion.Clasificar;

public class Episodio extends Audio implements Clasificar {

    private int numeroEpisodio;
    private String descripcion;
    private String podcast;

    public int getNumeroEpisodio() {
        return this.numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPodcast(String podcast){
        this.podcast=podcast;
    }

    public String getPodcast(){
        return this.podcast;
    }

    @Override
    public void clasificar() {
        if(getTotalDeReproducciones()>=400 && getTotalDeMeGusta()>20){
            System.out.println("Popular");

        }else if(getTotalDeReproducciones()<400 && getTotalDeReproducciones()>200 && getTotalDeMeGusta()>10){
            System.out.println("En acenso");
        }else{
            System.out.println("Recomendado");
        }
    }

    @Override
    public String toString(){
        String descripcion=
                "Podcast: "+getPodcast() + "\n" +
                "Episodio: "+getTitulo() + "\n" +
                "Descripción: "+getDescripcion() + "\n" +
                "Duración: "+getDuracionEnMinutos() + "\n" +
                "Me gusta: "+getTotalDeMeGusta() + "\n" +
                "Reproducciones: "+getTotalDeReproducciones() + "\n"
                ;
        return descripcion;
    }
}
