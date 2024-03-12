package com.generation.GestionApp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.util.ArrayList;

@Entity
@Table(name = "departamentos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long departamentoID;

    @Size(min = 3, max = 50)
    public String nombreDepartamento;

    @OneToMany(mappedBy = "departamentoEmpleado")
    public ArrayList<Empleado> empleadosDepartamento;

}