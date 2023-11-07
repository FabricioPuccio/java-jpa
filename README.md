# Práctica JPA

## Java Persistence API

### ¿Qué es JPA?

* JPA es un ORM (Object Relational Mapping) que tiene como objetivo lograr la persistencia de datos entre una aplicación desarrolada en Java y una base de datos.

* JPA busca traducir el modelado de las clases Java a un modelado relacional en una base de datos, posibilitando al programador/a elegir qué clase u objetos quiere persistir.

### ¿Cómo funciona JPA?

* JPA se vale de una serie de mapeos que se deben realizar sobra cada uno de los elementos de una clase, los mismos, se representan mediante annotations **@**.

* JPA cuenta con proveedores de JPA, entre ellos EclipseLink, Hibernate, TopLink, entre otros.

_Para la construcción y gestión de este proyecto se utiliza Maven, el IDE NetBeans, EclipseLink como proveedor de JPA y Mysql Workbench como administrador de base de datos._