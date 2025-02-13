package com.ikefercol.TaulaSimple.service;

import com.ikefercol.TaulaSimple.model.Entidades.Ciudad;
import com.ikefercol.TaulaSimple.model.Entidades.Pais;
import com.ikefercol.TaulaSimple.model.Entidades.Provincia;
import com.ikefercol.TaulaSimple.model.Repositorios.CiudadRepository;
import com.ikefercol.TaulaSimple.model.Repositorios.PaisRepository;
import com.ikefercol.TaulaSimple.model.Repositorios.ProvinciaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarBDAService {

    @Autowired
    private PaisRepository paisRepository;

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Autowired
    private CiudadRepository ciudadRepository;


    public void ListarPaises() {
        System.out.println("## PAISES ##");
        for (Pais pais : paisRepository.findAll()){
            System.out.println(pais.getNom());
        }
    }
    public void ListarProvincias() {
        System.out.println("## PROVINCIAS ##");
        for (Provincia provincia : provinciaRepository.findAll()){
            System.out.println(provincia.getNom());
        }
    }
    public void ListarCiudades() {
        System.out.println("## CIUDADES ##");
        for (Ciudad ciudad : ciudadRepository.findAll()){
            System.out.println(ciudad.getNom());
        }
    }

    @PostConstruct
    public void inicializar() {
        System.out.println("------------ Inicializando el servicio... --------------");
        ListarPaises();
        ListarProvincias();
        ListarCiudades();
    }


}
