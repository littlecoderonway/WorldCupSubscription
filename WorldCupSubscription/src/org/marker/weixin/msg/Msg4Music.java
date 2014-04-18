/*     */ package org.marker.weixin.msg;
/*     */ 
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class Msg4Music extends Msg
/*     */ {
/*     */   private String title;
/*     */   private String description;
/*     */   private String musicUrl;
/*     */   private String hQMusicUrl;
/*     */   private String thumbMediaId;
/*     */ 
/*     */   public Msg4Music()
/*     */   {
/*  32 */     this.head = new Msg4Head();
/*  33 */     this.head.setMsgType("music");
/*     */   }
/*     */ 
/*     */   public void write(Document document)
/*     */   {
/*  40 */     Element root = document.createElement("xml");
/*  41 */     this.head.write(root, document);
/*  42 */     Element musicElement = document.createElement("Music");
/*  43 */     Element titleElement = document.createElement("Title");
/*  44 */     titleElement.setTextContent(this.title);
/*  45 */     Element descriptionElement = document.createElement("Description");
/*  46 */     descriptionElement.setTextContent(this.description);
/*  47 */     Element musicUrlElement = document.createElement("MusicUrl");
/*  48 */     musicUrlElement.setTextContent(this.musicUrl);
/*  49 */     Element hQMusicUrlElement = document.createElement("HQMusicUrl");
/*  50 */     hQMusicUrlElement.setTextContent(this.hQMusicUrl);
/*  51 */     Element thumbMediaIdElement = document.createElement("ThumbMediaId");
/*  52 */     thumbMediaIdElement.setTextContent(this.thumbMediaId);
/*     */ 
/*  54 */     musicElement.appendChild(titleElement);
/*  55 */     musicElement.appendChild(descriptionElement);
/*  56 */     musicElement.appendChild(musicUrlElement);
/*  57 */     musicElement.appendChild(hQMusicUrlElement);
/*  58 */     musicElement.appendChild(thumbMediaIdElement);
/*  59 */     root.appendChild(musicElement);
/*     */ 
/*  61 */     document.appendChild(root);
/*     */   }
/*     */ 
/*     */   public void read(Document document)
/*     */   {
/*     */   }
/*     */ 
/*     */   public String getTitle()
/*     */   {
/*  73 */     return this.title;
/*     */   }
/*     */   public void setTitle(String title) {
/*  76 */     this.title = title;
/*     */   }
/*     */   public String getDescription() {
/*  79 */     return this.description;
/*     */   }
/*     */   public void setDescription(String description) {
/*  82 */     this.description = description;
/*     */   }
/*     */   public String getMusicUrl() {
/*  85 */     return this.musicUrl;
/*     */   }
/*     */   public void setMusicUrl(String musicUrl) {
/*  88 */     this.musicUrl = musicUrl;
/*     */   }
/*     */   public String getHQMusicUrl() {
/*  91 */     return this.hQMusicUrl;
/*     */   }
/*     */   public void setHQMusicUrl(String hQMusicUrl) {
/*  94 */     this.hQMusicUrl = hQMusicUrl;
/*     */   }
/*     */ 
/*     */   public String gethQMusicUrl()
/*     */   {
/* 103 */     return this.hQMusicUrl;
/*     */   }
/*     */ 
/*     */   public void sethQMusicUrl(String hQMusicUrl)
/*     */   {
/* 112 */     this.hQMusicUrl = hQMusicUrl;
/*     */   }
/*     */ 
/*     */   public String getThumbMediaId()
/*     */   {
/* 121 */     return this.thumbMediaId;
/*     */   }
/*     */ 
/*     */   public void setThumbMediaId(String thumbMediaId)
/*     */   {
/* 130 */     this.thumbMediaId = thumbMediaId;
/*     */   }
/*     */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.msg.Msg4Music
 * JD-Core Version:    0.6.2
 */