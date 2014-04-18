/*     */ package org.marker.weixin.msg;
/*     */ 
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import org.marker.weixin.Session;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ import org.w3c.dom.Node;
/*     */ import org.w3c.dom.NodeList;
/*     */ 
/*     */ public class Msg4Head
/*     */ {
/*     */   private String toUserName;
/*     */   private String fromUserName;
/*     */   private String createTime;
/*     */   private String msgType;
/*     */ 
/*     */   public Msg4Head()
/*     */   {
/*  33 */     this.createTime = Session.DATE_FORMAT.format(new Date());
/*     */   }
/*     */ 
/*     */   public void write(Element root, Document document) {
/*  37 */     Element toUserNameElement = document
/*  38 */       .createElement("ToUserName");
/*  39 */     toUserNameElement.setTextContent(this.toUserName);
/*  40 */     Element fromUserNameElement = document
/*  41 */       .createElement("FromUserName");
/*  42 */     fromUserNameElement.setTextContent(this.fromUserName);
/*  43 */     Element createTimeElement = document
/*  44 */       .createElement("CreateTime");
/*  45 */     createTimeElement.setTextContent(this.createTime);
/*  46 */     Element msgTypeElement = document
/*  47 */       .createElement("MsgType");
/*  48 */     msgTypeElement.setTextContent(this.msgType);
/*     */ 
/*  50 */     root.appendChild(toUserNameElement);
/*  51 */     root.appendChild(fromUserNameElement);
/*  52 */     root.appendChild(createTimeElement);
/*  53 */     root.appendChild(msgTypeElement);
/*     */   }
/*     */ 
/*     */   public void read(Document document) {
/*  57 */     this.toUserName = document
/*  58 */       .getElementsByTagName("ToUserName").item(0)
/*  59 */       .getTextContent();
/*  60 */     this.fromUserName = document
/*  61 */       .getElementsByTagName("FromUserName").item(0)
/*  62 */       .getTextContent();
/*  63 */     this.createTime = document
/*  64 */       .getElementsByTagName("CreateTime").item(0)
/*  65 */       .getTextContent();
/*  66 */     this.msgType = document.getElementsByTagName("MsgType")
/*  67 */       .item(0).getTextContent();
/*     */   }
/*     */ 
/*     */   public String getToUserName()
/*     */   {
/*  72 */     return this.toUserName;
/*     */   }
/*     */ 
/*     */   public void setToUserName(String toUserName) {
/*  76 */     this.toUserName = toUserName;
/*     */   }
/*     */ 
/*     */   public String getFromUserName() {
/*  80 */     return this.fromUserName;
/*     */   }
/*     */ 
/*     */   public void setFromUserName(String fromUserName) {
/*  84 */     this.fromUserName = fromUserName;
/*     */   }
/*     */ 
/*     */   public String getCreateTime() {
/*  88 */     return this.createTime;
/*     */   }
/*     */ 
/*     */   public void setCreateTime(String createTime) {
/*  92 */     this.createTime = createTime;
/*     */   }
/*     */ 
/*     */   public String getMsgType() {
/*  96 */     return this.msgType;
/*     */   }
/*     */ 
/*     */   public void setMsgType(String msgType) {
/* 100 */     this.msgType = msgType;
/*     */   }
/*     */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.msg.Msg4Head
 * JD-Core Version:    0.6.2
 */