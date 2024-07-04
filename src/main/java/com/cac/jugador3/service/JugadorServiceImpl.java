package com.cac.jugador3.service;

import com.cac.jugador3.entity.Jugador;
import com.cac.jugador3.repository.JugadorRepository;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadorServiceImpl implements JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Override
    public Jugador saveJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @Override
    public List<Jugador> fetchJugadorList() {
        return (List<Jugador>) jugadorRepository.findAll();
    }

    //
    @Override
    public String updateJugador(Jugador jugador, Long jugadorId) {
        var opcJugador = jugadorRepository.findById(jugadorId);

        if (!opcJugador.toString().equals(Optional.empty().toString())) {
            Jugador jugadorDB = jugadorRepository.findById(jugadorId).get();
            if (Objects.nonNull(jugador.getCamiseta()) && jugador.getCamiseta() != 0) {
                jugadorDB.setCamiseta(jugador.getCamiseta());

            }
            if (Objects.nonNull(jugador.getNombre()) && !"".equalsIgnoreCase(
                    jugador.getNombre())) {
                jugadorDB.setNombre(jugador.getNombre());

            }
            
            jugadorRepository.save(jugadorDB);
            return "Jugador Modificado: " + opcJugador.toString();
        } else {
            return "No existe el jugador: " + opcJugador.toString();
        }

    }

    @Override
    public String deleteJugadorById(Long jugadorId) {
        var opcJugador = jugadorRepository.findById(jugadorId);
        if (!opcJugador.toString().equals(Optional.empty().toString())) {
            jugadorRepository.deleteById(jugadorId);
            return "Jugador Eliminado: " + opcJugador.toString();
        } else {
            return "No existe el jugador: " + opcJugador.toString();
        }

    }

}
