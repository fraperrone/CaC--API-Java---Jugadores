
package com.cac.jugador3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long jugadorId;
    private String nombre;
    private int camiseta;
}
