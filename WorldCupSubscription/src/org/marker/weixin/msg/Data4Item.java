/*    */ package org.marker.weixin.msg;
/*    */ 
/*    */ public class Data4Item
/*    */ {
/*    */   private String title;
/*    */   private String description;
/*    */   private String picUrl;
/*    */   private String url;
/*    */ 
/*    */   public Data4Item()
/*    */   {
/*    */   }
/*    */ 
/*    */   public Data4Item(String title, String description, String picUrl, String url)
/*    */   {
/* 40 */     this.title = title;
/* 41 */     this.description = description;
/* 42 */     this.picUrl = picUrl;
/* 43 */     this.url = url;
/*    */   }
/*    */ 
/*    */   public String getTitle()
/*    */   {
/* 49 */     return this.title;
/*    */   }
/*    */   public void setTitle(String title) {
/* 52 */     this.title = title;
/*    */   }
/*    */   public String getDescription() {
/* 55 */     return this.description;
/*    */   }
/*    */   public void setDescription(String description) {
/* 58 */     this.description = description;
/*    */   }
/*    */   public String getPicUrl() {
/* 61 */     return this.picUrl;
/*    */   }
/*    */   public void setPicUrl(String picUrl) {
/* 64 */     this.picUrl = picUrl;
/*    */   }
/*    */   public String getUrl() {
/* 67 */     return this.url;
/*    */   }
/*    */   public void setUrl(String url) {
/* 70 */     this.url = url;
/*    */   }
/*    */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.msg.Data4Item
 * JD-Core Version:    0.6.2
 */