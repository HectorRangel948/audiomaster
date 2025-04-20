package com.alura.audiomaster.modelos;

public class Audio {
    private String titulo;
    private int duracionEnMinutos;
    private int totalDeReproducciones;
    private int totalDeMeGusta;

    public void meGusta(){
        this.totalDeMeGusta++;
    }

    public void reproducir(){
        this.totalDeReproducciones++;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos){
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getDuracionEnMinutos(){
        return this.duracionEnMinutos;
    }

    public int getTotalDeReproducciones() {
        return this.totalDeReproducciones;
    }

    public int getTotalDeMeGusta() {
        return this.totalDeMeGusta;
    }
}
