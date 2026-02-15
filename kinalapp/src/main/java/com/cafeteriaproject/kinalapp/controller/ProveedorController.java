package com.cafeteriaproject.kinalapp.controller;

import com.cafeteriaproject.kinalapp.entity.Proveedor;
import com.cafeteriaproject.kinalapp.repository.ProveedorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

    private final ProveedorRepository repo;

    public ProveedorController(ProveedorRepository repo){
        this.repo = repo ;
    }

    //listar proveedor Get
    @GetMapping
    public List<Proveedor> listar(){
        return repo.findAll();
    }

    //guardar proveedor post
    @PostMapping
    public Proveedor guardar(@RequestBody Proveedor p ){
        return repo.save(p);
    }

    //actualizar proveedor
    @PutMapping("/{id}")
    public ResponseEntity<Proveedor> actualizar(@PathVariable Long id, @RequestBody Proveedor proveedor){
        if(!repo.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        proveedor.setIdProveedor(id);
        return ResponseEntity.ok(repo.save(proveedor));
    }

    //buscar a los proveedores por su id
    @GetMapping("/{id}")
    public ResponseEntity<Proveedor>buscarPorId(@PathVariable Long id){
        return repo.findById(id)
                .map(proveedor -> ResponseEntity.ok(proveedor))
                .orElse(ResponseEntity.notFound().build() );
    }

    //elimina Proveedor Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
