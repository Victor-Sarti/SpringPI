package br.senac.SpringPI.repositories;

import br.senac.SpringPI.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AlunoRepository extends JpaRepository <Aluno, Integer> {

}
