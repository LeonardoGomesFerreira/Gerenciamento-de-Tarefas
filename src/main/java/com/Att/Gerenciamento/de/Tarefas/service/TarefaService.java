package com.Att.Gerenciamento.de.Tarefas.service;

import com.Att.Gerenciamento.de.Tarefas.entity.Tarefa;
import com.Att.Gerenciamento.de.Tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}