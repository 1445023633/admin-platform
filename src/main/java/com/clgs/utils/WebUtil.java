package com.clgs.utils;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;












/**
 * 
 * @author Administrator
 * 
 */
public class WebUtil {
	
	
	public static String webPath ;
	
	/**
	 * ȥ��html����
	 * 
	 * @param inputString
	 * @return
	 */
	public static String HtmltoText(String inputString) {
		String htmlStr = inputString; // ��html��ǩ���ַ���
		String textStr = "";
		java.util.regex.Pattern p_script;
		java.util.regex.Matcher m_script;
		java.util.regex.Pattern p_style;
		java.util.regex.Matcher m_style;
		java.util.regex.Pattern p_html;
		java.util.regex.Matcher m_html;
		java.util.regex.Pattern p_ba;
		java.util.regex.Matcher m_ba;

		try {
			String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>"; // ����script��������ʽ{��<script[^>]*?>[\\s\\S]*?<\\/script>
			// }
			String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>"; // ����style��������ʽ{��<style[^>]*?>[\\s\\S]*?<\\/style>
			// }
			String regEx_html = "<[^>]+>"; // ����HTML��ǩ��������ʽ
			String patternStr = "\\s+";

			p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
			m_script = p_script.matcher(htmlStr);
			htmlStr = m_script.replaceAll(""); // ����script��ǩ

			p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
			m_style = p_style.matcher(htmlStr);
			htmlStr = m_style.replaceAll(""); // ����style��ǩ

			p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
			m_html = p_html.matcher(htmlStr);
			htmlStr = m_html.replaceAll(""); // ����html��ǩ

			p_ba = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
			m_ba = p_ba.matcher(htmlStr);
			htmlStr = m_ba.replaceAll(""); // ���˿ո�

			textStr = htmlStr;

		} catch (Exception e) {
			System.err.println("Html2Text: " + e.getMessage());
		}
		return textStr;// �����ı��ַ���
	}

	/**
	 * ��ȡ���������� http://robocup.csu.edu.cn:8088/
	 * 
	 * @param request
	 * @return
	 */
	public static String getDomain(HttpServletRequest request) {
		String domain = null;
		if (request.getServerPort() != 80)
			domain = request.getScheme() + "://" + request.getServerName()
					+ ":" + request.getServerPort()+request.getContextPath()+"/";
		else {
			domain = request.getScheme() + "://" + request.getServerName()+request.getContextPath()+"/";
		}
		return domain;
		
		
	}
	
	/**
	 * ��ȡ���������� http://robocup.csu.edu.cn:8088/
	 * 
	 * @param request
	 * @return
	 */
	public static String getDomainSimple(HttpServletRequest request) {
		String domain = null;
		if (request.getServerPort() != 80)
			domain = request.getScheme() + "://" + request.getServerName()
					+ ":" + request.getServerPort()+request.getContextPath();
		else {
			domain = request.getScheme() + "://" + request.getServerName()+request.getContextPath();
		}
		return domain;
		
	}

	/**
	 * ��ȡ��Դ��ַ
	 * 
	 * @param request
	 * @return
	 */
	public static String getReferer(HttpServletRequest request) {
		
		String referer=request.getHeader("referer");
		String requestURL=getAccessPage(request);
		if(referer.equals(requestURL)){
			
			return "refresh page";
		}
		else
			return referer;
		
	}
	/**
	 * �п��ܷ���null
	 * @param request
	 * @return
	 */
	public static String getRefererShort(HttpServletRequest request) {
		String referer=request.getHeader("referer");
		//System.out.println("����ҳ��:"+referer);
		String requestURL=getAccessPage(request);
		if(referer.equals(requestURL)){
			
			return null;
		}
		else{
			int domainLength=getDomain(request).length();
			
			return referer.substring(domainLength-1);
		}
	}
	
	public static String getPrivilegeUrl(HttpServletRequest request) {
		String privielegUrl = request.getRequestURL().toString();
		int domainLength=getDomain(request).length();
		return privielegUrl.substring(domainLength-1);
		
	}
	
	
	
	/**
	 * ��ȡ����ҳ��
	 * @param request
	 * @return
	 */
	public static String getAccessPage(HttpServletRequest request){
		
		StringBuffer requestURL=request.getRequestURL();
		
		String queryString=request.getQueryString();
		if(queryString!=null){
			
			requestURL.append("?").append(queryString);
		}
		
		return  requestURL.toString();
	}

