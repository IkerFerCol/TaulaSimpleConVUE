package com.ikefercol.TaulaSimple.model.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "FRANQUICIA")
public class Franquicia {
    @Id
    @GeneratedValue
    private long id;
    private String nom;

    @JsonIgnoreProperties("franquicias") // Evita la recursion infinita, NO serializamos el campo "ciudades" de 'Provincias'
    @ManyToMany
    @JoinTable(name = "CIUDAD_FRANQUICIA", joinColumns = @JoinColumn(name = "franquicia_id"), inverseJoinColumns = @JoinColumn(name = "ciudad_id"))
    private List<Ciudad> ciudades;

    public Franquicia(long id, String nom, List<Ciudad> ciudades) {
        this.id = id;
        this.nom = nom;
        this.ciudades = ciudades;
    }

    public Franquicia() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }


}
