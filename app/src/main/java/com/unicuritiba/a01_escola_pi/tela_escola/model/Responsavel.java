package com.unicuritiba.a01_escola_pi.tela_escola.model;

public class Responsavel {

    private String nomeResponsavel;
    private String tempoRestante;
    private String nomeDependente;
    private String periodoDependente;

    public Responsavel() {
    }

    public Responsavel(String nomeResponsavel, String tempoRestante, String nomeDependente, String periodoDependente) {
        this.nomeResponsavel = nomeResponsavel;
        this.tempoRestante = tempoRestante;
        this.nomeDependente = nomeDependente;
        this.periodoDependente = periodoDependente;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTempoRestante() {
        return tempoRestante;
    }

    public void setTempoRestante(String tempoRestante) {
        this.tempoRestante = tempoRestante;
    }

    public String getNomeDependente() {
        return nomeDependente;
    }

    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    public String getPeriodoDependente() {
        return periodoDependente;
    }

    public void setPeriodoDependente(String periodoDependente) {
        this.periodoDependente = periodoDependente;
    }



}
