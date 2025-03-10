package br.senac.SpringPI.entities;

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

    public Aluno(int ra, String nome, LocalDateTime dataCadastro) {
        this.ra = ra;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }
    public Aluno(String nome, LocalDateTime dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    public Aluno() {
    }
}
