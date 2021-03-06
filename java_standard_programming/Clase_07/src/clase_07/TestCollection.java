/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_07;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author educacionit
 */
public class TestCollection extends javax.swing.JFrame {

    private Map<String,String>listaMapa;
    public TestCollection() {
        initComponents();
        cmbLista.removeAllItems();
        listaMapa = new Lista().getMapa();
        listaMapa.forEach((k,v)->cmbLista.addItem(k));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbLista = new javax.swing.JComboBox<>();
        valor1 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        txtValor3 = new javax.swing.JTextField();
        txtValor4 = new javax.swing.JTextField();
        txtValor5 = new javax.swing.JTextField();
        txtValor6 = new javax.swing.JTextField();
        valor2 = new javax.swing.JLabel();
        valor3 = new javax.swing.JLabel();
        valor4 = new javax.swing.JLabel();
        valor6 = new javax.swing.JLabel();
        valor5 = new javax.swing.JLabel();
        valor7 = new javax.swing.JLabel();
        valor8 = new javax.swing.JLabel();
        valor9 = new javax.swing.JLabel();
        txtValor7 = new javax.swing.JTextField();
        txtValor8 = new javax.swing.JTextField();
        txtValor9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaLista = new javax.swing.JTextArea();
        btnArmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista 1:");

        cmbLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        valor1.setText("Valor 1:");

        txtValor1.setText("viernes");
        txtValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor1ActionPerformed(evt);
            }
        });

        txtValor2.setText("domingo");
        txtValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor2ActionPerformed(evt);
            }
        });

        txtValor3.setText("sabado");
        txtValor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor3ActionPerformed(evt);
            }
        });

        txtValor4.setText("viernes");
        txtValor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor4ActionPerformed(evt);
            }
        });

        txtValor5.setText("martes");
        txtValor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor5ActionPerformed(evt);
            }
        });

        txtValor6.setText("lunes");
        txtValor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor6ActionPerformed(evt);
            }
        });

        valor2.setText("Valor 2:");

        valor3.setText("Valor 3:");

        valor4.setText("Valor 4:");

        valor6.setText("Valor 6:");

        valor5.setText("Valor 5:");

        valor7.setText("Valor 7:");

        valor8.setText("Valor 8:");

        valor9.setText("Valor 9:");

        txtValor7.setText("lunes");
        txtValor7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor7ActionPerformed(evt);
            }
        });

        txtValor8.setText("juevs");
        txtValor8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor8ActionPerformed(evt);
            }
        });

        txtValor9.setText("miercoles");
        txtValor9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor9ActionPerformed(evt);
            }
        });

        txaLista.setColumns(20);
        txaLista.setRows(5);
        jScrollPane1.setViewportView(txaLista);

        btnArmar.setText("Armar Lista");
        btnArmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(valor1)
                    .addComponent(valor2)
                    .addComponent(valor3)
                    .addComponent(valor4)
                    .addComponent(valor6)
                    .addComponent(valor5)
                    .addComponent(valor7)
                    .addComponent(valor8)
                    .addComponent(valor9))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtValor8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbLista, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValor2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(txtValor3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(txtValor4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(txtValor5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(txtValor6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(txtValor9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnArmar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(cmbLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(valor1)
                                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtValor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valor2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valor3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addComponent(txtValor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valor4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtValor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valor5)
                                .addGap(18, 18, 18)
                                .addComponent(valor6)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor7)
                            .addComponent(txtValor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor8)
                            .addComponent(txtValor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor9)
                            .addComponent(txtValor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnArmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor1ActionPerformed

    private void txtValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor2ActionPerformed

    private void txtValor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor3ActionPerformed

    private void txtValor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor4ActionPerformed

    private void txtValor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor5ActionPerformed

    private void txtValor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor6ActionPerformed

    private void txtValor7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor7ActionPerformed

    private void txtValor8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor8ActionPerformed

    private void txtValor9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor9ActionPerformed

    private void btnArmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArmarActionPerformed
        // Evento Armar Lista
        Collection col;
        try{
            col = (Collection)Class.forName(
                    listaMapa.get(
                            cmbLista.getSelectedItem().toString())
            ).newInstance();
            col.add(txtValor1.getText());
            col.add(txtValor2.getText());
            col.add(txtValor3.getText());
            col.add(txtValor4.getText());
            col.add(txtValor5.getText());
            col.add(txtValor6.getText());
            col.add(txtValor7.getText());
            col.add(txtValor8.getText());
            col.add(txtValor9.getText());
            txaLista.setText("");
            col.forEach(item->txaLista.append(item+"\n"));
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnArmarActionPerformed

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
            java.util.logging.Logger.getLogger(TestCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestCollection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArmar;
    private javax.swing.JComboBox<String> cmbLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaLista;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    private javax.swing.JTextField txtValor3;
    private javax.swing.JTextField txtValor4;
    private javax.swing.JTextField txtValor5;
    private javax.swing.JTextField txtValor6;
    private javax.swing.JTextField txtValor7;
    private javax.swing.JTextField txtValor8;
    private javax.swing.JTextField txtValor9;
    private javax.swing.JLabel valor1;
    private javax.swing.JLabel valor2;
    private javax.swing.JLabel valor3;
    private javax.swing.JLabel valor4;
    private javax.swing.JLabel valor5;
    private javax.swing.JLabel valor6;
    private javax.swing.JLabel valor7;
    private javax.swing.JLabel valor8;
    private javax.swing.JLabel valor9;
    // End of variables declaration//GEN-END:variables
}
