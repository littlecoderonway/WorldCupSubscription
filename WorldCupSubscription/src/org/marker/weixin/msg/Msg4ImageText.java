/*    */ package org.marker.weixin.msg;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import org.w3c.dom.Document;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ public class Msg4ImageText extends Msg
/*    */ {
/*    */   private String articleCount;
/* 23 */   private List<Data4Item> items = new ArrayList(3);
/*    */ 
/*    */   public Msg4ImageText()
/*    */   {
/* 31 */     this.head = new Msg4Head();
/* 32 */     this.head.setMsgType("news");
/*    */   }
/*    */ 
/*    */   public void write(Document document)
/*    */   {
/* 37 */     Element root = document.createElement("xml");
/* 38 */     this.head.write(root, document);
/* 39 */     Element articleCountElement = document.createElement("ArticleCount");
/* 40 */     articleCountElement.setTextContent(this.articleCount);
/*    */ 
/* 42 */     Element articlesElement = document.createElement("Articles");
/* 43 */     int size = Integer.parseInt(this.articleCount);
/* 44 */     for (int i = 0; i < size; i++) {
/* 45 */       Data4Item currentItem = (Data4Item)this.items.get(i);
/* 46 */       Element itemElement = document.createElement("item");
/* 47 */       Element titleElement = document.createElement("Title");
/* 48 */       titleElement.setTextContent(currentItem.getTitle());
/* 49 */       Element descriptionElement = document.createElement("Description");
/* 50 */       descriptionElement.setTextContent(currentItem.getDescription());
/* 51 */       Element picUrlElement = document.createElement("PicUrl");
/* 52 */       picUrlElement.setTextContent(currentItem.getPicUrl());
/* 53 */       Element urlElement = document.createElement("Url");
/* 54 */       urlElement.setTextContent(currentItem.getUrl());
/* 55 */       itemElement.appendChild(titleElement);
/* 56 */       itemElement.appendChild(descriptionElement);
/* 57 */       itemElement.appendChild(picUrlElement);
/* 58 */       itemElement.appendChild(urlElement);
/*    */ 
/* 60 */       articlesElement.appendChild(itemElement);
/*    */     }
/*    */ 
/* 65 */     root.appendChild(articleCountElement);
/* 66 */     root.appendChild(articlesElement);
/*    */ 
/* 68 */     document.appendChild(root);
/*    */   }
/*    */ 
/*    */   public void read(Document document)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void addItem(Data4Item item)
/*    */   {
/* 79 */     this.items.add(item);
/* 80 */     reflushArticleCount();
/*    */   }
/*    */ 
/*    */   public void removeItem(int index) {
/* 84 */     this.items.remove(index);
/* 85 */     reflushArticleCount();
/*    */   }
/*    */ 
/*    */   private void reflushArticleCount()
/*    */   {
/* 94 */     this.articleCount = String.valueOf( this.items.size());
/*    */   }
/*    */ }

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.msg.Msg4ImageText
 * JD-Core Version:    0.6.2
 */