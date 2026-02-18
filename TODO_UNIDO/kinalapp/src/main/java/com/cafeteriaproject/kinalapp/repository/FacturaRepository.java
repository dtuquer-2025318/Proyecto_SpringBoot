package com.cafeteriaproject.kinalapp.repository;

import com.cafeteriaproject.kinalapp.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura,Long> {
}
