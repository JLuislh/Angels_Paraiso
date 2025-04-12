/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Meseros;

import Inicio.*;
import BDclass.BDConexion;
import ClassAngels.MesasClass;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */
public final class MesasMeseros extends javax.swing.JFrame {

    int id_mesa;
    int orden;

    /**
     * Creates new form Mesas
     */
    public MesasMeseros(int ord) {
        initComponents();
        this.orden = ord;
        setLocationRelativeTo(null);
        habilitartodo();
        disponibilidad(false);
    }

    public void habilitartodo() {
        Mesa1.setEnabled(true);
        Mesa2.setEnabled(true);
        Mesa3.setEnabled(true);
        Mesa4.setEnabled(true);
        Mesa5.setEnabled(true);
        Mesa6.setEnabled(true);
        Mesa7.setEnabled(true);
        Mesa8.setEnabled(true);
        Mesa9.setEnabled(true);
        Mesa10.setEnabled(true);
        Mesa11.setEnabled(true);
        Mesa12.setEnabled(true);
        Mesa13.setEnabled(true);
        Mesa14.setEnabled(true);
        Mesa15.setEnabled(true);
        Mesa16.setEnabled(true);
        Mesa17.setEnabled(true);
        Mesa18.setEnabled(true);
        Mesa19.setEnabled(true);
        Mesa20.setEnabled(true);
        Mesa21.setEnabled(true);
        Mesa22.setEnabled(true);
        Mesa23.setEnabled(true);
        Mesa24.setEnabled(true);
        Mesa25.setEnabled(true);
        Mesa26.setEnabled(true);
        Mesa27.setEnabled(true);
        Mesa28.setEnabled(true);
        Mesa29.setEnabled(true);
        Mesa30.setEnabled(true);
        Mesa31.setEnabled(true);
        Mesa1.setBackground(Color.GREEN);
        Mesa2.setBackground(Color.GREEN);
        Mesa3.setBackground(Color.GREEN);
        Mesa4.setBackground(Color.GREEN);
        Mesa5.setBackground(Color.GREEN);
        Mesa6.setBackground(Color.GREEN);
        Mesa7.setBackground(Color.GREEN);
        Mesa8.setBackground(Color.GREEN);
        Mesa9.setBackground(Color.GREEN);
        Mesa10.setBackground(Color.GREEN);
        Mesa11.setBackground(Color.GREEN);
        Mesa12.setBackground(Color.GREEN);
        Mesa13.setBackground(Color.GREEN);
        Mesa14.setBackground(Color.GREEN);
        Mesa15.setBackground(Color.GREEN);
        Mesa16.setBackground(Color.GREEN);
        Mesa17.setBackground(Color.GREEN);
        Mesa18.setBackground(Color.GREEN);
        Mesa19.setBackground(Color.GREEN);
        Mesa20.setBackground(Color.GREEN);
        Mesa21.setBackground(Color.GREEN);
        Mesa22.setBackground(Color.GREEN);
        Mesa23.setBackground(Color.GREEN);
        Mesa24.setBackground(Color.GREEN); 
        Mesa25.setBackground(Color.GREEN);
        Mesa26.setBackground(Color.GREEN);
        Mesa27.setBackground(Color.GREEN);
        Mesa28.setBackground(Color.GREEN);
        Mesa29.setBackground(Color.GREEN);
        Mesa30.setBackground(Color.GREEN);
        Mesa31.setBackground(Color.GREEN);
            
            
    }

