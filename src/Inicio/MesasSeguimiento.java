/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import ClassAngels.MesasClass;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */
public final class MesasSeguimiento extends javax.swing.JFrame {

     int id_mesa;
     int noorden;
     int orden1;
     int orden2;
     int orden3;
     int orden4;
     int orden5;
     int orden6;
     int orden7;
     int orden8;
     int orden9;
     int orden10;
     int orden11;
     int orden12;
     int orden13;
     int orden14;
     int orden15;
     int orden16;
     int orden17;
     int orden18;
     int orden19;
     int orden20;
     int orden21;
     int orden22;
     int orden23;
     int orden24;
     int orden25;
     int orden26;
     int orden27;
     int orden28;
     int orden29;
     int orden30;
     int orden31;
     Color Mesas = new Color(255,51,51);

    /**
     * Creates new form Mesas
     */
    public MesasSeguimiento() {
        initComponents();
        setLocationRelativeTo(null);
        habilitartodo();
        disponibilidad(false);
        Etiquetas();
        
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
            String b = result.get(i).getMesa();
            if ("MESA1".equals(b)) {
                Mesa1.setEnabled(a);
                Mesa1.setBackground(Mesas);
                orden1 = result.get(i).getOrden();
            } else if ("MESA2".equals(b)) {
                Mesa2.setEnabled(a);
                Mesa2.setBackground(Mesas);
                orden2 = result.get(i).getOrden();
            } else if ("MESA3".equals(b)) {
                Mesa3.setEnabled(a);
                Mesa3.setBackground(Mesas);
                orden3 = result.get(i).getOrden();
            } else if ("MESA4".equals(b)) {
                Mesa4.setEnabled(a);
                Mesa4.setBackground(Mesas);
                orden4 = result.get(i).getOrden();
            } else if ("MESA5".equals(b)) {
                Mesa5.setEnabled(a);
                Mesa5.setBackground(Mesas);
                orden5 = result.get(i).getOrden();
            } else if ("MESA6".equals(b)) {
                Mesa6.setEnabled(a);
                Mesa6.setBackground(Mesas);
                orden6 = result.get(i).getOrden();
            } else if ("MESA7".equals(b)) {
                Mesa7.setEnabled(a);
                Mesa7.setBackground(Mesas);
                orden7 = result.get(i).getOrden();
            } else if ("MESA8".equals(b)) {
                Mesa8.setEnabled(a);
                Mesa8.setBackground(Mesas);
                orden8 = result.get(i).getOrden();
            } else if ("MESA9".equals(b)) {
                Mesa9.setEnabled(a);
                Mesa9.setBackground(Mesas);
                orden9 = result.get(i).getOrden();
            } else if ("MESA10".equals(b)) {
                Mesa10.setEnabled(a);
                Mesa10.setBackground(Mesas);
                orden10 = result.get(i).getOrden();
            } else if ("MESA11".equals(b)) {
                Mesa11.setEnabled(a);
                Mesa11.setBackground(Mesas);
                orden11 = result.get(i).getOrden();
            } else if ("MESA12".equals(b)) {
                Mesa12.setEnabled(a);
                Mesa12.setBackground(Mesas);
                orden12 = result.get(i).getOrden();
            } else if ("MESA13".equals(b)) {
                Mesa13.setEnabled(a);
                Mesa13.setBackground(Mesas);
                orden13 = result.get(i).getOrden();
            } else if ("MESA14".equals(b)) {
                Mesa14.setEnabled(a);
                Mesa14.setBackground(Mesas);
                orden14 = result.get(i).getOrden();
            } else if ("MESA15".equals(b)) {
                Mesa15.setEnabled(a);
                Mesa15.setBackground(Mesas);
                orden15 = result.get(i).getOrden();
            } else if ("MESA16".equals(b)) {
                Mesa16.setEnabled(a);
                Mesa16.setBackground(Mesas);
                orden16 = result.get(i).getOrden();
            } else if ("MESA17".equals(b)) {
                Mesa17.setEnabled(a);
                Mesa17.setBackground(Mesas);
                orden17 = result.get(i).getOrden();
            } else if ("MESA18".equals(b)) {
                Mesa18.setEnabled(a);
                Mesa18.setBackground(Mesas);
                orden18 = result.get(i).getOrden();
            } else if ("MESA19".equals(b)) {
                Mesa19.setEnabled(a);
                Mesa19.setBackground(Mesas);
                orden19 = result.get(i).getOrden();
            } else if ("MESA20".equals(b)) {
                Mesa20.setEnabled(a);
                Mesa20.setBackground(Mesas);
                orden20 = result.get(i).getOrden();
            } else if ("MESA21".equals(b)) {
                Mesa21.setEnabled(a);
                Mesa21.setBackground(Mesas);
                orden21 = result.get(i).getOrden();
            }else if ("MESA22".equals(b)) {
                Mesa22.setEnabled(a);
                Mesa22.setBackground(Mesas);
                orden22 = result.get(i).getOrden();
            }else if ("MESA23".equals(b)) {
                Mesa23.setEnabled(a);
                Mesa23.setBackground(Mesas);
                orden23 = result.get(i).getOrden();
            }else if ("MESA24".equals(b)) {
                Mesa24.setEnabled(a);
                Mesa24.setBackground(Mesas);
                orden24 = result.get(i).getOrden();
            }else if ("MESA25".equals(b)) {
                Mesa25.setEnabled(a);
                Mesa25.setBackground(Mesas);
                orden25 = result.get(i).getOrden();
            }else if ("MESA26".equals(b)) {
                Mesa26.setEnabled(a);
                Mesa26.setBackground(Mesas);
                orden26 = result.get(i).getOrden();
            }else if ("MESA27".equals(b)) {
                Mesa27.setEnabled(a);
                Mesa27.setBackground(Mesas);
                orden27 = result.get(i).getOrden();
            }else if ("MESA28".equals(b)) {
                Mesa28.setEnabled(a);
                Mesa28.setBackground(Mesas);
                orden28 = result.get(i).getOrden();
            }else if ("MESA29".equals(b)) {
                Mesa29.setEnabled(a);
                Mesa29.setBackground(Mesas);
                orden29 = result.get(i).getOrden();
            }else if ("MESA30".equals(b)) {
                Mesa30.setEnabled(a);
                Mesa30.setBackground(Mesas);
                orden30 = result.get(i).getOrden();
            }else if ("MESA31".equals(b)) {
                Mesa31.setEnabled(a);
                Mesa31.setBackground(Mesas);
                orden31 = result.get(i).getOrden();
            }
            //System.out.println("MESA " +result.get(i).getMesa());
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
        ME1 = new javax.swing.JLabel();
        Mesa2 = new ClassAngels.PanelRound();
        ME2 = new javax.swing.JLabel();
        Mesa3 = new ClassAngels.PanelRound();
        ME3 = new javax.swing.JLabel();
        Mesa4 = new ClassAngels.PanelRound();
        ME4 = new javax.swing.JLabel();
        Mesa5 = new ClassAngels.PanelRound();
        ME5 = new javax.swing.JLabel();
        Mesa6 = new ClassAngels.PanelRound();
        ME6 = new javax.swing.JLabel();
        Mesa7 = new ClassAngels.PanelRound();
        ME7 = new javax.swing.JLabel();
        Mesa8 = new ClassAngels.PanelRound();
        ME8 = new javax.swing.JLabel();
        Mesa9 = new ClassAngels.PanelRound();
        ME9 = new javax.swing.JLabel();
        Mesa10 = new ClassAngels.PanelRound();
        ME10 = new javax.swing.JLabel();
        Mesa11 = new ClassAngels.PanelRound();
        ME11 = new javax.swing.JLabel();
        Mesa12 = new ClassAngels.PanelRound();
        ME12 = new javax.swing.JLabel();
        Mesa13 = new ClassAngels.PanelRound();
        ME13 = new javax.swing.JLabel();
        Mesa14 = new ClassAngels.PanelRound();
        ME14 = new javax.swing.JLabel();
        Mesa15 = new ClassAngels.PanelRound();
        ME15 = new javax.swing.JLabel();
        Mesa16 = new ClassAngels.PanelRound();
        ME16 = new javax.swing.JLabel();
        Mesa17 = new ClassAngels.PanelRound();
        ME17 = new javax.swing.JLabel();
        Mesa18 = new ClassAngels.PanelRound();
        ME18 = new javax.swing.JLabel();
        Mesa19 = new ClassAngels.PanelRound();
        ME19 = new javax.swing.JLabel();
        Mesa20 = new ClassAngels.PanelRound();
        ME20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new ClassAngels.PanelRound();
        jLabel22 = new javax.swing.JLabel();
        Mesa21 = new ClassAngels.PanelRound();
        ME21 = new javax.swing.JLabel();
        Mesa22 = new ClassAngels.PanelRound();
        ME22 = new javax.swing.JLabel();
        Mesa23 = new ClassAngels.PanelRound();
        ME23 = new javax.swing.JLabel();
        Mesa24 = new ClassAngels.PanelRound();
        ME24 = new javax.swing.JLabel();
        Mesa25 = new ClassAngels.PanelRound();
        ME25 = new javax.swing.JLabel();
        Mesa26 = new ClassAngels.PanelRound();
        ME26 = new javax.swing.JLabel();
        Mesa27 = new ClassAngels.PanelRound();
        ME27 = new javax.swing.JLabel();
        Mesa28 = new ClassAngels.PanelRound();
        ME28 = new javax.swing.JLabel();
        Mesa29 = new ClassAngels.PanelRound();
        ME29 = new javax.swing.JLabel();
        Mesa30 = new ClassAngels.PanelRound();
        ME30 = new javax.swing.JLabel();
        Mesa31 = new ClassAngels.PanelRound();
        ME31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 643));

        Mesa1.setBackground(new java.awt.Color(255, 153, 153));
        Mesa1.setRoundBottomLeft(20);
        Mesa1.setRoundBottomRight(20);
        Mesa1.setRoundTopLeft(20);
        Mesa1.setRoundTopRight(20);

        ME1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME1.setText("MESA 1");
        ME1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa1Layout = new javax.swing.GroupLayout(Mesa1);
        Mesa1.setLayout(Mesa1Layout);
        Mesa1Layout.setHorizontalGroup(
            Mesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa1Layout.setVerticalGroup(
            Mesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa2.setBackground(new java.awt.Color(255, 153, 153));
        Mesa2.setRoundBottomLeft(20);
        Mesa2.setRoundBottomRight(20);
        Mesa2.setRoundTopLeft(20);
        Mesa2.setRoundTopRight(20);

        ME2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME2.setText("MESA 2");
        ME2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa2Layout = new javax.swing.GroupLayout(Mesa2);
        Mesa2.setLayout(Mesa2Layout);
        Mesa2Layout.setHorizontalGroup(
            Mesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa2Layout.setVerticalGroup(
            Mesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa3.setBackground(new java.awt.Color(255, 153, 153));
        Mesa3.setRoundBottomLeft(20);
        Mesa3.setRoundBottomRight(20);
        Mesa3.setRoundTopLeft(20);
        Mesa3.setRoundTopRight(20);

        ME3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME3.setText("MESA 3");
        ME3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa3Layout = new javax.swing.GroupLayout(Mesa3);
        Mesa3.setLayout(Mesa3Layout);
        Mesa3Layout.setHorizontalGroup(
            Mesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa3Layout.setVerticalGroup(
            Mesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa4.setBackground(new java.awt.Color(255, 153, 153));
        Mesa4.setRoundBottomLeft(20);
        Mesa4.setRoundBottomRight(20);
        Mesa4.setRoundTopLeft(20);
        Mesa4.setRoundTopRight(20);

        ME4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME4.setText("MESA 4");
        ME4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa4Layout = new javax.swing.GroupLayout(Mesa4);
        Mesa4.setLayout(Mesa4Layout);
        Mesa4Layout.setHorizontalGroup(
            Mesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa4Layout.setVerticalGroup(
            Mesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa5.setBackground(new java.awt.Color(255, 153, 153));
        Mesa5.setRoundBottomLeft(20);
        Mesa5.setRoundBottomRight(20);
        Mesa5.setRoundTopLeft(20);
        Mesa5.setRoundTopRight(20);

        ME5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME5.setText("MESA 5");
        ME5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa5Layout = new javax.swing.GroupLayout(Mesa5);
        Mesa5.setLayout(Mesa5Layout);
        Mesa5Layout.setHorizontalGroup(
            Mesa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa5Layout.setVerticalGroup(
            Mesa5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa6.setBackground(new java.awt.Color(255, 153, 153));
        Mesa6.setRoundBottomLeft(20);
        Mesa6.setRoundBottomRight(20);
        Mesa6.setRoundTopLeft(20);
        Mesa6.setRoundTopRight(20);

        ME6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME6.setText("MESA 6");
        ME6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa6Layout = new javax.swing.GroupLayout(Mesa6);
        Mesa6.setLayout(Mesa6Layout);
        Mesa6Layout.setHorizontalGroup(
            Mesa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa6Layout.setVerticalGroup(
            Mesa6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa7.setBackground(new java.awt.Color(255, 153, 153));
        Mesa7.setRoundBottomLeft(20);
        Mesa7.setRoundBottomRight(20);
        Mesa7.setRoundTopLeft(20);
        Mesa7.setRoundTopRight(20);

        ME7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME7.setText("MESA 7");
        ME7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa7Layout = new javax.swing.GroupLayout(Mesa7);
        Mesa7.setLayout(Mesa7Layout);
        Mesa7Layout.setHorizontalGroup(
            Mesa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa7Layout.setVerticalGroup(
            Mesa7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa8.setBackground(new java.awt.Color(255, 153, 153));
        Mesa8.setRoundBottomLeft(20);
        Mesa8.setRoundBottomRight(20);
        Mesa8.setRoundTopLeft(20);
        Mesa8.setRoundTopRight(20);

        ME8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME8.setText("MESA 8");
        ME8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa8Layout = new javax.swing.GroupLayout(Mesa8);
        Mesa8.setLayout(Mesa8Layout);
        Mesa8Layout.setHorizontalGroup(
            Mesa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa8Layout.setVerticalGroup(
            Mesa8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa9.setBackground(new java.awt.Color(255, 153, 153));
        Mesa9.setRoundBottomLeft(20);
        Mesa9.setRoundBottomRight(20);
        Mesa9.setRoundTopLeft(20);
        Mesa9.setRoundTopRight(20);

        ME9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME9.setText("MESA 9");
        ME9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa9Layout = new javax.swing.GroupLayout(Mesa9);
        Mesa9.setLayout(Mesa9Layout);
        Mesa9Layout.setHorizontalGroup(
            Mesa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa9Layout.setVerticalGroup(
            Mesa9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa10.setBackground(new java.awt.Color(255, 153, 153));
        Mesa10.setRoundBottomLeft(20);
        Mesa10.setRoundBottomRight(20);
        Mesa10.setRoundTopLeft(20);
        Mesa10.setRoundTopRight(20);

        ME10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME10.setText("MESA 10");
        ME10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa10Layout = new javax.swing.GroupLayout(Mesa10);
        Mesa10.setLayout(Mesa10Layout);
        Mesa10Layout.setHorizontalGroup(
            Mesa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa10Layout.setVerticalGroup(
            Mesa10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa11.setBackground(new java.awt.Color(255, 153, 153));
        Mesa11.setRoundBottomLeft(20);
        Mesa11.setRoundBottomRight(20);
        Mesa11.setRoundTopLeft(20);
        Mesa11.setRoundTopRight(20);

        ME11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME11.setText("MESA 11");
        ME11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa11Layout = new javax.swing.GroupLayout(Mesa11);
        Mesa11.setLayout(Mesa11Layout);
        Mesa11Layout.setHorizontalGroup(
            Mesa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa11Layout.setVerticalGroup(
            Mesa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa12.setBackground(new java.awt.Color(255, 153, 153));
        Mesa12.setRoundBottomLeft(20);
        Mesa12.setRoundBottomRight(20);
        Mesa12.setRoundTopLeft(20);
        Mesa12.setRoundTopRight(20);

        ME12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME12.setText("MESA 12");
        ME12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa12Layout = new javax.swing.GroupLayout(Mesa12);
        Mesa12.setLayout(Mesa12Layout);
        Mesa12Layout.setHorizontalGroup(
            Mesa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa12Layout.setVerticalGroup(
            Mesa12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa13.setBackground(new java.awt.Color(255, 153, 153));
        Mesa13.setRoundBottomLeft(20);
        Mesa13.setRoundBottomRight(20);
        Mesa13.setRoundTopLeft(20);
        Mesa13.setRoundTopRight(20);

        ME13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME13.setText("MESA 13");
        ME13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa13Layout = new javax.swing.GroupLayout(Mesa13);
        Mesa13.setLayout(Mesa13Layout);
        Mesa13Layout.setHorizontalGroup(
            Mesa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa13Layout.setVerticalGroup(
            Mesa13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa14.setBackground(new java.awt.Color(255, 153, 153));
        Mesa14.setRoundBottomLeft(20);
        Mesa14.setRoundBottomRight(20);
        Mesa14.setRoundTopLeft(20);
        Mesa14.setRoundTopRight(20);

        ME14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME14.setText("MESA 14");
        ME14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa14Layout = new javax.swing.GroupLayout(Mesa14);
        Mesa14.setLayout(Mesa14Layout);
        Mesa14Layout.setHorizontalGroup(
            Mesa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa14Layout.setVerticalGroup(
            Mesa14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME14, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa15.setBackground(new java.awt.Color(255, 153, 153));
        Mesa15.setRoundBottomLeft(20);
        Mesa15.setRoundBottomRight(20);
        Mesa15.setRoundTopLeft(20);
        Mesa15.setRoundTopRight(20);

        ME15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME15.setText("MESA 15");
        ME15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa15Layout = new javax.swing.GroupLayout(Mesa15);
        Mesa15.setLayout(Mesa15Layout);
        Mesa15Layout.setHorizontalGroup(
            Mesa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa15Layout.setVerticalGroup(
            Mesa15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa16.setBackground(new java.awt.Color(255, 153, 153));
        Mesa16.setRoundBottomLeft(20);
        Mesa16.setRoundBottomRight(20);
        Mesa16.setRoundTopLeft(20);
        Mesa16.setRoundTopRight(20);

        ME16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME16.setText("MESA 16");
        ME16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa16Layout = new javax.swing.GroupLayout(Mesa16);
        Mesa16.setLayout(Mesa16Layout);
        Mesa16Layout.setHorizontalGroup(
            Mesa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa16Layout.setVerticalGroup(
            Mesa16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa17.setBackground(new java.awt.Color(255, 153, 153));
        Mesa17.setRoundBottomLeft(20);
        Mesa17.setRoundBottomRight(20);
        Mesa17.setRoundTopLeft(20);
        Mesa17.setRoundTopRight(20);

        ME17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME17.setText("MESA 17");
        ME17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa17Layout = new javax.swing.GroupLayout(Mesa17);
        Mesa17.setLayout(Mesa17Layout);
        Mesa17Layout.setHorizontalGroup(
            Mesa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME17, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa17Layout.setVerticalGroup(
            Mesa17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME17, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa18.setBackground(new java.awt.Color(255, 153, 153));
        Mesa18.setRoundBottomLeft(20);
        Mesa18.setRoundBottomRight(20);
        Mesa18.setRoundTopLeft(20);
        Mesa18.setRoundTopRight(20);

        ME18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME18.setText("MESA 18");
        ME18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa18Layout = new javax.swing.GroupLayout(Mesa18);
        Mesa18.setLayout(Mesa18Layout);
        Mesa18Layout.setHorizontalGroup(
            Mesa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa18Layout.setVerticalGroup(
            Mesa18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME18, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa19.setBackground(new java.awt.Color(255, 153, 153));
        Mesa19.setRoundBottomLeft(20);
        Mesa19.setRoundBottomRight(20);
        Mesa19.setRoundTopLeft(20);
        Mesa19.setRoundTopRight(20);

        ME19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME19.setText("MESA 19");
        ME19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa19Layout = new javax.swing.GroupLayout(Mesa19);
        Mesa19.setLayout(Mesa19Layout);
        Mesa19Layout.setHorizontalGroup(
            Mesa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME19, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa19Layout.setVerticalGroup(
            Mesa19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME19, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa20.setBackground(new java.awt.Color(255, 153, 153));
        Mesa20.setRoundBottomLeft(20);
        Mesa20.setRoundBottomRight(20);
        Mesa20.setRoundTopLeft(20);
        Mesa20.setRoundTopRight(20);

        ME20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME20.setText("MESA 20");
        ME20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa20Layout = new javax.swing.GroupLayout(Mesa20);
        Mesa20.setLayout(Mesa20Layout);
        Mesa20Layout.setHorizontalGroup(
            Mesa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME20, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa20Layout.setVerticalGroup(
            Mesa20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa20Layout.createSequentialGroup()
                .addComponent(ME20, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
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
        jLabel22.setText("INICIO");
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
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Mesa21.setBackground(new java.awt.Color(255, 153, 153));
        Mesa21.setRoundBottomLeft(20);
        Mesa21.setRoundBottomRight(20);
        Mesa21.setRoundTopLeft(20);
        Mesa21.setRoundTopRight(20);

        ME21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME21.setText("MESA 21");
        ME21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa21Layout = new javax.swing.GroupLayout(Mesa21);
        Mesa21.setLayout(Mesa21Layout);
        Mesa21Layout.setHorizontalGroup(
            Mesa21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME21, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa21Layout.setVerticalGroup(
            Mesa21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa21Layout.createSequentialGroup()
                .addComponent(ME21, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa22.setBackground(new java.awt.Color(255, 153, 153));
        Mesa22.setRoundBottomLeft(20);
        Mesa22.setRoundBottomRight(20);
        Mesa22.setRoundTopLeft(20);
        Mesa22.setRoundTopRight(20);

        ME22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME22.setText("MESA 22");
        ME22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa22Layout = new javax.swing.GroupLayout(Mesa22);
        Mesa22.setLayout(Mesa22Layout);
        Mesa22Layout.setHorizontalGroup(
            Mesa22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME22, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa22Layout.setVerticalGroup(
            Mesa22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa22Layout.createSequentialGroup()
                .addComponent(ME22, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa23.setBackground(new java.awt.Color(255, 153, 153));
        Mesa23.setRoundBottomLeft(20);
        Mesa23.setRoundBottomRight(20);
        Mesa23.setRoundTopLeft(20);
        Mesa23.setRoundTopRight(20);

        ME23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME23.setText("MESA 23");
        ME23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa23Layout = new javax.swing.GroupLayout(Mesa23);
        Mesa23.setLayout(Mesa23Layout);
        Mesa23Layout.setHorizontalGroup(
            Mesa23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME23, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa23Layout.setVerticalGroup(
            Mesa23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa23Layout.createSequentialGroup()
                .addComponent(ME23, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa24.setBackground(new java.awt.Color(255, 153, 153));
        Mesa24.setRoundBottomLeft(20);
        Mesa24.setRoundBottomRight(20);
        Mesa24.setRoundTopLeft(20);
        Mesa24.setRoundTopRight(20);

        ME24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME24.setText("MESA 24");
        ME24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa24Layout = new javax.swing.GroupLayout(Mesa24);
        Mesa24.setLayout(Mesa24Layout);
        Mesa24Layout.setHorizontalGroup(
            Mesa24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME24, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa24Layout.setVerticalGroup(
            Mesa24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa24Layout.createSequentialGroup()
                .addComponent(ME24, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa25.setBackground(new java.awt.Color(255, 153, 153));
        Mesa25.setRoundBottomLeft(20);
        Mesa25.setRoundBottomRight(20);
        Mesa25.setRoundTopLeft(20);
        Mesa25.setRoundTopRight(20);

        ME25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME25.setText("MESA 25");
        ME25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa25Layout = new javax.swing.GroupLayout(Mesa25);
        Mesa25.setLayout(Mesa25Layout);
        Mesa25Layout.setHorizontalGroup(
            Mesa25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME25, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa25Layout.setVerticalGroup(
            Mesa25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa25Layout.createSequentialGroup()
                .addComponent(ME25, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa26.setBackground(new java.awt.Color(255, 153, 153));
        Mesa26.setRoundBottomLeft(20);
        Mesa26.setRoundBottomRight(20);
        Mesa26.setRoundTopLeft(20);
        Mesa26.setRoundTopRight(20);

        ME26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME26.setText("MESA 26");
        ME26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa26Layout = new javax.swing.GroupLayout(Mesa26);
        Mesa26.setLayout(Mesa26Layout);
        Mesa26Layout.setHorizontalGroup(
            Mesa26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME26, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa26Layout.setVerticalGroup(
            Mesa26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa26Layout.createSequentialGroup()
                .addComponent(ME26, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa27.setBackground(new java.awt.Color(255, 153, 153));
        Mesa27.setRoundBottomLeft(20);
        Mesa27.setRoundBottomRight(20);
        Mesa27.setRoundTopLeft(20);
        Mesa27.setRoundTopRight(20);

        ME27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME27.setText("MESA 27");
        ME27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa27Layout = new javax.swing.GroupLayout(Mesa27);
        Mesa27.setLayout(Mesa27Layout);
        Mesa27Layout.setHorizontalGroup(
            Mesa27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME27, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa27Layout.setVerticalGroup(
            Mesa27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa27Layout.createSequentialGroup()
                .addComponent(ME27, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa28.setBackground(new java.awt.Color(255, 153, 153));
        Mesa28.setRoundBottomLeft(20);
        Mesa28.setRoundBottomRight(20);
        Mesa28.setRoundTopLeft(20);
        Mesa28.setRoundTopRight(20);

        ME28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME28.setText("MESA 28");
        ME28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa28Layout = new javax.swing.GroupLayout(Mesa28);
        Mesa28.setLayout(Mesa28Layout);
        Mesa28Layout.setHorizontalGroup(
            Mesa28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME28, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa28Layout.setVerticalGroup(
            Mesa28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa28Layout.createSequentialGroup()
                .addComponent(ME28, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa29.setBackground(new java.awt.Color(255, 153, 153));
        Mesa29.setRoundBottomLeft(20);
        Mesa29.setRoundBottomRight(20);
        Mesa29.setRoundTopLeft(20);
        Mesa29.setRoundTopRight(20);

        ME29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME29.setText("MESA 29");
        ME29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa29Layout = new javax.swing.GroupLayout(Mesa29);
        Mesa29.setLayout(Mesa29Layout);
        Mesa29Layout.setHorizontalGroup(
            Mesa29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME29, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa29Layout.setVerticalGroup(
            Mesa29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa29Layout.createSequentialGroup()
                .addComponent(ME29, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa30.setBackground(new java.awt.Color(255, 153, 153));
        Mesa30.setRoundBottomLeft(20);
        Mesa30.setRoundBottomRight(20);
        Mesa30.setRoundTopLeft(20);
        Mesa30.setRoundTopRight(20);

        ME30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME30.setText("MESA 30");
        ME30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME30MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa30Layout = new javax.swing.GroupLayout(Mesa30);
        Mesa30.setLayout(Mesa30Layout);
        Mesa30Layout.setHorizontalGroup(
            Mesa30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME30, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa30Layout.setVerticalGroup(
            Mesa30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa30Layout.createSequentialGroup()
                .addComponent(ME30, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        Mesa31.setBackground(new java.awt.Color(255, 153, 153));
        Mesa31.setRoundBottomLeft(20);
        Mesa31.setRoundBottomRight(20);
        Mesa31.setRoundTopLeft(20);
        Mesa31.setRoundTopRight(20);

        ME31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ME31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ME31.setText("MESA 31");
        ME31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ME31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Mesa31Layout = new javax.swing.GroupLayout(Mesa31);
        Mesa31.setLayout(Mesa31Layout);
        Mesa31Layout.setHorizontalGroup(
            Mesa31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ME31, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Mesa31Layout.setVerticalGroup(
            Mesa31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Mesa31Layout.createSequentialGroup()
                .addComponent(ME31, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Mesa25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Mesa17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Mesa9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Mesa18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Mesa17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Mesa19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Mesa20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Mesa22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Mesa23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Mesa24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Mesa21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Mesa25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Mesa27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Mesa28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Mesa26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ME1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME1MouseClicked
        if(Mesa1.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 1;
        noorden = orden1;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME1MouseClicked

    private void ME2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME2MouseClicked
         if(Mesa2.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 2;
        noorden = orden2;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
         }
    }//GEN-LAST:event_ME2MouseClicked

    private void ME3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME3MouseClicked
         if(Mesa3.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 3;
        noorden = orden3;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME3MouseClicked

    private void ME4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME4MouseClicked
        if(Mesa4.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 4;
        noorden = orden4;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME4MouseClicked

    private void ME5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME5MouseClicked
         if(Mesa5.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 5;
        noorden = orden5;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME5MouseClicked

    private void ME6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME6MouseClicked
        if(Mesa6.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 6;
        noorden = orden6;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME6MouseClicked

    private void ME7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME7MouseClicked
         if(Mesa7.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 7;
        noorden = orden7;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME7MouseClicked

    private void ME8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME8MouseClicked
         if(Mesa8.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 8;
        noorden = orden8;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME8MouseClicked

    private void ME9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME9MouseClicked
         if(Mesa9.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 9;
        noorden = orden9;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME9MouseClicked

    private void ME10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME10MouseClicked
         if(Mesa10.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 10;
        noorden = orden10;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME10MouseClicked

    private void ME11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME11MouseClicked
        if(Mesa11.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 11;
        noorden = orden11;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME11MouseClicked

    private void ME12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME12MouseClicked
        if(Mesa12.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 12;
        noorden = orden12;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_ME12MouseClicked

    private void ME13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME13MouseClicked
      if(Mesa13.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 13;
        noorden = orden13;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME13MouseClicked

    private void ME14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME14MouseClicked
      if(Mesa14.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 14;
        noorden = orden14;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME14MouseClicked

    private void ME15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME15MouseClicked
      if(Mesa15.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 15;
        noorden = orden15;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME15MouseClicked

    private void ME16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME16MouseClicked
       if(Mesa16.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 16;
        noorden = orden16;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME16MouseClicked

    private void ME17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME17MouseClicked
        if(Mesa17.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 17;
        noorden = orden17;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME17MouseClicked

    private void ME18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME18MouseClicked
       if(Mesa18.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 18;
        noorden = orden18;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME18MouseClicked

    private void ME19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME19MouseClicked
       if(Mesa19.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 19;
        noorden = orden19;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME19MouseClicked

    private void ME20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME20MouseClicked
       if(Mesa20.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 20;
        noorden = orden20;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME20MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        Ordenes F = new Ordenes();
        F.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void ME21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME21MouseClicked
        if(Mesa21.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 21;
        noorden = orden21;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME21MouseClicked

    private void ME22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME22MouseClicked
        if(Mesa22.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 22;
        noorden = orden22;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME22MouseClicked

    private void ME23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME23MouseClicked
        if(Mesa23.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 23;
        noorden = orden23;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME23MouseClicked

    private void ME24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME24MouseClicked
        if(Mesa24.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 24;
        noorden = orden24;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME24MouseClicked

    private void ME25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME25MouseClicked
        if(Mesa25.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 25;
        noorden = orden25;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME25MouseClicked

    private void ME26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME26MouseClicked
        if(Mesa26.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 26;
        noorden = orden26;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME26MouseClicked

    private void ME27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME27MouseClicked
        if(Mesa27.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 27;
        noorden = orden27;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME27MouseClicked

    private void ME28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME28MouseClicked
        if(Mesa28.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 28;
        noorden = orden28;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME28MouseClicked

    private void ME29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME29MouseClicked
        if(Mesa29.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 29;
        noorden = orden29;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME29MouseClicked

    private void ME30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME30MouseClicked
      if(Mesa30.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 30;
        noorden = orden30;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME30MouseClicked

    private void ME31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ME31MouseClicked
        if(Mesa31.isEnabled()){JOptionPane.showMessageDialog(null, "Mesa No Tiene Orden Abierta...");}
        else{
        id_mesa = 31;
        noorden = orden31;
        MenuSeguimiento F = new MenuSeguimiento(noorden,id_mesa);
        F.setVisible(true);
        this.dispose();
      }
    }//GEN-LAST:event_ME31MouseClicked

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
            java.util.logging.Logger.getLogger(MesasSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesasSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesasSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesasSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new MesasSeguimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ME1;
    private javax.swing.JLabel ME10;
    private javax.swing.JLabel ME11;
    private javax.swing.JLabel ME12;
    private javax.swing.JLabel ME13;
    private javax.swing.JLabel ME14;
    private javax.swing.JLabel ME15;
    private javax.swing.JLabel ME16;
    private javax.swing.JLabel ME17;
    private javax.swing.JLabel ME18;
    private javax.swing.JLabel ME19;
    private javax.swing.JLabel ME2;
    private javax.swing.JLabel ME20;
    private javax.swing.JLabel ME21;
    private javax.swing.JLabel ME22;
    private javax.swing.JLabel ME23;
    private javax.swing.JLabel ME24;
    private javax.swing.JLabel ME25;
    private javax.swing.JLabel ME26;
    private javax.swing.JLabel ME27;
    private javax.swing.JLabel ME28;
    private javax.swing.JLabel ME29;
    private javax.swing.JLabel ME3;
    private javax.swing.JLabel ME30;
    private javax.swing.JLabel ME31;
    private javax.swing.JLabel ME4;
    private javax.swing.JLabel ME5;
    private javax.swing.JLabel ME6;
    private javax.swing.JLabel ME7;
    private javax.swing.JLabel ME8;
    private javax.swing.JLabel ME9;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private ClassAngels.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables

private void Etiquetas() {
String texto1 = "<html><center><body>MESA 1<br>Orden No<br><font color='white'>"+orden1+"</font></body></center></html>";
        ME1.setText(texto1);
        String texto2 ="<html><center><body>MESA 2<br>Orden No<br><font color='white'>"+orden2+"</font></body></center></html>";
        ME2.setText(texto2);
        String texto3 ="<html><center><body>MESA 3<br>Orden No<br><font color='white'>"+orden3+"</font></body></center></html>";
        ME3.setText(texto3);
        String texto4 ="<html><center><body>MESA 4<br>Orden No<br><font color='white'>"+orden4+"</font></body></center></html>";
        ME4.setText(texto4);
        String texto5 ="<html><center><body>MESA 5<br>Orden No<br><font color='white'>"+orden5+"</font></body></center></html>";
        ME5.setText(texto5);
        String texto6 ="<html><center><body>MESA 6<br>Orden No<br><font color='white'>"+orden6+"</font></body></center></html>";
        ME6.setText(texto6);
        String texto7 ="<html><center><body>MESA 7<br>Orden No<br><font color='white'>"+orden7+"</font></body></center></html>";
        ME7.setText(texto7);
        String texto8 ="<html><center><body>MESA 8<br>Orden No<br><font color='white'>"+orden8+"</font></body></center></html>";
        ME8.setText(texto8);
        String texto9 ="<html><center><body>MESA 9<br>Orden No<br><font color='white'>"+orden9+"</font></body></center></html>";
        ME9.setText(texto9);
        String texto10 ="<html><center><body>MESA 10<br>Orden No<br><font color='white'>"+orden10+"</font></body></center></html>";
        ME10.setText(texto10);
        String texto11 ="<html><center><body>MESA 11<br>Orden No<br><font color='white'>"+orden11+"</font></body></center></html>";
        ME11.setText(texto11);
        String texto12 ="<html><center><body>MESA 12<br>Orden No<br><font color='white'>"+orden12+"</font></body></center></html>";
        ME12.setText(texto12);
        String texto13 ="<html><center><body>MESA 13<br>Orden No<br><font color='white'>"+orden13+"</font></body></center></html>";
        ME13.setText(texto13);
        String texto14 ="<html><center><body>MESA 14<br>Orden No<br><font color='white'>"+orden14+"</font></body></center></html>";
        ME14.setText(texto14);
        String texto15 ="<html><center><body>MESA 15<br>Orden No<br><font color='white'>"+orden15+"</font></body></center></html>";
        ME15.setText(texto15);
        String texto16 ="<html><center><body>MESA 16<br>Orden No<br><font color='white'>"+orden16+"</font></body></center></html>";
        ME16.setText(texto16);
        String texto17 ="<html><center><body>MESA 17<br>Orden No<br><font color='white'>"+orden17+"</font></body></center></html>";
        ME17.setText(texto17);
        String texto18 ="<html><center><body>MESA 18<br>Orden No<br><font color='white'>"+orden18+"</font></body></center></html>";
        ME18.setText(texto18);
        String texto19 ="<html><center><body>MESA 19<br>Orden No<br><font color='white'>"+orden19+"</font></body></center></html>";
        ME19.setText(texto19);
        String texto20 ="<html><center><body>MESA 20<br>Orden No<br><font color='white'>"+orden20+"</font></body></center></html>";
        ME20.setText(texto20);
        String texto21 ="<html><center><body>MESA 21<br>Orden No<br><font color='white'>"+orden21+"</font></body></center></html>";
        ME21.setText(texto21);
        String texto22 ="<html><center><body>MESA 22<br>Orden No<br><font color='white'>"+orden22+"</font></body></center></html>";
        ME22.setText(texto22);
        String texto23 ="<html><center><body>MESA 23<br>Orden No<br><font color='white'>"+orden23+"</font></body></center></html>";
        ME23.setText(texto23);
        String texto24 ="<html><center><body>MESA 24<br>Orden No<br><font color='white'>"+orden24+"</font></body></center></html>";
        ME24.setText(texto24);
        String texto25 ="<html><center><body>MESA 25<br>Orden No<br><font color='white'>"+orden25+"</font></body></center></html>";
        ME25.setText(texto25);
        String texto26 ="<html><center><body>MESA 26<br>Orden No<br><font color='white'>"+orden26+"</font></body></center></html>";
        ME26.setText(texto26);
        String texto27 ="<html><center><body>MESA 27<br>Orden No<br><font color='white'>"+orden27+"</font></body></center></html>";
        ME27.setText(texto27);
        String texto28 ="<html><center><body>MESA 28<br>Orden No<br><font color='white'>"+orden28+"</font></body></center></html>";
        ME28.setText(texto28);
        String texto29 ="<html><center><body>MESA 29<br>Orden No<br><font color='white'>"+orden29+"</font></body></center></html>";
        ME29.setText(texto29);
        String texto30 ="<html><center><body>MESA 30<br>Orden No<br><font color='white'>"+orden30+"</font></body></center></html>";
        ME30.setText(texto30);
        String texto31 ="<html><center><body>MESA 31<br>Orden No<br><font color='white'>"+orden31+"</font></body></center></html>";
        ME31.setText(texto31);

 }

}
