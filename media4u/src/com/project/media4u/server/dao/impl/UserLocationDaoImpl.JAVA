package com.project.media4u.server.dao.impl;

import org.springframework.orm.jpa.JpaTemplate;

import com.project.media4u.server.dao.UserLocationDao;
import com.project.media4u.server.dao.base.AbstractDao;
import com.project.media4u.server.entities.UserLocation;

public class UserLocationDaoImpl extends AbstractDao<UserLocation> implements UserLocationDao {

	public UserLocationDaoImpl(JpaTemplate jpaTemplate) {
		super(jpaTemplate);
	}

	@Override
	public UserLocation getUserLocation(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
