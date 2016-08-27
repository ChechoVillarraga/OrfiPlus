package com.orfi.entity;

import com.orfi.entity.Disenio;
import com.orfi.entity.Estado;
import com.orfi.entity.Material;
import com.orfi.entity.Orden;
import com.orfi.entity.Tipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-08-27T04:48:50")
@StaticMetamodel(Joya.class)
public class Joya_ { 

    public static volatile SingularAttribute<Joya, String> talla;
    public static volatile SingularAttribute<Joya, String> urlJoya;
    public static volatile SingularAttribute<Joya, Material> idMaterial;
    public static volatile SingularAttribute<Joya, Orden> idOrden;
    public static volatile SingularAttribute<Joya, Integer> valorUnitario;
    public static volatile SingularAttribute<Joya, Integer> gramaje;
    public static volatile SingularAttribute<Joya, Estado> idEstado;
    public static volatile SingularAttribute<Joya, String> inscripcion;
    public static volatile SingularAttribute<Joya, Integer> valorTotal;
    public static volatile SingularAttribute<Joya, Integer> idJoya;
    public static volatile SingularAttribute<Joya, Boolean> estadoinfo;
    public static volatile SingularAttribute<Joya, Tipo> idTipo;
    public static volatile SingularAttribute<Joya, Integer> cantidad;
    public static volatile SingularAttribute<Joya, Disenio> idDisenio;

}