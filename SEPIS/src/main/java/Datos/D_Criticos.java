/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class D_Criticos {
       private ClsConexion mysql = new ClsConexion();
    private Connection conect = mysql.conectar();
    private String sSql = "";
    
        public DefaultTableModel listarcriticosn() {

        DefaultTableModel modelo;

        String[] titulos = {"Cod_Alum", "Nombre", "Ciclo", "Curso", "Unidad","Nota","Estado"};
        String[] registro = new String[7];

        //totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSql = "SELECT cod_alum,nombre,ciclo,curso,unidad,nota,estado from notas where nota<5";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sSql);
          //   PreparedStatement pst = conect.prepareStatement(sSql);
            while (rs.next()) {
                // cod_alum= rs.getString("cod_alum");
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
                 registro[5] = rs.getString(6);
                  registro[6] = rs.getString(7);
            //    registro[5] = rs.getString(6);
            //    registro[6] = rs.getString(7);
            //    registro[7] = rs.getString(8);

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        }
        
         public DefaultTableModel listarcriticosa() {

        DefaultTableModel modelo;

        String[] titulos = {"Cod_Alum", "Nombre", "Ciclo","Estado","N°Faltas"};
        String[] registro = new String[5];

        //totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSql = "SELECT cod_alumn,nombres,ciclo,estado,COUNT(*) AS \"N°Faltas\" from asistencia   GROUP BY cod_alumn; ";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sSql);
          //   PreparedStatement pst = conect.prepareStatement(sSql);
            while (rs.next()) {
                // cod_alum= rs.getString("cod_alum");
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
             //    registro[5] = rs.getString(6);
             //     registro[6] = rs.getString(7);
            //    registro[5] = rs.getString(6);
            //    registro[6] = rs.getString(7);
            //    registro[7] = rs.getString(8);

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        }
}
