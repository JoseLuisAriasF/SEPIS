/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.E_Ficha;
import Entidad.E_Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class D_Ficha {

    private ClsConexion mysql = new ClsConexion();
    private Connection conect = mysql.conectar();
    private String sSql = "";

    public boolean insertarficha(E_Ficha dts) {

        sSql = "INSERT INTO ficha(cod_alum,problema_academico,problema_personal,acuerdo_academico,acuerdo_personal,observacion_academico,observacion_personal,nombre,fecha)VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conect.prepareStatement(sSql);

            //  pst.setInt(1, dts.getIdestudiante());
            pst.setString(1, dts.getCod_alum());
            pst.setString(2, dts.getProblema_academico());
            pst.setString(3, dts.getProblema_personal());
            pst.setString(4, dts.getAcuerdo_academico());
            pst.setString(5, dts.getAcuerdo_personal());
            pst.setString(6, dts.getObservacion_academico());
            pst.setString(7, dts.getObservacion_personal());
               pst.setString(8, dts.getNombre());
                  pst.setString(9, dts.getFecha());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos " + e);
            return false;

        }
    }
    
       public DefaultTableModel listarficha(String cod_alum) {

        DefaultTableModel modelo;

        String[] titulos = {"Cod_Alum", "fecha"};
        String[] registro = new String[2];

        //totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSql = "SELECT cod_alum,fecha from ficha where cod_alum='" + cod_alum + "'";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sSql);
          //   PreparedStatement pst = conect.prepareStatement(sSql);
            while (rs.next()) {
                 cod_alum= rs.getString("cod_alum");
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
          
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
