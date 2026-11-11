package br.com.barbearia.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Agendamento {
    public enum Status { AGENDADO, CANCELADO, CONCLUIDO }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false, fetch = FetchType.LAZY) private Cliente cliente;
    @ManyToOne(optional = false, fetch = FetchType.LAZY) private Profissional profissional;
    @ManyToOne(optional = false, fetch = FetchType.LAZY) private Servico servico;
    @Column(nullable = false) private LocalDateTime inicio;
    @Column(nullable = false) private LocalDateTime fim;
    @Enumerated(EnumType.STRING) @Column(nullable = false) private Status status = Status.AGENDADO;

    protected Agendamento() {}
    public Agendamento(Cliente cliente, Profissional profissional, Servico servico, LocalDateTime inicio) {
        this.cliente = cliente; this.profissional = profissional; this.servico = servico;
        this.inicio = inicio; this.fim = inicio.plusMinutes(servico.getDuracaoMinutos());
    }
    public Long getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public Profissional getProfissional() { return profissional; }
    public Servico getServico() { return servico; }
    public LocalDateTime getInicio() { return inicio; }
    public LocalDateTime getFim() { return fim; }
    public Status getStatus() { return status; }
    public void cancelar() { this.status = Status.CANCELADO; }
}