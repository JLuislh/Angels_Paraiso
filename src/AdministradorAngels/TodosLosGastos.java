/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdministradorAngels;

import GastosMayores.GastosParaiso;
import GastosMayores.ListadeGastosParaiso;
import java.awt.BorderLayout;

/**
 *
 * @author jluis
 */
public class TodosLosGastos extends javax.swing.JPanel {

    /**
     * Creates new form TodosLosGastos
     */
    public TodosLosGastos() {
        initComponents();
        String texto1 = "<html><center><body>GASTOS<br>POR<br>DIA</body></center></html>";
        L1.setText(texto1);
        String texto2 = "<html><center><body>LISTA GASTOS<br>MOYORES</body></center></html>";
        L3.setText(texto2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGastos = new javax.swing.JPanel();
        P1 = new ClassAngels.PanelRound();
        L1 = new javax.swing.JLabel();
        P2 = new ClassAngels.PanelRound();
        L2 = new javax.swing.JLabel();
        P3 = new ClassAngels.PanelRound();
        L3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        PanelGastos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelGastosLayout = new javax.swing.GroupLayout(PanelGastos);
        PanelGastos.setLayout(PanelGastosLayout);
        PanelGastosLayout.setHorizontalGroup(
            PanelGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelGastosLayout.setVerticalGroup(
            PanelGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        P1.setBackground(new java.awt.Color(204, 255, 255));
        P1.setRoundBottomLeft(20);
        P1.setRoundBottomRight(20);
        P1.setRoundTopLeft(20);
        P1.setRoundTopRight(20);
        P1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1MouseClicked(evt);
            }
        });

        L1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        L1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1.setText("DIARIOS");

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        P2.setBackground(new java.awt.Color(204, 255, 255));
        P2.setRoundBottomLeft(20);
        P2.setRoundBottomRight(20);
        P2.setRoundTopLeft(20);
        P2.setRoundTopRight(20);

        L2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        L2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L2.setText("GASTOS MAYORES");
        L2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P2Layout.createSequentialGroup()
                .addComponent(L2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        P3.setBackground(new java.awt.Color(204, 255, 255));
        P3.setRoundBottomLeft(20);
        P3.setRoundBottomRight(20);
        P3.setRoundTopLeft(20);
        P3.setRoundTopRight(20);

        L3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        L3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L3.setText("LISTA GASTOS ");
        L3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 749, Short.MAX_VALUE))
            .addComponent(PanelGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void P1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1MouseClicked
        AdGastos op2 = new AdGastos();
        op2.setSize(1164, 508);
        op2.setLocation(0, 0);
        PanelGastos.removeAll();
        PanelGastos.add(op2,BorderLayout.CENTER);
        PanelGastos.revalidate();
        PanelGastos.repaint();
      
    }//GEN-LAST:event_P1MouseClicked

    private void L2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseClicked
        GastosParaiso op2 = new GastosParaiso();
        op2.setSize(1164, 508);
        op2.setLocation(0, 0);
        PanelGastos.removeAll();
        PanelGastos.add(op2,BorderLayout.CENTER);
        PanelGastos.revalidate();
        PanelGastos.repaint();
    }//GEN-LAST:event_L2MouseClicked

    private void L3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseClicked
        ListadeGastosParaiso op2 = new ListadeGastosParaiso();
        op2.setSize(1164, 508);
        op2.setLocation(0, 0);
        PanelGastos.removeAll();
        PanelGastos.add(op2,BorderLayout.CENTER);
        PanelGastos.revalidate();
        PanelGastos.repaint();
    }//GEN-LAST:event_L3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private ClassAngels.PanelRound P1;
    private ClassAngels.PanelRound P2;
    private ClassAngels.PanelRound P3;
    private javax.swing.JPanel PanelGastos;
    // End of variables declaration//GEN-END:variables
}
