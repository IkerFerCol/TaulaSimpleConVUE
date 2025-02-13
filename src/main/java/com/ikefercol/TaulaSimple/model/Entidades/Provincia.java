package com.ikefercol.TaulaSimple.model.Entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PROVINCIA")
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nom;

    @ManyToOne
    @JoinColumn(name = "PAIS_ID", nullable = false)
    Pais pais_id;

    @OneToMany(mappedBy = "provincia_id", cascade = CascadeType.ALL)
    private List<Ciudad> ciudades;

    public Provincia(Long id, String nom, Pais pais_id, List<Ciudad> ciudads) {
        this.id = id;
        this.nom = nom;
        this.pais_id = pais_id;
        this.ciudades = ciudads;
    }

    public Provincia() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Pais getPais_id() {
        return pais_id;
    }

    public void setPais_id(Pais pais_id) {
        this.pais_id = pais_id;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudads(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }


}
