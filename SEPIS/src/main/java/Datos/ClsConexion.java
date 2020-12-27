/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ClsConexion {

    static String conect = "sepis";
    static String user = "root";
    static String pass = "";
    static String url = "jdbc:mysql://localhost:33065/" + conect;

    public ClsConexion() {

    }

    public Connection conectar() {
        Connection link = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos" + e);
        }
        return link;
    }

}
