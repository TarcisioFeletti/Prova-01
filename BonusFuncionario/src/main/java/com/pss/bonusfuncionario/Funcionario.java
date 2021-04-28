/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario;

/**
 *
 * @author tarci
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private int numFaltas;
    private int distanciaDoTrabalho;
    private double salarioBase;
    private double salarioFinal;
    private int produtividade;
    
    Funcionario(String nome, String cargo, int numFaltas, int distanciaDoTrabalho, int produtividade, double salarioBase){
        this.nome = nome;
        this.cargo = cargo;
        this.numFaltas = numFaltas;
        this.distanciaDoTrabalho = distanciaDoTrabalho;
        this.salarioBase = salarioBase;
        this.salarioFinal = salarioBase;
        this.produtividade = produtividade;
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

    public int getProdutividade() {
        return produtividade;
    }
    
    

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    
    
}
