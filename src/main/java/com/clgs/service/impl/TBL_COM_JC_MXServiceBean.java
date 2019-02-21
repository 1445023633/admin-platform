package com.clgs.service.impl;

import org.springframework.jdae.access.pool.JdbcDAOSupport;
import org.springframework.stereotype.Service;

import com.clgs.service.CORE;
import com.clgs.service.TBL_COM_JC_MXService;
import com.clgs.entity.TBL_COM_JC_MX;


@Service
public class TBL_COM_JC_MXServiceBean extends JdbcDAOSupport<CORE, TBL_COM_JC_MX> implements TBL_COM_JC_MXService {

}
