package bean;

public class KH_LS_VC {
	public KhachHangBean khacHang;
	public VacxinBean vacxin;
	public LichSuTiemPhongBean lichSu;
	public LichSuTiemPhongBean getLichSu() {
		return lichSu;
	}
	public void setLichSu(LichSuTiemPhongBean lichSu) {
		this.lichSu = lichSu;
	}
	public KH_LS_VC(KhachHangBean khacHang, VacxinBean vacxin,  LichSuTiemPhongBean lichSu) {
		super();
		this.khacHang = khacHang;
		this.vacxin = vacxin;
		this.lichSu = lichSu;
	}
	public KhachHangBean getKhacHang() {
		return khacHang;
	}
	public void setKhacHang(KhachHangBean khacHang) {
		this.khacHang = khacHang;
	}
	public VacxinBean getVacxin() {
		return vacxin;
	}
	public void setVacxin(VacxinBean vacxin) {
		this.vacxin = vacxin;
	}
	
	
}
