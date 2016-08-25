package com.orfi.entity;

import com.orfi.entity.Permiso;
import com.orfi.entity.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-24T16:17:58")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> descripcion;
    public static volatile SingularAttribute<Rol, Integer> idROL;
    public static volatile ListAttribute<Rol, Persona> personaList;
    public static volatile SingularAttribute<Rol, String> rol;
    public static volatile ListAttribute<Rol, Permiso> permisoList;

}