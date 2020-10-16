package Entitys;

import Entitys.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-28T17:58:56")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> codCli;
    public static volatile SingularAttribute<Cliente, String> dirCli;
    public static volatile SingularAttribute<Cliente, String> sexoCli;
    public static volatile SingularAttribute<Cliente, String> cedCli;
    public static volatile SingularAttribute<Cliente, String> apeCli;
    public static volatile SingularAttribute<Cliente, String> telCli;
    public static volatile SingularAttribute<Cliente, String> nomCli;
    public static volatile ListAttribute<Cliente, Factura> facturaList;
    public static volatile SingularAttribute<Cliente, String> emailCli;

}