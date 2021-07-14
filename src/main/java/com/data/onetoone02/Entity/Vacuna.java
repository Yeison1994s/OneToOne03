package com.data.onetoone02.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Vacuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String marca;

    @OneToOne(mappedBy = "vacuna")
    private Ciudadano ciudadano;

    public Vacuna() {
    }

    public Vacuna(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }
}
