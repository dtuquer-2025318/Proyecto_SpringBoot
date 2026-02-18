package com.cafeteriaproject.kinalapp.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @Column(name = "id_factura")
    private Long idFactura;
    @Column
    private LocalDate fechaFactura;
    @Column
    private double totalFactura;
    @Column
    private String codigoFactura;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    public Factura() {
    }

    public Factura(Long idFactura, LocalDate fechaFactura, double totalFactura, String codigoFactura, Cliente cliente, Producto producto) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.totalFactura = totalFactura;
        this.codigoFactura = codigoFactura;
        this.cliente = cliente;
        this.producto = producto;
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}

