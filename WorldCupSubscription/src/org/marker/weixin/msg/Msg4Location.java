/*    */ package org.marker.weixin.msg;
/*    */ 
/*    */ import org.w3c.dom.Document;
/*    */ import org.w3c.dom.Node;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ public class Msg4Location extends Msg
/*    */ {
/*    */   private String location_X;
/*    */   private String location_Y;
/*    */   private String scale;
/*    */   private String label;
/*    */   private String msgId;
/*    */ 
/*    */   public Msg4Location()
/*    */   {
/* 31 */     this.head = new Msg4Head();
/* 32 */     this.head.setMsgType("location");
/*    */   }
/*    */ 
/*    */   public Msg4Location(Msg4Head head)
/*    */   {
/* 39 */     this.head = head;
/*    */   }
/*    */ 
/*    */   public void write(Document document)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void read(Document document)
/*    */   {
/* 49 */     this.location_X = document.getElementsByTagName("Location_X").item(0).getTextContent();
/* 50 */     this.location_Y = document.getElementsByTagName("Location_Y").item(0).getTextContent();
/* 51 */     this.scale = document.getElementsByTagName("Scale").item(0).getTextContent();
/* 52 */     this.label = document.getElementsByTagName("Label").item(0).getTextContent();
/* 53 */     this.msgId = document.getElementsByTagName("MsgId").item(0).getTextContent();
/*    */   }
/*    */ 
/*    */   public String getLocation_X()
/*    */   {
/* 61 */     return this.location_X;
/*    */   }
/*    */   public void setLocation_X(String location_X) {
/* 64 */     this.location_X = location_X;
/*    */   }
/*    */   public String getLocation_Y() {
/* 67 */     return this.location_Y;
/*    */   }
/*    */   public void setLocation_Y(String location_Y) {
/* 70 */     this.location_Y = location_Y;
/*    */   }
/*    */   public String getScale() {
/* 73 */     return this.scale;
/*    */   }
/*    */   public void setScale(String scale) {
/* 76 */     this.scale = scale;
/*    */   }
/*    */   public String getLabel() {
/* 79 */     return this.label;
/*    */   }
/*    */   public void setLabel(String label) {
/* 82 */     this.label = label;
/*    */   }
/*    */   public String getMsgId() {
/* 85 */     return this.msgId;
/*    */   }
/*    */   public void setMsgId(String msgId) {
/* 88 */     this.msgId = msgId;
/*    */   }
/*    */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.msg.Msg4Location
 * JD-Core Version:    0.6.2
 */