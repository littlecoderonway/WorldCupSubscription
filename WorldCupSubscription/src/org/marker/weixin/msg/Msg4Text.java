/*    */ package org.marker.weixin.msg;
/*    */ 
/*    */ import org.w3c.dom.Document;
/*    */ import org.w3c.dom.Element;
/*    */ import org.w3c.dom.Node;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ public class Msg4Text extends Msg
/*    */ {
/*    */   private String content;
/*    */   private String msgId;
/*    */ 
/*    */   public Msg4Text()
/*    */   {
/* 29 */     this.head = new Msg4Head();
/* 30 */     this.head.setMsgType("text");
/*    */   }
/*    */ 
/*    */   public Msg4Text(Msg4Head head)
/*    */   {
/* 38 */     this.head = head;
/*    */   }
/*    */ 
/*    */   public void write(Document document)
/*    */   {
/* 44 */     Element root = document.createElement("xml");
/* 45 */     this.head.write(root, document);
/* 46 */     Element contentElement = document.createElement("Content");
/* 47 */     contentElement.setTextContent(this.content);
/* 48 */     root.appendChild(contentElement);
/* 49 */     document.appendChild(root);
/*    */   }
/*    */ 
/*    */   public void read(Document document)
/*    */   {
/* 55 */     this.content = document.getElementsByTagName("Content").item(0).getTextContent();
/* 56 */     this.msgId = document.getElementsByTagName("MsgId").item(0).getTextContent();
/*    */   }
/*    */ 
/*    */   public String getContent()
/*    */   {
/* 63 */     return this.content;
/*    */   }
/*    */ 
/*    */   public void setContent(String content) {
/* 67 */     this.content = content;
/*    */   }
/*    */ 
/*    */   public String getMsgId() {
/* 71 */     return this.msgId;
/*    */   }
/*    */ 
/*    */   public void setMsgId(String msgId) {
/* 75 */     this.msgId = msgId;
/*    */   }
/*    */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.msg.Msg4Text
 * JD-Core Version:    0.6.2
 */