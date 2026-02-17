package com.cafeteriaproject.kinalapp.entity;

import jakarta.persistence.*;

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

    //@ManyToOne
    //@JoinColumn(name = "id_Factura")
    //private Factura factura;

    //@ManyToOne
    //@JoinColusmn(name = "id_cliente")
    //@JoinColumn Cliente cliente;

    //@ManyToOne
    //@JoinColumn(name = "id_proveedor")
    //private Proveedor proveedor;

    public Producto() {
    }

    public Producto(long IDProducto, String nombreProducto, double precioProducto, long stockProducto) {
        this.IDProducto = IDProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        StockProducto = stockProducto;
        //this.proveedor = proveedor;
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

    //public Proveedor getProveedor() {
        //return proveedor;
    //}

    //public void setProveedor(Proveedor proveedor) {
    //    this.proveedor = proveedor;
   // }
}
