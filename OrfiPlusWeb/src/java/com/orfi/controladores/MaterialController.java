package com.orfi.controladores;

import com.orfi.Facades.MaterialFacade;
import com.orfi.Facades.TipoFacade;
import com.orfi.entity.Material;
import com.orfi.entity.Tipo;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "materialController")
@ViewScoped
public class MaterialController extends AbstractController<Material> {
    
    private Material material;

    @EJB
    private MaterialFacade materialFacade;

    @PostConstruct
    public void init() {
        material = new Material();
    }

    public MaterialController() {
        // Inform the Abstract parent controller of the concrete Material Entity
        super(Material.class);
    }

    /**
     * Sets the "items" attribute with a collection of Joya entities that are
     * retrieved from Material?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Joya page
     */
    public String navigateJoyaList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Joya_items", this.getSelected().getJoyaList());
        }
        return "/protegido/pages/joya/index";
    }

    public List<Material> getAll() {
        List<Material> li = materialFacade.findAll();
        return li;
    }
    
}
