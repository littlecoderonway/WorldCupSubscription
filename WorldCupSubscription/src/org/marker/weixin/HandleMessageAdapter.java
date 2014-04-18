package org.marker.weixin;

import org.marker.weixin.msg.Msg4Event;
import org.marker.weixin.msg.Msg4Image;
import org.marker.weixin.msg.Msg4Link;
import org.marker.weixin.msg.Msg4Location;
import org.marker.weixin.msg.Msg4Text;
import org.marker.weixin.msg.Msg4Video;
import org.marker.weixin.msg.Msg4Voice;

public class HandleMessageAdapter
  implements HandleMessageListener
{
  public void onTextMsg(Msg4Text msg)
  {
  }

  public void onImageMsg(Msg4Image msg)
  {
  }

  public void onEventMsg(Msg4Event msg)
  {
  }

  public void onLinkMsg(Msg4Link msg)
  {
  }

  public void onLocationMsg(Msg4Location msg)
  {
  }

  public void onErrorMsg(int errorCode)
  {
  }

  public void onVoiceMsg(Msg4Voice msg)
  {
  }

  public void onVideoMsg(Msg4Video msg)
  {
  }
}

/* Location:           F:\微信接口\微信API更新20131111\weixinapi.jar
 * Qualified Name:     org.marker.weixin.HandleMessageAdapter
 * JD-Core Version:    0.6.2
 */