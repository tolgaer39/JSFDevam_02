package _01.inject;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="message")
@SessionScoped
public class MessageBean {
	
	private String myMessage="JSF injection message.";

	public String getMyMessage() {
		return myMessage;
	}

	public void setMyMessage(String myMessage) {
		this.myMessage = myMessage;
	}

}
