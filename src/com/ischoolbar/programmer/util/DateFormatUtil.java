package com.ischoolbar.programmer.util;

import java.text.SimpleDateFormat;
import java.util.Date;
/*��ȡʱ��*/
public class DateFormatUtil {
	public static String getFormatDate(Date date,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
}
