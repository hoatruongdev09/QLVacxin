package dao;

import java.sql.*;
import java.util.ArrayList;

import bean.*;
import config.Database;
public class BenhDao {
	public void themBenh(String tenBenh, String moTa) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "INSERT INTO BENH(MaBenh,TenBenh,MoTa) VALUES(?,?,?)";
		int count = demBenh() + 1;
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setInt(1, count);
		stmt.setString(2, tenBenh);
		stmt.setString(3, moTa);
		stmt.executeQuery();
		stmt.close();
		cn.close();
	}
	public int demBenh() throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "SELECT COUNT(BENH.MaBenh) as num FROM BENH";
		PreparedStatement stmt = cn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		int count = 0;
		if(rs.next()) {
			count = rs.getInt(1);
		}
		stmt.close();
		cn.close();
		return count;
	}
	public ArrayList<BenhBean> danhSachBenh() throws Exception{
		Connection cn = Database.KetNoi();
		String sql = "SELECT * FROM BENH";
		PreparedStatement stmt = cn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		ArrayList<BenhBean> dsBenh = new ArrayList<BenhBean>();
		BenhBean tmp = null;
		while(rs.next()) {
			tmp = new BenhBean(rs.getInt(1), rs.getString(2), rs.getString(3));
			dsBenh.add((tmp));
		}
		stmt.close();
		cn.close();
		return dsBenh;
	}
	public BenhBean layThongTinBenh(int maBenh) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "SELECT * FROM BENH WHERE MaBenh = ?";
		PreparedStatement stmt = cn.prepareStatement(sql);
		stmt.setInt(1, maBenh);
		ResultSet rs = stmt.executeQuery();
		BenhBean tmp = null;
		if(rs.next()) {
			tmp = new BenhBean(rs.getInt(1),rs.getString(2),rs.getString(3));
		}
		stmt.close();
		cn.close();
		return tmp;
	}
	public void suaThongTinBenh(int maBenh, String tenBenh, String moTa) throws Exception {
		Connection cn = Database.KetNoi();
		String sql = "UPDATE BENH SET TenBenh = ?, MoTa = ? WHERE MaBenh = ? ";
		PreparedStatement stmt =  cn.prepareStatement(sql);
		stmt.setString(1, tenBenh);
		stmt.setString(2, moTa);
		stmt.setInt(3, maBenh);
		stmt.executeQuery();
		stmt.close();
		cn.close();
	}
	
	
}







































