package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.BaiRaoBan;
import model.bean.DanhMuc;
import model.bean.RaoBan;

import org.apache.catalina.User;

public class BaiRaoBanDAO {
	String url = "jdbc:sqlserver://localhost:1433;databaseName=LineBook";
	String userName = "sa";
	String password = "12345678";
	Connection connection;

	void connect() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		}
	}

	public ArrayList<BaiRaoBan> layDanhSachMoiNhat() {
		connect();

		String sql = "select top 4 maraoban,tensach,tacgia,gia,tentinh,linkanh1 from tblraoban rb inner join tblsach sa on rb.masach =sa.masach inner join tbltinh ti on ti.matinh =rb.matinh where trangthaiban=0 order by maraoban desc";
		ArrayList<BaiRaoBan> list = new ArrayList<BaiRaoBan>();

		try {
			Statement stm = connection.createStatement();
			ResultSet rs = null;
			rs = stm.executeQuery(sql);
			BaiRaoBan baiRaoBan;
			while (rs.next()) {
				baiRaoBan = new BaiRaoBan();
				baiRaoBan.setMaRaoBan(rs.getString("maraoban"));
				baiRaoBan.setTacGia(rs.getString("tacgia"));
				baiRaoBan.setTenSach(rs.getString("tensach"));
				baiRaoBan.setTenTinh(rs.getString("tentinh"));
				baiRaoBan.setGia(rs.getFloat("gia"));
				baiRaoBan.setLinkAnh(rs.getString("linkanh1"));
				list.add(baiRaoBan);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<BaiRaoBan> layDanhSachNgauNhien() {
		connect();

		String sql = "select top 4 maraoban,tensach,tacgia,gia,tentinh,linkanh1 from tblraoban rb inner join tblsach sa on rb.masach =sa.masach inner join tbltinh ti on ti.matinh =rb.matinh where trangthaiban=0 order by newid()";
		ArrayList<BaiRaoBan> list = new ArrayList<BaiRaoBan>();

		try {
			Statement stm = connection.createStatement();
			ResultSet rs = null;
			rs = stm.executeQuery(sql);
			BaiRaoBan baiRaoBan;
			while (rs.next()) {
				baiRaoBan = new BaiRaoBan();
				baiRaoBan.setMaRaoBan(rs.getString("maraoban"));
				baiRaoBan.setTacGia(rs.getString("tacgia"));
				baiRaoBan.setTenSach(rs.getString("tensach"));
				baiRaoBan.setTenTinh(rs.getString("tentinh"));
				baiRaoBan.setGia(rs.getFloat("gia"));
				baiRaoBan.setLinkAnh(rs.getString("linkanh1"));
				list.add(baiRaoBan);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<BaiRaoBan> layDanhSachDanhMucBanNhieuNhat() {
		connect();

		String sql = "select top 4 maraoban,tensach,tacgia,gia,tentinh,linkanh1 from tblraoban rb inner join tblsach sa on rb.masach =sa.masach inner join tbltinh ti on ti.matinh =rb.matinh inner join tbldanhmuc dm on dm.madanhmuc=sa.madanhmuc where trangthaiban=0 and sa.madanhmuc in (select top 1 madanhmuc from tbldanhmuc order by soluongdaban)";
		ArrayList<BaiRaoBan> list = new ArrayList<BaiRaoBan>();

		try {
			Statement stm = connection.createStatement();
			ResultSet rs = null;
			rs = stm.executeQuery(sql);
			BaiRaoBan baiRaoBan;
			while (rs.next()) {
				baiRaoBan = new BaiRaoBan();
				baiRaoBan.setMaRaoBan(rs.getString("maraoban"));
				baiRaoBan.setTacGia(rs.getString("tacgia"));
				baiRaoBan.setTenSach(rs.getString("tensach"));
				baiRaoBan.setTenTinh(rs.getString("tentinh"));
				baiRaoBan.setGia(rs.getFloat("gia"));
				baiRaoBan.setLinkAnh(rs.getString("linkanh1"));
				list.add(baiRaoBan);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<BaiRaoBan> layDanhSachTimKiemTenSach(String tuKhoa) {
		connect();

		String sql = "select maraoban,tensach,tacgia,gia,tentinh,linkanh1 from tblraoban rb inner join tblsach sa on rb.masach =sa.masach inner join tbltinh ti on ti.matinh =rb.matinh inner join tbldanhmuc dm on dm.madanhmuc=sa.madanhmuc where trangthaiban=0 and tensach like N'%" + tuKhoa + "%' order by gia,ngayban";
		ArrayList<BaiRaoBan> list = new ArrayList<BaiRaoBan>();
		System.out.println("SQL: " + sql);
		try {
			Statement pstm = connection.createStatement();
//			pstm.setString(1, tuKhoa);
			ResultSet rs = null;
			rs = pstm.executeQuery(sql);
			BaiRaoBan baiRaoBan;
			while (rs.next()) {
				baiRaoBan = new BaiRaoBan();
				baiRaoBan.setMaRaoBan(rs.getString("maraoban"));
				baiRaoBan.setTacGia(rs.getString("tacgia"));
				baiRaoBan.setTenSach(rs.getString("tensach"));
				baiRaoBan.setTenTinh(rs.getString("tentinh"));
				baiRaoBan.setGia(rs.getFloat("gia"));
				baiRaoBan.setLinkAnh(rs.getString("linkanh1"));
				list.add(baiRaoBan);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<BaiRaoBan> layDanhSachTimKiemTenTacGia(String tuKhoa) {
		connect();

		String sql = "select maraoban,tensach,tacgia,gia,tentinh,linkanh1 from tblraoban rb inner join tblsach sa on rb.masach =sa.masach inner join tbltinh ti on ti.matinh =rb.matinh inner join tbldanhmuc dm on dm.madanhmuc=sa.madanhmuc where trangthaiban=0 and tacgia like like N'%" + tuKhoa + "%' order by gia,ngayban)";
		ArrayList<BaiRaoBan> list = new ArrayList<BaiRaoBan>();

		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, tuKhoa);
			ResultSet rs = null;
			rs = pstm.executeQuery(sql);
			BaiRaoBan baiRaoBan;
			while (rs.next()) {
				baiRaoBan = new BaiRaoBan();
				baiRaoBan.setMaRaoBan(rs.getString("maraoban"));
				baiRaoBan.setTacGia(rs.getString("tacgia"));
				baiRaoBan.setTenSach(rs.getString("tensach"));
				baiRaoBan.setTenTinh(rs.getString("tentinh"));
				baiRaoBan.setGia(rs.getFloat("gia"));
				baiRaoBan.setLinkAnh(rs.getString("linkanh1"));
				list.add(baiRaoBan);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<BaiRaoBan> layDanhSachGoiY(String userID) {
		
		connect();

		String sql = "select top 4 maraoban,tensach,tacgia,gia,tentinh,linkanh1 from tblraoban rb inner join tblsach sa on rb.masach =sa.masach inner join tbltinh ti on ti.matinh =rb.matinh where trangthaiban=0 order by maraoban desc";
		ArrayList<BaiRaoBan> list = new ArrayList<BaiRaoBan>();

		try {
			Statement stm = connection.createStatement();
			ResultSet rs = null;
			rs = stm.executeQuery(sql);
			BaiRaoBan baiRaoBan;
			while (rs.next()) {
				baiRaoBan = new BaiRaoBan();
				baiRaoBan.setMaRaoBan(rs.getString("maraoban"));
				baiRaoBan.setTacGia(rs.getString("tacgia"));
				baiRaoBan.setTenSach(rs.getString("tensach"));
				baiRaoBan.setTenTinh(rs.getString("tentinh"));
				baiRaoBan.setGia(rs.getFloat("gia"));
				baiRaoBan.setLinkAnh(rs.getString("linkanh1"));
				list.add(baiRaoBan);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
