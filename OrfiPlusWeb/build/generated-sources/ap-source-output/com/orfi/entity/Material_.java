package com.orfi.entity;

import com.orfi.entity.Joya;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-01T21:16:55")
@StaticMetamodel(Material.class)
public class Material_ { 

    public static volatile SingularAttribute<Material, String> descripcion;
    public static volatile SingularAttribute<Material, String> urlMaterial;
    public static volatile SingularAttribute<Material, String> material;
    public static volatile SingularAttribute<Material, Integer> idMATERIAL;
    public static volatile SingularAttribute<Material, Boolean> estadoinfo;
    public static volatile SingularAttribute<Material, Integer> precioxmaterial;
    public static volatile ListAttribute<Material, Joya> joyaList;

}