package persistencia;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Autor;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-26T11:05:05")
@StaticMetamodel(Artigo.class)
public class Artigo_ { 

    public static volatile SingularAttribute<Artigo, String> palavras_chave_ingles;
    public static volatile SingularAttribute<Artigo, Integer> num_paginas;
    public static volatile SingularAttribute<Artigo, String> titulo_ingles;
    public static volatile SingularAttribute<Artigo, String> palavras_chave_orig;
    public static volatile SingularAttribute<Artigo, Integer> num_ordem;
    public static volatile SingularAttribute<Artigo, String> titulo_original;
    public static volatile SingularAttribute<Artigo, String> idioma;
    public static volatile ListAttribute<Artigo, Autor> lista_autores;
    public static volatile SingularAttribute<Artigo, Long> id;
    public static volatile SingularAttribute<Artigo, String> resumo_original;
    public static volatile SingularAttribute<Artigo, String> resumo_ingles;

}