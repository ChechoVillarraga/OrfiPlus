/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orfi.Facades;

import com.orfi.entity.Joya;
import com.orfi.entity.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author seanv
 */
@Stateless
public class JoyaFacade extends AbstractFacade<Joya> {

    @PersistenceContext(unitName = "OrfiPlusWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JoyaFacade() {
        super(Joya.class);
    }
    
    public List<Joya> consultarJoya() {
        List<Joya> joya = null;
        try {
            TypedQuery<Joya> query = em.createNamedQuery("Joya.findAll", Joya.class);
            joya = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            System.out.println("Error en envio de datos");
        }

        return joya;
    }
    
}
