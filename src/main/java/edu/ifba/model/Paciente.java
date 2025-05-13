package edu.ifba.model;

import java.util.List;
import java.util.UUID;

public class Paciente extends Pessoa{
    private String planoSaude;
    private List<Consulta> consultas;
    
    public Paciente(UUID id, String nome, String whatspapp, Genero genero, Endereco endereco, Usuario usuario,
            String planoSaude, List<Consulta> consultas) {
        super(id, nome, whatspapp, genero, endereco, usuario);
        this.planoSaude = planoSaude;
        this.consultas = consultas;
    }
    
    public Paciente() {
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    
}
