
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
public class Users {
    private String nome;
    private ArrayList<Users> convidadosByThisUser = new ArrayList<Users>(); //UTILIZEI O ARRAYLIST POR NÃO TER FIM, DIFERENTE DO ARRAY PADRAO DO JAVA
    private String convidadorPor;
    public Users(String nome, String convidadoPor){ //CONSTRUTOR DA CLASSE
        this.nome = nome;
        this.convidadorPor = convidadoPor;
    }
        
    public String getNome(){
        return this.nome;
    }
    public Users addConvidadoByUser(String nome){ //ADICIONA UM NOVO CONVIDADO PELO OBJETO ATUAL QUE ESTÁ CHAMANDO
        Users NewUser = new Users(nome, this.nome);
        boolean haveUser = false;
        for (Users user1 : convidadosByThisUser){
            if (user1.getNome().equalsIgnoreCase(nome)){
                haveUser = true;
            }
        }
        if (!haveUser){
            this.convidadosByThisUser.add(NewUser);
            PartyClass.convidados.add(NewUser);
            return NewUser;
        } 
        return null;
    }
    public String getInvitedBy(){ //QUEM CONVIDOU O USUÁRIO (OBJETO) ATUAL
        String str = this.nome + " foi convidado por: " + this.convidadorPor;
        return str;
    }
    public String getConvidadosByThisUserName(){ //PEGA O NOME (STRING) DE TODOS OS USUÁRIO QUE ESSE USUÁRIO CONVIDOU
        String nomes = this.getNome() +" convidou ";
        for (Users user : convidadosByThisUser){
            nomes += user.getNome() + ", ";
        }
        return nomes;
    }
    public ArrayList<Users> getConvidadosByThisUserArray(){ //MESMA COISA DO MÉTODO DE CIMA, PORÉM RETORNA O ARRAY E NÃO OS NOMES
        return this.convidadosByThisUser;
    }
    public int getUsersInvitedSize(){ //RETORNA O NÚMERO DE USUÁRIOS QUE ESSE OBJETO CONVIDOU
        return this.convidadosByThisUser.size();
    }
}