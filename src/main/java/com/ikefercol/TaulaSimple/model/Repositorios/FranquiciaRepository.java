package com.ikefercol.TaulaSimple.model.Repositorios;

import com.ikefercol.TaulaSimple.model.Entidades.Ciudad;
import com.ikefercol.TaulaSimple.model.Entidades.Franquicia;
import org.apache.catalina.LifecycleState;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FranquiciaRepository extends CrudRepository<Franquicia, Long> {
//    List<Franquicia> findByCiudades(Ciudad ciudad);
}
