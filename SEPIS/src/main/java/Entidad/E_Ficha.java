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
public class E_Ficha {
    public E_Ficha(){
    
    }

    public int getIdregistro() {
        return idregistro;
    }

    public String getCod_alum() {
        return cod_alum;
    }

    public String getProblema_academico() {
        return problema_academico;
    }

    public String getProblema_personal() {
        return problema_personal;
    }

    public String getAcuerdo_academico() {
        return acuerdo_academico;
    }

    public String getAcuerdo_personal() {
        return acuerdo_personal;
    }

    public String getObservacion_academico() {
        return observacion_academico;
    }

    public String getObservacion_personal() {
        return observacion_personal;
    }

    public void setIdregistro(int idregistro) {
        this.idregistro = idregistro;
    }

    public void setCod_alum(String cod_alum) {
        this.cod_alum = cod_alum;
    }

    public void setProblema_academico(String problema_academico) {
        this.problema_academico = problema_academico;
    }

    public void setProblema_personal(String problema_personal) {
        this.problema_personal = problema_personal;
    }

    public void setAcuerdo_academico(String acuerdo_academico) {
        this.acuerdo_academico = acuerdo_academico;
    }

    public void setAcuerdo_personal(String acuerdo_personal) {
        this.acuerdo_personal = acuerdo_personal;
    }

    public void setObservacion_academico(String observacion_academico) {
        this.observacion_academico = observacion_academico;
    }

    public void setObservacion_personal(String observacion_personal) {
        this.observacion_personal = observacion_personal;
    }

    public E_Ficha(int idregistro, String cod_alum, String problema_academico, String problema_personal, String acuerdo_academico, String acuerdo_personal, String observacion_academico, String observacion_personal,String nombre,String fecha) {
        this.idregistro = idregistro;
        this.cod_alum = cod_alum;
        this.problema_academico = problema_academico;
        this.problema_personal = problema_personal;
        this.acuerdo_academico = acuerdo_academico;
        this.acuerdo_personal = acuerdo_personal;
        this.observacion_academico = observacion_academico;
        this.observacion_personal = observacion_personal;
        this.nombre=nombre;
        this.fecha=fecha;
    }

    int idregistro;
    String cod_alum;
    String problema_academico;
    String problema_personal;
    String acuerdo_academico;
    String acuerdo_personal;
     String observacion_academico;
    String observacion_personal;
      String nombre;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
      String fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   // String nombre;
}
