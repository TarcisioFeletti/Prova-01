/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Model;

import java.time.LocalDate;

/**
 *
 * @author tarci
 */
public class HistoricoDeBonus {
    private double salarioBase;
    private double salarioFinal;
    private int bonusGeneroso;
    private double porcentagemBonusAssiduidade;
    private double porcentagemBonusCargo;
    private double porcentagemBonusTempoDeServico;
    private double porcentagemBonusFuncionarioDoMes;
    private double valorBonusAssiduidade;
    private double valorBonusCargo;
    private double valorBonusTempoDeServico;
    private double valorBonusFuncionarioDoMes;
    private boolean funcionarioDoMes;
    private int numFaltas;
    private String cargo;
    private LocalDate dataDoCalculo;
    private LocalDate admissao;

    public HistoricoDeBonus(double salarioBase, int bonusGeneroso, boolean funcionarioDoMes, 
        int numFaltas, String cargo, LocalDate dataDoCalculo, LocalDate admissao) {
        this.salarioBase = salarioBase;
        this.bonusGeneroso = bonusGeneroso;
        this.funcionarioDoMes = funcionarioDoMes;
        this.numFaltas = numFaltas;
        this.cargo = cargo;
        this.dataDoCalculo = dataDoCalculo;
        this.admissao = admissao;
        valorBonusAssiduidade = 0;
        valorBonusCargo = 0;
        valorBonusFuncionarioDoMes = 0;
        valorBonusTempoDeServico = 0;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public int getBonusGeneroso() {
        return bonusGeneroso;
    }

    public double getPorcentagemBonusAssiduidade() {
        return porcentagemBonusAssiduidade;
    }

    public double getPorcentagemBonusCargo() {
        return porcentagemBonusCargo;
    }

    public double getPorcentagemBonusTempoDeServico() {
        return porcentagemBonusTempoDeServico;
    }

    public double getPorcentagemBonusFuncionarioDoMes() {
        return porcentagemBonusFuncionarioDoMes;
    }

    public boolean isFuncionarioDoMes() {
        return funcionarioDoMes;
    }

    public int getNumFaltas() {
        return numFaltas;
    }

    public String getCargo() {
        return cargo;
    }

    public LocalDate getDataDoCalculo() {
        return dataDoCalculo;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public void setPorcentagemBonusAssiduidade(double porcentagemBonusAssiduidade) {
        this.porcentagemBonusAssiduidade = porcentagemBonusAssiduidade;
    }

    public void setPorcentagemBonusCargo(double porcentagemBonusCargo) {
        this.porcentagemBonusCargo = porcentagemBonusCargo;
    }

    public void setPorcentagemBonusTempoDeServico(double porcentagemBonusTempoDeServico) {
        this.porcentagemBonusTempoDeServico = porcentagemBonusTempoDeServico;
    }

    public void setPorcentagemBonusFuncionarioDoMes(double porcentagemBonusFuncionarioDoMes) {
        this.porcentagemBonusFuncionarioDoMes = porcentagemBonusFuncionarioDoMes;
    }

    public double getValorBonusAssiduidade() {
        return valorBonusAssiduidade;
    }

    public void calcularValorBonusAssiduidade() {
        this.valorBonusAssiduidade = this.porcentagemBonusAssiduidade*this.salarioBase;
    }

    public double getValorBonusCargo() {
        return valorBonusCargo;
    }

    public void calcularValorBonusCargo() {
        this.valorBonusCargo = this.porcentagemBonusCargo*this.salarioBase;
    }

    public double getValorBonusTempoDeServico() {
        return valorBonusTempoDeServico;
    }

    public void calcularValorBonusTempoDeServico() {
        this.valorBonusTempoDeServico = this.porcentagemBonusFuncionarioDoMes*this.salarioBase;
    }

    public double getValorBonusFuncionarioDoMes() {
        return valorBonusFuncionarioDoMes;
    }

    public void calcularValorBonusFuncionarioDoMes() {
        this.valorBonusFuncionarioDoMes = this.porcentagemBonusTempoDeServico*this.salarioBase;
    }
    
    public double somarValorBonus(){
        return this.valorBonusAssiduidade+this.valorBonusCargo+
                this.valorBonusFuncionarioDoMes+this.valorBonusTempoDeServico;
    }
    
    
}
