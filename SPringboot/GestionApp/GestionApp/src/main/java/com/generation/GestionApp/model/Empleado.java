package com.generation.GestionApp.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@Entity   // representa una tabla
@Table(name = "empleados")    // especificamos el nombre de la tabla
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Empleado {

    @Id                                                  //Indica que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Indica que se va a generar de manera autoincrementable
    private Long empleadoId;


    @Column(name = "nombre_empleados") //especifica el nombre de una columna
    @Size(min = 3, max= 15) // validar el minimo y el maximo del nombre
    private String nombreEmpleados;

    @Column(name = "direccion")
    @Size(min = 3, max= 50)
    private String dirreccionEmpleado;

    @Min(value = 1, message = "Tienes que indicar mayor numero a 1")
    @Max(value = 10, message = "Tienes que indicar un valor menos a 10")
    private Integer aniosAntiguedad;


    @ManyToOne
    @JoinColumn(name = "departamento")
    private Departamento departamentoEmpleado;
    @Email(message = "Correo invalido")
    private String correoEmpleado;

    @OneToOne
    @JoinColumn(name = "cargo")
    private Cargo cargoEmpleado;

    @ManyToMany(mappedBy = "tareaEmpleados")
    private ArrayList<Tarea> tareaEmpleados;



}
