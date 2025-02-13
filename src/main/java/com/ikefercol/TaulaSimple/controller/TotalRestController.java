package com.ikefercol.TaulaSimple.controller;

import com.ikefercol.TaulaSimple.model.Repositorios.CiudadRepository;
import com.ikefercol.TaulaSimple.model.Repositorios.FranquiciaRepository;
import com.ikefercol.TaulaSimple.model.Repositorios.PaisRepository;
import com.ikefercol.TaulaSimple.model.Repositorios.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8082", allowedHeaders = "*", methods = {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/total")
public class TotalRestController {

    @Autowired
    CiudadRepository ciudadRepository;

    @Autowired
    FranquiciaRepository franquiciaRepository;

    @Autowired
    PaisRepository paisRepository;

    @Autowired
    ProvinciaRepository provinciaRepository;

    @GetMapping(name = "/ciudad")
    public String getCiudades(Model model){
        model.addAttribute("ciudad", ciudadRepository.findAll());
        return "ciudades";
    }

    @GetMapping("/franquicia")
    public String getFranquicia(Model model){
        model.addAttribute("franquicia", franquiciaRepository.findAll());
        return "franquicias";
    }

    @GetMapping("/pais")
    public String getPais(Model model){
        model.addAttribute("pais", paisRepository.findAll());
        return "paises";
    }

    @GetMapping("/provincia")
    public String getProvincias(Model model){
        model.addAttribute("provincia", provinciaRepository.findAll());
        return "provincias";
    }

}
