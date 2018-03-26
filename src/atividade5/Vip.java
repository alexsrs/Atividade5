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
public abstract class Vip extends Ingresso {
    private boolean openBar;
    private String camarote;

    public Vip(double p, String d, String s, String c) {
        super(p, d, s);
        this.camarote = c;
    }

    public boolean isOpenBar() {
        return openBar;
    }

    public String getCamarote() {
        return camarote;
    }

    @Override
    public String toString() {
        return super.toString() + " Vip " + "openBar : " + openBar + " camarote : " + camarote;
    }

    public void setOpenBar(boolean openBar) {
        this.openBar = openBar;
    }

   
    
    
    
}
