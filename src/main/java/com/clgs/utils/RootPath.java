package com.clgs.utils;


public class RootPath {
	public static String getRootPath() {
		// ��Ϊ����Ϊ"Application"�����" Application.class"һ�����ҵ�
		String result = RootPath.class.getResource("RootPath.class").toString();
		int index = result.indexOf("WEB-INF");
		if (index == -1) {
			index = result.indexOf("bin");
		}
		result = result.substring(0, index);
		if (result.startsWith("jar")) {
			// ��class�ļ���jar�ļ���ʱ������"jar:file:/F:/ ..."����·��
			result = result.substring(10);
		} else if (result.startsWith("file")) {
			// ��class�ļ���class�ļ���ʱ������"file:/F:/ ..."����·��
			result = result.substring(6);
		}
		if (result.endsWith("/"))
			result = result.substring(0, result.length() - 1);// ����������"/"
		return result;
	}

	public static String getProjectPath() {
//		java.net.URL url = RootPath.class.getProtectionDomain().getCodeSource()
//				.getLocation();
//		String filePath = null;
//		try {
//			filePath = java.net.URLDecoder.decode(url.getPath(), "utf-8");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		if (filePath.endsWith(".jar"))
//			filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1);
//		if(filePath.indexOf("file")>0){filePath=filePath.split("file")[0].trim();}
//		if(filePath.indexOf("File")>0){filePath=filePath.split("File")[0].trim();}
//		System.out.println("FilePath:"+filePath);
//		java.io.File file = new java.io.File(filePath);
//		filePath = file.getAbsolutePath();
//		return filePath;
		String filePath=XmlHelper.GetXmlNodeText("Log", "/ServerConfig.xml");
		return filePath;
	}
}
