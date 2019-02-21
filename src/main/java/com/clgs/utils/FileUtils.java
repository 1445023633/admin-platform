package com.clgs.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.UUID;

public class FileUtils {

	public static String getTxtContent(String webPath, String fileName) {

		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		String line = null;
		File footFile = null;
		StringBuffer sb = new StringBuffer();

		try {
			footFile = new File(webPath, fileName);
			if (!footFile.exists())
				footFile.createNewFile();

			fis = new FileInputStream(footFile);
			isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);
			line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (isr != null)

						isr.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (fis != null)
							fis.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		}

		return sb.toString();
	}
	public static String getTxtContentAddBr(String webPath, String fileName) {

		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		String line = null;
		File footFile = null;
		StringBuffer sb = new StringBuffer();

		try {
			footFile = new File(webPath, fileName);
			if (!footFile.exists())
				footFile.createNewFile();

			fis = new FileInputStream(footFile);
			isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);
			line = br.readLine();
			while (line != null) {
				sb.append(line).append("<br />");
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (isr != null)

						isr.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (fis != null)
							fis.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		}

		return sb.toString();
	}
	
	
	
	/**
	 * ��contentд�뵽webPath�µ�fileName
	 * @param content
	 * @param webPath
	 * @param fileName  ����/��ͷ
	 */
	public static void setTxtContent(String content, String webPath,
			String fileName) {
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		File footFile = null;
		try {
			footFile = new File(webPath, fileName);
			if (!footFile.exists())
				footFile.createNewFile();
			fos = new FileOutputStream(footFile);
			osw = new OutputStreamWriter(fos, "UTF-8");
			bw = new BufferedWriter(osw);
			
			bw.write(content, 0, content.length());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (bw != null)
					bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (osw != null)

						osw.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (fos != null)
							fos.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		}

	}
	
	/**
	 * ��contentд�뵽webPath�µ�fileName
	 * @param content
	 * @param webPath
	 * @param fileName  ����/��ͷ
	 * @throws IOException 
	 */
	public static void setTxtContentMinusBr(String content, String webPath,
			String fileName) throws IOException {
			
			
			
			FileInputStream fis = null;
			InputStreamReader isr = null;
			BufferedReader br = null;
			String line = null;
			File footFile = null;
			PrintStream ps=null;
			File tempFile=null;
				
			try {	
				footFile = new File(webPath, fileName);
				if (footFile.exists())
					footFile.delete();
				
				if (!footFile.exists())
					footFile.createNewFile();
				
				String realDir=footFile.getParent();
				
				String tempFileName=UUID.randomUUID().toString();
				
				tempFile=new File(realDir,tempFileName);
				if(!tempFile.exists())
					tempFile.createNewFile();
				
				setTxtContent(content,realDir, tempFileName);
				
				fis = new FileInputStream(tempFile);
				isr = new InputStreamReader(fis, "UTF-8");
				br = new BufferedReader(isr);
				
				
				ps=new PrintStream(footFile);//һ��Ҫʹ��ps
				
				line = br.readLine();
				while (line != null) {
					
					line=line.replace("<br />", "");
					ps.println(line);
					
					line = br.readLine();
				}
				
				
				
			
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
		
				try {
					if (br != null)
						br.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (isr != null)
		
							isr.close();
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							if (fis != null)
								fis.close();
						} catch (Exception e) {
							e.printStackTrace();
						}finally{
							try {
								if (ps != null)
									ps.close();
							} catch (Exception e) {
								e.printStackTrace();
								
							
							}finally{
								tempFile.delete();
							}
					}
				}
		
			}

			
			
			
			
		

			}
	
	

}
}
