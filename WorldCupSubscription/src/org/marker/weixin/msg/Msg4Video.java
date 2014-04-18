/*     */ package org.marker.weixin.msg;
/*     */ 
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class Msg4Video extends Msg
/*     */ {
/*     */   private String mediaId;
/*     */   private String thumbMediaId;
/*     */   private String msgId;
/*     */ 
/*     */   public Msg4Video()
/*     */   {
/*  28 */     this.head = new Msg4Head();
/*  29 */     this.head.setMsgType("video");
/*     */   }
/*     */ 
/*     */   public Msg4Video(Msg4Head head)
/*     */   {
/*  38 */     this.head = head;
/*     */   }
/*     */ 
/*     */   public void write(Document document)
/*     */   {
/*  45 */     Element root = document.createElement("xml");
/*  46 */     this.head.write(root, document);
/*  47 */     Element videoElement = document.createElement("Video");
/*  48 */     Element mediaIdElement = document.createElement("MediaId");
/*  49 */     Element thumbMediaIdElement = document.createElement("ThumbMediaId");
/*  50 */     videoElement.appendChild(mediaIdElement);
/*  51 */     videoElement.appendChild(thumbMediaIdElement);
/*  52 */     root.appendChild(videoElement);
/*  53 */     document.appendChild(root);
/*     */   }
/*     */ 
/*     */   public void read(Document document)
/*     */   {
/*  60 */     this.mediaId = getElementContent(document, "MediaId");
/*  61 */     this.thumbMediaId = getElementContent(document, "ThumbMediaId");
/*  62 */     this.msgId = getElementContent(document, "MsgId");
/*     */   }
/*     */ 
/*     */   public String getMediaId()
/*     */   {
/*  71 */     return this.mediaId;
/*     */   }
/*     */ 
/*     */   public void setMediaId(String mediaId)
/*     */   {
/*  80 */     this.mediaId = mediaId;
/*     */   }
/*     */ 
/*     */   public String getThumbMediaId()
/*     */   {
/*  89 */     return this.thumbMediaId;
/*     */   }
/*     */ 
/*     */   public void setThumbMediaId(String thumbMediaId)
/*     */   {
/*  98 */     this.thumbMediaId = thumbMediaId;
/*     */   }
/*     */ 
/*     */   public String getMsgId()
/*     */   {
/* 107 */     return this.msgId;
/*     */   }
/*     */ 
/*     */   public void setMsgId(String msgId)
/*     */   {
/* 116 */     this.msgId = msgId;
/*     */   }
/*     */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.msg.Msg4Video
 * JD-Core Version:    0.6.2
 */