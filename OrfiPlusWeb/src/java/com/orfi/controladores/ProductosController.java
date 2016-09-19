/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orfi.controladores;

import com.orfi.Facades.JoyaFacade;
import com.orfi.entity.Joya;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author USUARIO
 */
@Named(value = "ProductosController")
@RequestScoped
public class ProductosController implements Serializable  {
    @EJB
    private JoyaFacade joyaFacade;
    
     public List<Joya> verProductos() {
        List<Joya> per = joyaFacade.consultarJoya();
        return per;
    }
    
}
