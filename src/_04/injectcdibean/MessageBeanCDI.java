package _04.injectcdibean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named(value="messageBeanCDI")
@SessionScoped
public class MessageBeanCDI implements Serializable{
	
	private String myMessage="JSF injection message.";

	public String getMyMessage() {
		return myMessage;
	}

	public void setMyMessage(String myMessage) {
		this.myMessage = myMessage;
	}

}
