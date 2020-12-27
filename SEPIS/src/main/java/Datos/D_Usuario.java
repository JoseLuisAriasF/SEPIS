/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.E_Usuario;
import Presentacion.frmMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class D_Usuario {

    private ClsConexion mysql = new ClsConexion();
    private Connection conect = mysql.conectar();
    private String sSql = "";
 

    public DefaultTableModel listar() {

        DefaultTableModel modelo;

        String[] titulos = {"Id", "DNI", "Nombre", "Telefono", "Usuario", "Contraseña", "Cargo", "Estado"};
        String[] registro = new String[8];

        //totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSql = "SELECT * FROM usuario";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            while (rs.next()) {
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
                registro[5] = rs.getString(6);
                registro[6] = rs.getString(7);
                registro[7] = rs.getString(8);

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
 


    public boolean insertar(E_Usuario dts) {

         
        sSql = "INSERT INTO usuario (dni,nombre,telefono,usuario,contraseña,cargo,estado)VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conect.prepareStatement(sSql);

            //  pst.setInt(1, dts.getIdestudiante());
            pst.setString(1, dts.getDni());
            pst.setString(2, dts.getNombre());
            pst.setString(3, dts.getTelefono());
            pst.setString(4, dts.getUsuario());
            pst.setString(5, dts.getContraseña());
            pst.setString(6, dts.getCargo());
            pst.setString(7, dts.getEstado());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos " + e);
            return false;
            
        }
    }

    public boolean editar(E_Usuario dts) {

         
        sSql = "UPDATE usuario SET dni=?,nombre=?,telefono=?,usuario=?,contraseña=?,cargo=?,estado=? WHERE idusuario=?";
        try {
            PreparedStatement pst = conect.prepareStatement(sSql);

            pst.setString(1, dts.getDni());
            pst.setString(2, dts.getNombre());
            pst.setString(3, dts.getTelefono());
            pst.setString(4, dts.getUsuario());
            pst.setString(5, dts.getContraseña());
            pst.setString(6, dts.getCargo());
            pst.setString(7, dts.getEstado());
            //   pst.setString(3, dts.getNumero_ejemplar());

            pst.setInt(8, dts.getIdusuario());
            int n = pst.executeUpdate();
            
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar datos " + e);
            return false;
        }finally{
            
        }
    }

    public boolean eliminar(E_Usuario dts) {
        
         
        sSql = "DELETE FROM usuario WHERE idusuario=?";
        try {
            PreparedStatement pst = conect.prepareStatement(sSql);

            pst.setInt(1, dts.getIdusuario());

            int n = pst.executeUpdate();
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar datos " + e);
            return false;
        }
    }

}
