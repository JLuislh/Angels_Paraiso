/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDclass;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */

public class BDConexionPedidos {

   public static final String URL = "jdbc:mysql://26.49.11.7:3306/PedidosProductos?useTimezone=true&serverTimezone=UTC";
   public static final String USER =   "PedidosProductos";//
   public static final String CLAVE =  "Coast@cm";//  
     
   public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"ERROR CONTACTE CON EL ADMINISTRADOR DEL SISTEMA");
        }
        return con;
    }
}