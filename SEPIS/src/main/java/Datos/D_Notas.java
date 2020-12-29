/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.E_Notas;
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
public class D_Notas {

    private ClsConexion mysql = new ClsConexion();
    private Connection conect = mysql.conectar();
    private String sSql = "";

    public DefaultTableModel listar() {

        DefaultTableModel modelo;

        String[] titulos = {"CodAlum", "Nombre", "Ciclo", "Estado", "N°Cursos Desaprobados"};
        String[] registro = new String[5];

        //totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSql = "SELECT cod_alum,nombre,ciclo,estado,COUNT(*) AS \"N°Cursos Desaprobados\" from notas GROUP BY cod_alum;";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            while (rs.next()) {
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
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
    /*
    
      public DefaultTableModel buscar(String cod_alum) {

        DefaultTableModel modelo;

        String[] titulos = {"Cod Alumno", "Nombre", "Ciclo", "Estado", "N°Cursos Desaprobados"};
        String[] registro = new String[8];

        //totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSql = "SELECT cod_alum,nombre,ciclo,estado,COUNT(*) AS \"N°Cursos Desaprobados\" from notas GROUP BY cod_alum where cod_alum='" + cod_alum + "' and estado='1'";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            while (rs.next()) {
                E_Notas obj=new E_Notas();
                cod_alum = rs.getString("cod_alum");
             //   nombre = rs.getString("nombre");
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
              //  registro[5] = rs.getString(6);
              //  registro[6] = rs.getString(7);
              //  registro[7] = rs.getString(8);

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    } */
 
}
