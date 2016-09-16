/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orfi.controladores;

import com.orfi.Facades.PersonaFacade;
import com.orfi.Facades.RolFacade;
import com.orfi.entity.Persona;
import com.orfi.entity.Rol;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author seanv
 */
@Named(value = "clienteController")
@RequestScoped
public class ClienteController implements Serializable {

    private String confirmarPsw;
    
    @EJB
    private PersonaFacade personaFacade;
    @EJB
    private RolFacade rolFacade;
    private Persona persona;

    /**
     * Creates a new instance of EmpleadoController
     */
    @PostConstruct
    public void init() {
        persona = new Persona();

    }
    
    

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void registrarCliente() {
        try {
            Rol rol = rolFacade.find(101011);
            persona.setRolList(new ArrayList<>());
            persona.getRolList().add(rol);
            persona.setFechaCreacion(new Date());
            personaFacade.create(persona);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Error en envio de datos");
        }
    }
    
    public String cancelar(){
        return "principal";
    }
    
    public List<Persona> verClientesController() {
        List<Persona> per = personaFacade.consultarPersonas();
        return per;
    }

    public String getConfirmarPsw() {
        return confirmarPsw;
    }

    public void setConfirmarPsw(String confirmarPsw) {
        this.confirmarPsw = confirmarPsw;
    }

    
    
}
