import Models.Curso;
import Models.Estudiante;

import java.util.ArrayList;

public class NuevoEstudiante {
    public static void main(String[] args) {

        ArrayList<Estudiante> alumnos = new ArrayList<>();

            //agregando alumnos por constructor
        Estudiante alumno = new Estudiante("kernel", "panic" ,27 ,'T');
        Estudiante alumno2 = new Estudiante("Master", "Z", 50, 'T');
        Estudiante alumno3 = new Estudiante("Cris", "Pato", 60);

            //agregado por SET
        Estudiante alumno4 = new Estudiante();
        alumno4.setNombre("Kernelsito");
        alumno4.setApellido("Panico");
        alumno4.setEdad(23);
        alumno4.setGenero('M');

            //alumnos agregados en el Array Alumnos

        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);

          //muestra los alumnos en consola

        System.out.println(alumno3);
        System.out.println(alumnos);

        //agregando los alumnos al curso
        Curso escuelitaMate = new Curso("Matematicas", "Chimultrufia",2 );
        //escuelitaMate.agregarEstudiante(alumno2);
        //escuelitaMate.agregarEstudiante(alumno3);
        escuelitaMate.setEstudianteInscritos(alumnos);   //estudiantes agregados por metodo array en Curso
        System.out.println(escuelitaMate);

        Curso escuelitaIngles = new Curso("Ingles", "RobertoCarlo",3);
        escuelitaIngles.agregarEstudiante(alumno2);
        escuelitaIngles.agregarEstudiante(alumno);
    }

}
