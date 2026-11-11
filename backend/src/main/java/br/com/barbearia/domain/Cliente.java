package br.com.barbearia.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank private String nome;
    @NotBlank private String telefone;
    @Email private String email;

    protected Cliente() {}
    public Cliente(String nome, String telefone, String email) {
        this.nome = nome; this.telefone = telefone; this.email = email;
    }
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
}