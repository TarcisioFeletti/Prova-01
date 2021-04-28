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
public interface Bonus {
    public double calcular(Funcionario funcionario);
    public boolean aceita(Funcionario funcionario);
}
