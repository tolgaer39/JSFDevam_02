package _03.injectxml;



public class HelloInjectBeanXML {


	private MessageBeanXML messageBean;

	public MessageBeanXML getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(MessageBeanXML messageBean) {
		this.messageBean = messageBean;
	}
	
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getMyMessage(){
		
		return messageBean.getMyMessage()+name;
	}
	
	
}
