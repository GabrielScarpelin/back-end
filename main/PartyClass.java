/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class PartyClass {
    public static ArrayList<Users> convidados = new ArrayList<Users>();
    public static void addConvidado(Users user){ //Adiciona o convidado a lista de convidados geral da festa
        boolean haveUser = false;
        for (Users user1 : convidados){ //VERIFICA SE JÁ TEM ESSE NOME NA LISTA
            if (user1.getNome().equalsIgnoreCase(user.getNome())){
                haveUser = true;
            }
        }
        if (!haveUser){
            convidados.add(user);
        }
    }
    public static boolean hasConvidado(Users user){
        boolean haveUser = false;
        for (Users user1 : convidados){ //VERIFICA SE JÁ TEM ESSE NOME NA LISTA
            if (user1.getNome().equalsIgnoreCase(user.getNome())){
                haveUser = true;
            }
        }
        return haveUser;
        
    }
    public static String getCadeiaUsuarios(){ //Função que retorna a cadeia de quem convidou quem
        String strText = "";
        strText = mountChain(convidados.get(0), strText);
        return strText;
    }
    private static String mountChain(Users atualUser, String atualStr){ //UMA FUNÇÃO RECURSIVA QUE SE TIVER CONVIDADO DENTRO DO USUÁRIO ATUAL ELE CHAMA A PRÓPRIA FUNÇÃO PARA REPETIR O PROCESSO. Foi a maneira que encontrei abrir a lista de convidados de usuário por usuário
        int size = atualUser.getUsersInvitedSize() == 0 ? -1 : atualUser.getUsersInvitedSize();
        if (size != -1){
            for (int i = 0; i < size; i++){
                atualStr += " \n "+atualUser.getNome() + "  \n          Convidou: " + atualUser.getConvidadosByThisUserArray().get(i).getNome();
                atualStr = mountChain(atualUser.getConvidadosByThisUserArray().get(i), atualStr);
            }
        }
        return atualStr;
    }

}