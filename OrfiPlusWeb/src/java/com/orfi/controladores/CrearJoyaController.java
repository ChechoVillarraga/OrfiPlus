/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orfi.controladores;

import com.orfi.Facades.EstadoFacade;
import com.orfi.Facades.JoyaFacade;
import com.orfi.Facades.TipoFacade;
import com.orfi.entity.Estado;
import com.orfi.entity.Joya;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author seanv
 */
@Named(value = "crearJoyaController")
@RequestScoped
public class CrearJoyaController implements Serializable {

    private Joya joya;

    @EJB
    private JoyaFacade joyaFacade;
    @EJB
    private TipoFacade tipoFacade;
    @EJB
    private EstadoFacade estadoFacade;

    @PostConstruct
    public void init() {
        joya = new Joya();

    }

    public Joya getJoya() {
        return joya;
    }

    public void setJoya(Joya joya) {
        this.joya = joya;
    }

    public void registrarJoya() {
        try {
            joya.setEstadoinfo(Boolean.TRUE);
            Estado estado = estadoFacade.find(103015);
            joya.setIdEstado(estado);
            joyaFacade.create(joya);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Creaciòn", "Se ha registrado corectamente"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Error en envio de datos");
        }

    }

    public List<Joya> verJoyasSolicitadas() {
        List<Joya> joyaObj = joyaFacade.findAll();
        return joyaObj;
    }

}
