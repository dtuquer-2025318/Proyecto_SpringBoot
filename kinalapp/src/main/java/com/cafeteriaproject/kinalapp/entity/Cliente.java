package com.cafeteriaproject.kinalapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @Column(name = "id_cliente")
    private long IDCliente;
    @Column
    private String nombreCliente;
    @Column
    private String apellidoCliente;
    @Column
    private int carnetCliente;

    public Cliente() {
    }

    public Cliente(long IDCliente, String nombreCliente, String apellidoCliente, int carnetCliente) {
        this.IDCliente = IDCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.carnetCliente = carnetCliente;
    }

    public long getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(long IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getCarnetCliente() {
        return carnetCliente;
    }

    public void setCarnetCliente(int carnetCliente) {
        this.carnetCliente = carnetCliente;
    }
}
