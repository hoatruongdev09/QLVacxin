package bean;

import java.sql.*;

public class LichSuTiemPhongBean {
	public int maKH;
	public int maVacxin;
	public int sttMui;
	public Date ngayTiemPhong;
	public Date ngayHenTiepTheo;
	public LichSuTiemPhongBean(int maKH, int maVacxin, int sttMui, Date ngayTiemPhong, Date ngayHenTiepTheo) {
		super();
		this.maKH = maKH;
		this.maVacxin = maVacxin;
		this.sttMui = sttMui;
		this.ngayTiemPhong = ngayTiemPhong;
		this.ngayHenTiepTheo = ngayHenTiepTheo;
	}
	public int getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	public int getMaVacxin() {
		return maVacxin;
	}
	public void setMaVacxin(int maVacxin) {
		this.maVacxin = maVacxin;
	}
	public int getSttMui() {
		return sttMui;
	}
	public void setSttMui(int sttMui) {
		this.sttMui = sttMui;
	}
	public Date getNgayTiemPhong() {
		return ngayTiemPhong;
	}
	public void setNgayTiemPhong(Date ngayTiemPhong) {
		this.ngayTiemPhong = ngayTiemPhong;
	}
	public Date getNgayHenTiepTheo() {
		return ngayHenTiepTheo;
	}
	public void setNgayHenTiepTheo(Date ngayHenTiepTheo) {
		this.ngayHenTiepTheo = ngayHenTiepTheo;
	}
	
	
}
