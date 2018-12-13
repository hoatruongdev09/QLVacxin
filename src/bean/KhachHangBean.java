package bean;
import java.sql.*;
public class KhachHangBean {
	public int maKH;
	public String hoTenKH;
	public String soDienThoai;
	public String diaChiKH;
	public Date ngaySinh;
	public int gioiTinh;
	public KhachHangBean(int maKH, String hoTenKH, String soDienThoai, String diaChiKH, Date ngaySinh, int gioiTinh) {
		super();
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.soDienThoai = soDienThoai;
		this.diaChiKH = diaChiKH;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}
	public int getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	public String getHoTenKH() {
		return hoTenKH;
	}
	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChiKH() {
		return diaChiKH;
	}
	public void setDiaChiKH(String diaChiKH) {
		this.diaChiKH = diaChiKH;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	
}
