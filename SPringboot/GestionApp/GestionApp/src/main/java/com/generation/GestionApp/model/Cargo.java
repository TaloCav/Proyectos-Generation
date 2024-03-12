package com.generation.GestionApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Table(name = "cargos")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Max(10)
    private long cargoId;


    @Size(min = 2, max = 15)
    private String nombreCargo;

    @Min(value = 450000, message = "El sueldo del cargo debe ser mayor a 450.000")
    private Integer sueldoCargo;


}