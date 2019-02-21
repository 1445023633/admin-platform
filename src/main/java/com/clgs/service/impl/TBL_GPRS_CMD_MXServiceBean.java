package com.clgs.service.impl;

import org.springframework.jdae.access.pool.JdbcDAOSupport;
import org.springframework.stereotype.Service;

import com.clgs.service.CORE;
import com.clgs.service.TBL_GPRS_CMD_MXService;
import com.clgs.entity.TBL_GPRS_CMD_MX;

@Service
public class TBL_GPRS_CMD_MXServiceBean extends JdbcDAOSupport<CORE, TBL_GPRS_CMD_MX> implements TBL_GPRS_CMD_MXService {
	
}
