package com.way.worldcup;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.marker.weixin.DefaultSession;
import org.marker.weixin.HandleMessageAdapter;
import org.marker.weixin.MySecurity;
import org.marker.weixin.msg.Data4Item;
import org.marker.weixin.msg.Msg4ImageText;
import org.marker.weixin.msg.Msg4Text;

import com.opensymphony.xwork2.util.ResolverUtil.IsA;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static final String TOKEN = "testtoken";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
    }

	/**
	 * 处理微信服务器验证
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("test");
		//return;
		String signature = request.getParameter("signature"); //微信加密签名
		String timestamp = request.getParameter("timestamp"); //时间戳
		String nonce = request.getParameter("nonce"); //随机数
		String echostr = request.getParameter("echostr");//随机字符串
		
		List<String> list = new ArrayList<String>(3){
			private static final long serialVersionUID = 2621444383666420433L;
			public String toString() {
			    return this.get(0) + this.get(1) + this.get(2);
			}
		};
		list.add(TOKEN);
		list.add(timestamp);
		list.add(nonce);
		Collections.sort(list);
		String tmp = new MySecurity().encode(list.toString(), MySecurity.SHA_1);//SHA-1加密
		Writer out = response.getWriter();
		if (signature.equals(tmp)) {
			out.write(echostr);
		}else{
			out.write("");
		}
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("test");
		//return;
		
		InputStream is = request.getInputStream();
		OutputStream os = response.getOutputStream();
		
		final DefaultSession session = DefaultSession.newInstance();
		session.addOnHandleMessageListener(new HandleMessageAdapter(){
			@Override
			public void onTextMsg(Msg4Text msg){
				System.out.println("收到微信消息: "+msg.getContent());
				if ("test".equals(msg.getContent())) {
					Msg4Text rmsg = new Msg4Text();
					rmsg.setFromUserName(msg.getToUserName());
					//rmsg.setFuncFlag("0");
					rmsg.setContent("haha");
					session.callback(rmsg);
				}
				//回复一条消息
				Data4Item d1 = new Data4Item("蘑菇建站系统", "测试描述", "http://cms.yl-blog.com/themes/blue/images/logo.png", "cms.yl-blog.com");
				Data4Item d2 = new Data4Item("雨林博客", "测试描述", "http://www.yl-blog.com/template/ylblog/images/logo.png", "www.yl-blog.com");
				Msg4ImageText mit = new Msg4ImageText();
				mit.setFromUserName(msg.getToUserName());
				mit.setToUserName(msg.getFromUserName());
				mit.setCreateTime(msg.getCreateTime());
				mit.addItem(d1);
				mit.addItem(d2);
				//mit.setFuncFlag("0"); 
				session.callback(mit);
			}
		});
		
		//必须调用这两个方法
		//如果不调用close方法，将会出现响应数据串到其它Servlet中。
		session.process(is, os);//处理微信消息
		session.close();//关闭Session

	}

}











