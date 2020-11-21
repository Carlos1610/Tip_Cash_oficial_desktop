/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tip.cash;

import dao.conexao;

/**
 *
 * @author carkk
 */
public class TipCash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       conexao d = new conexao();
        if(d.conecta("143.106.241.3","cl18128","cl18128","cl*21062003")) {
            System.out.println("Conectado");
        }
    }
}
    

