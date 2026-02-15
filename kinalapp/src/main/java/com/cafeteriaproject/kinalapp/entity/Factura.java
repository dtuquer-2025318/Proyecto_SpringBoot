package com.cafeteriaproject.kinalapp.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_factura")
    private Long idFactura;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "total")
    private double total;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Factura() {
    }

    public Factura(Long idFactura, LocalDate fecha, double total, Cliente cliente) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.total = total;
        this.cliente = cliente;
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
