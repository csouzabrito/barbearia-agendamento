package br.com.barbearia.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

@Entity
public class Servico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank private String nome;
    @NotNull @Positive private BigDecimal preco;
    @Min(1) private int duracaoMinutos;

    protected Servico() {}
    public Servico(String nome, BigDecimal preco, int duracaoMinutos) {
        this.nome = nome; this.preco = preco; this.duracaoMinutos = duracaoMinutos;
    }
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public BigDecimal getPreco() { return preco; }
    public int getDuracaoMinutos() { return duracaoMinutos; }
}