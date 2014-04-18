/*     */ package org.marker.weixin;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.marker.weixin.msg.Msg4Event;
/*     */ import org.marker.weixin.msg.Msg4Image;
/*     */ import org.marker.weixin.msg.Msg4Link;
/*     */ import org.marker.weixin.msg.Msg4Location;
/*     */ import org.marker.weixin.msg.Msg4Text;
/*     */ import org.marker.weixin.msg.Msg4Video;
/*     */ import org.marker.weixin.msg.Msg4Voice;
/*     */ 
/*     */ public class DefaultSession extends Session
/*     */ {
/*  26 */   private List<HandleMessageListener> listeners = new ArrayList(3);
/*     */ 
/*     */   public static DefaultSession newInstance()
/*     */   {
/*  38 */     return new DefaultSession();
/*     */   }
/*     */ 
/*     */   public void addOnHandleMessageListener(HandleMessageListener handleMassge)
/*     */   {
/*  47 */     this.listeners.add(handleMassge);
/*     */   }
/*     */ 
/*     */   public void removeOnHandleMessageListener(HandleMessageListener handleMassge)
/*     */   {
/*  55 */     this.listeners.remove(handleMassge);
/*     */   }
/*     */ 
/*     */   public void onTextMsg(Msg4Text msg)
/*     */   {
/*  61 */     for (HandleMessageListener currentListener : this.listeners)
/*  62 */       currentListener.onTextMsg(msg);
/*     */   }
/*     */ 
/*     */   public void onImageMsg(Msg4Image msg)
/*     */   {
/*  68 */     for (HandleMessageListener currentListener : this.listeners)
/*  69 */       currentListener.onImageMsg(msg);
/*     */   }
/*     */ 
/*     */   public void onEventMsg(Msg4Event msg)
/*     */   {
/*  75 */     for (HandleMessageListener currentListener : this.listeners)
/*  76 */       currentListener.onEventMsg(msg);
/*     */   }
/*     */ 
/*     */   public void onLinkMsg(Msg4Link msg)
/*     */   {
/*  82 */     for (HandleMessageListener currentListener : this.listeners)
/*  83 */       currentListener.onLinkMsg(msg);
/*     */   }
/*     */ 
/*     */   public void onLocationMsg(Msg4Location msg)
/*     */   {
/*  89 */     for (HandleMessageListener currentListener : this.listeners)
/*  90 */       currentListener.onLocationMsg(msg);
/*     */   }
/*     */ 
/*     */   public void onErrorMsg(int errorCode)
/*     */   {
/*  96 */     for (HandleMessageListener currentListener : this.listeners)
/*  97 */       currentListener.onErrorMsg(errorCode);
/*     */   }
/*     */ 
/*     */   public void onVoiceMsg(Msg4Voice msg)
/*     */   {
/* 107 */     for (HandleMessageListener currentListener : this.listeners)
/* 108 */       currentListener.onVoiceMsg(msg);
/*     */   }
/*     */ 
/*     */   public void onVideoMsg(Msg4Video msg)
/*     */   {
/* 118 */     for (HandleMessageListener currentListener : this.listeners)
/* 119 */       currentListener.onVideoMsg(msg);
/*     */   }
/*     */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.DefaultSession
 * JD-Core Version:    0.6.2
 */