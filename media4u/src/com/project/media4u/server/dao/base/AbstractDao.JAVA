package com.project.media4u.server.dao.base;

import org.springframework.orm.jpa.JpaTemplate;

import com.project.media4u.server.entities.EntityBase;

public class AbstractDao<T extends EntityBase> {
	
	protected final JpaTemplate jpaTemplate;

	public AbstractDao(JpaTemplate jpaTemplate) {
		this.jpaTemplate=jpaTemplate;
	}
	
	public T findById(Class<T> entityClass,Long id){
		return jpaTemplate.find(entityClass, id);
	}
	

}
