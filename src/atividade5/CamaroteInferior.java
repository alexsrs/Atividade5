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
public class CamaroteInferior extends Vip {
    private String cadeira;
    private double consumacao;

    public CamaroteInferior(String cd, double con, double p, String d, String s, String c) {
        super(p, d, s, c);
        this.cadeira = cd;
        this.consumacao = con;
        setOpenBar(false);
    }

    public String getCadeira() {
        return cadeira;
    }

    public double getConsumacao() {
        return consumacao;
    }

    @Override
    public String toString() {
        return super.toString() + " CamaroteInferior " + "cadeira : " + cadeira + " consumacao : R$ " + consumacao;
    }
    
    
    
}
