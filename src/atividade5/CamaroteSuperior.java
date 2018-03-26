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
public class CamaroteSuperior extends Vip {
    private String sala;

    public CamaroteSuperior(double p, String d, String s, String c, String sl) {
        super(p, d, s, c);
        this.sala = sl;
        setOpenBar(true);
    }

    public String getSala() {
        return sala;
    }

    @Override
    public String toString() {
        return super.toString() + " CamaroteSuperior " + "sala : " + sala;
    }
    
    
    
}
