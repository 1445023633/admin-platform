package com.clgs.utils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


public class DESUtil {
    private static int length=128;
    private static String strDefaultKey = "clgs";
    private String password = "";
    /**
    * 加密
    * 
    * @param content
    *            需要加密的内容
    * @param password
    *            加密密码
    * @return
    * @throws NoSuchAlgorithmException
    * @throws NoSuchPaddingException
    * @throws UnsupportedEncodingException
    * @throws InvalidKeyException
    * @throws BadPaddingException
    * @throws IllegalBlockSizeException
    */
    public DESUtil() throws Exception {
          this(strDefaultKey);
         }
    
    public DESUtil(String strKey) throws Exception {
        this.password=strKey;
         }
    
    
    
    private byte[] encryptTobyte(String content)
            throws Exception {

        KeyGenerator kgen = KeyGenerator.getInstance("AES");
                SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" ); 
                secureRandom.setSeed(this.password.getBytes()); 
        kgen.init(length, secureRandom);
        SecretKey secretKey = kgen.generateKey();
        byte[] enCodeFormat = secretKey.getEncoded();
        SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
        Cipher cipher = Cipher.getInstance("AES");// 创建密码器
        byte[] byteContent = content.getBytes("utf-8");
        cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
        byte[] result = cipher.doFinal(byteContent);
        return result; // 加密

    }

    /**
    * 解密
    * 
    * @param content
    *            待解密内容
    * @param password
    *            解密密钥
    * @return
    */
    private byte[] decryptTobyte(byte[] content)
            throws Exception {

        KeyGenerator kgen = KeyGenerator.getInstance("AES");
                 SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" ); 
                  secureRandom.setSeed(this.password.getBytes()); 
        kgen.init(length, secureRandom);
        SecretKey secretKey = kgen.generateKey();
        byte[] enCodeFormat = secretKey.getEncoded();
        SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
        Cipher cipher = Cipher.getInstance("AES");// 创建密码器
        cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
        byte[] result = cipher.doFinal(content);
        return result; // 加密
                
             

    }



    /**
    * 加密
    * 
    * @param content
    *            需要加密的内容
    * @param password
    *            加密密码
    * @return
    */
    public static byte[] encrypt2(String content, String password) {
        try {
            SecretKeySpec key = new SecretKeySpec(password.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            byte[] byteContent = content.getBytes("utf-8");
            cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
            byte[] result = cipher.doFinal(byteContent);
            return result; // 加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String encrypt(String content) throws Exception {
        byte[] encryptResult = encryptTobyte(content);
        return Base64.encode(encryptResult);
    }

    public  String decrypt(String content) throws Exception {

        byte[] decryptResult = decryptTobyte(Base64.decode(content));
        return new String(decryptResult,"UTF-8");
    }

     public static void main(String[] args) {
          // TODO Auto-generated method stub
          try {
           String content = "";
           String password = "clgs";
           //DESPlus des = new DESPlus();//默认密钥
           DESUtil des = new DESUtil(password);//自定义密钥
          // String tt4 = des.encrypt(content);
            //System.out.println(new String(tt4));
           System.out.println("加密后的字符："+content);
           System.out.println("解密后的字符："+des.decrypt(content));
          } catch (Exception e) {
           // TODO: handle exception
           e.printStackTrace();
          }
         }
}

