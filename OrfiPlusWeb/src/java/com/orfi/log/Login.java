package com.orfi.log;

import com.orfi.entity.Persona;
import com.orfi.Facades.PersonaFacade;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

@ManagedBean
@SessionScoped
public class Login implements Serializable {

    private static final long serialVersionUID = 1094801825228386363L;

    private String pwd;
    private String msg;
    private String user;
    private Persona usuario;
    
    @Inject
    private PersonaFacade perFacade;

    public Login() {
        usuario = null;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }
    

    //validate login
    public String validateUsernamePassword() {
        //TAREA: VERIFICAR como instalarle un filtro para que no se totteeee esto cuando no retorne datos
        
        //arma el mapa con los valores que se van a incluir como filtos en la consulta ej Carlos y Ramirez
        Map<String, Object> filtro = new HashMap<>();
        //SE enlistan el campo y el valor que se quieren a?adir al filtro. Si se desean mas coopie y pegue la linea
        filtro.put("nombres", "Nelson");
        
        //a?ade los resultados de la consulta en una lista para que pasos posteriores solo se disponga de estos datos filtrados.
        List<Persona> personas = perFacade.fitro(filtro);
        
        
        //boolean valid = LoginDAO.validate(user, pwd); esta linea era del antiguo login
        //para usar La entidad Facade la cual hace toda la consulta sin aramar mas codigos
        Persona per = perFacade.validate(user, pwd);
        // si retorno un objeto o no
        if (per != null) {
            //Ni ideaa porque cargo eso asi.
            usuario = per;
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", per);
            //retorna un valor, esto es del login original
            return "protegido/index?faces-redirect=true";
        } else {
            //Esta mal los datos de login retoran mensaje de error
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            return "login";
        }
    }

    //Para cerrar la sesion efectivamente necesita eliminar todo dato cargado en las variables
    public String logout() {
        user = "";
        pwd = "";
        msg = "";
        usuario = null;
        HttpSession session = SessionUtils.getSession();
        session.invalidate();
        return "login";
    }
}