    public void disponibilidad(boolean a) {
        ArrayList<MesasClass> result = MesasClass.ListaMesas();
        for (int i = 0; i < result.size(); i++) {
            //Añadir cada elemento del ArrayList en el modelo de la lista
            //String a = "Mesa"+result.get(i).getMesa()= setEnabled(true);
            String b = result.get(i).getMesa();
            if ("MESA1".equals(b)) {
                Mesa1.setEnabled(a);
                Mesa1.setBackground(Color.red);
            } else if ("MESA2".equals(b)) {
                Mesa2.setEnabled(a);
                Mesa2.setBackground(Color.red);
            } else if ("MESA3".equals(b)) {
                Mesa3.setEnabled(a);
                Mesa3.setBackground(Color.red);
            } else if ("MESA4".equals(b)) {
                Mesa4.setEnabled(a);
                Mesa4.setBackground(Color.red);
            } else if ("MESA5".equals(b)) {
                Mesa5.setEnabled(a);
                Mesa5.setBackground(Color.red);
            } else if ("MESA6".equals(b)) {
                Mesa6.setEnabled(a);
                Mesa6.setBackground(Color.red);
            } else if ("MESA7".equals(b)) {
                Mesa7.setEnabled(a);
                Mesa7.setBackground(Color.red);
            } else if ("MESA8".equals(b)) {
                Mesa8.setEnabled(a);
                Mesa8.setBackground(Color.red);
            } else if ("MESA9".equals(b)) {
                Mesa9.setEnabled(a);
                Mesa9.setBackground(Color.red);
            } else if ("MESA10".equals(b)) {
                Mesa10.setEnabled(a);
                Mesa10.setBackground(Color.red);
            } else if ("MESA11".equals(b)) {
                Mesa11.setEnabled(a);
                Mesa11.setBackground(Color.red);
            } else if ("MESA12".equals(b)) {
                Mesa12.setEnabled(a);
                Mesa12.setBackground(Color.red);
            } else if ("MESA13".equals(b)) {
                Mesa13.setEnabled(a);
                Mesa13.setBackground(Color.red);
            } else if ("MESA14".equals(b)) {
                Mesa14.setEnabled(a);
                Mesa14.setBackground(Color.red);
            } else if ("MESA15".equals(b)) {
                Mesa15.setEnabled(a);
                Mesa15.setBackground(Color.red);
            } else if ("MESA16".equals(b)) {
                Mesa16.setEnabled(a);
                Mesa16.setBackground(Color.red);
            } else if ("MESA17".equals(b)) {
                Mesa17.setEnabled(a);
                Mesa17.setBackground(Color.red);
            } else if ("MESA18".equals(b)) {
                Mesa18.setEnabled(a);
                Mesa18.setBackground(Color.red);
            } else if ("MESA19".equals(b)) {
                Mesa19.setEnabled(a);
                Mesa19.setBackground(Color.red);
            } else if ("MESA20".equals(b)) {
                Mesa20.setEnabled(a);
                Mesa20.setBackground(Color.red);
            }else if ("MESA21".equals(b)) {
                Mesa21.setEnabled(a);
                Mesa21.setBackground(Color.red);
            }else if ("MESA22".equals(b)) {
                Mesa22.setEnabled(a);
                Mesa22.setBackground(Color.red);
            }else if ("MESA23".equals(b)) {
                Mesa23.setEnabled(a);
                Mesa23.setBackground(Color.red);
            }else if ("MESA24".equals(b)) {
                Mesa24.setEnabled(a);
                Mesa24.setBackground(Color.red);
            }else if ("MESA25".equals(b)) {
                Mesa25.setEnabled(a);
                Mesa25.setBackground(Color.red);
            }else if ("MESA26".equals(b)) {
                Mesa26.setEnabled(a);
                Mesa26.setBackground(Color.red);
            }else if ("MESA27".equals(b)) {
                Mesa27.setEnabled(a);
                Mesa27.setBackground(Color.red);
            }else if ("MESA28".equals(b)) {
                Mesa28.setEnabled(a);
                Mesa28.setBackground(Color.red);
            }else if ("MESA29".equals(b)) {
                Mesa29.setEnabled(a);
                Mesa29.setBackground(Color.red);
            }else if ("MESA30".equals(b)) {
                Mesa30.setEnabled(a);
                Mesa30.setBackground(Color.red);
            }else if ("MESA31".equals(b)) {
                Mesa31.setEnabled(a);
                Mesa31.setBackground(Color.red);
            }
            //System.out.println("MESA " +result.get(i).getMesa());
        }
    }

