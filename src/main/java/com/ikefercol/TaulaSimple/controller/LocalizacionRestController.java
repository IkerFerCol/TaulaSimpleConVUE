//package com.ikefercol.TaulaSimple.controller;
//
//import com.ikefercol.TaulaSimple.model.Entidades.Ciudad;
//import com.ikefercol.TaulaSimple.model.Entidades.Pais;
//import com.ikefercol.TaulaSimple.model.Entidades.Provincia;
//import com.ikefercol.TaulaSimple.service.CiudadPoblacionMinimaService;
//import com.ikefercol.TaulaSimple.service.PaisObtenerTodosService;
//import com.ikefercol.TaulaSimple.service.ProvinciaObtenerPorPaisService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "*")
//@RestController
//@RequestMapping("/api/localizaciones")
//public class LocalizacionRestController {
//
//    @Autowired
//    private PaisObtenerTodosService paisService;
//
//    @Autowired
//    private ProvinciaObtenerPorPaisService provinciaService;
//
//    @Autowired
//    private CiudadPoblacionMinimaService ciudadService;
//
//    @GetMapping("/paises")
//    public List<Pais> obtenerTodosLosPaises() {
//        return paisService.obtenerTodosLosPaises();
//    }
//    @GetMapping("/provincias")
//    public List<Provincia> obtenerTodasLasProvinciasPorPais(@RequestParam String nombrePais) {
//        return provinciaService.obtenerProvinciasPorPais(nombrePais);
//    }
//    @GetMapping("/ciudades")
//    public List<Ciudad> obtenerTodasLasCiudadesConPoblacionMinima(@RequestParam int poblacionMinima) {
//        return ciudadService.obtenerCiudadesAmbPoblacionMinima(poblacionMinima);
//    }
//
//
//
//
//
//}
