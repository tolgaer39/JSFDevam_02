package _10.viewscope;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;



@ManagedBean
@ViewScoped
public class ViewScopeBean implements Serializable {
	
	private static final long serialVersiyonID =1L;
	
	private String name;
	private int count;
	
	public int getCount() {
		return ++count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHashCode(){
		return super.hashCode();
	}
	
}
