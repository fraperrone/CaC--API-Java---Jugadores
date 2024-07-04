package com.cac.jugador3.controller;

import com.cac.jugador3.entity.Jugador;
import com.cac.jugador3.service.JugadorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    //Obtener lista jugadores
    @GetMapping("/jugadores")
    public List<Jugador> fetchJugadoresList() {
        return jugadorService.fetchJugadorList();
    }

    // Agregar Jugador
    @PostMapping("/jugadores")
    public Jugador saveJugador(
            @RequestBody Jugador jugador) {
        return jugadorService.saveJugador(jugador);
    }

    // eliminar jugador
    @DeleteMapping("/jugadores/{id}")
    public String deleteJugadorById(@PathVariable("id") Long jugadorId) {
        String res = jugadorService.deleteJugadorById(jugadorId);
        return res;
    }

    // Modificar jugador
    @PutMapping("/jugadores/{id}")
    public String modificarJugadorById(@RequestBody Jugador jugador, @PathVariable("id") Long jugadorId) {
        return jugadorService.updateJugador(jugador, jugadorId);

    }

}
