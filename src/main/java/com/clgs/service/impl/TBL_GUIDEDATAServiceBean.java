package com.clgs.service.impl;


import com.clgs.service.CORE;
import com.clgs.service.TBL_GUIDEDATAService;

import org.springframework.jdae.access.pool.JdbcDAOSupport;
import org.springframework.stereotype.Service;

import com.clgs.entity.TBL_GUIDEDATA;

@Service
public class TBL_GUIDEDATAServiceBean extends JdbcDAOSupport<CORE, TBL_GUIDEDATA> implements TBL_GUIDEDATAService {

}
