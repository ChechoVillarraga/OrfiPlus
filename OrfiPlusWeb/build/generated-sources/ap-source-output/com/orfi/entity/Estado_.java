package com.orfi.entity;

import com.orfi.entity.Joya;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-24T20:13:23")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, Integer> idESTADO;
    public static volatile SingularAttribute<Estado, String> descripcion;
    public static volatile SingularAttribute<Estado, String> estadoJoya;
    public static volatile SingularAttribute<Estado, Boolean> estadoinfo;
    public static volatile ListAttribute<Estado, Joya> joyaList;

}