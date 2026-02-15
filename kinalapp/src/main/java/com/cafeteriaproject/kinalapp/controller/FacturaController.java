package com.cafeteriaproject.kinalapp.controller;

import com.cafeteriaproject.kinalapp.entity.Factura;
import com.cafeteriaproject.kinalapp.repository.FacturaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    private final FacturaRepository repo;

    public FacturaController(FacturaRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Factura> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Factura guardar(@RequestBody Factura factura) {
        return repo.save(factura);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> buscar(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Factura> actualizar(@PathVariable Long id, @RequestBody Factura factura) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        factura.setIdFactura(id);
        return ResponseEntity.ok(repo.save(factura));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}