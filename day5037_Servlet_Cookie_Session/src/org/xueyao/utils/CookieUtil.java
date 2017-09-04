package org.xueyao.utils;

import javax.servlet.http.Cookie;


public class CookieUtil {
	//在一个Cookie数组中寻找指定名称的Cookie
	public static Cookie findCookieByName(String name, Cookie[] cks) {
		if (null != cks && cks.length > 0) {
			for (Cookie ck : cks) {
				if (name.equals(ck.getName())) {
					return ck;
				}
			}
		}
		return null;
	}
}
