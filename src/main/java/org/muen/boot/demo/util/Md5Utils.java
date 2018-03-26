package org.muen.boot.demo.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.muen.boot.demo.web.util.WebConstant;
import org.springframework.util.StringUtils;

/**
 * @program: demo
 * @description: MD5加密工具类
 * @author: Parasomnia
 * @create: 2018-03-26 21:59
 **/
public class Md5Utils {

	/**
	 * 根据已知密钥进行md5加密
	 * @param key 自定义密钥
	 * @param str 加密字符串
	 * @return
	 */
	public static String getMd5(String key, String str) {
		if (StringUtils.isEmpty(str)) {
			return "";
		}
		return DigestUtils.md5Hex(key + str);
	}

	/**
	 * 根据默认密钥进行md5加密
	 * @param str 加密字符串
	 * @return
	 */
	public static String getMd5(String str) {
		if (StringUtils.isEmpty(str)) {
			return "";
		}
		return DigestUtils.md5Hex(WebConstant.MD5KEY + str);
	}

}
