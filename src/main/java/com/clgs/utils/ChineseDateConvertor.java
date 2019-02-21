/**   
 * @Title: ss.java 
 * @Package: com.xgqweb.gongshang.date 
 * @author: xgqman@126.com   
 * @date: Feb 28, 2011 8:31:38 PM 
 * @version: 1.0 
 * @Description: TODO(用一句话描述该文件做什么)   
 */
package com.clgs.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChineseDateConvertor {

	
	public static void main(String[] args) {

		
		String issueDate = "2001-12-25";
		System.out.println(formatStr(issueDate));

	}

	public static String getDateStr(Date date)

	{

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String datestr = sdf.format(date);
		return datestr;

	}

	public static String getYearStr(String str)

	{

		String yearStr = "";

		yearStr = str.substring(0, 4);

		return yearStr;

	}

	public static String getMonthStr(String str)

	{

		String monthStr;

		int startIndex = str.indexOf("年");

		int endIndex = str.indexOf("月");

		monthStr = str.substring(startIndex + 1, endIndex);

		return monthStr;

	}

	public static char formatDigit(char sign) {

		if (sign == '0')

			sign = '〇';

		if (sign == '1')

			sign = '一';

		if (sign == '2')

			sign = '二';

		if (sign == '3')

			sign = '三';

		if (sign == '4')

			sign = '四';

		if (sign == '5')

			sign = '五';

		if (sign == '6')

			sign = '六';

		if (sign == '7')

			sign = '七';

		if (sign == '8')

			sign = '八';

		if (sign == '9')

			sign = '九';

		return sign;

	}

	public static int getMidLen(String str, int pos1, int pos2) {

		return str.substring(pos1 + 1, pos2).length();

	}

	public static int getLastLen(String str, int pos2) {

		return str.substring(pos2 + 1).length();

	}

	public static String getDayStr(String str)

	{

		String dayStr = "";

		int startIndex = str.indexOf("月");

		int endIndex = str.indexOf("日");

		dayStr = str.substring(startIndex + 1, endIndex);

		return dayStr;

	}

	public static String formatStr(String str) {

		StringBuffer sb = new StringBuffer();

		int pos1 = str.indexOf("-");

		int pos2 = str.lastIndexOf("-");

		for (int i = 0; i < 4; i++) {

			sb.append(formatDigit(str.charAt(i)));

		}

		sb.append('年');

		if (getMidLen(str, pos1, pos2) == 1) {

			sb.append(formatDigit(str.charAt(5)) + "月");

			if (str.charAt(7) != '0') {

				if (getLastLen(str, pos2) == 1) {

					sb.append(formatDigit(str.charAt(7)) + "日");

				}

				if (getLastLen(str, pos2) == 2) {

					if (str.charAt(7) != '1' && str.charAt(8) != '0') {

						sb.append(formatDigit(str.charAt(7)) + "十" + formatDigit(str.charAt(8)) + "日");

					}

					else if (str.charAt(7) != '1' && str.charAt(8) == '0') {

						sb.append(formatDigit(str.charAt(7)) + "十日");

					}

					else if (str.charAt(7) == '1' && str.charAt(8) != '0') {

						sb.append("十" + formatDigit(str.charAt(8)) + "日");

					}

					else {

						sb.append("十日");

					}

				}

			}

			else {

				sb.append(formatDigit(str.charAt(8)) + "日");

			}

		}

		if (getMidLen(str, pos1, pos2) == 2) {

			if (str.charAt(5) != '0' && str.charAt(6) != '0') {

				sb.append("十" + formatDigit(str.charAt(6)) + "月");

				if (getLastLen(str, pos2) == 1) {

					sb.append(formatDigit(str.charAt(8)) + "日");

				}

				if (getLastLen(str, pos2) == 2) {

					if (str.charAt(8) != '0') {

						if (str.charAt(8) != '1' && str.charAt(9) != '0') {

							sb.append(formatDigit(str.charAt(8)) + "十" + formatDigit(str.charAt(9)) + "日");

						}

						else if (str.charAt(8) != '1' && str.charAt(9) == '0') {

							sb.append(formatDigit(str.charAt(8)) + "十日");

						}

						else if (str.charAt(8) == '1' && str.charAt(9) != '0') {

							sb.append("十" + formatDigit(str.charAt(9)) + "日");

						}

						else {

							sb.append("十日");

						}

					}

					else {

						sb.append(formatDigit(str.charAt(9)) + "日");

					}

				}

			}

			else if (str.charAt(5) != '0' && str.charAt(6) == '0') {

				sb.append("十月");

				if (getLastLen(str, pos2) == 1) {

					sb.append(formatDigit(str.charAt(8)) + "日");

				}

				if (getLastLen(str, pos2) == 2) {

					if (str.charAt(8) != '0') {

						if (str.charAt(8) != '1' && str.charAt(9) != '0') {

							sb.append(formatDigit(str.charAt(8)) + "十" + formatDigit(str.charAt(9)) + "日");

						}

						else if (str.charAt(8) != '1' && str.charAt(9) == '0') {

							sb.append(formatDigit(str.charAt(8)) + "十日");

						}

						else if (str.charAt(8) == '1' && str.charAt(9) != '0') {

							sb.append("十" + formatDigit(str.charAt(9)) + "日");

						}

						else {

							sb.append("十日");

						}
					}

					else {

						sb.append(formatDigit(str.charAt(9)) + "日");

					}

				}

			}

			else {

				sb.append(formatDigit(str.charAt(6)) + "月");

				if (getLastLen(str, pos2) == 1) {

					sb.append(formatDigit(str.charAt(8)) + "日");

				}

				if (getLastLen(str, pos2) == 2) {

					if (str.charAt(8) != '0') {

						if (str.charAt(8) != '1' && str.charAt(9) != '0') {

							sb.append(formatDigit(str.charAt(8)) + "十" + formatDigit(str.charAt(9)) + "日");

						}

						else if (str.charAt(8) != '1' && str.charAt(9) == '0') {

							sb.append(formatDigit(str.charAt(8)) + "十日");

						}

						else if (str.charAt(8) == '1' && str.charAt(9) != '0') {

							sb.append("十" + formatDigit(str.charAt(9)) + "日");

						}

						else {

							sb.append("十日");

						}

					}

					else {

						sb.append(formatDigit(str.charAt(9)) + "日");

					}

				}

			}

		}

		return sb.toString();

	}

}
