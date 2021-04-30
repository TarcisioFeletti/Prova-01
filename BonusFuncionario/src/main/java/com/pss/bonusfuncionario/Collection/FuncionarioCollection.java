/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Collection;

import com.pss.bonusfuncionario.Model.FuncionarioModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tarci
 */
public class FuncionarioCollection {

    private List<FuncionarioModel> funcionarioCollection;
    private static FuncionarioCollection instancia;

    public FuncionarioCollection() {
        funcionarioCollection = new ArrayList<>();
    }

    public static FuncionarioCollection getInstancia() {
        if (instancia == null) {
            instancia = new FuncionarioCollection();
        }
        return instancia;
    }

    public List<FuncionarioModel> getFuncionarioCollection() {
        return funcionarioCollection;
    }

    public void adicinarFuncionario(FuncionarioModel funcionario) {
        funcionario.setId(funcionarioCollection.size());
        funcionarioCollection.add(funcionario);
    }

    public List<FuncionarioModel> lerFuncionario(String nomeFuncionario) {
        List<FuncionarioModel> retornoFuncionarioCollection = new ArrayList<>();
        for (FuncionarioModel funcionario : this.funcionarioCollection) {
            if (funcionario.getNome().equals(nomeFuncionario)) {
                retornoFuncionarioCollection.add(funcionario);
            }
        }
        return retornoFuncionarioCollection;
    }

    public FuncionarioModel lerFuncionario(int id) throws IndexOutOfBoundsException {
        if (funcionarioCollection.isEmpty()) {
            throw new IndexOutOfBoundsException("Lista Vazia");
        } else {
            return funcionarioCollection.get(id);
        }
    }

}
