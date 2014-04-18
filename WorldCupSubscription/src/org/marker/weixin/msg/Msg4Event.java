/*     */ package org.marker.weixin.msg;
/*     */ 
/*     */ import org.w3c.dom.Document;
/*     */ 
/*     */ public class Msg4Event extends Msg
/*     */ {
/*     */   public static final String SUBSCRIBE = "subscribe";
/*     */   public static final String UNSUBSCRIBE = "unsubscribe";
/*     */   public static final String CLICK = "CLICK";
/*     */   public static final String SCAN = "scan";
/*     */   public static final String LOCATION = "LOCATION";
/*     */   private String event;
/*     */   private String eventKey;
/*     */   private String ticket;
/*     */   private String latitude;
/*     */   private String longitude;
/*     */   private String precision;
/*     */ 
/*     */   public Msg4Event(Msg4Head head)
/*     */   {
/*  39 */     this.head = head;
/*     */   }
/*     */ 
/*     */   public void write(Document document)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void read(Document document)
/*     */   {
/*  52 */     this.event = getElementContent(document, "Event");
/*     */ 
/*  55 */     if (("subscribe".equals(this.event)) || ("unsubscribe".equals(this.event)) || ("scan".equals(this.event))) {
/*  56 */       this.eventKey = getElementContent(document, "EventKey");
/*  57 */       this.ticket = getElementContent(document, "Ticket");
/*  58 */     } else if ("LOCATION".equals(this.event)) {
/*  59 */       this.latitude = getElementContent(document, "Latitude");
/*  60 */       this.longitude = getElementContent(document, "Longitude");
/*  61 */       this.precision = getElementContent(document, "Precision");
/*  62 */     } else if ("CLICK".equals(this.event)) {
/*  63 */       this.eventKey = getElementContent(document, "EventKey");
/*     */     }
/*     */   }
/*     */ 
/*     */   public String getEvent()
/*     */   {
/*  73 */     return this.event;
/*     */   }
/*     */ 
/*     */   public void setEvent(String event)
/*     */   {
/*  78 */     this.event = event;
/*     */   }
/*     */ 
/*     */   public String getEventKey()
/*     */   {
/*  83 */     return this.eventKey;
/*     */   }
/*     */ 
/*     */   public void setEventKey(String eventKey)
/*     */   {
/*  88 */     this.eventKey = eventKey;
/*     */   }
/*     */ 
/*     */   public String getTicket()
/*     */   {
/*  96 */     return this.ticket;
/*     */   }
/*     */ 
/*     */   public void setTicket(String ticket)
/*     */   {
/* 104 */     this.ticket = ticket;
/*     */   }
/*     */ 
/*     */   public String getLatitude()
/*     */   {
/* 112 */     return this.latitude;
/*     */   }
/*     */ 
/*     */   public void setLatitude(String latitude)
/*     */   {
/* 120 */     this.latitude = latitude;
/*     */   }
/*     */ 
/*     */   public String getLongitude()
/*     */   {
/* 128 */     return this.longitude;
/*     */   }
/*     */ 
/*     */   public void setLongitude(String longitude)
/*     */   {
/* 136 */     this.longitude = longitude;
/*     */   }
/*     */ 
/*     */   public String getPrecision()
/*     */   {
/* 144 */     return this.precision;
/*     */   }
/*     */ 
/*     */   public void setPrecision(String precision)
/*     */   {
/* 152 */     this.precision = precision;
/*     */   }
/*     */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.msg.Msg4Event
 * JD-Core Version:    0.6.2
 */