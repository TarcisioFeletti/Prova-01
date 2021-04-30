/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Model;

/**
 *
 * @author tarci
 */
public class FuncionarioModel {
    private String nome;
    private String cargo;
    private int numFaltas;
    private int distanciaDoTrabalho;
    private double salarioBase;
    private double salarioFinal;
    private int id;
    private int idade;
    private int tempoDeServico;
    private double porcentagemBonusAssiduidade;
    private double porcentagemBonusTempoDeServico;
    private double porcentagemBonusCargo;
    private double porcentagemBonusDistancia;
    
    public FuncionarioModel(String nome, String cargo, int numFaltas, int distanciaDoTrabalho, 
            double salarioBase, int idade, int tempoDeServico){
        this.nome = nome;
        this.cargo = cargo;
        this.numFaltas = numFaltas;
        this.distanciaDoTrabalho = distanciaDoTrabalho;
        this.salarioBase = salarioBase;
        this.salarioFinal = salarioBase;
        this.idade = idade;
        this.tempoDeServico = tempoDeServico;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getNumFaltas() {
        return numFaltas;
    }

    public int getDistanciaDoTrabalho() {
        return distanciaDoTrabalho;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public int getTempoDeServico() {
        return tempoDeServico;
    }

    public double getPorcentagemBonusAssiduidade() {
        return porcentagemBonusAssiduidade;
    }

    public double getPorcentagemBonusTempoDeServico() {
        return porcentagemBonusTempoDeServico;
    }

    public double getPorcentagemBonusCargo() {
        return porcentagemBonusCargo;
    }

    public double getPorcentagemBonusDistancia() {
        return porcentagemBonusDistancia;
    }
    
    
    
    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public void setPorcentagemBonusAssiduidade(double porcentagemBonusAssiduidade) {
        this.porcentagemBonusAssiduidade = porcentagemBonusAssiduidade;
    }

    public void setPorcentagemBonusTempoDeServico(double porcentagemBonusTempoDeServico) {
        this.porcentagemBonusTempoDeServico = porcentagemBonusTempoDeServico;
    }

    public void setPorcentagemBonusCargo(double porcentagemBonusCargo) {
        this.porcentagemBonusCargo = porcentagemBonusCargo;
    }

    public void setPorcentagemBonusDistancia(double porcentagemBonusDistancia) {
        this.porcentagemBonusDistancia = porcentagemBonusDistancia;
    }
    
    
}
