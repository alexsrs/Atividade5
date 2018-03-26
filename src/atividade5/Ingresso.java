/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade5;

/**
 *
 * @author alexsrs
 */
public abstract class Ingresso {
    private double preco;
    private String data;
    private String setor;

    public Ingresso(double p, String d, String s) {
        this.preco = p;
        this.data = d;
        this.setor = s;
    }

    public double getPreco() {
        return preco;
    }

    public String getData() {
        return data;
    }

    public String getSetor() {
        return setor;
    }

    @Override
    public String toString() {
        return "Ingresso para o dia " + data + " preco : R$ " + preco + " Setor : " + setor;
    }
    
    
}
