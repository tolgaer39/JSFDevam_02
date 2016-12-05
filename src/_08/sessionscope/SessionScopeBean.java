package _08.sessionscope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class SessionScopeBean {
	
	private String name;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	// bir tane bean objesi olusturlur ve session boyunca o session kullanilir.

	public int getHashCode(){
		return super.hashCode();
	}
	
}
