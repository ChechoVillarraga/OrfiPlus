/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orfi.controladores;

import com.orfi.Facades.MaterialFacade;
import com.orfi.entity.Material;
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
@Named(value = "materialesVController")
@RequestScoped
public class materialesVController implements Serializable {
    @EJB
    private MaterialFacade materialFacate;
    private Material material;
    
      public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    
     private boolean estado;

 public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
     @PostConstruct
    public void init() {
        material = new Material();

    }
    
     public List<Material> verMaterias() {
        List<Material> per = materialFacate.consultarMaterias();
        return per;
    }
            public void registrarMaterial() {
        try {          
            materialFacate.create(material);
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
