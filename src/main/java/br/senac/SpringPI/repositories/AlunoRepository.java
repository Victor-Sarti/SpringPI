package br.senac.SpringPI.repositories;

import br.senac.SpringPI.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
