package com.ikefercol.TaulaSimple.model.Entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PAIS")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nom;

    @OneToMany(mappedBy = "pais_id", cascade = CascadeType.ALL)
    List<Provincia> provincias;


    public Pais(long id, String nom, List<Provincia> provincias) {
        this.id = id;
        this.nom = nom;
        this.provincias = provincias;
    }

    public Pais() {

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

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }


}
