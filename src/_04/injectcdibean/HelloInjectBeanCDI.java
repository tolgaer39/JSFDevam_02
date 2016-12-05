package _04.injectcdibean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named(value="helloInjectBeanCDI")
@SessionScoped
public class HelloInjectBeanCDI implements Serializable{

	// CDI beanlerinde @ManagedProperty yerine @Inject annotaion ile inject ediyorduk.
	@Inject
	private MessageBeanCDI messageBean;

	public MessageBeanCDI getMessageBean() {
		return messageBean;
	}
	
	public void setMessageBean(MessageBeanCDI messageBean) {
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
