package _07.requestscope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class RequestScopeBean {

	// her bir request sonrasi bir bean objesi olusur.
	
	public int getHashCode(){
		return super.hashCode();
	}
	
}
