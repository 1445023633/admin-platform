package com.clgs.service;

import org.springframework.jdae.access.pool.JdbcDAO;
import com.clgs.entity.TBL_POINTS_IMG;

public abstract interface TBL_POINTS_IMGService
  extends JdbcDAO<TBL_POINTS_IMG>
{
  public abstract String GetJcImgPath(String paramString);
}
