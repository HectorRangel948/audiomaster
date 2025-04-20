package com.alura.audiomaster.modelos;

import com.alura.audiomaster.clasificacion.Clasificar;

public class Cancion extends Audio implements Clasificar {
    private String nombreArtista;
    private String album;

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString(){
        String descripcion=
                "Nombre: "+getTitulo() + "\n" +
                "Album: "+getAlbum() + "\n" +
                "Artista: "+getNombreArtista() + "\n" +
                "Duración: "+getDuracionEnMinutos() + "\n" +
                "Me gusta: "+getTotalDeMeGusta() + "\n" +
                "Reproducciones: "+getTotalDeReproducciones() + "\n"
                ;

        return descripcion;
    }

    @Override
    public void clasificar() {
        if(getTotalDeReproducciones()>=100 && getTotalDeMeGusta()>50){
            System.out.println("Superfavoritos");
        }else if(getTotalDeReproducciones()<100 && getTotalDeReproducciones()>50 && getTotalDeMeGusta()>20){
            System.out.println("Hot");
        }else{
            System.out.println("Te lo recomendamos");
        }
    }
}
