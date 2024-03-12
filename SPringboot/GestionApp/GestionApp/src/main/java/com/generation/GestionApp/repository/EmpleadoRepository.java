package com.generation.GestionApp.repository;
import com.generation.GestionApp.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    //Hereda de JPARepository que aporta metodos para realizar CRUD y Paginacion y orden

}