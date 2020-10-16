package Entitys;

import Entitys.Cliente;
import Entitys.Detallefactura;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-28T17:58:56")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile SingularAttribute<Factura, Cliente> codCli;
    public static volatile ListAttribute<Factura, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Factura, Integer> idFactura;

}