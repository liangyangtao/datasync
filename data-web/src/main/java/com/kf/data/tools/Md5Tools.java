package com.kf.data.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/*
 * MD5 算法
 */
public class Md5Tools {

	public static String GetMD5Code(String strObj) {
		String resultString = org.apache.commons.codec.digest.DigestUtils.md5Hex(strObj);
		return resultString;
	}

	public static String getMd5ByFile(String url) {
		String md5 = null;
		try {
			URL inputUrl = new URL(url);
			InputStream inputStream = inputUrl.openStream();
			md5 = org.apache.commons.codec.digest.DigestUtils.md5Hex(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return md5;
	}
}
