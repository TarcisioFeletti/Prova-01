/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author tarci
 */
public class FuncionarioModel {
    private String nome;
    private int id;
    private int idade;
    private LocalDate admissao;
    private double salarioBase;
    private double salarioFinal;
    private boolean funcionarioDoMes;
    private int numFaltas;
    private String cargo;
    private int bonusGeneroso;
    private ArrayList<HistoricoDeBonus> historicoBonusCollection;

    public FuncionarioModel(String nome, int idade, LocalDate admissao, double salarioBase, 
            boolean funcionarioDoMes, int numFaltas, String cargo, 
            int bonusGeneroso) {
        this.nome = nome;
        this.idade = idade;
        this.admissao = admissao;
        this.salarioBase = salarioBase;
        this.funcionarioDoMes = funcionarioDoMes;
        this.numFaltas = numFaltas;
        this.cargo = cargo;
        this.bonusGeneroso = bonusGeneroso;
        this.historicoBonusCollection = new ArrayList<>();
    }
    
    

    public String getNome() {
        return nome;
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

    public LocalDate getAdmissao() {
        return admissao;
    }  

    public double getSalarioBase() {
        return salarioBase;
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

    public int getBonusGeneroso() {
        return bonusGeneroso;
    }

    public ArrayList<HistoricoDeBonus> getBonusCollection() {
        return historicoBonusCollection;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    
    public void adicionarBonus(HistoricoDeBonus bonus){
        historicoBonusCollection.add(bonus);
    }
    
    
}
