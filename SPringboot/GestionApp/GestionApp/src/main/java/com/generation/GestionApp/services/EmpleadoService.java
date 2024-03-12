package com.generation.GestionApp.services;

import com.generation.GestionApp.model.Empleado;

import java.util.List;

public interface EmpleadoService {
    //En esta interfaz declaro los metodos solamente

    Empleado guardarEmpleado(Empleado empleadoParaGuardar);

    void borrarEmpleadoPorId(Long empleadoId);

    List<Empleado> listarEmpleados();

}
