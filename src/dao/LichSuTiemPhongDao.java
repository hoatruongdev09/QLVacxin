package dao;
import java.sql.*;
import java.util.ArrayList;

import bean.*;
import config.Database;
public class LichSuTiemPhongDao {
	public ArrayList<KH_LS_VC> danhSachKhachHangVacxin() throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "SELECT * FROM KHACHHANG JOIN LICHSUTIEMPHONG ON KHACHHANG.MaKH = LICHSUTIEMPHONG.MaKH JOIN VACXIN ON LICHSUTIEMPHONG.MaVacxin = VACXIN.MaVacxin";
		PreparedStatement stmt = cn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		ArrayList<KH_LS_VC> list = new ArrayList<KH_LS_VC>();
		KH_LS_VC tmp = null;
		while(rs.next()) {
			KhachHangBean khachHang = new KhachHangBean(rs.getInt(1), rs.getString(2), rs.getString(3),	rs.getString(4), rs.getDate(5), rs.getInt(6));
			LichSuTiemPhongBean lichSu = new LichSuTiemPhongBean(rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getDate(10), rs.getDate(11));
			VacxinBean vacxin = new VacxinBean(rs.getInt(12), rs.getString(13), rs.getInt(14), rs.getString(15), rs.getString(16));
			tmp = new KH_LS_VC(khachHang, vacxin, lichSu);
			list.add(tmp);
		}
		
		stmt.close();
		cn.close();
		return list;
	}
	public void xoaLichSu(int maKhachHang, int maVacxin, int sttMui) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "DELETE FROM LICHSUTIEMPHONG WHERE LICHSUTIEMPHONG.MaKH = ? AND LICHSUTIEMPHONG.MaVacxin = ? AND LICHSUTIEMPHONG.STTMui = ?";
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setInt(1, maKhachHang);
		stmt.setInt(2, maVacxin);
		stmt.setInt(3, sttMui);
		stmt.executeQuery();
		stmt.close();
		cn.close();
	}
}











































