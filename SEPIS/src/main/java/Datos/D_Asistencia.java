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
public class D_Asistencia {
     private ClsConexion mysql = new ClsConexion();
    private Connection conect = mysql.conectar();
    private String sSql = "";

     public DefaultTableModel mostrar (String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"Codigo Alumno","Nombre","Ciclo","Estado","N° Faltas"};
        String [] registro = new String [5];
        
       // totalregistros = 0;
        modelo = new DefaultTableModel (null, titulos);
        if (buscar.equals("")) {
            sSql = "SELECT cod_alumn,nombres,ciclo,estado,COUNT(*) AS \"N°Faltas\" from asistencia where estado=1 GROUP BY cod_alumn;";
        } else {
            sSql = "SELECT cod_alumn,nombres,ciclo,estado,COUNT(*) AS \"N°Faltas\" from asistencia  where cod_alum LIKE '%"+buscar+"%' GROUP BY cod_alum";
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
}
