/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario;

import java.util.ArrayList;

/**
 *
 * @author tarci
 */
public class Main {
    public static void main(String args[]){
        ArrayList<Funcionario> listaFunc = new ArrayList<>();
        ProcessaBonus processadora = new ProcessaBonus();
        
        listaFunc.add(new Funcionario("João", "Programador", 3, 10, 65, 1250.00));
        listaFunc.add(new Funcionario("Fabricio", "Gerente", 6, 100, 80, 2250.00));
        listaFunc.add(new Funcionario("Marcelo", "Programador Senior", 0, 10, 50, 1750.00));
        listaFunc.add(new Funcionario("Murilo", "Programador", 0, 210, 90, 1250.00));
        listaFunc.add(new Funcionario("Tarcisio", "Programador Senior", 0, 210, 100, 1750.00));
        
        processadora.processar(listaFunc.get(0));
        System.out.println("O "+listaFunc.get(0).getCargo()+" "+listaFunc.get(0).getNome()+" tem salário final igual a: "+listaFunc.get(0).getSalarioFinal());
        processadora.processar(listaFunc.get(1));
        System.out.println("O "+listaFunc.get(1).getCargo()+" "+listaFunc.get(1).getNome()+" tem salário final igual a: "+listaFunc.get(1).getSalarioFinal());
        processadora.processar(listaFunc.get(2));
        System.out.println("O "+listaFunc.get(2).getCargo()+" "+listaFunc.get(2).getNome()+" tem salário final igual a: "+listaFunc.get(2).getSalarioFinal());
        processadora.processar(listaFunc.get(3));
        System.out.println("O "+listaFunc.get(3).getCargo()+" "+listaFunc.get(3).getNome()+" tem salário final igual a: "+listaFunc.get(3).getSalarioFinal());
        processadora.processar(listaFunc.get(4));
        System.out.println("O "+listaFunc.get(4).getCargo()+" "+listaFunc.get(4).getNome()+" tem salário final igual a: "+listaFunc.get(4).getSalarioFinal());
    }
}