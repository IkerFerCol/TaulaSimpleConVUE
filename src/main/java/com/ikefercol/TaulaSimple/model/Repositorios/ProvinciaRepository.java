package com.ikefercol.TaulaSimple.model.Repositorios;

import com.ikefercol.TaulaSimple.model.Entidades.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProvinciaRepository extends JpaRepository<Provincia, Long> {
}
