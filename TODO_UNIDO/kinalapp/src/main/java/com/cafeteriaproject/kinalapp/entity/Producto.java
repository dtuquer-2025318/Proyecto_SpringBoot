package com.cafeteriaproject.kinalapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @Column(name = "id_producto")
    private long IDProducto;
    @Column
    private String nombreProducto;
    @Column
    private double precioProducto;
    @Column
    private long StockProducto;

//    @ManyToOne
//    @JoinColumn(name = "id_cliente")
//    private Cliente cliente;
//
//    //Foreign Key → Producto
//    @ManyToOne
//    @JoinColumn(name = "id_producto")
//    private Producto producto;

    public Producto() {
    }

    public Producto(long IDProducto, String nombreProducto, double precioProducto, long stockProducto) {//, Cliente cliente, Producto producto
        this.IDProducto = IDProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        StockProducto = stockProducto;
//        this.cliente = cliente;
//        this.producto = producto;
    }

    public long getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(long IDProducto) {
        this.IDProducto = IDProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public long getStockProducto() {
        return StockProducto;
    }

    public void setStockProducto(long stockProducto) {
        StockProducto = stockProducto;
    }

//    public Cliente getCliente() {
//        return cliente;
//    }
//
//    public void setCliente(Cliente cliente) {
//        this.cliente = cliente;
//    }
//
//    public Producto getProducto() {
//        return producto;
//    }
//
//    public void setProducto(Producto producto) {
//        this.producto = producto;
//    }
}
