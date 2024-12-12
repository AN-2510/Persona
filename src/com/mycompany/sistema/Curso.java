/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema;
import java.util.List;

/**
 *
 * @author Dell i5
 */
import java.util.ArrayList;

public class Curso {
    private final String nombre;
    private final List<Asignatura> asignaturas;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        this.asignaturas.add(asignatura);
    }

    public void listarAsignaturas() {
        if (asignaturas.isEmpty()) {
            System.out.println("No hay asignaturas en este curso.");
        } else {
            System.out.println("Asignaturas en " + nombre + ":");
            for (Asignatura a : asignaturas) {
                System.out.println(a.getNombre());
            }
        }
    }
}
