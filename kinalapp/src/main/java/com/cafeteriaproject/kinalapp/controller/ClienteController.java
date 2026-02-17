package com.cafeteriaproject.kinalapp.controller;

import com.cafeteriaproject.kinalapp.entity.Cliente;
import com.cafeteriaproject.kinalapp.repository.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository repo;

    //Constructor de la clase
    public ClienteController(ClienteRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Cliente> listar(){
        return repo.findAll();
    }

    @PostMapping
    public Cliente guardar(@RequestBody Cliente c){
        return repo.save(c);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> actualizar(@PathVariable long id, @RequestBody Cliente cliente){
        if (!repo.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        cliente.setIDCliente(id);
        return ResponseEntity.ok(repo.save(cliente));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente>buscarPorID(@PathVariable long id){
        return repo.findById(id)
                .map(cliente-> ResponseEntity.ok(cliente))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable long id){
        if(!repo.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
