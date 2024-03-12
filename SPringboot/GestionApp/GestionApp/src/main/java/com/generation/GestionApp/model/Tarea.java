package com.generation.GestionApp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tareas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tareaId;

    @Size(min = 5, max = 50)
    private String nombreTarea;

    @ManyToMany
    @JoinTable(
            name = "tarea_empleados", //el nombre de la tarea
            joinColumns = @JoinColumn(name = "tarea_id"), // indicamos la columna que lleva la llave foranea
            inverseJoinColumns = @JoinColumn(name = "empleado_id") // indica la llave foreana de la otra identidad
    )
    private List<Empleado> tareaEmpleados;


    //contructores


}