/*    */ package org.marker.weixin.msg;
/*    */ 
/*    */ import org.w3c.dom.Document;
/*    */ import org.w3c.dom.Node;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ public class Msg4Link extends Msg
/*    */ {
/*    */   private String title;
/*    */   private String description;
/*    */   private String url;
/*    */   private String msgId;
/*    */ 
/*    */   public Msg4Link()
/*    */   {
/* 26 */     this.head = new Msg4Head();
/* 27 */     this.head.setMsgType("link");
/*    */   }
/*    */ 
/*    */   public Msg4Link(Msg4Head head)
/*    */   {
/* 35 */     this.head = head;
/*    */   }
/*    */ 
/*    */   public void write(Document document)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void read(Document document) {
/* 43 */     this.title = document.getElementsByTagName("Title").item(0).getTextContent();
/* 44 */     this.description = document.getElementsByTagName("Description").item(0).getTextContent();
/* 45 */     this.url = document.getElementsByTagName("Url").item(0).getTextContent();
/* 46 */     this.msgId = document.getElementsByTagName("MsgId").item(0).getTextContent();
/*    */   }
/*    */ 
/*    */   public String getTitle()
/*    */   {
/* 52 */     return this.title;
/*    */   }
/*    */   public void setTitle(String title) {
/* 55 */     this.title = title;
/*    */   }
/*    */   public String getDescription() {
/* 58 */     return this.description;
/*    */   }
/*    */   public void setDescription(String description) {
/* 61 */     this.description = description;
/*    */   }
/*    */   public String getUrl() {
/* 64 */     return this.url;
/*    */   }
/*    */   public void setUrl(String url) {
/* 67 */     this.url = url;
/*    */   }
/*    */   public String getMsgId() {
/* 70 */     return this.msgId;
/*    */   }
/*    */   public void setMsgId(String msgId) {
/* 73 */     this.msgId = msgId;
/*    */   }
/*    */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.msg.Msg4Link
 * JD-Core Version:    0.6.2
 */