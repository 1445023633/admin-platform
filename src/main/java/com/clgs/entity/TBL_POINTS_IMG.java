package com.clgs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TBL_POINTS_IMG  implements Serializable{
  //@PK
  @Id
  private String POINT_ID;
  private String JC_IMG;
  private String JC_EXTIMG;
  
  public String getPOINT_ID()
  {
    return this.POINT_ID;
  }
  
  public void setPOINT_ID(String point_id)
  {
    this.POINT_ID = point_id;
  }
  
  public String getJC_IMG()
  {
    return this.JC_IMG;
  }
  
  public void setJC_IMG(String jc_img)
  {
    this.JC_IMG = jc_img;
  }
  
  public String getJC_EXTIMG()
  {
    return this.JC_EXTIMG;
  }
  
  public void setJC_EXTIMG(String jc_extimg)
  {
    this.JC_EXTIMG = jc_extimg;
  }
}
