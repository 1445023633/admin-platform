package com.clgs.service;

import org.springframework.jdae.access.pool.JdbcDAO;

import com.clgs.entity.TBL_USER;

public interface TBL_USERService extends JdbcDAO<TBL_USER> {

	
	public boolean validate(String manager_id, String password);
}
