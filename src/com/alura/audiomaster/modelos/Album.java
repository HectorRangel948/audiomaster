package com.alura.audiomaster.modelos;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nombre;
    private int cantidadCanciones;
    private List<Cancion> listaDeCanciones = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }

    public void agregarCancion(Cancion cancion){

        if(listaDeCanciones.contains(cancion)){
            System.out.println("Esta canción ya se encuentra en el album");
        }else{
            listaDeCanciones.add(cancion);
            System.out.println("Canción agregada al album");
            listaDeCanciones.forEach(can->{
                System.out.println(can.getTitulo());
            });
        }
    }
}
