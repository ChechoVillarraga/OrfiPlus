/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orfi.controladores;

import com.orfi.Facades.DisenioFacade;
import com.orfi.entity.Disenio;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author USUARIO
 */
@Named(value = "ControllerDisenios")
@RequestScoped
public class ControllerDisenios implements Serializable {
      @EJB
    private DisenioFacade disenioFacade;
      private Disenio disenio;
      
        private boolean estado;

    public Disenio getDisenio() {
        return disenio;
    }

    public void setDisenio(Disenio disenio) {
        this.disenio = disenio;
    }

 public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
      @PostConstruct
    public void init() {
        disenio = new Disenio();

    }
    
     public List<Disenio> verDisenios() {
        List<Disenio> per = disenioFacade.consultarDiseno();
        return per;
    }
       public void registrarDisenio() {
        try {          
            disenioFacade.create(disenio);
              estado = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Error en envio de datos");
        }
    }
             public void cambiarEstado() {
        estado = false;
    }
}
