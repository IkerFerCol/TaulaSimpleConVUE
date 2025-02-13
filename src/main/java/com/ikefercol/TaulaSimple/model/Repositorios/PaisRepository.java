package com.ikefercol.TaulaSimple.model.Repositorios;

import com.ikefercol.TaulaSimple.model.Entidades.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PaisRepository extends JpaRepository<Pais, Long> {
}
