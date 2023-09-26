/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

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
                new View.Calc_GUI().setVisible(true);
            }
        });
        
        Users Gabriel = new Users("Gabriel Scarpelin", "null");
        PartyClass.addConvidado(Gabriel);
        Gabriel.addConvidadoByUser("Carlos Augusto");
    }
    
}
