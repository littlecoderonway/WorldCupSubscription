/*    */ package org.marker.weixin.msg;
/*    */ 
/*    */ import org.w3c.dom.Document;
/*    */ import org.w3c.dom.Element;
/*    */ import org.w3c.dom.Node;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ public class Msg4Image extends Msg
/*    */ {
/*    */   private String picUrl;
/*    */   private String msgId;
/*    */   private String mediaId;
/*    */ 
/*    */   public Msg4Image()
/*    */   {
/* 29 */     this.head = new Msg4Head();
/* 30 */     this.head.setMsgType("image");
/*    */   }
/*    */ 
/*    */   public Msg4Image(Msg4Head head)
/*    */   {
/* 38 */     this.head = head;
/*    */   }
/*    */ 
/*    */   public void write(Document document)
/*    */   {
/* 44 */     Element root = document.createElement("xml");
/* 45 */     this.head.write(root, document);
/* 46 */     Element imageElement = document.createElement("Image");
/* 47 */     Element mediaIdElement = document.createElement("MediaId");
/* 48 */     imageElement.appendChild(mediaIdElement);
/* 49 */     root.appendChild(imageElement);
/* 50 */     document.appendChild(root);
/*    */   }
/*    */ 
/*    */   public void read(Document document)
/*    */   {
/* 56 */     this.picUrl = document.getElementsByTagName("PicUrl").item(0).getTextContent();
/* 57 */     this.mediaId = getElementContent(document, "MediaId");
/* 58 */     this.msgId = document.getElementsByTagName("MsgId").item(0).getTextContent();
/*    */   }
/*    */ 
/*    */   public String getPicUrl()
/*    */   {
/* 63 */     return this.picUrl;
/*    */   }
/*    */ 
/*    */   public void setPicUrl(String picUrl)
/*    */   {
/* 68 */     this.picUrl = picUrl;
/*    */   }
/*    */ 
/*    */   public String getMsgId()
/*    */   {
/* 73 */     return this.msgId;
/*    */   }
/*    */ 
/*    */   public void setMsgId(String msgId)
/*    */   {
/* 78 */     this.msgId = msgId;
/*    */   }
/*    */ 
/*    */   public String getMediaId()
/*    */   {
/* 86 */     return this.mediaId;
/*    */   }
/*    */ 
/*    */   public void setMediaId(String mediaId)
/*    */   {
/* 94 */     this.mediaId = mediaId;
/*    */   }
/*    */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.msg.Msg4Image
 * JD-Core Version:    0.6.2
 */