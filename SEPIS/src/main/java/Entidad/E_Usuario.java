/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Administrador
 */
public class E_Usuario {

    public E_Usuario() {

    }

    public E_Usuario(int idusuario, String dni, String nombre, String apellido, String telefono, String usuario, String contraseña, String cargo, String estado) {
        this.dni = dni;
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cargo = cargo;
        this.estado = estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    int idusuario;
    public static String dni;
    public static String nombre;
    public static String apellido;
    public static String telefono;
    public static String usuario;
    public static String contraseña;
    public static String cargo;
    public static String estado;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
