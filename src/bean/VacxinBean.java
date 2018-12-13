package bean;

public class VacxinBean {
	public int maVacxin;
	public String tenVacxin;
	public int soMui;
	public String moTa;
	public String tenHangSX;
	public VacxinBean(int maVacxin, String tenVacxin, int soMui, String moTa, String tenHangSX) {
		super();
		this.maVacxin = maVacxin;
		this.tenVacxin = tenVacxin;
		this.soMui = soMui;
		this.moTa = moTa;
		this.tenHangSX = tenHangSX;
	}
	public int getMaVacxin() {
		return maVacxin;
	}
	public void setMaVacxin(int maVacxin) {
		this.maVacxin = maVacxin;
	}
	public String getTenVacxin() {
		return tenVacxin;
	}
	public void setTenVacxin(String tenVacxin) {
		this.tenVacxin = tenVacxin;
	}
	public int getSoMui() {
		return soMui;
	}
	public void setSoMui(int soMui) {
		this.soMui = soMui;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getTenHangSX() {
		return tenHangSX;
	}
	public void setTenHangSX(String tenHangSX) {
		this.tenHangSX = tenHangSX;
	}

	
}
