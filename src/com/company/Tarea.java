package com.company;

import java.time.LocalDateTime;

public class Tarea{
    private String todo;
    private boolean completado=false;
    private LocalDateTime plazo;

    public Tarea(String todo, LocalDateTime plazo) {
        this.todo = todo;
        this.plazo = plazo;
    }

    public void completar(){
        completado=true;
    }

    @Override
    public String toString() {
        return  todo + '(' +
                (completado? "Completado" : "Incompleto") + ')' +
                " Fecha de completar: " + plazo + "\n";
    }

    public LocalDateTime getPlazo() {
        return plazo;
    }

}
