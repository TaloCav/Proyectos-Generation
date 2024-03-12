package Models;

import java.util.ArrayList;

public class Curso {
    public String ramo;
    public String profesor;
    public int sala;
    public ArrayList<Estudiante> estudianteInscritos = new ArrayList<>();

    public Curso() {
    }

    public Curso(String ramo, String profesor, int sala) {
        this.ramo = ramo;
        this.profesor = profesor;
        this.sala = sala;
    }

    public Curso(String ramo, String profesor, int sala, ArrayList<Estudiante> estudianteInscritos) {
        this.ramo = ramo;
        this.profesor = profesor;
        this.sala = sala;
        this.estudianteInscritos = estudianteInscritos;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public ArrayList<Estudiante> getEstudianteInscritos() {
        return estudianteInscritos;
    }

    public void setEstudianteInscritos(ArrayList<Estudiante> estudianteInscritos) {
        this.estudianteInscritos = estudianteInscritos;
    }

    //Metodo
    public void agregarEstudiante(Estudiante alumnocurso){
        estudianteInscritos.add(alumnocurso);
        System.out.println("el larry " + alumnocurso.nombre + " " + alumnocurso.apellido + " " + "Fue inscrito");
    }

    @Override
    public String toString() {
        return "Curso{" +
                "ramo='" + ramo + '\'' +
                ", profesor='" + profesor + '\'' +
                ", sala=" + sala +
                ", estudianteInscritos=" + estudianteInscritos +
                '}';
    }
}


