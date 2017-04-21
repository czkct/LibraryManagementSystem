package cn.bms.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;


//import sun.misc.BASE64Encoder;



//将密码用编码包装起来，然后在存入数据文件中
public class ServiceUtils {

	public static String md5(String message){
		
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			byte md5[] = md.digest(message.getBytes());
			
			Base64 encoder = new Base64();
			return encoder.encodeBase64String(md5);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
}
