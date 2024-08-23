/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdministradorAngels;

import BDclass.BDConexion;
import ClassAngels.InsertarProducto;
import ClassAngels.TextAreaRenderer;
import Inicio.Ordenes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Jorge Lopez
 */
public class ReportesIngresosLocales extends javax.swing.JPanel {
    int TipoSucursal;
    String FECHAINs;
    String FECHAFINs;
    String FE;

    /**
     * Creates new form ReportesIngresosLocales
     */
    public ReportesIngresosLocales() {
        initComponents();
        Noordenes.requestFocus();
        ListarTotalesSucursales();
    }
    
    public void ingresoCuenta() throws SQLException{
        DateFormat f = new SimpleDateFormat("yyyy/MM/dd");
         FE = f.format(FECHA.getDate());
        BDConexion conecta = new BDConexion();
        PreparedStatement smtp;
        try (Connection con = conecta.getConexion()) {
            smtp = null;
            smtp =con.prepareStatement("call INGRESOCUENTASUCURSALES('"+FE+"','"+EFECTIVO.getText()+"','"+TARJETA.getText()+"','"+Total.getText()+"','"+Noordenes.getText()+"','"+TRANFERENCIA.getText()+"','"+GASTOS.getText()+"','"+TipoSucursal+"')");
            smtp.executeUpdate();
        }
        smtp.close(); 
        JOptionPane.showMessageDialog(null, "CANTIDAD AGREGADA");
        limpiar();
    }
    
    private void limpiar(){
    Noordenes.setText("");
    EFECTIVO.setText("");
    TARJETA.setText("");
    TRANFERENCIA.setText("");
    Total.setText("");
    GASTOS.setText("");
    Sucursal.setSelectedItem("SELECCIONAR...");
    ListarTotalesSucursales();
    }
    
     private void generarParaiso() {
        try {
            System.out.println("llega a el paraiso");
            SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            FECHAINs = df.format(FECHAIN.getDate());
            FECHAFINs = df.format(FECHAFIN.getDate());

           
                BDConexion con = new BDConexion();
                Connection conexion = con.getConexion();
                JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile("C:\\Reportes\\ANGELS\\ResumenIngresosElparaiso.jasper");
                Map parametros = new HashMap();
                parametros.put("FECHAIN", FECHAINs);
                parametros.put("FECHAFIN", FECHAFINs);
                JasperPrint print = JasperFillManager.fillReport(jasperReport, parametros, conexion);
                JasperPrintManager.printReport(print, true);
             
        } catch (Exception e) {
            System.out.println("F" + e);
            JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  " + e);
        }

    }
     
