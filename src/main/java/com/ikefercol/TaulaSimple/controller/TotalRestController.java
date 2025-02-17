package com.ikefercol.TaulaSimple.controller;

import com.ikefercol.TaulaSimple.model.Entidades.Ciudad;
import com.ikefercol.TaulaSimple.model.Entidades.Franquicia;
import com.ikefercol.TaulaSimple.model.Entidades.Pais;
import com.ikefercol.TaulaSimple.model.Entidades.Provincia;
import com.ikefercol.TaulaSimple.model.Repositorios.CiudadRepository;
import com.ikefercol.TaulaSimple.model.Repositorios.FranquiciaRepository;
import com.ikefercol.TaulaSimple.model.Repositorios.PaisRepository;
import com.ikefercol.TaulaSimple.model.Repositorios.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciudads")
public class TotalRestController {

    @Autowired
    CiudadRepository ciudadRepository;

    @Autowired
    FranquiciaRepository franquiciaRepository;

    @Autowired
    PaisRepository paisRepository;

    @Autowired
    ProvinciaRepository provinciaRepository;


    @GetMapping("/ciudades")
    public List<Ciudad> getCiudades() {
        return ciudadRepository.findAll();
    }


    @PostMapping("/ciudades")
    public void createCiudad(@RequestBody Ciudad ciudad) {
        ciudadRepository.save(ciudad);
    }

    @DeleteMapping("/ciudades/{id}")
    public String deleteCiudad(@PathVariable Long id) {
        ciudadRepository.deleteById(id);
        return "Ciudad borrada";
    }

    @GetMapping("/provincias")
    public List<Provincia> getProvincias() {
        return provinciaRepository.findAll();
    }


    @PostMapping("/provincias")
    public void createProvincia(@RequestBody Provincia provincia) {
        provinciaRepository.save(provincia);
    }

    @DeleteMapping("/provincias/{id}")
    public String deleteProvincias(@PathVariable Long id) {
        provinciaRepository.deleteById(id);
        return "Provincia borrada";
    }

    @GetMapping("/paises")
    public List<Pais> getPaises() {
        return paisRepository.findAll();
    }


    @PostMapping("/paises")
    public void createPais(@RequestBody Pais pais) {
        paisRepository.save(pais);
    }

    @DeleteMapping("/paises/{id}")
    public String deletePais(@PathVariable Long id) {
        paisRepository.deleteById(id);
        return "Pais borrada";
    }


    @GetMapping("/franquicias")
    public List<Franquicia> getFranquicia() {
        return franquiciaRepository.findAll();
    }

    @PostMapping("/franquicias")
    public void createFranquicia(@RequestBody Franquicia franquicia) {
        franquiciaRepository.save(franquicia);
    }

    @DeleteMapping("/franquicias/{id}")
    public String deleteFranquicias(@PathVariable Long id) {
        ciudadRepository.deleteById(id);
        return "Franquicia borrada";
    }



}
