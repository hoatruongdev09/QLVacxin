package bo;

import java.util.ArrayList;

import bean.BenhBean;
import dao.*;
public class BenhBo {
	private BenhDao benhDao;
	
	public BenhBo() {
		benhDao = new BenhDao();
	}
	public void themBenh(String tenBenh, String moTa) throws Exception {
		benhDao.themBenh(tenBenh, moTa);
	}
	public int demBenh() throws Exception {
		return benhDao.demBenh();
	}
	public ArrayList<BenhBean> danhSachBenh() throws Exception{
		return benhDao.danhSachBenh();
	}
	public BenhBean layThongTinBenh(int maBenh) throws Exception {
		return benhDao.layThongTinBenh(maBenh);
	}
	public void suaThongTinBenh(int maBenh, String tenBenh, String moTa) throws Exception {
		benhDao.suaThongTinBenh(maBenh, tenBenh, moTa);
	}
}
