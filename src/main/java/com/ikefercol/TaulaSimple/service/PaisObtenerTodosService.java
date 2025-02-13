package com.ikefercol.TaulaSimple.service;

import com.ikefercol.TaulaSimple.model.Entidades.Pais;
import com.ikefercol.TaulaSimple.model.Repositorios.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisObtenerTodosService {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> obtenerTodosLosPaises() {
        return paisRepository.findAll();
    }

    public Optional<Pais> obtenerPaisPorId(Long id) {
        return paisRepository.findById(id);
    }
}
