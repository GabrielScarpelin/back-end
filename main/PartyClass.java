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
    private static ArrayList<Object> convidados;
    public static void addConvidado(Object user){
        try{
            if (!convidados.contains(user)){
                convidados.add(user);
            }
        }
        catch (Exception e){
            System.out.println("Primeiro usuario");
        }
    }
    public static boolean hasConvidado(Object user){
        try {
            return convidados.contains(user);
        }
        catch (Exception e) {
            return false;
        }
        
    }
    public static String getFirstInvitedName(){
        return convidados.get(0).toString();
    }
}
