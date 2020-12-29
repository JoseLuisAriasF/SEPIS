/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Cache.UserLoginCache;
import Entidad.E_Usuario;
import Presentacion.frmMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class D_Login2 {

    frmMain fs ;
    String sSql= "";

   
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
                E_Usuario obj=new E_Usuario();
                usuario = resultado.getString("usuario");
                contraseña = resultado.getString("contraseña");
                obj.setIdusuario(resultado.getInt("idusuario"));
                obj.setDni(resultado.getString("dni"));
                obj.setNombre(resultado.getString("nombre"));
                obj.setTelefono(resultado.getString("telefono"));
                obj.setUsuario(resultado.getString("usuario"));
                obj.setContraseña(resultado.getString("contraseña"));
                obj.setCargo(resultado.getString("cargo"));
                obj.setEstado(resultado.getString("estado"));
      
             fs=new frmMain(obj);
                
                fs.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos " + e);

        }

    }
}
