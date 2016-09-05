package com.orfi.entity;

import com.orfi.entity.Joya;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-01T21:16:55")
@StaticMetamodel(Tipo.class)
public class Tipo_ { 

    public static volatile SingularAttribute<Tipo, String> descripcion;
    public static volatile SingularAttribute<Tipo, String> tipo;
    public static volatile SingularAttribute<Tipo, Integer> precioxtipo;
    public static volatile SingularAttribute<Tipo, String> urlTipo;
    public static volatile SingularAttribute<Tipo, Integer> idTIPO;
    public static volatile SingularAttribute<Tipo, Boolean> estadoinfo;
    public static volatile ListAttribute<Tipo, Joya> joyaList;

}