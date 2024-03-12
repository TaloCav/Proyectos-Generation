package com.generation.GestionApp.services;

import com.generation.GestionApp.model.Empleado;
import com.generation.GestionApp.repository.EmpleadoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
@Transactional
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired          //esta anotacion inyecta un componente dentro de esta clase
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado guardarEmpleado(Empleado empleadoParaGuardar) {
        return empleadoRepository.save(empleadoParaGuardar);
    }

    @Override
    public void borrarEmpleadoPorId(Long id) {
        //Validamos que el empleado existe
        Boolean empleadoExiste = empleadoRepository.existsById(id);

        if (empleadoExiste) {
            empleadoRepository.deleteById(id);
        }
    }
    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }
}
