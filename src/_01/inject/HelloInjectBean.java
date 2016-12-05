package _01.inject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class HelloInjectBean {

	// ManagedProperty annotation ile dependency injection teknigini JSF in yapmasini sagliyoruz.
	// Bunu yapabilmesi icin setter methodu uzerinden calismalidir. Buna setter injection adi verilir.
	@ManagedProperty(value="#{message}")
	private MessageBean messageBean;

	public MessageBean getMessageBean() {
		return messageBean;
	}
	// Bunu yapabilmesi icin setter methodu uzerinden calismalidir. Buna setter injection adi verilir.
	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}
	
	
	
	@ManagedProperty(value="test name")
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
