/*     */ package org.marker.weixin;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.text.SimpleDateFormat;
/*     */ import javax.xml.parsers.DocumentBuilder;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import javax.xml.parsers.ParserConfigurationException;
/*     */ import javax.xml.transform.Transformer;
/*     */ import javax.xml.transform.TransformerFactory;
/*     */ import javax.xml.transform.dom.DOMSource;
/*     */ import javax.xml.transform.stream.StreamResult;
/*     */ import org.marker.weixin.msg.Msg;
/*     */ import org.marker.weixin.msg.Msg4Event;
/*     */ import org.marker.weixin.msg.Msg4Head;
/*     */ import org.marker.weixin.msg.Msg4Image;
/*     */ import org.marker.weixin.msg.Msg4Link;
/*     */ import org.marker.weixin.msg.Msg4Location;
/*     */ import org.marker.weixin.msg.Msg4Text;
/*     */ import org.marker.weixin.msg.Msg4Video;
/*     */ import org.marker.weixin.msg.Msg4Voice;
/*     */ import org.w3c.dom.Document;
/*     */ import org.xml.sax.SAXException;
/*     */ 
/*     */ public abstract class Session
/*     */ {
/*  39 */   public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
/*     */   private InputStream is;
/*     */   private OutputStream os;
/*     */   private static DocumentBuilder builder;
/*  58 */   private static TransformerFactory tffactory = TransformerFactory.newInstance();
/*     */ 
/*     */   static
/*     */   {
/*  51 */     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
/*     */     try {
/*  53 */       builder = factory.newDocumentBuilder();
/*     */     } catch (ParserConfigurationException e) {
/*  55 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void process(InputStream is, OutputStream os)
/*     */   {
/*  75 */     this.os = os;
/*     */     try {
/*  77 */       Document document = builder.parse(is);
/*  78 */       Msg4Head head = new Msg4Head();
/*  79 */       head.read(document);
/*  80 */       String type = head.getMsgType();
/*     */ 
/*  82 */       if ("text".equals(type)) {
/*  83 */         Msg4Text msg = new Msg4Text(head);
/*  84 */         msg.read(document);
/*  85 */         onTextMsg(msg);
/*  86 */       } else if ("image".equals(type)) {
/*  87 */         Msg4Image msg = new Msg4Image(head);
/*  88 */         msg.read(document);
/*  89 */         onImageMsg(msg);
/*  90 */       } else if ("event".equals(type)) {
/*  91 */         Msg4Event msg = new Msg4Event(head);
/*  92 */         msg.read(document);
/*  93 */         onEventMsg(msg);
/*  94 */       } else if ("link".equals(type)) {
/*  95 */         Msg4Link msg = new Msg4Link(head);
/*  96 */         msg.read(document);
/*  97 */         onLinkMsg(msg);
/*  98 */       } else if ("location".equals(type)) {
/*  99 */         Msg4Location msg = new Msg4Location(head);
/* 100 */         msg.read(document);
/* 101 */         onLocationMsg(msg);
/* 102 */       } else if ("voice".equals(type)) {
/* 103 */         Msg4Voice msg = new Msg4Voice(head);
/* 104 */         msg.read(document);
/* 105 */         onVoiceMsg(msg);
/* 106 */       } else if ("video".equals(type)) {
/* 107 */         Msg4Video msg = new Msg4Video(head);
/* 108 */         msg.read(document);
/* 109 */         onVideoMsg(msg);
/*     */       } else {
/* 111 */         onErrorMsg(-1);
/*     */       }
/*     */     } catch (SAXException e) {
/* 114 */       e.printStackTrace();
/*     */     } catch (IOException e) {
/* 116 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void callback(Msg msg)
/*     */   {
/* 131 */     Document document = builder.newDocument();
/* 132 */     msg.write(document);
/*     */     try {
/* 134 */       Transformer transformer = tffactory.newTransformer();
/*     */ 
/* 137 */       transformer.transform(new DOMSource(document), new StreamResult(new OutputStreamWriter(this.os, "utf-8")));
/*     */     } catch (Exception e) {
/* 139 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void close()
/*     */   {
/*     */     try
/*     */     {
/* 149 */       if (this.is != null) {
/* 150 */         this.is.close();
/*     */       }
/* 152 */       if (this.os != null) {
/* 153 */         this.os.flush();
/* 154 */         this.os.close();
/*     */       }
/*     */     } catch (IOException e) {
/* 157 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public abstract void onTextMsg(Msg4Text paramMsg4Text);
/*     */ 
/*     */   public abstract void onImageMsg(Msg4Image paramMsg4Image);
/*     */ 
/*     */   public abstract void onEventMsg(Msg4Event paramMsg4Event);
/*     */ 
/*     */   public abstract void onLinkMsg(Msg4Link paramMsg4Link);
/*     */ 
/*     */   public abstract void onLocationMsg(Msg4Location paramMsg4Location);
/*     */ 
/*     */   public abstract void onVoiceMsg(Msg4Voice paramMsg4Voice);
/*     */ 
/*     */   public abstract void onVideoMsg(Msg4Video paramMsg4Video);
/*     */ 
/*     */   public abstract void onErrorMsg(int paramInt);
/*     */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.Session
 * JD-Core Version:    0.6.2
 */