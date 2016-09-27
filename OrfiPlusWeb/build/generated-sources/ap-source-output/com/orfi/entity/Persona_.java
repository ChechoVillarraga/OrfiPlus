package com.orfi.entity;

import com.orfi.entity.Orden;
import com.orfi.entity.Rol;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-24T20:13:23")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile SingularAttribute<Persona, String> correoe;
    public static volatile SingularAttribute<Persona, String> password;
    public static volatile ListAttribute<Persona, Orden> ordenList;
    public static volatile SingularAttribute<Persona, Integer> idPERSONAS;
    public static volatile SingularAttribute<Persona, Date> fechaCreacion;
    public static volatile SingularAttribute<Persona, Boolean> estadoinfo;
    public static volatile SingularAttribute<Persona, Integer> telefonos;
    public static volatile ListAttribute<Persona, Rol> rolList;
    public static volatile SingularAttribute<Persona, String> nombres;

}