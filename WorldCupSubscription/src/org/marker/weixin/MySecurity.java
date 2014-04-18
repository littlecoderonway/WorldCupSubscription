/*    */ package org.marker.weixin;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.security.MessageDigest;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ 
/*    */ public class MySecurity
/*    */ {
/*    */   public static final String SHA_1 = "SHA-1";
/*    */   public static final String MD5 = "MD5";
/*    */ 
/*    */   public String encode(String strSrc, String encodeType)
/*    */   {
/* 22 */     MessageDigest md = null;
/* 23 */     String strDes = null;
/* 24 */     byte[] bt = strSrc.getBytes();
/*    */     try {
/* 26 */       if ((encodeType == null) || ("".equals(encodeType)))
/* 27 */         encodeType = "MD5";
/* 28 */       md = MessageDigest.getInstance(encodeType);
/* 29 */       md.update(bt);
/* 30 */       strDes = bytes2Hex(md.digest());
/*    */     } catch (NoSuchAlgorithmException e) {
/* 32 */       return strSrc;
/*    */     }
/* 34 */     return strDes;
/*    */   }
/*    */ 
/*    */   public String bytes2Hex(byte[] bts) {
/* 38 */     String des = "";
/* 39 */     String tmp = null;
/* 40 */     for (int i = 0; i < bts.length; i++) {
/* 41 */       tmp = Integer.toHexString(bts[i] & 0xFF);
/* 42 */       if (tmp.length() == 1) {
/* 43 */         des = des + "0";
/*    */       }
/* 45 */       des = des + tmp;
/*    */     }
/* 47 */     return des;
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 51 */     MySecurity te = new MySecurity();
/* 52 */     String strSrc = "可以加密汉字";
/* 53 */     System.out.println("Source String:" + strSrc);
/* 54 */     System.out.println("Encrypted String:");
/* 55 */     System.out.println("Use MD5:" + te.encode(strSrc, null));
/* 56 */     System.out.println("Use MD5:" + te.encode(strSrc, "MD5"));
/* 57 */     System.out.println("Use SHA:" + te.encode(strSrc, "SHA-1"));
/* 58 */     System.out.println("Use SHA-256:" + te.encode(strSrc, "SHA-256"));
/*    */   }
/*    */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.MySecurity
 * JD-Core Version:    0.6.2
 */