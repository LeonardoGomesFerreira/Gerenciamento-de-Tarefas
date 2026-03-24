package com.Att.Gerenciamento.de.Tarefas.controller;

import com.Att.Gerenciamento.de.Tarefas.entity.Tarefa;
import com.Att.Gerenciamento.de.Tarefas.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return service.salvar(tarefa);
    }

    @GetMapping
    public List<Tarefa> listar() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}