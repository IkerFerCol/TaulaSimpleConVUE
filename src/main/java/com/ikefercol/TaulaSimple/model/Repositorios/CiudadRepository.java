package com.ikefercol.TaulaSimple.model.Repositorios;

import com.ikefercol.TaulaSimple.model.Entidades.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
}
