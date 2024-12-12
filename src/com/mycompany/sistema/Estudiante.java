
package com.mycompany.sistema;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell i5
 */

public class Estudiante extends Persona {
    private final List<String> asignaturasInscritas; 
    private final List<Double> calificaciones; 
    private String curso; 

    public Estudiante(int id, String nombre, String apellido, int edad, String correo, String curso) {
        super(id, nombre, apellido, edad, correo);
        this.asignaturasInscritas = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
        this.curso = curso;
    }

    // MÃ©todos para curso
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostrarCurso() {
        System.out.println("El estudiante " + getNombre() + " " + getApellido() + " pertenece al curso: " + curso);
    }

    // MÃ©todos para asignaturas y calificaciones
    public List<String> getAsignaturasInscritas() {
        return asignaturasInscritas;
    }

    // Inscribir asignatura con calificaciÃ³n
    public void inscribirAsignatura(String asignatura, double calificacion) {
        asignaturasInscritas.add(asignatura);
        calificaciones.add(calificacion);
    }

    // Eliminar una asignatura
    public void eliminarAsignatura(String asignatura) {
        int index = asignaturasInscritas.indexOf(asignatura);
        if (index != -1) {
            asignaturasInscritas.remove(index);
            calificaciones.remove(index);
            System.out.println("Asignatura " + asignatura + " eliminada correctamente.");
        } else {
            System.out.println("La asignatura " + asignatura + " no estÃ¡ inscrita.");
        }
    }

    // Listar asignaturas con calificaciones
    public void listarAsignaturas() {
        System.out.println("Asignaturas inscritas por " + getNombre() + " " + getApellido() + ":");
        if (asignaturasInscritas.isEmpty()) {
            System.out.println("No hay asignaturas inscritas.");
        } else {
            for (int i = 0; i < asignaturasInscritas.size(); i++) {
                System.out.println("- " + asignaturasInscritas.get(i) + " (CalificaciÃ³n: " + calificaciones.get(i) + ")");
            }
        }
    }

    void mostrarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
