package com.ikefercol.TaulaSimple.service;

import com.ikefercol.TaulaSimple.model.Entidades.Ciudad;
import com.ikefercol.TaulaSimple.model.Entidades.Provincia;
import com.ikefercol.TaulaSimple.model.Repositorios.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProvinciaObtenerPorPaisService {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    public List<Provincia> obtenerProvinciasPorPais(String nombrePais) {
        List<Provincia> provincias = provinciaRepository.findAll();
        List<Provincia> resultado = new ArrayList<>();

        for (Provincia provincia : provincias) {
            if (provincia.getPais_id().getNom().equalsIgnoreCase(nombrePais)) {
                resultado.add(provincia);
            }
        }

        return resultado;
    }

    public Iterable<Provincia> getAllProvincias() {
        return provinciaRepository.findAll();
    }
}
