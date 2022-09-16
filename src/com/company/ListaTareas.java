package com.company;

import com.company.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class ListaTareas {

    private ArrayList<Tarea> lista = new ArrayList<Tarea>();
    public void agregarTarea(Tarea tarea) throws Exception {
        lista.add(tarea);
    }

    public Tarea getTarea(int id) throws Exception {
        return lista.get(id);
    }

    public void ordenarPorFecha(){
        Collections.sort(lista, new Comparador Tarea());

    }

    public void eliminarTarea(int id) throws Exception {
        lista.remove(id);
    }


    public void completarTarea(int id) throws Exception {
        lista.get(id).completar();
    }

    @Override
    public String toString() {
        return lista.toString();

    }
}
