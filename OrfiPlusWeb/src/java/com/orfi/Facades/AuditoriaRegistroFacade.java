/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orfi.Facades;

import com.orfi.entity.AuditoriaRegistro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author seanv
 */
@Stateless
public class AuditoriaRegistroFacade extends AbstractFacade<AuditoriaRegistro> {

    @PersistenceContext(unitName = "OrfiPlusWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuditoriaRegistroFacade() {
        super(AuditoriaRegistro.class);
    }
    
}
