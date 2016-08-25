package com.orfi.entity;

import com.orfi.entity.Joya;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-24T16:17:58")
@StaticMetamodel(Disenio.class)
public class Disenio_ { 

    public static volatile SingularAttribute<Disenio, Integer> idDISENIO;
    public static volatile SingularAttribute<Disenio, String> descripcion;
    public static volatile SingularAttribute<Disenio, Boolean> estadoinfo;
    public static volatile SingularAttribute<Disenio, Integer> precioxdisenio;
    public static volatile SingularAttribute<Disenio, String> disenio;
    public static volatile ListAttribute<Disenio, Joya> joyaList;
    public static volatile SingularAttribute<Disenio, String> urlDisenio;

}