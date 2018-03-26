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
public class TestaIngresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ingresso i;
        String sai = "";
        
        Normal normal = new Normal(35.00, "27/03/2016", "1A");
        CamaroteInferior inferior = new CamaroteInferior("38-AS", 100.00, 250.00, "27/03/16", "CM01", "87A");
        CamaroteSuperior superior = new CamaroteSuperior(500.00, "23/04/2018", "CS01", "7FS", "3");
         i = normal;
         sai += i.toString() +"\n";
         
         i = inferior;
         sai += i.toString() +"\n";
         
         i = superior;
         sai += i.toString() +"\n";
         
         System.out.println(sai);
    }
    
}
