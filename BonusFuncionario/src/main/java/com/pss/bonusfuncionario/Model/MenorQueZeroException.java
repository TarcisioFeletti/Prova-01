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
public class MenorQueZeroException extends Exception{
    @Override
    public String getMessage(){
        return "O valor não pode ser menor que zero";
    }
}
