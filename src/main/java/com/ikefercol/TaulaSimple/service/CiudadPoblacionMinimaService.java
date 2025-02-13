package com.ikefercol.TaulaSimple.service;

import com.ikefercol.TaulaSimple.model.Entidades.Ciudad;
import com.ikefercol.TaulaSimple.model.Repositorios.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiudadPoblacionMinimaService {

    @Autowired
    private CiudadRepository ciudadRepository;

    public List<Ciudad> obtenerCiudadesAmbPoblacionMinima(int poblacionMinima){
        List<Ciudad> todasLasCiudades = ciudadRepository.findAll();
        List<Ciudad> ciudadesFiltradas = new ArrayList<>();

        for (Ciudad ciudad : todasLasCiudades) {
            if (ciudad.getPoblacion() > poblacionMinima) {
                ciudadesFiltradas.add(ciudad);
            }
        }
        return ciudadesFiltradas;
    }

    public Iterable<Ciudad> getAllCiutats() {
        return ciudadRepository.findAll();
    }

}
