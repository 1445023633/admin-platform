package com.clgs.utils;

import java.util.ArrayList;
import java.util.List;

public class Creatindexgroup {
   
	List<String> lst= new ArrayList<String>();   
	  
 public	Creatindexgroup(List<String> list)
	  {
		this.lst=list;
	  }
	  public  List<String>  comprsise()
	  {
		  List<String> lst1= new ArrayList<String>();   
		  String temp;
		  		  
		  if(lst.size()==1)
		  {
			  for(int i=0;i<lst.get(0).trim().length();i++)
			  {
				  temp=lst.get(0).substring(i, i+1);
				  lst1.add(temp);
				  System.out.println(temp);
			  }
			  
			  
			  

		  }
		  if(lst.size()==2)
		  {
			  for(int i=0;i<lst.get(0).trim().length();i++)
			  {
				  
				  for(int j=0;j<lst.get(1).trim().length();j++)
				  {
					 temp= lst.get(0).subSequence(i, i+1)+lst.get(1).substring(j, j+1);				 
					 lst1.add(temp);
//					 lst1.add(lst.get(1).substring(j, j+1).toString());
					 System.out.println(temp);
				  }
//				  lst1.add(lst.get(0).subSequence(i, i+1).toString());
			  }
			 
		  }
		  if(lst.size()==3&&lst.size()>3)
		  {
			  for(int i=0;i<lst.get(0).trim().length();i++)
			  {
				 
				  for(int j=0;j<lst.get(1).trim().length();j++)
				  {
					  
					  for(int k=0;k<lst.get(2).trim().length();k++)
					  {
						 temp= lst.get(0).subSequence(i, i+1)+lst.get(1).substring(j, j+1)+lst.get(2).substring(k, k+1);						
						 lst1.add(temp);
//						 lst1.add(lst.get(2).substring(k, k+1).toString());	
						 System.out.println(temp);
					  }
//					  lst1.add(lst.get(1).substring(j, j+1).toString());	
				  }
//				  lst1.add(lst.get(0).subSequence(i, i+1).toString());
			  }
			 
		  }
		  return lst1;
		 
	  }
	  
}
