/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Dell i5
 */

public class Sistema {
            
    // listas para guardar asignaturas y cursos
    private static final List<Curso> cursos = new ArrayList<>();
    private static final List<Asignatura> asignaturas = new ArrayList<>();

    
    
    // funcion para validaciones
    
    public static int obtenerEnteroPositivo(Scanner sc, String mensaje) {
    int valor;
    while (true) {
        System.out.print(mensaje);
        if (sc.hasNextInt()) {
            valor = sc.nextInt();
            if (valor > 0) {
                sc.nextLine(); // Limpiar el buffer
                return valor;
            } else {
                System.out.println("Error El valor debe ser un entero positivo.");
            }
        } else {
            System.out.println("Error Debes ingresar un nÃºmero entero.");
            sc.nextLine(); // Limpiar el buffer
        }
    }
    }
    public static void main(String[] args) {
        // Listas para gestionar profesores y estudiantes
        try (Scanner sc = new Scanner(System.in)) {
            List<Profesor> profesores = new ArrayList<>();
            List<Estudiante> estudiantes = new ArrayList<>();
            
            // CreaciÃ³n de algunos profesores y estudiantes por defecto
            Profesor prof1 = new Profesor(1, "Rosa", "Segura", 45, "rosa.segura@mail.com");
            prof1.agregarAsignatura("Matematicas");
            prof1.agregarAsignatura("Fisica");
            prof1.agregarAsignatura("Quimica");

            Profesor prof2 = new Profesor(2, "Ana", "Gomez", 38, "ana.gomez@mail.com");
            prof2.agregarAsignatura("Historia");
            prof2.agregarAsignatura("Lectura");
            
            Estudiante est1 = new Estudiante(1, "Carlos", "Ramirez", 20, "carlos.ramirez@mail.com", "licenciatura en matematicas");
            est1.inscribirAsignatura("Matematicas", 85.0);
            est1.inscribirAsignatura("Fisica", 65.0);
            est1.inscribirAsignatura("Lectura", 45.0);
            
            Estudiante est2 = new Estudiante(2, "Marai", "Lopez", 22, "maria.lopez@mail.com", "licenciatura en historia");
            est2.inscribirAsignatura("Historia", 90.0);
            est2.inscribirAsignatura("Quimica", 60.0);
            est2.inscribirAsignatura("Fisica", 32.0);
            
            profesores.add(prof1);
            profesores.add(prof2);
            estudiantes.add(est1);
            estudiantes.add(est2);
            
                    // Crear cursos
        Curso curso1 = new Curso("licenciatura en matematicas");
        Curso curso2 = new Curso("Ingenieria En Producción Industrial");

        // Crear asignaturas
        Asignatura asignatura1 = new Asignatura("Matematicas", "curso sobre matematicas 1");
        Asignatura asignatura2 = new Asignatura("Fisica", "principios de fisica");
        Asignatura asignatura3 = new Asignatura("Quimica","curso de quimica 1");
        Asignatura asignatura4 = new Asignatura("POO","Aplicacion de los principios");
        Asignatura asignatura5 = new Asignatura("Ecuaciones Diferenciales","Modulo 1");
        
        asignaturas.add(asignatura1);
        asignaturas.add(asignatura2);
        asignaturas.add(asignatura3);
        asignaturas.add(asignatura4);
        asignaturas.add(asignatura5);

        // Agregar asignaturas a los cursos
        curso1.agregarAsignatura(asignatura1);
        curso1.agregarAsignatura(asignatura2);
        curso1.agregarAsignatura(asignatura3);
        curso2.agregarAsignatura(asignatura4);
        curso2.agregarAsignatura(asignatura5);
        
        // lista para guardar cursos 
        cursos.add(curso1);
        cursos.add(curso2);


                 
            // MenÃº del sistema
            int opcion = 0;
            while (opcion != 5) {
                System.out.println("\n*** Menu ***");
                System.out.println("1. Gestionar Profesores");
                System.out.println("2. Gestionar Estudiantes");
                System.out.println("3. Gestionar cursos");
                System.out.println("4. Gestionar asignaturas");
                System.out.println("5. Salir");
                System.out.print("Elige una opcion: ");
                opcion = obtenerEnteroPositivo(sc,":");
                
                switch (opcion) {
                    case 1 -> {
                        // Gestionar Profesores
                        int opProfesor = 0;
                        while (opProfesor != 5) {
                            System.out.println("\n*** Gestionar Profesores ***");
                            System.out.println("1. Agregar Profesor");
                            System.out.println("2. Eliminar Profesor");
                            System.out.println("3. Ver Informacion de Profesor (por ID)");
                            System.out.println("4. Ver Materias que Imparte un Profesor");
                            System.out.println("5. Volver al Menu Principal");
                            System.out.print("Elige una opcion: ");
                            opProfesor = obtenerEnteroPositivo(sc,":");
                            
                            switch (opProfesor) {
                                case 1 -> {
                                    // Agregar Profesor
                                    System.out.print("Ingrese el ID del Profesor: ");
                                    int idProfesor = obtenerEnteroPositivo(sc,":");
                                    
                                    // Verificar si el ID del profesor ya existe
                                    boolean existeProfesor = false;
                                    for (Profesor p : profesores) {
                                        if (p.getId() == idProfesor) {
                                            existeProfesor = true;
                                            break;
                                        }
                                    }
                                    
                                    if (existeProfesor) {
                                        System.out.println("El ID del profesor ya existe.");
                                    } else {
                                        System.out.print("Ingrese el Nombre del Profesor: ");
                                        String nombreProfesor = sc.nextLine();
                                        System.out.print("Ingrese el Apellido del Profesor: ");
                                        String apellidoProfesor = sc.nextLine();
                                        System.out.print("Ingrese la Edad del Profesor: ");
                                        int edadProfesor = sc.nextInt();
                                        sc.nextLine();
                                        System.out.print("Ingrese el Correo del Profesor: ");
                                        String correoProfesor = sc.nextLine();
                                        Profesor nuevoProfesor = new Profesor(idProfesor, nombreProfesor, apellidoProfesor, edadProfesor, correoProfesor);
                                        profesores.add(nuevoProfesor);
                                        System.out.println("Profesor agregado correctamente.");
                                    }
                                }
                                case 2 -> {
                                    // Eliminar Profesor
                                    System.out.print("Ingrese el ID del Profesor a eliminar: ");
                                    int idEliminarProfesor = obtenerEnteroPositivo(sc,":");
                                    Profesor profesorEliminar = null;
                                    for (Profesor p : profesores) {
                                        if (p.getId() == idEliminarProfesor) {
                                            profesorEliminar = p;
                                            break;
                                        }
                                    }
                                    if (profesorEliminar != null) {
                                        profesores.remove(profesorEliminar);
                                        System.out.println("Profesor eliminado correctamente.");
                                    } else {
                                        System.out.println("Profesor no encontrado.");
                                    }
                                }
                                case 3 -> {
                                    // Ver InformaciÃ³n de Profesor por ID
                                    System.out.print("Ingrese el ID del Profesor: ");
                                    int idVerProfesor = obtenerEnteroPositivo(sc,":");
                                    Profesor profesorInfo = null;
                                    for (Profesor p : profesores) {
                                        if (p.getId() == idVerProfesor) {
                                            profesorInfo = p;
                                            break;
                                        }
                                    }
                                    if (profesorInfo != null) {
                                        profesorInfo.mostrarInformacion();
                                    } else {
                                        System.out.println("Profesor no encontrado.");
                                    }
                                }
                                case 4 -> {
                                    // Ver Materias que Imparte un Profesor
                                    System.out.print("Ingrese el ID del Profesor: ");
                                    int idMateriasProfesor = obtenerEnteroPositivo(sc,":");
                                    Profesor profesorMaterias = null;
                                    for (Profesor p : profesores) {
                                        if (p.getId() == idMateriasProfesor) {
                                            profesorMaterias = p;
                                            break;
                                        }
                                    }
                                    if (profesorMaterias != null) {
                                        profesorMaterias.listarAsignaturas();
                                    } else {
                                        System.out.println("Profesor no encontrado.");
                                    }
                                }
                            }
                        }
                    }
                    
                    case 2 -> {
                        // Gestionar Estudiantes
                        int opEstudiante = 0;
                        while (opEstudiante != 6) {
                            System.out.println("\n*** Gestionar Estudiantes ***");
                            System.out.println("1. Agregar Estudiante");
                            System.out.println("2. Eliminar Estudiante");
                            System.out.println("3. Agregar Materia con Calificacion a Estudiante");
                            System.out.println("4. Ver Materias de un Estudiante");
                            System.out.println("5. Ver Informacion de Estudiante (por ID)");
                            System.out.println("6. Volver al Menu Principal");
                            System.out.print("Elige una opcion: ");
                            opEstudiante = obtenerEnteroPositivo(sc,":");
                            
                            switch (opEstudiante) {
                                case 1 -> {
                                    // Agregar Estudiante
                                    System.out.print("Ingrese el ID del Estudiante: ");
                                    int idEstudiante = obtenerEnteroPositivo(sc,":");
                                    
                                    // Verificar si el ID del estudiante ya existe
                                    boolean existeEstudiante = false;
                                    for (Estudiante e : estudiantes) {
                                        if (e.getId() == idEstudiante) {
                                            existeEstudiante = true;
                                        }
                                    }
                                    
                                    if (existeEstudiante) {
                                        System.out.println("El ID del estudiante ya existe.");
                                    } else {
                                        System.out.print("Ingrese el Nombre del Estudiante: ");
                                        String nombreEstudiante = sc.nextLine();
                                        System.out.print("Ingrese el Apellido del Estudiante: ");
                                        String apellidoEstudiante = sc.nextLine();
                                        System.out.print("Ingrese la Edad del Estudiante: ");
                                        int edadEstudiante = sc.nextInt();
                                        sc.nextLine();
                                        System.out.print("Ingrese el Correo del Estudiante: ");
                                        String correoEstudiante = sc.nextLine();
                                        System.out.print("Ingrese el Curso del Estudiante: ");
                                        String cursoEstudiante = sc.nextLine();
                                        Estudiante nuevoEstudiante = new Estudiante(idEstudiante, nombreEstudiante, apellidoEstudiante, edadEstudiante, correoEstudiante, cursoEstudiante);
                                        estudiantes.add(nuevoEstudiante);
                                        System.out.println("Estudiante agregado correctamente.");
                                    }
                                }
                                case 2 -> {
                                    // Eliminar Estudiante
                                    System.out.print("Ingrese el ID del Estudiante a eliminar: ");
                                    int idEliminarEstudiante = obtenerEnteroPositivo(sc,":");
                                    Estudiante estudianteEliminar = null;
                                    for (Estudiante e : estudiantes) {
                                        if (e.getId() == idEliminarEstudiante) {
                                            estudianteEliminar = e;
                                        }
                                    }
                                    if (estudianteEliminar != null) {
                                        estudiantes.remove(estudianteEliminar);
                                        System.out.println("Estudiante eliminado correctamente.");
                                    } else {
                                        System.out.println("Estudiante no encontrado.");
                                    }
                                }
                                case 3 -> {
                                    // Agregar Materia con CalificaciÃ³n a Estudiante
                                    System.out.print("Ingrese el ID del Estudiante: ");
                                    int idMateriaEstudiante = obtenerEnteroPositivo(sc,":");
                                    Estudiante estudianteMateria = null;
                                    for (Estudiante e : estudiantes) {
                                        if (e.getId() == idMateriaEstudiante) {
                                            estudianteMateria = e;
                                        }
                                    }
                                    if (estudianteMateria != null) {
                                        System.out.print("Ingrese el nombre de la asignatura: ");
                                        String asignatura = sc.nextLine();
                                        System.out.print("Ingrese la calificacion de la asignatura: ");
                                        double calificacion = sc.nextDouble();
                                        estudianteMateria.inscribirAsignatura(asignatura, calificacion);
                                    } else {
                                        System.out.println("Estudiante no encontrado.");
                                    }
                                }
                                case 4 -> {
                                    // Ver Materias de un Estudiante
                                    System.out.print("Ingrese el ID del Estudiante: ");
                                    int idVerEstudiante = sc.nextInt();
                                    sc.nextLine();
                                    Estudiante estudianteInfo = null;
                                    for (Estudiante e : estudiantes) {
                                        if (e.getId() == idVerEstudiante) {
                                            estudianteInfo = e;
                                        }
                                    }
                                    if (estudianteInfo != null) {
                                        estudianteInfo.listarAsignaturas();
                                    } else {
                                        System.out.println("Estudiante no encontrado.");
                                    }
                                }
                                case 5 -> {
                                    // Ver InformaciÃ³n de Estudiante (por ID)
                                    System.out.print("Ingrese el ID del Estudiante: ");
                                    int idEstudianteInfo = obtenerEnteroPositivo(sc,":");
                                    Estudiante estudianteInformacion = null;
                                    for (Estudiante e : estudiantes) {
                                        if (e.getId() == idEstudianteInfo) {
                                            estudianteInformacion = e;
                                        }
                                    }
                                    if (estudianteInformacion != null) {
                                        estudianteInformacion.mostrarInformacion();
                                    } else {
                                        System.out.println("Estudiante no encontrado.");
                                    }
                                }
                             
                            }
                        }
                    }
                    
                    case 3 -> {
                        // Gestionar Cursos
                        int opCursos = 0;
                        while (opCursos != 3) {
                            System.out.println("\n*** Gestionar Cursos ***");
                            System.out.println("1. Agregar Curso");
                            System.out.println("2. Ver cursos");
                            System.out.println("3. Volver al Menu Principal");
                            System.out.print("Elige una opcion: ");
                            opCursos = obtenerEnteroPositivo(sc,":");
                            
                            switch (opCursos) {
                            case 1 -> {
                                // Agregar curso
                                System.out.println("Ingrese el nombre del curso:");
                                String nombreCurso = sc.nextLine();

                                // Verificar si el curso ya existe
                                boolean cursoExiste = false;
                                for (Curso curso : cursos) {
                                    if (curso.getNombre().equalsIgnoreCase(nombreCurso)) {
                                        cursoExiste = true;
                                        break;
                                    }
                                }

                                if (cursoExiste) {
                                    System.out.println("El curso '" + nombreCurso + "' ya existe.");
                                    for (Curso curso : cursos) {
                                        if (curso.getNombre().equalsIgnoreCase(nombreCurso)) {
                                            curso.listarAsignaturas();
                                        }
                                    }
                                } else {
                                    // Crear un nuevo curso
                                    Curso nuevoCurso = new Curso(nombreCurso);

                                    // Agregar asignaturas
                                    System.out.println("Ingrese el numero de asignaturas a agregar:");
                                    int numAsignaturas = obtenerEnteroPositivo(sc,":");

                                    for (int i = 0; i < numAsignaturas; i++) {
                                        System.out.println("Ingrese el nombre de la asignatura:");
                                        String nombreAsignatura = sc.nextLine();
                                        Asignatura nuevaAsignatura = new Asignatura(nombreAsignatura, "DescripciÃ³n de " + nombreAsignatura);
                                        nuevoCurso.agregarAsignatura(nuevaAsignatura);
                                    }

                                    // Agregar el curso a la lista
                                    cursos.add(nuevoCurso);
                                    System.out.println("Curso creado: " + nombreCurso);

                                }
                            }                                    

                                
                                case 2 -> {
                                        // Ver lista de cursos
                                        if (cursos.isEmpty()) {
                                            System.out.println("No hay cursos disponibles.");
                                        } else {
                                            // Iterar sobre los cursos 
                                            for (Curso curso : cursos) {
                                                System.out.println("Curso: " + curso.getNombre());
                                                curso.listarAsignaturas();
                                                System.out.println(); // Espacio en blanco para separar los cursos
                                            }
                                        }
                                    }

                         
                             
   
                             
                            }
                        }
                    }
                    
                    case 4 -> {
                        // Gestionar asignaturas
                        int opCursos = 0;
                        while (opCursos != 3) {
                            System.out.println("\n*** Gestionar Asignaturas ***");
                            System.out.println("1. Ver lista de asignaturas");
                            System.out.println("2. Agregar una asignatura");
                            System.out.println("3. Volver al Menu Principal");
                            System.out.print("Elige una opcion: ");
                            opCursos = obtenerEnteroPositivo(sc,":");
                            
                            switch (opCursos) {
                                case 1 -> {
                                    // Ver lista de asignaturas
                                    if (asignaturas.isEmpty()) {
                                        System.out.println("No hay asignaturas disponibles.");
                                    } else {
                                        System.out.println("Lista de asignaturas:");
                                        for (Asignatura asignatura : asignaturas) {
                                            System.out.println("- " + asignatura.getNombre() + ": " + asignatura.getDescripcion());
                                        }
                                    }
                                }
                                case 2 -> {
                                // Agregar una asignatura
                                System.out.print("Ingrese el nombre de la nueva asignatura: ");
                                String nombreAsignatura = sc.nextLine();
                                System.out.print("Ingrese la descripciÃ³n de la asignatura: ");
                                String descripcionAsignatura = sc.nextLine();

                                // Verificar si la asignatura ya existe
                                boolean existe = false;
                                for (Asignatura asignatura : asignaturas) {
                                    if (asignatura.getNombre().equalsIgnoreCase(nombreAsignatura)) {
                                        existe = true;
                                        break;
                                    }
                                }

                                if (existe) {
                                    System.out.println("La asignatura '" + nombreAsignatura + "' ya existe. No se puede agregar.");
                                } else {
                                    // Crear y agregar la nueva asignatura
                                    Asignatura nuevaAsignatura = new Asignatura(nombreAsignatura, descripcionAsignatura);
                                    asignaturas.add(nuevaAsignatura);
                                    System.out.println("Asignatura '" + nombreAsignatura + "' agregada exitosamente.");
                                }
                            }
                        }
                    }

                                                      
                            }
    


                    case 5 -> {
                        System.out.println("Saliendo...");
                    }
                    
                    default -> System.out.println("Opcion no valida.");
                }
            }
        }
    }
}
