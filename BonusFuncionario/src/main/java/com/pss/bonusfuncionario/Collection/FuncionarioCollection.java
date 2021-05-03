/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.bonusfuncionario.Collection;

import com.pss.bonusfuncionario.Model.FuncionarioModel;
import com.pss.bonusfuncionario.Presenter.TelaPrincipalPresenter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tarci
 */
public class FuncionarioCollection {

    private final List<FuncionarioModel> funcionarioCollection;
    private TelaPrincipalPresenter observer;
    private static FuncionarioCollection instancia;

    private FuncionarioCollection() {
        funcionarioCollection = new ArrayList<>();
        observer = TelaPrincipalPresenter.getInstancia();
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
        notificarObservers();
    }

    public List<FuncionarioModel> lerFuncionario(String nomeFuncionario) {
        if (!funcionarioCollection.isEmpty()) {
            List<FuncionarioModel> retornoFuncionarioCollection = new ArrayList<>();
            for (FuncionarioModel funcionario : this.funcionarioCollection) {
                if (funcionario.getNome().contains(nomeFuncionario)) {
                    retornoFuncionarioCollection.add(funcionario);
                }
            }
            return retornoFuncionarioCollection;
        } else {
            throw new IndexOutOfBoundsException("Uai voce não adicionou nada na lista");
        }
    }

    public FuncionarioModel lerFuncionario(int idFuncionario) throws IndexOutOfBoundsException {
        if (!funcionarioCollection.isEmpty()) {
            return funcionarioCollection.get(idFuncionario);
        } else {
            throw new IndexOutOfBoundsException("Uai voce não adicionou nada na lista");
        }
    }

    public List<FuncionarioModel> lerFuncionario(LocalDate dataAdmissao) {
        if (!funcionarioCollection.isEmpty()) {
            List<FuncionarioModel> retornoFuncionarioCollection = new ArrayList<>();
            for (FuncionarioModel funcionario : this.funcionarioCollection) {
                if (funcionario.getAdmissao().equals(dataAdmissao)) {
                    retornoFuncionarioCollection.add(funcionario);
                }
            }
            return retornoFuncionarioCollection;
        } else {
            throw new IndexOutOfBoundsException("Uai voce não adicionou nada na lista");
        }
    }

    public void update(FuncionarioModel funcionario, int idFuncionario) {
        funcionario.setHistoricoBonusCollection(funcionarioCollection.get(idFuncionario).getHistoricoBonusCollection());
        funcionario.calculaSalarioFinal();
        funcionarioCollection.remove(idFuncionario);
        funcionarioCollection.add(idFuncionario, funcionario);
        

    }

    public void excluir(int idFuncionario) {
        funcionarioCollection.remove(idFuncionario);
        for (int i = idFuncionario; i < funcionarioCollection.size(); i++) {
            funcionarioCollection.get(i).setId(i);
        }
        notificarObservers();
    }

    public void notificarObservers() {
        observer.update(funcionarioCollection);
    }

}
