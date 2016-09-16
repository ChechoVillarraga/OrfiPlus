package com.orfi.entity;

import com.orfi.entity.Permiso;
import com.orfi.entity.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-05T17:38:29")
@StaticMetamodel(Permiso.class)
public class Permiso_ { 

    public static volatile SingularAttribute<Permiso, String> descripcion;
    public static volatile SingularAttribute<Permiso, String> permiso;
    public static volatile SingularAttribute<Permiso, Integer> idPERMISOS;
    public static volatile SingularAttribute<Permiso, String> urlPermisos;
    public static volatile ListAttribute<Permiso, Rol> rolList;
    public static volatile ListAttribute<Permiso, Permiso> permisoList;
    public static volatile SingularAttribute<Permiso, Permiso> pERMISOSidPERMISOS;

}