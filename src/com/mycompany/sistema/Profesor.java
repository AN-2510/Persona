
package com.mycompany.sistema;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Dell i5
 */

public class Profesor extends Persona {
    // asignaturas impartidas por el profesor
    private List<String> asignaturasImpartidas; 

    public Profesor(int id, String nombre, String apellido, int edad, String correo) {
        super(id, nombre, apellido, edad, correo);
        this.asignaturasImpartidas = new ArrayList<>();
    }


    // metodo para dar y obtener 
    public List<String> getAsignaturasImpartidas() {
        return asignaturasImpartidas;
    }

    public void setAsignaturasImpartidas(List<String> asignaturasImpartidas) {
        this.asignaturasImpartidas = asignaturasImpartidas;
    }
    
    // metodo para agregar una asignatura
    public void agregarAsignatura(String asignatura) {
        asignaturasImpartidas.add(asignatura);
    }
    
    // metodo para eliminar una asignatura
    public void eliminarAsignatura(String asignatura) {
        if (asignaturasImpartidas.contains(asignatura)) {
            asignaturasImpartidas.remove(asignatura);
            System.out.println("Asignatura " + asignatura + " eliminada correctamente.");
        } else {
            System.out.println("La asignatura " + asignatura + " no estÃ¡ en la lista.");
        }
    }

    // metodo para listar las asignaturas
    public void listarAsignaturas() {
        System.out.println("Asignaturas impartidas por " + getNombre() + " " + getApellido() + ":");
        for (String asignatura : asignaturasImpartidas) {
            System.out.println("- " + asignatura);
        }
    }


}

