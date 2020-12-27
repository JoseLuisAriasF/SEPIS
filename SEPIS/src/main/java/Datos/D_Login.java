/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Cache.UserLoginCache;
import Presentacion.frmLogin;
import Presentacion.frmMain;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class D_Login {

    frmMain fs = new frmMain();
    String sSql;

    public void Login(String usuario, String contraseña) {
        ClsConexion mysql = new ClsConexion();
        //Connection conect = mysql.conectar();

        PreparedStatement sentencia_preparada;
        ResultSet resultado;
        Connection conexion;
        try {
            Connection conect = mysql.conectar();
            sSql = "select * from usuario where usuario='" + usuario + "' && contraseña='" + contraseña + "' and estado='ACTIVO'";

            sentencia_preparada = conect.prepareStatement(sSql);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {

                usuario = resultado.getString("usuario");
                contraseña = resultado.getString("contraseña");
                //  UserLoginCache.nombre=resultado.getString("nombre");

                // ra.setVisible(false);
                fs.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos " + e);

        }

    }
}
