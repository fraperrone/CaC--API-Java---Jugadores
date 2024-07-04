
package com.cac.jugador3.service;

import com.cac.jugador3.entity.Jugador;

import java.util.List;
public interface JugadorService {
    Jugador saveJugador(Jugador jugador);
    
    List<Jugador> fetchJugadorList();
    
    String updateJugador(Jugador jugador, Long jugadorId);
    
    String deleteJugadorById(Long jugadorId);
}
