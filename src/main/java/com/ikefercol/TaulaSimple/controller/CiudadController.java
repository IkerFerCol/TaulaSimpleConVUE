package com.ikefercol.TaulaSimple.controller;


import com.ikefercol.TaulaSimple.model.Repositorios.FranquiciaRepository;
import com.ikefercol.TaulaSimple.service.CiudadPoblacionMinimaService;
import com.ikefercol.TaulaSimple.service.PaisObtenerTodosService;
import com.ikefercol.TaulaSimple.service.ProvinciaObtenerPorPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/listas")
public class CiudadController {

    @Autowired
    CiudadPoblacionMinimaService ciudadService;

    @Autowired
    ProvinciaObtenerPorPaisService provinciaService;

    @Autowired
    PaisObtenerTodosService paisService;

    @Autowired
    FranquiciaRepository franquiciaRepository;

    @GetMapping("/ciudad")
    public String getCiudades(Model model){
        model.addAttribute("ciudad", ciudadService.getAllCiutats());
        return "ciudades";
    }

    @GetMapping("/provincia")
    public String getProvincias(Model model){
        model.addAttribute("provincia", provinciaService.getAllProvincias());
        return "provincias";
    }

    @GetMapping("/pais")
    public String getPais(Model model){
        model.addAttribute("pais", paisService.obtenerTodosLosPaises());
        return "paises";
    }

    @GetMapping("/franquicia")
    public String getFranquicia(Model model){
        model.addAttribute("franquicia", franquiciaRepository.findAll());
        return "franquicias";
    }

}
