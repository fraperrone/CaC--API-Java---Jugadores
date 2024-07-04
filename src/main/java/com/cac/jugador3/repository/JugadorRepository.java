
package com.cac.jugador3.repository;

import com.cac.jugador3.entity.Jugador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends CrudRepository<Jugador, Long> {
    
}
