package persistencia;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Artigo;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-26T11:05:05")
@StaticMetamodel(Volume.class)
public class Volume_ { 

    public static volatile SingularAttribute<Volume, Date> data_inicio;
    public static volatile SingularAttribute<Volume, String> sigla_evento;
    public static volatile SingularAttribute<Volume, Integer> num_edicao;
    public static volatile SingularAttribute<Volume, String> cidade;
    public static volatile SingularAttribute<Volume, String> descr_ingles;
    public static volatile ListAttribute<Volume, Artigo> lista_artigos;
    public static volatile SingularAttribute<Volume, String> descr_port;
    public static volatile SingularAttribute<Volume, Long> id;

}