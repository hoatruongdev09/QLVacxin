package bo;

import java.util.ArrayList;

import bean.*;
import dao.*;

public class LichSuTiemPhongBo {
	private LichSuTiemPhongDao lsTiemPhongDao;
	
	public LichSuTiemPhongBo() {
		lsTiemPhongDao = new LichSuTiemPhongDao();
	}
	
	public ArrayList<KH_LS_VC> danhSachKhachHangVacxin() throws Exception{
		return lsTiemPhongDao.danhSachKhachHangVacxin();
	}
	public void xoaLichSu(int maKhachHang, int maVacxin, int sttMui) throws Exception {
		lsTiemPhongDao.xoaLichSu(maKhachHang, maVacxin, sttMui);
	}
}
