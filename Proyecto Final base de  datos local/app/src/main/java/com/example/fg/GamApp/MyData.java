package com.example.fg.GamApp;

/**
 * Created by Titi on 13/07/2017.
 */

class MyData {

    private int id;
    private String nombre , juego;

    public MyData(int id, String nombre, String juego) {
        this.id = id;
        this.nombre = nombre;
        this.juego = juego;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }
}
