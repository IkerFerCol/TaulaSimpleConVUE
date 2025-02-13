package com.ikefercol.TaulaSimple.model.Entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "CIUDAD")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nom;
    String descripcion;
    String imagen;
    int poblacion;

    @ManyToMany(mappedBy = "ciudades")
    List<Franquicia> franquicias;

    @ManyToOne
    @JoinColumn(name = "PROVINCIA_ID", nullable = false)
    Provincia provincia_id;

    public Ciudad() {}

    public Ciudad(long id, String nom, String descripcion, String imagen, int poblacion, List<Franquicia> franquicias, Provincia provincia_id) {
        this.id = id;
        this.nom = nom;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.poblacion = poblacion;
        this.franquicias = franquicias;
        this.provincia_id = provincia_id;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public List<Franquicia> getFranquicias() {
        return franquicias;
    }

    public void setFranquicias(List<Franquicia> franquicias) {
        this.franquicias = franquicias;
    }

    public Provincia getProvincia_id() {
        return provincia_id;
    }

    public void setProvincia_id(Provincia provincia_id) {
        this.provincia_id = provincia_id;
    }


}
