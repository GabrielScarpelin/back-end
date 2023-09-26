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
    private ArrayList<Object> convidadosByThisUser;
    private String convidadorPor;
    public Users(String nome, String convidadoPor){
        this.nome = nome;
        this.convidadorPor = convidadoPor;
    }
        
    public String getConvidadoPor(){
        return this.convidadorPor;
    }
    public String getNome(){
        return this.nome;
    }
    public Object addConvidadoByUser(String nome){
        Users NewUser = new Users(nome, this.nome);
        try {
           if (!this.convidadosByThisUser.contains(NewUser) && PartyClass.hasConvidado(NewUser)){
            this.convidadosByThisUser.add(NewUser);
            PartyClass.addConvidado(NewUser);
            } 
        }
        catch (Exception e) {
            System.out.println("Primeiro Usuario");
        }
        return NewUser;
    }
}
