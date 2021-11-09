package study.utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Utils {

    //对字符串进行编码
    public static String encode(String str) throws UnsupportedEncodingException {

        return Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
    }

    public static String decode (String str) throws UnsupportedEncodingException {
        return new String(Base64.getDecoder().decode(str),"utf-8");
    }
}