    private void generarPalencia() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            FECHAINs = df.format(FECHAIN.getDate());
            FECHAFINs = df.format(FECHAFIN.getDate());

           
                BDConexion con = new BDConexion();
                Connection conexion = con.getConexion();
                JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile("C:\\Reportes\\ANGELS\\ResumenIngresosPalencia.jasper");
                Map parametros = new HashMap();
                parametros.put("FECHAIN", FECHAINs);
                parametros.put("FECHAFIN", FECHAFINs);
                JasperPrint print = JasperFillManager.fillReport(jasperReport, parametros, conexion);
                JasperPrintManager.printReport(print, true);
             
        } catch (Exception e) {
            System.out.println("F" + e);
            JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  " + e);
        }

    }
    
    private void generarResidenciales() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            FECHAINs = df.format(FECHAIN.getDate());
            FECHAFINs = df.format(FECHAFIN.getDate());

           
                BDConexion con = new BDConexion();
                Connection conexion = con.getConexion();
                JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile("C:\\Reportes\\ANGELS\\ResumenIngresosResidenciales.jasper");
                Map parametros = new HashMap();
                parametros.put("FECHAIN", FECHAINs);
                parametros.put("FECHAFIN", FECHAFINs);
                JasperPrint print = JasperFillManager.fillReport(jasperReport, parametros, conexion);
                JasperPrintManager.printReport(print, true);
             
        } catch (Exception e) {
            System.out.println("F" + e);
            JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  " + e);
        }

    }
    
    private void ListarTotalesSucursales(){
        
        
        ArrayList<InsertarProducto> result = BDIngresos.ListarTotalesSucursales();
        RecargarGas(result);  
    }
     private void RecargarGas(ArrayList<InsertarProducto> list) {
              Object[][] datos = new Object[list.size()][3];
              int i = 0;
              for(InsertarProducto t : list)
              {
                  datos[i][0] = t.getSucursal();
                  datos[i][1] = t.getTotal();
                  datos[i][2] = t.getFecha();
                  i++;
              }    
             Gast.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                "SUCURSAL","TOTAL","FECHA"
             })
             {  
                 @Override
                 public boolean isCellEditable(int row, int column){
                 return false;

             }
             });
             Gast.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
             TableColumn columna1 = Gast.getColumn("SUCURSAL");
             columna1.setPreferredWidth(75);
             TableColumn columna2 = Gast.getColumn("TOTAL");
             columna2.setPreferredWidth(25);
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
        jLabel1 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Noordenes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TRANFERENCIA = new javax.swing.JTextField();
        TARJETA = new javax.swing.JTextField();
        EFECTIVO = new javax.swing.JTextField();
        GASTOS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Sucursal = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        FECHA = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        Gast = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        FECHAIN = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        FECHAFIN = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        SucursalGenerar = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("TOTAL ");

        Total.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CANTIDA ORDENES");

        Noordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoordenesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("EFECTIVO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("TARJETA");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("TRANSFERENCIA");

        TRANFERENCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRANFERENCIAActionPerformed(evt);
            }
        });

        TARJETA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TARJETAActionPerformed(evt);
            }
        });

        EFECTIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EFECTIVOActionPerformed(evt);
            }
        });

        GASTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GASTOSActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("GASTOS");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("SUCURSAL");

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save2.png"))); // NOI18N
        Guardar.setText("GUARDAR");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Sucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR...", "RESTAURANTE PALENCIA", "RESTAURANTE RESIDENCIALES" }));
        Sucursal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                SucursalComponentHidden(evt);
            }
        });
        Sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SucursalActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("FECHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EFECTIVO)
                            .addComponent(Total)
                            .addComponent(Noordenes)
                            .addComponent(TARJETA)
                            .addComponent(TRANFERENCIA)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(GASTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addComponent(Sucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(FECHA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Noordenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EFECTIVO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TARJETA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TRANFERENCIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GASTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Gast.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUCURSAL", "TOTAL", "FECHA"
            }
        ));
        jScrollPane2.setViewportView(Gast);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GENERAR REPORTE POR FECHA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("FECHA INICIO");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FECHA FINAL");

        jButton1.setText("GENERAR REPORTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SUCURSAL");

        SucursalGenerar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR...", "EL PARAISO", "PALENCIA", "RESIDENCIALES" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SucursalGenerar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FECHAIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(FECHAFIN, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SucursalGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FECHAIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FECHAFIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if(Noordenes.getText().compareTo("")!=0 &&
           EFECTIVO.getText().compareTo("")!=0 &&
           TARJETA.getText().compareTo("")!=0 &&
           TRANFERENCIA.getText().compareTo("")!=0 &&
           Total.getText().compareTo("")!=0 &&
           GASTOS.getText().compareTo("")!=0 && !Sucursal.getSelectedItem().equals("SELECCIONAR...") && FECHA.getDate() != null)        
        {

         if(Sucursal.getSelectedItem().equals("RESTAURANTE PALENCIA"))
               {
                   TipoSucursal = 1;
               }
            
            else if(Sucursal.getSelectedItem().equals("RESTAURANTE RESIDENCIALES"))
            {
                   TipoSucursal = 2;
            }   
           
        try {
            ingresoCuenta();
        } catch (SQLException ex) {
            Logger.getLogger(ReportesIngresosLocales.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
        }else{JOptionPane.showMessageDialog(null, "INGRESAR TODOS LOS DATOS O COLOCAR 0");} 
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (FECHAIN.getDate() != null && FECHAFIN.getDate() != null && !SucursalGenerar.getSelectedItem().equals("SELECCIONAR...")) {
            

            if(SucursalGenerar.getSelectedItem().equals("EL PARAISO"))
               {generarParaiso();}
            
            else if(SucursalGenerar.getSelectedItem().equals("PALENCIA"))
            {
            generarPalencia();
            }   
            else if(SucursalGenerar.getSelectedItem().equals("RESIDENCIALES"))
            {
            generarResidenciales();
            }   
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE UNA FECHA O SUCURSAL");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NoordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoordenesActionPerformed
       EFECTIVO.requestFocus();
    }//GEN-LAST:event_NoordenesActionPerformed

    private void EFECTIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EFECTIVOActionPerformed
        TARJETA.requestFocus();
    }//GEN-LAST:event_EFECTIVOActionPerformed

    private void TARJETAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TARJETAActionPerformed
       TRANFERENCIA.requestFocus();
    }//GEN-LAST:event_TARJETAActionPerformed

    private void TRANFERENCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRANFERENCIAActionPerformed
      Total.requestFocus();
    }//GEN-LAST:event_TRANFERENCIAActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
       GASTOS.requestFocus();
    }//GEN-LAST:event_TotalActionPerformed

    private void SucursalComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SucursalComponentHidden
       Guardar.requestFocus();
    }//GEN-LAST:event_SucursalComponentHidden

    private void GASTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GASTOSActionPerformed
        Sucursal.requestFocus();
    }//GEN-LAST:event_GASTOSActionPerformed

    private void SucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SucursalActionPerformed
        Guardar.requestFocus();
    }//GEN-LAST:event_SucursalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EFECTIVO;
    private com.toedter.calendar.JDateChooser FECHA;
    private com.toedter.calendar.JDateChooser FECHAFIN;
    private com.toedter.calendar.JDateChooser FECHAIN;
    private javax.swing.JTextField GASTOS;
    private javax.swing.JTable Gast;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Noordenes;
    private javax.swing.JComboBox<String> Sucursal;
    private javax.swing.JComboBox<String> SucursalGenerar;
    private javax.swing.JTextField TARJETA;
    private javax.swing.JTextField TRANFERENCIA;
    private javax.swing.JTextField Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
