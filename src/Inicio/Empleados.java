/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import BDclass.BDConexion;

/**
 *
 * @author it
 */
public class Empleados extends JFrame {

    private JPanel panelBotones;
    private final int noOrden;

    public Empleados(int noOrden) {
        this.noOrden = noOrden;

        setTitle("Empleados");

        // No permitir cerrar, minimizar ni maximizar
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);

        // Evita que se cierre con Alt+F4 o clic fuera
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Configura el tamaño y diseño
        setSize(500, 400);
        setLayout(new BorderLayout());

        configurarEncabezado();
        setLocationRelativeTo(null);

        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(0, 3, 10, 10));
        add(new JScrollPane(panelBotones), BorderLayout.CENTER);

        cargarEmpleados();

        setVisible(true);
    }

    private void configurarEncabezado() {
        JLabel lblNoOrden = new JLabel("Número de orden: " + noOrden);
        lblNoOrden.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblNoOrden.setHorizontalAlignment(SwingConstants.CENTER);

        // Lo agregamos arriba de la ventana
        this.setLayout(new BorderLayout());
        this.add(lblNoOrden, BorderLayout.NORTH);
    }

    private void cargarEmpleados() {
        try {
            BDConexion conecta = new BDConexion();
            Connection cn = conecta.getConexion();
            Statement stmt = cn.createStatement();

            panelBotones.setLayout(new GridLayout(0, 3, 10, 10));

            ResultSet rs = stmt.executeQuery("SELECT codigo, nombre FROM empleados WHERE estado = 1");

            while (rs.next()) {
                int codigoEmpleado = rs.getInt("codigo");
                String nombreEmpleado = rs.getString("nombre");

                JButton boton = new JButton(nombreEmpleado);
                boton.setPreferredSize(new Dimension(150, 40));

                // 🎨 Estilo visual
                boton.setBackground(new Color(0, 123, 255));  // Azul bonito
                boton.setForeground(Color.WHITE);
                boton.setFocusPainted(false);
                boton.setFont(new Font("Segoe UI", Font.BOLD, 14));
                boton.setBorder(BorderFactory.createLineBorder(new Color(30, 144, 255), 20, true)); // Borde redondeado 0,90,200

                // 🔵 Redondear bordes visualmente
                boton.setContentAreaFilled(false);
                boton.setOpaque(false);
                boton.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
                    @Override
                    public void paint(Graphics g, JComponent c) {
                        Graphics2D g2 = (Graphics2D) g.create();
                        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                        JButton b = (JButton) c;

                        // Fondo redondeado
                        g2.setColor(b.getModel().isRollover() ? new Color(30, 144, 255) : b.getBackground());
                        g2.fillRoundRect(0, 0, b.getWidth(), b.getHeight(), 20, 20);

                        // Texto
                        g2.setColor(b.getForeground());
                        FontMetrics fm = g2.getFontMetrics();
                        int x = (b.getWidth() - fm.stringWidth(b.getText())) / 2;
                        int y = (b.getHeight() + fm.getAscent()) / 2 - 3;
                        g2.drawString(b.getText(), x, y);

                        g2.dispose();
                    }
                });

                // 🎯 Acción al presionar
                boton.addActionListener(e -> {
                    asignarEmpleadoAOrden(codigoEmpleado, noOrden);
                });

                panelBotones.add(boton);
            }

            panelBotones.revalidate();
            panelBotones.repaint();

            rs.close();
            stmt.close();
            cn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar empleados: " + e.getMessage());
        }
    }

    private void asignarEmpleadoAOrden(int codigoEmpleado, int noOrden) {
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();

            String sql = "UPDATE ordenes SET codigo = ? WHERE noorden = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigoEmpleado);
            ps.setInt(2, noOrden);

            ps.executeUpdate();

            ps.close();
            con.close();

            //JOptionPane.showMessageDialog(null, "Empleado asignado correctamente a la orden.");
            // Volver a la ventana de órdenes
            Ordenes ventanaOrdenes = new Ordenes();
            ventanaOrdenes.setVisible(true);
            this.dispose();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar orden: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Empleados(0));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
