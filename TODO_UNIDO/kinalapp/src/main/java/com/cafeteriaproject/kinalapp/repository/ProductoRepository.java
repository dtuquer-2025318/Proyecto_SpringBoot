package com.cafeteriaproject.kinalapp.repository;

import com.cafeteriaproject.kinalapp.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
