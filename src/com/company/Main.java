package com.company;

import java.awt.*;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        //*******************LISTA DEBER*********************

        Tarea tarea1 = new Tarea("TODO: Implementar matriz en la tabla ", LocalDateTime.of(2021, 3, 2, 20, 0));
        Tarea tarea2 = new Tarea("TODO: Restricciones de los movimientos de las fichas ", LocalDateTime.of(2021, 4, 2, 22, 0));
        Tarea tarea3 = new Tarea("TODO: Como ver el tablero??? ", LocalDateTime.of(2021, 3, 10, 20, 0));
        Tarea tarea4 = new Tarea("TODO: implemetar metodos faltantes ", LocalDateTime.of(2021, 5, 2, 20, 0));
        Tarea tarea5 = new Tarea("TODO: implementar excepciones ", LocalDateTime.of(2020, 12, 30, 7, 0));

        ListaTareas miLista = new ListaTareas();

        try {
            miLista.agregarTarea(tarea1);
            miLista.agregarTarea(tarea2);
            miLista.agregarTarea(tarea3);
            miLista.agregarTarea(tarea4);
            miLista.agregarTarea(tarea5);
            miLista.completarTarea(90);
            System.out.println(miLista);

            //miLista.verificarLista();
            System.out.println(miLista.getTarea(4));
            //miLista.completarTarea(40);
            miLista.completarTarea(3);
            miLista.ordenarPorFecha();

        } catch (NullPointerException e) {
            System.out.println("Se ingreso un id de una tarea inexistente: " + e.getMessage());
        } catch (StackOverflowError e) {
            System.out.println("Error metodo con bucle infinito: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Sucedio un error inesperado: " + e.getMessage());
        }
        //miLista.eliminarTarea("2");
        System.out.println(miLista);

    }
}




