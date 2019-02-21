package com.clgs.service.impl;

import org.springframework.jdae.access.pool.JdbcDAOSupport;
import org.springframework.stereotype.Service;

import com.clgs.service.CORE;
import com.clgs.service.TBL_MODULE_TYPEService;
import com.clgs.entity.TBL_MODULE_TYPE;


@Service
public class TBL_MODULE_TYPEServiceBean extends JdbcDAOSupport<CORE, TBL_MODULE_TYPE> implements TBL_MODULE_TYPEService {
	
}
