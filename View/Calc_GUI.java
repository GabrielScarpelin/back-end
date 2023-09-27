/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author gabri
 */
public class Calc_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Calc_GUI
     */
    public Calc_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelResult = new javax.swing.JLabel();
        limparBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();
        dividirBtn = new javax.swing.JButton();
        seteBtn = new javax.swing.JButton();
        oitoBtn = new javax.swing.JButton();
        noveBtn = new javax.swing.JButton();
        multiplicarBtn = new javax.swing.JButton();
        quatroBtn = new javax.swing.JButton();
        cincoBtn = new javax.swing.JButton();
        seisBtn = new javax.swing.JButton();
        subtrairBtn = new javax.swing.JButton();
        umBtn = new javax.swing.JButton();
        doisBtn = new javax.swing.JButton();
        tresBtn = new javax.swing.JButton();
        somarBtn = new javax.swing.JButton();
        ZeroBtn = new javax.swing.JButton();
        pointBtn = new javax.swing.JButton();
        igualBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelResult.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        labelResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelResult.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelResult, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        limparBtn.setText("C");
        limparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBtnActionPerformed(evt);
            }
        });

        voltarBtn.setText("<");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        dividirBtn.setText("/");
        dividirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirBtnActionPerformed(evt);
            }
        });

        seteBtn.setText("7");
        seteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteBtnActionPerformed(evt);
            }
        });

        oitoBtn.setText("8");
        oitoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoBtnActionPerformed(evt);
            }
        });

        noveBtn.setText("9");
        noveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveBtnActionPerformed(evt);
            }
        });

        multiplicarBtn.setText("X");
        multiplicarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarBtnActionPerformed(evt);
            }
        });

        quatroBtn.setText("4");
        quatroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroBtnActionPerformed(evt);
            }
        });

        cincoBtn.setText("5");
        cincoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoBtnActionPerformed(evt);
            }
        });

        seisBtn.setText("6");
        seisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisBtnActionPerformed(evt);
            }
        });

        subtrairBtn.setText("-");
        subtrairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairBtnActionPerformed(evt);
            }
        });

        umBtn.setText("1");
        umBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umBtnActionPerformed(evt);
            }
        });

        doisBtn.setText("2");
        doisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisBtnActionPerformed(evt);
            }
        });

        tresBtn.setText("3");
        tresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresBtnActionPerformed(evt);
            }
        });

        somarBtn.setText("+");
        somarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somarBtnActionPerformed(evt);
            }
        });

        ZeroBtn.setText("0");
        ZeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroBtnActionPerformed(evt);
            }
        });

        pointBtn.setText(".");
        pointBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointBtnActionPerformed(evt);
            }
        });

        igualBtn.setText("=");
        igualBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(limparBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dividirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voltarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(quatroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oitoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cincoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(multiplicarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtrairBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(umBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(doisBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(ZeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tresBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(pointBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(igualBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(somarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limparBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(voltarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dividirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oitoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplicarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subtrairBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(quatroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cincoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seisBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(umBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doisBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tresBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(somarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ZeroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pointBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(igualBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int stateNum = 0; //Verifica se é o primeiro ou segundo número
    private int operacaoEscolhida ; //0 = soma, 1 = subtração, 2 = multiplicação e 3 = divisão
    private double num1, num2;
    private String atualNumberStr = "";
    private void addNumber(String number){
        this.atualNumberStr = this.atualNumberStr + number;
        try {
            double parsedNumber = Double.parseDouble(this.atualNumberStr);
            labelResult.setText(String.valueOf(parsedNumber));
            if (this.stateNum == 0){
                this.num1 = parsedNumber;
            }
            else {
                this.num2 = parsedNumber;
            }
            
        }
        catch(Exception e){
            System.out.print("Not a number");
        }
    }
    private void seisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisBtnActionPerformed
        // TODO add your handling code here:
        addNumber("6");
    }//GEN-LAST:event_seisBtnActionPerformed

    private void ZeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroBtnActionPerformed
        // TODO add your handling code here:
        addNumber("0");
    }//GEN-LAST:event_ZeroBtnActionPerformed

    private void umBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umBtnActionPerformed
        // TODO add your handling code here:
        addNumber("1");
        
    }//GEN-LAST:event_umBtnActionPerformed

    private void doisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisBtnActionPerformed
        // TODO add your handling code here:
        addNumber("2");
        
    }//GEN-LAST:event_doisBtnActionPerformed

    private void tresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresBtnActionPerformed
        // TODO add your handling code here:
        addNumber("3");
        
    }//GEN-LAST:event_tresBtnActionPerformed

    private void quatroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroBtnActionPerformed
        // TODO add your handling code here:
        addNumber("4");
        
    }//GEN-LAST:event_quatroBtnActionPerformed

    private void cincoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoBtnActionPerformed
        // TODO add your handling code here:
        addNumber("5");
        
    }//GEN-LAST:event_cincoBtnActionPerformed

    private void seteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteBtnActionPerformed
        // TODO add your handling code here:
        addNumber("7");
    }//GEN-LAST:event_seteBtnActionPerformed

    private void oitoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoBtnActionPerformed
        // TODO add your handling code here:
        addNumber("8");
    }//GEN-LAST:event_oitoBtnActionPerformed

    private void noveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveBtnActionPerformed
        // TODO add your handling code here:
        addNumber("9");
    }//GEN-LAST:event_noveBtnActionPerformed

    private void pointBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointBtnActionPerformed
        // TODO add your handling code here:
        if (!this.atualNumberStr.contains(".")){
            addNumber(".");
        }
    }//GEN-LAST:event_pointBtnActionPerformed

    private void limparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBtnActionPerformed
        // TODO add your handling code here:
        this.operacaoEscolhida = 0;
        this.stateNum = 0; //Verifica se é o primeiro ou segundo número
        this.atualNumberStr = "";
    }//GEN-LAST:event_limparBtnActionPerformed

    private void igualBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualBtnActionPerformed
        // TODO add your handling code here:
        if (this.operacaoEscolhida == 0 && stateNum == 1){
            labelResult.setText(String.valueOf(Controller.Operacoes.somar(this.num1, this.num2)));
        }
        else if (this.operacaoEscolhida == 1 && stateNum == 1){
            labelResult.setText(String.valueOf(Controller.Operacoes.subtrair(this.num1, this.num2)));
        }
        else if (this.operacaoEscolhida == 2 && stateNum == 1){
            labelResult.setText(String.valueOf(Controller.Operacoes.multiplicar(this.num1, this.num2)));
        }
        else if (this.operacaoEscolhida == 3 && stateNum == 1){
            labelResult.setText(String.valueOf(Controller.Operacoes.dividir(this.num1, this.num2)));
        }
    }//GEN-LAST:event_igualBtnActionPerformed

    private void somarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somarBtnActionPerformed
        // TODO add your handling code here:
        this.operacaoEscolhida = 0;
        this.stateNum = 1;
        this.atualNumberStr = "";
    }//GEN-LAST:event_somarBtnActionPerformed

    private void subtrairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrairBtnActionPerformed
        // TODO add your handling code here:
        this.operacaoEscolhida = 1;
        this.stateNum = 1;
        this.atualNumberStr = "";
        labelResult.setText("");
    }//GEN-LAST:event_subtrairBtnActionPerformed

    private void multiplicarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarBtnActionPerformed
        // TODO add your handling code here:
        this.operacaoEscolhida = 2;
        this.stateNum = 1;
        this.atualNumberStr = "";
        labelResult.setText("");
    }//GEN-LAST:event_multiplicarBtnActionPerformed

    private void dividirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirBtnActionPerformed
        // TODO add your handling code here:
        this.operacaoEscolhida = 3;
        this.stateNum = 1;
        this.atualNumberStr = "";
        labelResult.setText("");
    }//GEN-LAST:event_dividirBtnActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        // TODO add your handling code here:
        this.atualNumberStr = this.atualNumberStr.substring(0, this.atualNumberStr.length() - 1);
        try {
            double parsedNumber = Double.parseDouble(this.atualNumberStr);
            labelResult.setText(String.valueOf(parsedNumber));
            if (this.stateNum == 0){
                this.num1 = parsedNumber;
            }
            else {
                this.num2 = parsedNumber;
            }
            
        }
        catch(Exception e){
            System.out.print("Not a number");
        }
    }//GEN-LAST:event_voltarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ZeroBtn;
    private javax.swing.JButton cincoBtn;
    private javax.swing.JButton dividirBtn;
    private javax.swing.JButton doisBtn;
    private javax.swing.JButton igualBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelResult;
    private javax.swing.JButton limparBtn;
    private javax.swing.JButton multiplicarBtn;
    private javax.swing.JButton noveBtn;
    private javax.swing.JButton oitoBtn;
    private javax.swing.JButton pointBtn;
    private javax.swing.JButton quatroBtn;
    private javax.swing.JButton seisBtn;
    private javax.swing.JButton seteBtn;
    private javax.swing.JButton somarBtn;
    private javax.swing.JButton subtrairBtn;
    private javax.swing.JButton tresBtn;
    private javax.swing.JButton umBtn;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
