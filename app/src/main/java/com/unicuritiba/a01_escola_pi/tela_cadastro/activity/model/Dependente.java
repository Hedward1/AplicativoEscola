package com.unicuritiba.a01_escola_pi.tela_cadastro.activity.model;

public class Dependente extends Cadastro {

    private String turma;
    private String idResponsavel;

    public String getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(String idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
