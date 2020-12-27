/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cache;

import Datos.ClsConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class UserLoginCache {

    public static int getIdusuario() {
        return idusuario;
    }

    public static String getDni() {
        return dni;
    }

    public static String getNombre() {
        return nombre;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static String getContraseña() {
        return contraseña;
    }

    public static String getCargo() {
        return cargo;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setIdusuario(int idusuario) {
        UserLoginCache.idusuario = idusuario;
    }

    public static void setDni(String dni) {
        UserLoginCache.dni = dni;
    }

    public static void setNombre(String nombre) {
        UserLoginCache.nombre = nombre;
    }

    public static void setTelefono(String telefono) {
        UserLoginCache.telefono = telefono;
    }

    public static void setUsuario(String usuario) {
        UserLoginCache.usuario = usuario;
    }

    public static void setContraseña(String contraseña) {
        UserLoginCache.contraseña = contraseña;
    }

    public static void setCargo(String cargo) {
        UserLoginCache.cargo = cargo;
    }

    public static void setEstado(String estado) {
        UserLoginCache.estado = estado;
    }
    public static int idusuario;
    public static String dni;
    public static String nombre;
    public static String telefono;
    public static String usuario;
    public static String contraseña;
    public static String cargo;
    public static String estado;
    
     
    
   
}
