/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desas_gui;

import java.util.ArrayList;

/**
 *
 * @author Baiba
 */
public class Game extends javax.swing.JPanel {

    boolean Player;
    boolean match;
    String value;
    int turns;

    public Game() {
        initComponents();
        value = "X";
        Player = true;
        match = false;
        infoPlayer.setText("Player:  " + value);
        infoTurns.setText("Turns left: " + 9);
        turns = 9;
    }

    private void setSymbol() {
        if (!match && turns > 0) {
            if (Player) {
                value = "X";
                infoPlayer.setText("Player:  O");
                infoTurns.setText("Turns left: " + (turns - 1));
            } else {
                value = "O";
                infoPlayer.setText("Player:  X");
                infoTurns.setText("Turns left: " + (turns - 1));
                if (match) {
                    infoPlayer.setText("oooo");
                }
            }
            Player = !Player;
            turns--;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b0 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        infoPlayer = new javax.swing.JLabel();
        infoTurns = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        b0.setBackground(new java.awt.Color(255, 255, 255));
        b0.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
        b0.setForeground(new java.awt.Color(102, 102, 102));
        b0.setLabel("");
        b0.setMaximumSize(new java.awt.Dimension(80, 80));
        b0.setMinimumSize(new java.awt.Dimension(80, 80));
        b0.setPreferredSize(new java.awt.Dimension(80, 80));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
        b1.setForeground(new java.awt.Color(102, 102, 102));
        b1.setMaximumSize(new java.awt.Dimension(80, 80));
        b1.setMinimumSize(new java.awt.Dimension(80, 80));
        b1.setPreferredSize(new java.awt.Dimension(80, 80));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
        b2.setForeground(new java.awt.Color(102, 102, 102));
        b2.setMaximumSize(new java.awt.Dimension(80, 80));
        b2.setMinimumSize(new java.awt.Dimension(80, 80));
        b2.setPreferredSize(new java.awt.Dimension(80, 80));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
        b3.setForeground(new java.awt.Color(102, 102, 102));
        b3.setMaximumSize(new java.awt.Dimension(80, 80));
        b3.setMinimumSize(new java.awt.Dimension(80, 80));
        b3.setPreferredSize(new java.awt.Dimension(80, 80));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
        b4.setForeground(new java.awt.Color(102, 102, 102));
        b4.setMaximumSize(new java.awt.Dimension(80, 80));
        b4.setMinimumSize(new java.awt.Dimension(80, 80));
        b4.setPreferredSize(new java.awt.Dimension(80, 80));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
        b5.setForeground(new java.awt.Color(102, 102, 102));
        b5.setMaximumSize(new java.awt.Dimension(80, 80));
        b5.setMinimumSize(new java.awt.Dimension(80, 80));
        b5.setPreferredSize(new java.awt.Dimension(80, 80));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
        b6.setForeground(new java.awt.Color(102, 102, 102));
        b6.setMaximumSize(new java.awt.Dimension(80, 80));
        b6.setMinimumSize(new java.awt.Dimension(80, 80));
        b6.setPreferredSize(new java.awt.Dimension(80, 80));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
        b7.setForeground(new java.awt.Color(102, 102, 102));
        b7.setMaximumSize(new java.awt.Dimension(80, 80));
        b7.setMinimumSize(new java.awt.Dimension(80, 80));
        b7.setPreferredSize(new java.awt.Dimension(80, 80));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
        b8.setForeground(new java.awt.Color(102, 102, 102));
        b8.setMaximumSize(new java.awt.Dimension(80, 80));
        b8.setMinimumSize(new java.awt.Dimension(80, 80));
        b8.setPreferredSize(new java.awt.Dimension(80, 80));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        infoPlayer.setFont(new java.awt.Font("Tekton Pro", 1, 22)); // NOI18N
        infoPlayer.setText("Player: ");

        infoTurns.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        infoTurns.setText("Turns:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(infoPlayer)
                    .addComponent(infoTurns))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(infoPlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoTurns)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        if (!match && "".equals(b0.getText())) {
            setSymbol();
            b0.setText(value);
        }
        checkField();
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if (!match && "".equals(b1.getText())) {
            setSymbol();
            b1.setText(value);
        }
        checkField();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if (!match && "".equals(b2.getText())) {
            setSymbol();
            b2.setText(value);
        }
        checkField();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if (!match && "".equals(b3.getText())) {
            setSymbol();
            b3.setText(value);
        }
        checkField();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if (!match && "".equals(b4.getText())) {
            setSymbol();
            b4.setText(value);
        }
        checkField();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (!match && "".equals(b5.getText())) {
            setSymbol();
            b5.setText(value);
        }
        checkField();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if (!match && "".equals(b6.getText())) {
            setSymbol();
            b6.setText(value);
        }
        checkField();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (!match && "".equals(b7.getText())) {
            setSymbol();
            b7.setText(value);
        }
        checkField();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (!match && "".equals(b8.getText())) {
            setSymbol();
            b8.setText(value);
        }
        checkField();
    }//GEN-LAST:event_b8ActionPerformed

    private void checkField() {
        if (b0.getText().equals(b1.getText()) && b0.getText().equals(b2.getText())) {
            if (b0.getText().equals("X") || b0.getText().equals("O")) {
                match = true;
            }
        }
        if (b3.getText().equals(b4.getText()) && b3.getText().equals(b5.getText())) {
            if (b3.getText().equals("X") || b3.getText().equals("O")) {
                match = true;
            }
        }
        if (b6.getText().equals(b7.getText()) && b6.getText().equals(b8.getText())) {
            if (b6.getText().equals("X") || b6.getText().equals("O")) {
                match = true;
            }
        }
        if (b0.getText().equals(b3.getText()) && b0.getText().equals(b6.getText())) {
            if (b0.getText().equals("X") || b0.getText().equals("O")) {
                match = true;
            }
        }
        if (b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText())) {
            if (b1.getText().equals("X") || b1.getText().equals("O")) {
                match = true;
            }
        }
        if (b2.getText().equals(b5.getText()) && b2.getText().equals(b8.getText())) {
            if (b2.getText().equals("X") || b2.getText().equals("O")) {
                match = true;
            }
        }
        if (b0.getText().equals(b4.getText()) && b0.getText().equals(b8.getText())) {
            if (b0.getText().equals("X") || b0.getText().equals("O")) {
                match = true;
            }
        }
        if (b2.getText().equals(b4.getText()) && b2.getText().equals(b6.getText())) {
            if (b2.getText().equals("X") || b2.getText().equals("O")) {
                match = true;
            }
        }
        if (match) {
            infoPlayer.setText("Hurrah! The winner is player: " + value);
        }
        if (turns == 0 && !match) {
            infoPlayer.setText("It's a draw!");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JLabel infoPlayer;
    private javax.swing.JLabel infoTurns;
    // End of variables declaration//GEN-END:variables
}