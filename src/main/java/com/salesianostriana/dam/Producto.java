package com.salesianostriana.dam;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String descripción;
    private String categoria;
    private double pvp;

    public Producto(String nombre, String descripción, String categoria, double pvp) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.categoria = categoria;
        this.pvp = pvp;
    }
}
