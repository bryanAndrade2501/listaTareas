package com.company;

import java.util.Comparator;

public class ComparadorTarea implements Comparator<Tarea> {
    @Override
    public int compare(Tarea t1, Tarea t2) {
        return t1.getPlazo().compareTo(t2.getPlazo());
    }
}
