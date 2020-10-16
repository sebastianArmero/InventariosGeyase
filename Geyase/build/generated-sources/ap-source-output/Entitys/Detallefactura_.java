package Entitys;

import Entitys.Factura;
import Entitys.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-28T17:58:56")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Integer> total;
    public static volatile SingularAttribute<Detallefactura, Integer> idDetalle;
    public static volatile SingularAttribute<Detallefactura, Factura> idFactura;
    public static volatile SingularAttribute<Detallefactura, Integer> cantidad;
    public static volatile SingularAttribute<Detallefactura, Integer> importe;
    public static volatile SingularAttribute<Detallefactura, Productos> codPro;

}