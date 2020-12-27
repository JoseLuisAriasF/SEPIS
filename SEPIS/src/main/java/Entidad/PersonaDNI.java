/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Yanqui
 */
public class PersonaDNI {
 private String dni;
 private float cui;
 private String apellido_paterno;
 private String apellido_materno;
 private String nombres;


 // Getter Methods 

 public String getDni() {
  return dni;
 }

 public float getCui() {
  return cui;
 }

 public String getApellido_paterno() {
  return apellido_paterno;
 }

 public String getApellido_materno() {
  return apellido_materno;
 }

 public String getNombres() {
  return nombres;
 }

 // Setter Methods 

 public void setDni(String dni) {
  this.dni = dni;
 }

 public void setCui(float cui) {
  this.cui = cui;
 }

 public void setApellido_paterno(String apellido_paterno) {
  this.apellido_paterno = apellido_paterno;
 }

 public void setApellido_materno(String apellido_materno) {
  this.apellido_materno = apellido_materno;
 }

 public void setNombres(String nombres) {
  this.nombres = nombres;
 }
}
