package modelo;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Time.class)
public abstract class Time_ {

	public static volatile SingularAttribute<Time, Integer> codigo;
	public static volatile SingularAttribute<Time, String> estado;
	public static volatile SingularAttribute<Time, String> nome;

}

