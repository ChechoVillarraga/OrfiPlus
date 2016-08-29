package com.orfiplus.model;
// Generated 29/08/2016 10:16:26 AM by Hibernate Tools 4.3.1



/**
 * Estado generated by hbm2java
 */
public class Estado  implements java.io.Serializable {


     private int idEstado;
     private String estadoJoya;
     private String descripcion;
     private Boolean estadoinfo;

    public Estado() {
    }

	
    public Estado(int idEstado) {
        this.idEstado = idEstado;
    }
    public Estado(int idEstado, String estadoJoya, String descripcion, Boolean estadoinfo) {
       this.idEstado = idEstado;
       this.estadoJoya = estadoJoya;
       this.descripcion = descripcion;
       this.estadoinfo = estadoinfo;
    }
   
    public int getIdEstado() {
        return this.idEstado;
    }
    
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    public String getEstadoJoya() {
        return this.estadoJoya;
    }
    
    public void setEstadoJoya(String estadoJoya) {
        this.estadoJoya = estadoJoya;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Boolean getEstadoinfo() {
        return this.estadoinfo;
    }
    
    public void setEstadoinfo(Boolean estadoinfo) {
        this.estadoinfo = estadoinfo;
    }




}


