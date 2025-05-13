package edu.ifba.model;
//alterado em manu
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Consulta {
    private UUID id;
    private LocalDateTime data;
    private Boolean retorno;
    private BigDecimal valor;
    private Receita receita;
    private StatusPagamento statusPagamento;
    private StatusConsulta statusConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(UUID id, LocalDateTime data, Boolean retorno, BigDecimal valor, Receita receita,
            StatusPagamento statusPagamento, StatusConsulta statusConsulta, Medico medico, Paciente paciente) {
        this.id = id;
        this.data = data;
        this.retorno = retorno;
        this.valor = valor;
        this.receita = receita;
        this.statusPagamento = statusPagamento;
        this.statusConsulta = statusConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    
    public Consulta() {
    }


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public LocalDateTime getData() {
        return data;
    }


    public void setData(LocalDateTime data) {
        this.data = data;
    }


    public Boolean getRetorno() {
        return retorno;
    }


    public void setRetorno(Boolean retorno) {
        this.retorno = retorno;
    }


    public BigDecimal getValor() {
        return valor;
    }


    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }


    public Receita getReceita() {
        return receita;
    }


    public void setReceita(Receita receita) {
        this.receita = receita;
    }


    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }


    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }


    public StatusConsulta getStatusConsulta() {
        return statusConsulta;
    }


    public void setStatusConsulta(StatusConsulta statusConsulta) {
        this.statusConsulta = statusConsulta;
    }


    public Medico getMedico() {
        return medico;
    }


    public void setMedico(Medico medico) {
        this.medico = medico;
    }


    public Paciente getPaciente() {
        return paciente;
    }


    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
