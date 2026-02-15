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
    private String nombreCLiente;
    @Column
    private String apellidoCliente;
    @Column
    private int carnetCliente;

    public Cliente() {
    }

    public Cliente(long IDCliente, String nombreCLiente, String apellidoCliente, int carnetCliente) {
        this.IDCliente = IDCliente;
        this.nombreCLiente = nombreCLiente;
        this.apellidoCliente = apellidoCliente;
        this.carnetCliente = carnetCliente;
    }

    public long getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(long IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNombreCLiente() {
        return nombreCLiente;
    }

    public void setNombreCLiente(String nombreCLiente) {
        this.nombreCLiente = nombreCLiente;
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
