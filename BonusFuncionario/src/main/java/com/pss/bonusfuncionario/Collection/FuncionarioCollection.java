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

    private final List<FuncionarioModel> funcionarioCollection;
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
            if (funcionario.getNome().contains(nomeFuncionario)) {
                retornoFuncionarioCollection.add(funcionario);
            }
        }
        return retornoFuncionarioCollection;
    }

    public FuncionarioModel lerFuncionario(int id) throws IndexOutOfBoundsException {
        if(!funcionarioCollection.isEmpty()){
            return funcionarioCollection.get(id);
        }else{
            throw new IndexOutOfBoundsException("Lista Vazia");
        }
    }
    
    public void update(FuncionarioModel funcionario, int idFuncionario){
        funcionarioCollection.add(idFuncionario, funcionario);
    }
    
    public void excluir(int id){
        funcionarioCollection.remove(id);
        for (int i = id; i < funcionarioCollection.size(); i++){
            funcionarioCollection.get(i).setId(i);
        }
    }

}