    public void actualizarmesa() {

        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            PreparedStatement p = null;
            ps = con.prepareStatement("UPDATE MESAS SET ESTADO = 2 WHERE id_mesa =" + id_mesa);
            p = con.prepareStatement("UPDATE ordenes SET id_mesa = "+id_mesa+"  WHERE noorden =" + orden);
            ps.executeUpdate();
            p.executeUpdate();
            con.close();
            ps.close();
            p.close();

        } catch (SQLException e) {
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

        jPanel1 = new javax.swing.JPanel();
        Mesa1 = new ClassAngels.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        Mesa2 = new ClassAngels.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        Mesa3 = new ClassAngels.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        Mesa4 = new ClassAngels.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        Mesa5 = new ClassAngels.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        Mesa6 = new ClassAngels.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        Mesa7 = new ClassAngels.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        Mesa8 = new ClassAngels.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        Mesa9 = new ClassAngels.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        Mesa10 = new ClassAngels.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        Mesa11 = new ClassAngels.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        Mesa12 = new ClassAngels.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        Mesa13 = new ClassAngels.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        Mesa14 = new ClassAngels.PanelRound();
        jLabel15 = new javax.swing.JLabel();
        Mesa15 = new ClassAngels.PanelRound();
        jLabel16 = new javax.swing.JLabel();
        Mesa16 = new ClassAngels.PanelRound();
        jLabel17 = new javax.swing.JLabel();
        Mesa17 = new ClassAngels.PanelRound();
        jLabel18 = new javax.swing.JLabel();
        Mesa18 = new ClassAngels.PanelRound();
        jLabel19 = new javax.swing.JLabel();
        Mesa19 = new ClassAngels.PanelRound();
        jLabel20 = new javax.swing.JLabel();
        Mesa20 = new ClassAngels.PanelRound();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new ClassAngels.PanelRound();
        jLabel22 = new javax.swing.JLabel();
        Mesa21 = new ClassAngels.PanelRound();
        jLabel23 = new javax.swing.JLabel();
        Mesa22 = new ClassAngels.PanelRound();
        jLabel24 = new javax.swing.JLabel();
        Mesa23 = new ClassAngels.PanelRound();
        jLabel25 = new javax.swing.JLabel();
        Mesa24 = new ClassAngels.PanelRound();
        jLabel26 = new javax.swing.JLabel();
        Mesa25 = new ClassAngels.PanelRound();
        jLabel27 = new javax.swing.JLabel();
        Mesa26 = new ClassAngels.PanelRound();
        jLabel28 = new javax.swing.JLabel();
        Mesa27 = new ClassAngels.PanelRound();
        jLabel29 = new javax.swing.JLabel();
        Mesa28 = new ClassAngels.PanelRound();
        jLabel31 = new javax.swing.JLabel();
        Mesa29 = new ClassAngels.PanelRound();
        jLabel32 = new javax.swing.JLabel();
        Mesa30 = new ClassAngels.PanelRound();
        jLabel33 = new javax.swing.JLabel();
        Mesa31 = new ClassAngels.PanelRound();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 643));

        Mesa1.setBackground(new java.awt.Color(255, 153, 153));
        Mesa1.setRoundBottomLeft(20);
        Mesa1.setRoundBottomRight(20);
        Mesa1.setRoundTopLeft(20);
        Mesa1.setRoundTopRight(20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MESA 1");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa1Layout = new javax.swing.GroupLayout(Mesa1);
        Mesa1.setLayout(Mesa1Layout);
        Mesa1Layout.setHorizontalGroup(
            Mesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa1Layout.setVerticalGroup(
            Mesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa2.setBackground(new java.awt.Color(255, 153, 153));
        Mesa2.setRoundBottomLeft(20);
        Mesa2.setRoundBottomRight(20);
        Mesa2.setRoundTopLeft(20);
        Mesa2.setRoundTopRight(20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MESA 2");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa2Layout = new javax.swing.GroupLayout(Mesa2);
        Mesa2.setLayout(Mesa2Layout);
        Mesa2Layout.setHorizontalGroup(
            Mesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa2Layout.setVerticalGroup(
            Mesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa3.setBackground(new java.awt.Color(255, 153, 153));
        Mesa3.setRoundBottomLeft(20);
        Mesa3.setRoundBottomRight(20);
        Mesa3.setRoundTopLeft(20);
        Mesa3.setRoundTopRight(20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MESA 3");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa3Layout = new javax.swing.GroupLayout(Mesa3);
        Mesa3.setLayout(Mesa3Layout);
        Mesa3Layout.setHorizontalGroup(
            Mesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa3Layout.setVerticalGroup(
            Mesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa4.setBackground(new java.awt.Color(255, 153, 153));
        Mesa4.setRoundBottomLeft(20);
        Mesa4.setRoundBottomRight(20);
        Mesa4.setRoundTopLeft(20);
        Mesa4.setRoundTopRight(20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MESA 4");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa4Layout = new javax.swing.GroupLayout(Mesa4);
        Mesa4.setLayout(Mesa4Layout);
        Mesa4Layout.setHorizontalGroup(
            Mesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa4Layout.setVerticalGroup(
            Mesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa5.setBackground(new java.awt.Color(255, 153, 153));
        Mesa5.setRoundBottomLeft(20);
        Mesa5.setRoundBottomRight(20);
        Mesa5.setRoundTopLeft(20);
        Mesa5.setRoundTopRight(20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MESA 5");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa5Layout = new javax.swing.GroupLayout(Mesa5);
        Mesa5.setLayout(Mesa5Layout);
        Mesa5Layout.setHorizontalGroup(
            Mesa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa5Layout.setVerticalGroup(
            Mesa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa6.setBackground(new java.awt.Color(255, 153, 153));
        Mesa6.setRoundBottomLeft(20);
        Mesa6.setRoundBottomRight(20);
        Mesa6.setRoundTopLeft(20);
        Mesa6.setRoundTopRight(20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MESA 6");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa6Layout = new javax.swing.GroupLayout(Mesa6);
        Mesa6.setLayout(Mesa6Layout);
        Mesa6Layout.setHorizontalGroup(
            Mesa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa6Layout.setVerticalGroup(
            Mesa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa7.setBackground(new java.awt.Color(255, 153, 153));
        Mesa7.setRoundBottomLeft(20);
        Mesa7.setRoundBottomRight(20);
        Mesa7.setRoundTopLeft(20);
        Mesa7.setRoundTopRight(20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MESA 7");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa7Layout = new javax.swing.GroupLayout(Mesa7);
        Mesa7.setLayout(Mesa7Layout);
        Mesa7Layout.setHorizontalGroup(
            Mesa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa7Layout.setVerticalGroup(
            Mesa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa8.setBackground(new java.awt.Color(255, 153, 153));
        Mesa8.setRoundBottomLeft(20);
        Mesa8.setRoundBottomRight(20);
        Mesa8.setRoundTopLeft(20);
        Mesa8.setRoundTopRight(20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MESA 8");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa8Layout = new javax.swing.GroupLayout(Mesa8);
        Mesa8.setLayout(Mesa8Layout);
        Mesa8Layout.setHorizontalGroup(
            Mesa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa8Layout.setVerticalGroup(
            Mesa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa9.setBackground(new java.awt.Color(255, 153, 153));
        Mesa9.setRoundBottomLeft(20);
        Mesa9.setRoundBottomRight(20);
        Mesa9.setRoundTopLeft(20);
        Mesa9.setRoundTopRight(20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MESA 9");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa9Layout = new javax.swing.GroupLayout(Mesa9);
        Mesa9.setLayout(Mesa9Layout);
        Mesa9Layout.setHorizontalGroup(
            Mesa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa9Layout.setVerticalGroup(
            Mesa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa10.setBackground(new java.awt.Color(255, 153, 153));
        Mesa10.setRoundBottomLeft(20);
        Mesa10.setRoundBottomRight(20);
        Mesa10.setRoundTopLeft(20);
        Mesa10.setRoundTopRight(20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("MESA 10");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa10Layout = new javax.swing.GroupLayout(Mesa10);
        Mesa10.setLayout(Mesa10Layout);
        Mesa10Layout.setHorizontalGroup(
            Mesa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa10Layout.setVerticalGroup(
            Mesa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa11.setBackground(new java.awt.Color(255, 153, 153));
        Mesa11.setRoundBottomLeft(20);
        Mesa11.setRoundBottomRight(20);
        Mesa11.setRoundTopLeft(20);
        Mesa11.setRoundTopRight(20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MESA 11");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa11Layout = new javax.swing.GroupLayout(Mesa11);
        Mesa11.setLayout(Mesa11Layout);
        Mesa11Layout.setHorizontalGroup(
            Mesa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa11Layout.setVerticalGroup(
            Mesa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa12.setBackground(new java.awt.Color(255, 153, 153));
        Mesa12.setRoundBottomLeft(20);
        Mesa12.setRoundBottomRight(20);
        Mesa12.setRoundTopLeft(20);
        Mesa12.setRoundTopRight(20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MESA 12");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa12Layout = new javax.swing.GroupLayout(Mesa12);
        Mesa12.setLayout(Mesa12Layout);
        Mesa12Layout.setHorizontalGroup(
            Mesa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa12Layout.setVerticalGroup(
            Mesa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa13.setBackground(new java.awt.Color(255, 153, 153));
        Mesa13.setRoundBottomLeft(20);
        Mesa13.setRoundBottomRight(20);
        Mesa13.setRoundTopLeft(20);
        Mesa13.setRoundTopRight(20);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("MESA 13");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa13Layout = new javax.swing.GroupLayout(Mesa13);
        Mesa13.setLayout(Mesa13Layout);
        Mesa13Layout.setHorizontalGroup(
            Mesa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa13Layout.setVerticalGroup(
            Mesa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa14.setBackground(new java.awt.Color(255, 153, 153));
        Mesa14.setRoundBottomLeft(20);
        Mesa14.setRoundBottomRight(20);
        Mesa14.setRoundTopLeft(20);
        Mesa14.setRoundTopRight(20);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("MESA 14");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa14Layout = new javax.swing.GroupLayout(Mesa14);
        Mesa14.setLayout(Mesa14Layout);
        Mesa14Layout.setHorizontalGroup(
            Mesa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa14Layout.setVerticalGroup(
            Mesa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa15.setBackground(new java.awt.Color(255, 153, 153));
        Mesa15.setRoundBottomLeft(20);
        Mesa15.setRoundBottomRight(20);
        Mesa15.setRoundTopLeft(20);
        Mesa15.setRoundTopRight(20);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("MESA 15");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa15Layout = new javax.swing.GroupLayout(Mesa15);
        Mesa15.setLayout(Mesa15Layout);
        Mesa15Layout.setHorizontalGroup(
            Mesa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa15Layout.setVerticalGroup(
            Mesa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa16.setBackground(new java.awt.Color(255, 153, 153));
        Mesa16.setRoundBottomLeft(20);
        Mesa16.setRoundBottomRight(20);
        Mesa16.setRoundTopLeft(20);
        Mesa16.setRoundTopRight(20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("MESA 16");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa16Layout = new javax.swing.GroupLayout(Mesa16);
        Mesa16.setLayout(Mesa16Layout);
        Mesa16Layout.setHorizontalGroup(
            Mesa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa16Layout.setVerticalGroup(
            Mesa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa17.setBackground(new java.awt.Color(255, 153, 153));
        Mesa17.setRoundBottomLeft(20);
        Mesa17.setRoundBottomRight(20);
        Mesa17.setRoundTopLeft(20);
        Mesa17.setRoundTopRight(20);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("MESA 17");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa17Layout = new javax.swing.GroupLayout(Mesa17);
        Mesa17.setLayout(Mesa17Layout);
        Mesa17Layout.setHorizontalGroup(
            Mesa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa17Layout.setVerticalGroup(
            Mesa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Mesa18.setBackground(new java.awt.Color(255, 153, 153));
        Mesa18.setRoundBottomLeft(20);
        Mesa18.setRoundBottomRight(20);
        Mesa18.setRoundTopLeft(20);
        Mesa18.setRoundTopRight(20);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("MESA 18");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa18Layout = new javax.swing.GroupLayout(Mesa18);
        Mesa18.setLayout(Mesa18Layout);
        Mesa18Layout.setHorizontalGroup(
            Mesa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa18Layout.setVerticalGroup(
            Mesa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Mesa19.setBackground(new java.awt.Color(255, 153, 153));
        Mesa19.setRoundBottomLeft(20);
        Mesa19.setRoundBottomRight(20);
        Mesa19.setRoundTopLeft(20);
        Mesa19.setRoundTopRight(20);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("MESA 19");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa19Layout = new javax.swing.GroupLayout(Mesa19);
        Mesa19.setLayout(Mesa19Layout);
        Mesa19Layout.setHorizontalGroup(
            Mesa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa19Layout.setVerticalGroup(
            Mesa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Mesa20.setBackground(new java.awt.Color(255, 153, 153));
        Mesa20.setRoundBottomLeft(20);
        Mesa20.setRoundBottomRight(20);
        Mesa20.setRoundTopLeft(20);
        Mesa20.setRoundTopRight(20);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("MESA 20");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa20Layout = new javax.swing.GroupLayout(Mesa20);
        Mesa20.setLayout(Mesa20Layout);
        Mesa20Layout.setHorizontalGroup(
            Mesa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa20Layout.setVerticalGroup(
            Mesa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa20Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROL");

        panelRound1.setBackground(new java.awt.Color(255, 255, 0));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("CANCELAR");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Mesa21.setBackground(new java.awt.Color(255, 153, 153));
        Mesa21.setRoundBottomLeft(20);
        Mesa21.setRoundBottomRight(20);
        Mesa21.setRoundTopLeft(20);
        Mesa21.setRoundTopRight(20);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("MESA 21");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa21Layout = new javax.swing.GroupLayout(Mesa21);
        Mesa21.setLayout(Mesa21Layout);
        Mesa21Layout.setHorizontalGroup(
            Mesa21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa21Layout.setVerticalGroup(
            Mesa21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa21Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa22.setBackground(new java.awt.Color(255, 153, 153));
        Mesa22.setRoundBottomLeft(20);
        Mesa22.setRoundBottomRight(20);
        Mesa22.setRoundTopLeft(20);
        Mesa22.setRoundTopRight(20);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("MESA 22");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa22Layout = new javax.swing.GroupLayout(Mesa22);
        Mesa22.setLayout(Mesa22Layout);
        Mesa22Layout.setHorizontalGroup(
            Mesa22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa22Layout.setVerticalGroup(
            Mesa22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa22Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa23.setBackground(new java.awt.Color(255, 153, 153));
        Mesa23.setRoundBottomLeft(20);
        Mesa23.setRoundBottomRight(20);
        Mesa23.setRoundTopLeft(20);
        Mesa23.setRoundTopRight(20);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("MESA 23");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa23Layout = new javax.swing.GroupLayout(Mesa23);
        Mesa23.setLayout(Mesa23Layout);
        Mesa23Layout.setHorizontalGroup(
            Mesa23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa23Layout.setVerticalGroup(
            Mesa23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa23Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa24.setBackground(new java.awt.Color(255, 153, 153));
        Mesa24.setRoundBottomLeft(20);
        Mesa24.setRoundBottomRight(20);
        Mesa24.setRoundTopLeft(20);
        Mesa24.setRoundTopRight(20);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("MESA 24");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa24Layout = new javax.swing.GroupLayout(Mesa24);
        Mesa24.setLayout(Mesa24Layout);
        Mesa24Layout.setHorizontalGroup(
            Mesa24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Mesa24Layout.setVerticalGroup(
            Mesa24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Mesa25.setBackground(new java.awt.Color(255, 153, 153));
        Mesa25.setRoundBottomLeft(20);
        Mesa25.setRoundBottomRight(20);
        Mesa25.setRoundTopLeft(20);
        Mesa25.setRoundTopRight(20);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("MESA 25");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa25Layout = new javax.swing.GroupLayout(Mesa25);
        Mesa25.setLayout(Mesa25Layout);
        Mesa25Layout.setHorizontalGroup(
            Mesa25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa25Layout.setVerticalGroup(
            Mesa25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa25Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa26.setBackground(new java.awt.Color(255, 153, 153));
        Mesa26.setRoundBottomLeft(20);
        Mesa26.setRoundBottomRight(20);
        Mesa26.setRoundTopLeft(20);
        Mesa26.setRoundTopRight(20);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("MESA 26");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa26Layout = new javax.swing.GroupLayout(Mesa26);
        Mesa26.setLayout(Mesa26Layout);
        Mesa26Layout.setHorizontalGroup(
            Mesa26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa26Layout.setVerticalGroup(
            Mesa26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa26Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa27.setBackground(new java.awt.Color(255, 153, 153));
        Mesa27.setRoundBottomLeft(20);
        Mesa27.setRoundBottomRight(20);
        Mesa27.setRoundTopLeft(20);
        Mesa27.setRoundTopRight(20);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("MESA 27");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa27Layout = new javax.swing.GroupLayout(Mesa27);
        Mesa27.setLayout(Mesa27Layout);
        Mesa27Layout.setHorizontalGroup(
            Mesa27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa27Layout.setVerticalGroup(
            Mesa27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa27Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa28.setBackground(new java.awt.Color(255, 153, 153));
        Mesa28.setRoundBottomLeft(20);
        Mesa28.setRoundBottomRight(20);
        Mesa28.setRoundTopLeft(20);
        Mesa28.setRoundTopRight(20);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("MESA 28");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa28Layout = new javax.swing.GroupLayout(Mesa28);
        Mesa28.setLayout(Mesa28Layout);
        Mesa28Layout.setHorizontalGroup(
            Mesa28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa28Layout.setVerticalGroup(
            Mesa28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Mesa29.setBackground(new java.awt.Color(255, 153, 153));
        Mesa29.setRoundBottomLeft(20);
        Mesa29.setRoundBottomRight(20);
        Mesa29.setRoundTopLeft(20);
        Mesa29.setRoundTopRight(20);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("MESA 29");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa29Layout = new javax.swing.GroupLayout(Mesa29);
        Mesa29.setLayout(Mesa29Layout);
        Mesa29Layout.setHorizontalGroup(
            Mesa29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa29Layout.setVerticalGroup(
            Mesa29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Mesa30.setBackground(new java.awt.Color(255, 153, 153));
        Mesa30.setRoundBottomLeft(20);
        Mesa30.setRoundBottomRight(20);
        Mesa30.setRoundTopLeft(20);
        Mesa30.setRoundTopRight(20);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("MESA 30");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa30Layout = new javax.swing.GroupLayout(Mesa30);
        Mesa30.setLayout(Mesa30Layout);
        Mesa30Layout.setHorizontalGroup(
            Mesa30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa30Layout.setVerticalGroup(
            Mesa30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Mesa31.setBackground(new java.awt.Color(255, 153, 153));
        Mesa31.setRoundBottomLeft(20);
        Mesa31.setRoundBottomRight(20);
        Mesa31.setRoundTopLeft(20);
        Mesa31.setRoundTopRight(20);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("MESA 31");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa31Layout = new javax.swing.GroupLayout(Mesa31);
        Mesa31.setLayout(Mesa31Layout);
        Mesa31Layout.setHorizontalGroup(
            Mesa31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa31Layout.setVerticalGroup(
            Mesa31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Mesa9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Mesa17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Mesa25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mesa26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Mesa13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mesa14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mesa15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mesa16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Mesa21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mesa22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mesa23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mesa24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Mesa27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mesa9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Mesa17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mesa18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mesa19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mesa20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mesa22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mesa23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mesa24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Mesa21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Mesa25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mesa26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mesa27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mesa28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mesa29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mesa30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mesa31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(Mesa1.isEnabled()){
        id_mesa = 1;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if(Mesa2.isEnabled()){
        id_mesa = 2;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         if(Mesa3.isEnabled()){
        id_mesa = 3;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(Mesa4.isEnabled()){
        id_mesa = 4;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if(Mesa5.isEnabled()){
        id_mesa = 5;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(Mesa6.isEnabled()){
        id_mesa = 6;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if(Mesa7.isEnabled()){
        id_mesa = 7;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if(Mesa8.isEnabled()){
        id_mesa = 8;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if(Mesa9.isEnabled()){
        id_mesa = 9;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(Mesa10.isEnabled()){
        id_mesa = 10;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if(Mesa11.isEnabled()){
        id_mesa = 11;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if(Mesa12.isEnabled()){
        id_mesa = 12;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if(Mesa13.isEnabled()){
        id_mesa = 13;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if(Mesa14.isEnabled()){
        id_mesa = 14;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if(Mesa15.isEnabled()){
        id_mesa = 15;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        if(Mesa16.isEnabled()){
        id_mesa = 16;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        if(Mesa17.isEnabled()){
        id_mesa = 17;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        if(Mesa18.isEnabled()){
        id_mesa = 18;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        if(Mesa19.isEnabled()){
        id_mesa = 19;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        if(Mesa20.isEnabled()){
        id_mesa = 20;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
          
        try {
            
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps= con.prepareStatement("delete from Ordenes where noorden="+orden);
            ps.executeUpdate();
            con.close();
            ps.close();
            
            
        } catch (SQLException e) { System.out.println("ERRROR ELIMINANDO LA ORDEN EN MESAS"+e);
        }
        OrdenesMeseros F = new OrdenesMeseros();
        F.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
       if(Mesa21.isEnabled()){
        id_mesa = 21;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
       if(Mesa22.isEnabled()){
        id_mesa = 22;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        if(Mesa23.isEnabled()){
        id_mesa = 23;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        if(Mesa24.isEnabled()){
        id_mesa = 24;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        if(Mesa25.isEnabled()){
        id_mesa = 25;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        if(Mesa26.isEnabled()){
        id_mesa = 26;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        if(Mesa27.isEnabled()){
        id_mesa = 27;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
       if(Mesa28.isEnabled()){
        id_mesa = 28;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        if(Mesa29.isEnabled()){
        id_mesa = 29;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        if(Mesa30.isEnabled()){
        id_mesa = 30;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        if(Mesa31.isEnabled()){
        id_mesa = 31;
        actualizarmesa();
        MenuMeseros F = new MenuMeseros(id_mesa,orden);
        F.setVisible(true);
        this.dispose();
        }else{ JOptionPane.showMessageDialog(null, "MESA ESTA EN USO..."); }
    }//GEN-LAST:event_jLabel34MouseClicked

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
            java.util.logging.Logger.getLogger(MesasMeseros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesasMeseros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesasMeseros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesasMeseros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new Mesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ClassAngels.PanelRound Mesa1;
    private ClassAngels.PanelRound Mesa10;
    private ClassAngels.PanelRound Mesa11;
    private ClassAngels.PanelRound Mesa12;
    private ClassAngels.PanelRound Mesa13;
    private ClassAngels.PanelRound Mesa14;
    private ClassAngels.PanelRound Mesa15;
    private ClassAngels.PanelRound Mesa16;
    private ClassAngels.PanelRound Mesa17;
    private ClassAngels.PanelRound Mesa18;
    private ClassAngels.PanelRound Mesa19;
    private ClassAngels.PanelRound Mesa2;
    private ClassAngels.PanelRound Mesa20;
    private ClassAngels.PanelRound Mesa21;
    private ClassAngels.PanelRound Mesa22;
    private ClassAngels.PanelRound Mesa23;
    private ClassAngels.PanelRound Mesa24;
    private ClassAngels.PanelRound Mesa25;
    private ClassAngels.PanelRound Mesa26;
    private ClassAngels.PanelRound Mesa27;
    private ClassAngels.PanelRound Mesa28;
    private ClassAngels.PanelRound Mesa29;
    private ClassAngels.PanelRound Mesa3;
    private ClassAngels.PanelRound Mesa30;
    private ClassAngels.PanelRound Mesa31;
    private ClassAngels.PanelRound Mesa4;
    private ClassAngels.PanelRound Mesa5;
    private ClassAngels.PanelRound Mesa6;
    private ClassAngels.PanelRound Mesa7;
    private ClassAngels.PanelRound Mesa8;
    private ClassAngels.PanelRound Mesa9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private ClassAngels.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
