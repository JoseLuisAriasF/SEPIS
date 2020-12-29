/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Entidad.E_Notas;
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
public class D_Notas2 {

    private ClsConexion mysql = new ClsConexion();
    private Connection conect = mysql.conectar();
    private String sSql = "";

     public DefaultTableModel mostrar (String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"Codigo Alumno","Nombre","Ciclo","Estado","Cursos Desaprobados"};
        String [] registro = new String [5];
        
       // totalregistros = 0;
        modelo = new DefaultTableModel (null, titulos);
        if (buscar.equals("")) {
            sSql = "SELECT cod_alum,nombre,ciclo,estado,COUNT(*) AS \"N°Cursos Desaprobados\" from notas where estado=1 GROUP BY cod_alum;";
        } else {
            sSql = "SELECT cod_alum,nombre,ciclo,estado,COUNT(*) AS \"N°Cursos Desaprobados\" from notas  where cod_alum LIKE '%"+buscar+"%' GROUP BY cod_alum";
        }
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            
            while(rs.next()){
                registro [0] = rs.getString(1);
                registro [1] = rs.getString(2);
                registro [2] = rs.getString(3);
                registro [3] = rs.getString(4);
                registro [4] = rs.getString(5);
                
             //   totalregistros = totalregistros +1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
     
      public boolean editarestado(E_Notas dts) {

         
        sSql = "UPDATE notas SET estado=? WHERE cod_alum=?";
        try {
            PreparedStatement pst = conect.prepareStatement(sSql);

           
            pst.setString(1, dts.getEstado());
         //   pst.setString(5, dts.getContraseña());
         //   pst.setString(6, dts.getCargo());
        //    pst.setString(, dts.getEstado());
            //   pst.setString(3, dts.getNumero_ejemplar());

            pst.setString(2, dts.getCod_alum());
            int n = pst.executeUpdate();
            
            return n != 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar datos " + e);
            return false;
        }finally{
            
        }
    }
      
       public DefaultTableModel listarestudiante(String cod_alum) {

        DefaultTableModel modelo;

        String[] titulos = {"Cod_Alum", "Nombre", "Ciclo", "Curso", "Unidad","Nota","Estado"};
        String[] registro = new String[7];

        //totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSql = "SELECT cod_alum,nombre,ciclo,curso,unidad,nota,estado from notas where cod_alum='" + cod_alum + "'";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sSql);
          //   PreparedStatement pst = conect.prepareStatement(sSql);
            while (rs.next()) {
                 cod_alum= rs.getString("cod_alum");
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
    
}
