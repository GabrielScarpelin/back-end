/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import View.Calc_GUI;

/**
 *
 * @author gabri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc_GUI().setVisible(true);
            }
        });
        Users Gabriel = new Users("Gabriel Scarpelin", "null"); //CRIANDO O PRIMEIRO USUARIO E EM SEGUIDA O PRIMEIRO CONVIDADO - SERIA O DONO DA FESTA
        PartyClass.addConvidado(Gabriel);
        System.out.println(PartyClass.convidados.get(0).getNome()); //ADICIONANDO CONVIDADOS
        Users carlosAugusto = Gabriel.addConvidadoByUser("Carlos Augusto");        
        Users cabral = Gabriel.addConvidadoByUser("Cabral Augusto");
        Users lucas = cabral.addConvidadoByUser("Lucas Augusto");
        Users semnome = lucas.addConvidadoByUser("SemNome da Silva");
        Users augusto = carlosAugusto.addConvidadoByUser("Augusto Nunes");
        
        
        
        System.out.println(semnome.getInvitedBy()); //IMPRIME QUEM FOI O USUÁRIO QUE CONVIDOU DETERMINADO USUÁRIO
        System.out.println(Gabriel.getConvidadosByThisUserName()); //PEGA OS USUÁRIOS QUE O GABRIEL CONVIDOU
        System.out.println(PartyClass.getCadeiaUsuarios()); //PEGA A "CADEIA" DE CONVITES - QUEM CONVIDOU QUEM
        
        
    }
    
}
