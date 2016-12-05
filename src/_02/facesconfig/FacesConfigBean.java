package _02.facesconfig;


public class FacesConfigBean {

	// JSF 2.0 dan once managed beanler xml de tanimlanmak zorundadir.
	// Managed Beanleri xml konfigurasyonu olarak tanimlamak icin faces-config xml dosyasi gereklidir.
	// Bu dosya WEB-INF/faces-config.xml lokasyonunda olmalidir.
	
	// <managed-bean> baslangic
	// <namaged-bean-name> managed bean ismi
	// <managed-bean-class> package name.className bilgisi
	// <managed-bean-scope> scope bilgisi
	// <managed-property> @ManagedPropery e karsilik gelir.
	
	
	private String name;
	private String password;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
