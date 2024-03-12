package com.generation.GestionApp.repository;


import com.generation.GestionApp.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargosRepository extends JpaRepository<Cargo, Long> {

}
