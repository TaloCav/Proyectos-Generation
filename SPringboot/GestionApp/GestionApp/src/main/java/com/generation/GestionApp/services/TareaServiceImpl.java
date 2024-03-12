package com.generation.GestionApp.services;
import com.generation.GestionApp.model.Tarea;
import com.generation.GestionApp.repository.TareaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Transactional
public class TareaServiceImpl implements TareaService{

    @Autowired
    private TareaRepository tareaRepository;

    @Override
    public ArrayList<Tarea> obtenerListaTareas() {
        return (ArrayList<Tarea>) tareaRepository.findAll();
    }
}