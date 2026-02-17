package com.cafeteriaproject.kinalapp.repository;

import com.cafeteriaproject.kinalapp.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
