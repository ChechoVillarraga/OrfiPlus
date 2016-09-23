package com.orfi.controladores;

import com.orfi.Facades.DisenioFacade;
import com.orfi.entity.Disenio;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;

@Named(value = "disenioController")
@ViewScoped
public class DisenioController extends AbstractController<Disenio> {
    
    private Disenio disenio;

    @EJB
    private DisenioFacade disenioFacade;

    @PostConstruct
    public void init() {
        disenio = new Disenio();
    }

    public DisenioController() {
        // Inform the Abstract parent controller of the concrete Disenio Entity
        super(Disenio.class);
    }

    /**
     * Sets the "items" attribute with a collection of Joya entities that are
     * retrieved from Disenio?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Joya page
     */
    public String navigateJoyaList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Joya_items", this.getSelected().getJoyaList());
        }
        return "/protegido/pages/joya/index";
    }
    
    public List<Disenio> getAll() {
        List<Disenio> li = disenioFacade.findAll();
        return li;
    }

}
