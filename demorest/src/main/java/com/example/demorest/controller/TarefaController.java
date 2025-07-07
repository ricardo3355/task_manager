package com.example.demorest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demorest.model.Tarefa;
import com.example.demorest.repository.TarefaRepository;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaRepository repository;

    public TarefaController(TarefaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Tarefa> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> findById(@PathVariable Long id) {
        return repository.findById(id)
                .map(tarefa -> ResponseEntity.ok().body(tarefa))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tarefa create(@RequestBody Tarefa tarefa) {
        return repository.save(tarefa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> update(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setNome(tarefa.getNome());
                    existing.setDataEntrega(tarefa.getDataEntrega());
                    existing.setResponsavel(tarefa.getResponsavel());
                    Tarefa updated = repository.save(existing);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return repository.findById(id)
                .map(tarefa -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().<Void>build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
