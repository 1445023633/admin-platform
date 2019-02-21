package com.clgs.service.impl;

import java.io.PrintStream;
import java.util.List;
import org.springframework.jdae.Service;
import org.springframework.jdae.access.pool.JdbcDAOSupport;
import org.springframework.jdae.ds.JdaePersistence;
import org.springframework.jdae.init.Jdae;
import com.clgs.service.CORE;
import com.clgs.entity.TBL_POINTS_IMG;
import com.clgs.service.TBL_POINTS_IMGService;
import com.clgs.utils.KongUtil;

public class TBL_POINTS_IMGServiceBean
  extends JdbcDAOSupport<CORE, TBL_POINTS_IMG>
  implements TBL_POINTS_IMGService
{
  public static void main(String[] args)
  {
    Jdae.getInstance().init(JdbcDAOSupport.class, "jdae.properties");
    StringBuffer generatedText = new StringBuffer();
    
    JdaePersistence.closeThreadLocalConnection("clgs");
    System.out.println(generatedText);
  }
  
  public String GetJcImgPath(String PointID)
  {
    try
    {
      String strWhere = "POINT_ID='" + PointID + "'";
      List<String> lists = ((TBL_POINTS_IMGServiceBean)Service.get(TBL_POINTS_IMGServiceBean.class)).getSelectedListByCondition(String.class, "JC_IMG", 0, 1, new StringBuffer(strWhere), null, null, new Boolean[0]);
      if ((KongUtil.isNull(lists)) || (lists.size() == 0)) {
        return null;
      }
      return (String)lists.get(0);
    }
    catch (Exception d) {}
    return null;
  }
}
