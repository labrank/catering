package com.catecaro.entities;

/**
 * Created by jcuau on 13/06/2017.
 */
import com.sun.istack.internal.NotNull;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @NotNull
    private Date fecha;
    @NotNull
    private String tipo;
    @NotNull
    @ManyToMany
    @JoinColumn(name = "menu", referencedColumnName="id")
    private Integer menu;
    @NotNull
    @ManyToMany
    @JoinColumn(name = "cliente", referencedColumnName="id")
    private Integer cliente;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getMenu() {
        return menu;
    }

    public void setMenu(Integer menu) {
        this.menu = menu;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
