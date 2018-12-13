package bean;

public class BenhBean {
	public int maBenh;
	public String tenBenh;
	public String moTa;
	public BenhBean(int maBenh, String tenBenh, String moTa) {
		super();
		this.maBenh = maBenh;
		this.tenBenh = tenBenh;
		this.moTa = moTa;
	}
	public int getMaBenh() {
		return maBenh;
	}
	public void setMaBenh(int maBenh) {
		this.maBenh = maBenh;
	}
	public String getTenBenh() {
		return tenBenh;
	}
	public void setTenBenh(String tenBenh) {
		this.tenBenh = tenBenh;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	
}
