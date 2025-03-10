package br.senac.SpringPI;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity (name = "Alunos")

public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "RA")
    int ra;

    @Column(name = "Nome")
    String nome;
    LocalDateTime dataCadastro;



}
