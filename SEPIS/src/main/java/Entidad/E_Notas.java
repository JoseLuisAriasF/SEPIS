/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Datos.ClsConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class E_Notas {

    public int getIdregistro() {
        return idregistro;
    }

    public String getCod_alum() {
        return cod_alum;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public String getCurso() {
        return curso;
    }

    public String getUnidad() {
        return unidad;
    }

    public String getNota() {
        return nota;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdregistro(int idregistro) {
        this.idregistro = idregistro;
    }

    public void setCod_alum(String cod_alum) {
        this.cod_alum = cod_alum;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public E_Notas(int idregistro, String cod_alum, String nombre, String ciclo, String curso, String unidad, String nota, String estado) {
        this.idregistro = idregistro;
        this.cod_alum = cod_alum;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.curso = curso;
        this.unidad = unidad;
        this.nota = nota;
        this.estado = estado;
    }

    public E_Notas(String curso) {
        this.curso = curso;
    }

    int idregistro;
    String cod_alum;
    String nombre;
    String ciclo;
    String curso;
    String unidad;
    String nota;
    String estado;

    public E_Notas() {

    }
    private ClsConexion mysql = new ClsConexion();
    private Connection conect = mysql.conectar();
    private String sSql = "";

    public void listarcursos(JComboBox<E_Notas> cbcursos) {

        sSql = "SELECT distinct curso FROM notas ;";
        try {
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(sSql);
            while (rs.next()) {
                cbcursos.addItem(
                        new E_Notas(
                                rs.getString("curso")
                        )
                );

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public String toString() {
        return curso;
    }

}
