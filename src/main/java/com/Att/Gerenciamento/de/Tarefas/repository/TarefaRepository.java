package com.Att.Gerenciamento.de.Tarefas.repository;

import com.Att.Gerenciamento.de.Tarefas.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}