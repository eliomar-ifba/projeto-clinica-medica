package edu.ifba.model;

import java.util.List;
import java.util.UUID;

public class Medico extends Pessoa{
    String crm;
    List<Especialidade> especialidades;
    List<Consulta> consultas;
    
    public Medico(UUID id, String nome, String whatspapp, Genero genero, Endereco endereco, Usuario usuario, String crm,
    List<Especialidade> especialidades, List<Consulta> consultas) {
        super(id, nome, whatspapp, genero, endereco, usuario);
        this.crm = crm;
        this.especialidades = especialidades;
        this.consultas = consultas;
    }
    public Medico() {
    }
    
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }
    public void setEspecialidades(List<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    

}