	/**
	 * ��ȡ�ͻ���IP��ַ
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @return
	 */
	public static String getIPAddress(HttpServletRequest request) {
		String ipAddress = null;
		// ipAddress = this.getRequest().getRemoteAddr();
		ipAddress = request.getHeader("x-forwarded-for");
		if (ipAddress == null || ipAddress.length() == 0
				|| "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("Proxy-Client-IP");
		}
		if (ipAddress == null || ipAddress.length() == 0
				|| "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ipAddress == null || ipAddress.length() == 0
				|| "unknown".equalsIgnoreCase(ipAddress)) {
			ipAddress = request.getRemoteAddr();
			if (ipAddress.equals("127.0.0.1")) {
				// ��������ȡ�������õ�IP
				InetAddress inet = null;
				try {
					inet = InetAddress.getLocalHost();
				} catch (UnknownHostException e) {
					e.printStackTrace();
				}
				ipAddress = inet.getHostAddress();
			}

		}

		// ����ͨ�����������������һ��IPΪ�ͻ�����ʵIP,���IP����','�ָ�
		if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()
			// = 15
			if (ipAddress.indexOf(",") > 0) {
				ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
			}
		}
		return ipAddress;

	}
	/**
	 * ��ȡ�û�������汾
	 * @param request
	 * @return
	 */
	public static  String getBrowserVersion(HttpServletRequest request) {
		String agent = request.getHeader("user-agent");
		String browserVersion = "����";

		// �õ��û����������
		String userbrowser = agent;
		if (userbrowser.indexOf("MSIE 6.0") > 0)
			browserVersion = "IE 6.0";
		else if (userbrowser.indexOf("MSIE 5.5") > 0)
			browserVersion = "IE 5.5";
		else if (userbrowser.indexOf("MSIE 7.0") > 0)
			browserVersion = "IE 7.0";
		else if (userbrowser.indexOf("MSIE 8.0") > 0)
			browserVersion = "IE 8.0";

		else if (userbrowser.indexOf("Firefox") > 0)
			browserVersion = "Firefox";
		else if (userbrowser.indexOf("Chrome") > 0)
			browserVersion = "Chrome";
		else if (userbrowser.indexOf("Safari") > 0)
			browserVersion = "Safari";
		else if (userbrowser.indexOf("Camino") > 0)
			browserVersion = "Camino";
		else if (userbrowser.indexOf("Konqueror") > 0)
			browserVersion = "Konqueror";
		return browserVersion;
	}
	/**
	 * ��ȡ�û�����ϵͳ
	 * @param request
	 * @return
	 */
	public static  String getUserOSVersion(HttpServletRequest request) {
		String osVersion = "����";
		String agent = request.getHeader("user-agent");
		String useros = agent;
		
		if (useros.indexOf("NT 7.0") > 0)
			osVersion = "Windows 7";
		else if (useros.indexOf("NT 6.0") > 0)
			osVersion = "Windows Vista/Server 2008";
		else if (useros.indexOf("NT 5.2") > 0)
			osVersion = "Windows Server 2003";
		else if (useros.indexOf("NT 5.1") > 0)
			osVersion = "Windows XP";
		else if (useros.indexOf("NT 5") > 0)
			osVersion = "Windows 2000";
		else if (useros.indexOf("NT 4") > 0)
			osVersion = "Windows NT4";
		else if (useros.indexOf("Me") > 0)
			osVersion = "Windows Me";
		else if (useros.indexOf("98") > 0)
			osVersion = "Windows 98";
		else if (useros.indexOf("95") > 0)
			osVersion = "Windows 95";
		else if (useros.indexOf("Mac") > 0)
			osVersion = "Mac";
		else if (useros.indexOf("Unix") > 0)
			osVersion = "UNIX";
		else if (useros.indexOf("Linux") > 0)
			osVersion = "Linux";
		else if (useros.indexOf("SunOS") > 0)
			osVersion = "SunOS";
		return osVersion;
	}

	public static String getMacAddress(HttpServletRequest request)
			throws SocketException {

		/*
		 * int port=request.getRemotePort(); InetSocketAddress
		 * isa=InetSocketAddress.createUnresolved(host, port); InetAddress
		 * ia=isa.getAddress(); NetworkInterface
		 * ne=NetworkInterface.getByInetAddress(ia); System.out.println(ne);
		 * byte[]mac=ne.getHardwareAddress(); String mac_s=hexByte(mac[0])+":"+
		 * hexByte(mac[1])+":"+ hexByte(mac[2])+":"+ hexByte(mac[3])+":"+
		 * hexByte(mac[4])+":"+ hexByte(mac[5]) ;
		 * 
		 * return mac_s;
		 */
		return null;
	}
	public static   String getLocalIPByInetAddress() {
		InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return null;
		}
		byte[] ipAddr = addr.getAddress();
		String ipAddrStr = "";
		for (int i = 0; i < ipAddr.length; i++) {
			if (i > 0) {
				ipAddrStr += ".";
			}
			ipAddrStr += ipAddr[i] & 0xFF;
		}
		// ta.append(ipAddrStr);
		return ipAddrStr;
	}
	
	

	// ����һ���ֽڵ�ʮ�������ַ���
	static String hexByte(byte b) {
		String s = "000000" + Integer.toHexString(b);
		return s.substring(s.length() - 2);
	}

	public static String getPrivilegePage(HttpServletRequest request) {
		
		String  uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		if(KongUtil.isNull(contextPath))
				return uri;
		else
			
				return uri.substring(contextPath.length());
	}

}
