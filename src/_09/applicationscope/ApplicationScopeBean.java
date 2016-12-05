package _09.applicationscope;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@ApplicationScoped
public class ApplicationScopeBean {
	
	private String name;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	// bir tane bean objesi olusturulur ve session boyunca o session kullanilir.

	public int getHashCode(){
		return super.hashCode();
	}
	
}
