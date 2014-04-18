/*    */ package org.marker.weixin.msg;
/*    */ 
/*    */ import org.w3c.dom.Document;
/*    */ import org.w3c.dom.Node;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ public abstract class Msg
/*    */ {
/*    */   public static final String MSG_TYPE_TEXT = "text";
/*    */   public static final String MSG_TYPE_IMAGE = "image";
/*    */   public static final String MSG_TYPE_MUSIC = "music";
/*    */   public static final String MSG_TYPE_LOCATION = "location";
/*    */   public static final String MSG_TYPE_LINK = "link";
/*    */   public static final String MSG_TYPE_IMAGE_TEXT = "news";
/*    */   public static final String MSG_TYPE_EVENT = "event";
/*    */   public static final String MSG_TYPE_VOICE = "voice";
/*    */   public static final String MSG_TYPE_VIDEO = "video";
/*    */   protected Msg4Head head;
/*    */ 
/*    */   public abstract void write(Document paramDocument);
/*    */ 
/*    */   public abstract void read(Document paramDocument);
/*    */ 
/*    */   protected String getElementContent(Document document, String element)
/*    */   {
/* 59 */     if (document.getElementsByTagName(element).getLength() > 0) {
/* 60 */       return document.getElementsByTagName(element).item(0).getTextContent();
/*    */     }
/* 62 */     return null;
/*    */   }
/*    */ 
/*    */   public Msg4Head getHead()
/*    */   {
/* 69 */     return this.head;
/*    */   }
/*    */ 
/*    */   public void setHead(Msg4Head head) {
/* 73 */     this.head = head;
/*    */   }
/*    */ 
/*    */   public String getToUserName() {
/* 77 */     return this.head.getToUserName();
/*    */   }
/*    */ 
/*    */   public void setToUserName(String toUserName) {
/* 81 */     this.head.setToUserName(toUserName);
/*    */   }
/*    */ 
/*    */   public String getFromUserName() {
/* 85 */     return this.head.getFromUserName();
/*    */   }
/*    */ 
/*    */   public void setFromUserName(String fromUserName) {
/* 89 */     this.head.setFromUserName(fromUserName);
/*    */   }
/*    */ 
/*    */   public String getCreateTime() {
/* 93 */     return this.head.getCreateTime();
/*    */   }
/*    */ 
/*    */   public void setCreateTime(String createTime) {
/* 97 */     this.head.setCreateTime(createTime);
/*    */   }
/*    */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.msg.Msg
 * JD-Core Version:    0.6.2
 */