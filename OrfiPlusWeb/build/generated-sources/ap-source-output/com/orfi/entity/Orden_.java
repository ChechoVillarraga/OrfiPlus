package com.orfi.entity;

import com.orfi.entity.Joya;
import com.orfi.entity.Persona;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-01T21:16:55")
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile ListAttribute<Orden, Persona> personaList;
    public static volatile SingularAttribute<Orden, Integer> valorTotal;
    public static volatile SingularAttribute<Orden, Date> fechaEntrega;
    public static volatile SingularAttribute<Orden, Boolean> estadoinfo;
    public static volatile SingularAttribute<Orden, Integer> idORDEN;
    public static volatile SingularAttribute<Orden, Date> fechaOrden;
    public static volatile ListAttribute<Orden, Joya> joyaList;

}