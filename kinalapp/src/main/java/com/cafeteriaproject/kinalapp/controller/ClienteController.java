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

    @PutMapping("/{carnet}")
    public ResponseEntity<Cliente> actualizar(@PathVariable long carnet, @RequestBody Cliente cliente){
        if (!repo.existsById(carnet)){
            return ResponseEntity.notFound().build();
        }
        cliente.setIDCliente(carnet);
        return ResponseEntity.ok(repo.save(cliente));
    }

    @GetMapping("/{carnet}")
    public ResponseEntity<Cliente>buscarPorCarnet(@PathVariable long carnet){
        return repo.findById(carnet).map(cliente-> ResponseEntity.ok(cliente)).orElse(ResponseEntity.notFound().build());
    }

}
