package br.com.barbearia.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Profissional {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank private String nome;

    protected Profissional() {}
    public Profissional(String nome) { this.nome = nome; }
    public Long getId() { return id; }
    public String getNome() { return nome; }
}