package model.dao;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;

import model.bean.BaiRaoBan;
import model.bean.RaoBan;

import org.apache.catalina.User;

public class RaoBanDAO {
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

	public boolean dangBai(RaoBan raoBan) {
		connect();
		// exec p_themraoban
		// 1'tensach',
		// 2'madanhmuc',
		// 3'tacgia',
		// 4'nxb',
		// 5namxb,
		// 6'manguoiraoban',
		// 7matinhban,
		// 8gia,
		// 9'mota',
		// 10'linkanh1',
		// 11'linkanh2',
		// 12'linkanh3',
		// 13'linkanh4',
		// 14'linkanh5'
		String sql = "exec p_themraoban ?,?,?,?,?,?,?,?,?,?,?,?,?,?";
		System.out.println("RaoBanDAO");
		try {

//			PreparedStatement pstm = connection.prepareStatement(sql);
			
			CallableStatement cstm = connection.prepareCall("{call p_themraoban (?,?,?,?,?,?,?,?,?,?,?,?,?,?) }");
			cstm.setString(1, raoBan.getTenSach());
			cstm.setString(2, raoBan.getMaDanhMuc());
			cstm.setString(3, raoBan.getTacGia());
			cstm.setString(4, raoBan.getNxb());
			cstm.setInt(5, raoBan.getNamxb());
			cstm.setString(6, raoBan.getMaNguoiRaoBan());
			cstm.setInt(7, raoBan.getMaTinhBan());
			cstm.setFloat(8, raoBan.getGia());
			cstm.setString(9, raoBan.getMoTa());
			cstm.setString(10, raoBan.getLinkAnh1());
			cstm.setString(11, raoBan.getLinkAnh2());
			cstm.setString(12, raoBan.getLinkAnh3());
			cstm.setString(13, raoBan.getLinkAnh4());
			cstm.setString(14, raoBan.getLinkAnh5());
			
			cstm.executeQuery();
			/*
			pstm.setNString(1,raoBan.getTenSach());
			pstm.setString(2,raoBan.getMaDanhMuc());
			pstm.setNString(3,raoBan.getTacGia());
			pstm.setNString(4,raoBan.getNxb());
			pstm.setInt(5, raoBan.getNamxb());
			pstm.setString(6, raoBan.getMaNguoiRaoBan());
			pstm.setInt(7, raoBan.getMaTinhBan());
			pstm.setFloat(8,raoBan.getGia());
			pstm.setNString(9,raoBan.getMoTa());
			pstm.setString(10, raoBan.getLinkAnh1());
			pstm.setString(11, raoBan.getLinkAnh2());
			pstm.setString(12, raoBan.getLinkAnh3());
			pstm.setString(13, raoBan.getLinkAnh4());
			pstm.setString(14, raoBan.getLinkAnh5());
			
			pstm.executeUpdate(sql);*/

			System.out.println("Dang bai thanh cong");
			
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			
			System.out.println("Fail CMNR!!!");
		}
		return false;
	}

	public RaoBan layThongTinBaiDang(String maRaoBan) {
		System.out.println("Ma rao ban DAO: " + maRaoBan);

		connect();
		String sql = "select * from dbo.f_LayThongTinRaoBan(?)";
		RaoBan raoBan = null;
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, maRaoBan);
			ResultSet rs = pstm.executeQuery();
			raoBan = new RaoBan();
			rs.next();

			raoBan.setMaRaoBan(rs.getString("maraoban"));
			raoBan.setMaSach(rs.getString("masach"));
			raoBan.setMaNguoiRaoBan(rs.getString("manguoiraoban"));
			raoBan.setMaTinhBan(rs.getInt("matinhban"));
			raoBan.setTenTinhBan(rs.getString("tentinhban"));
			raoBan.setGia(rs.getFloat("gia"));
			raoBan.setMoTa(rs.getString("mota"));
			raoBan.setLinkAnh1(rs.getString("linkanh1"));
			raoBan.setLinkAnh2(rs.getString("linkanh2"));
			raoBan.setLinkAnh3(rs.getString("linkanh3"));
			raoBan.setLinkAnh4(rs.getString("linkanh4"));
			raoBan.setLinkAnh5(rs.getString("linkanh5"));
			raoBan.setNgayBan(rs.getDate("ngayban"));
			raoBan.setHoTenNguoiBan(rs.getString("hoten"));
			raoBan.setTaiKhoanNguoiBan(rs.getString("taikhoan"));
			raoBan.setAnhNguoiBan(rs.getString("anh"));
			raoBan.setGioiTinh(rs.getInt("gioitinh"));
			raoBan.setNamSinhNguoiBan(rs.getInt("namsinh"));
			raoBan.setTenSach(rs.getString("tensach"));
			raoBan.setMaDanhMuc(rs.getString("madanhmuc"));
			raoBan.setTenDanhMuc(rs.getString("tendanhmuc"));
			raoBan.setNamxb(rs.getInt("namxb"));
			raoBan.setNxb(rs.getString("nxb"));
			raoBan.setTacGia(rs.getString("tacgia"));

			System.out.print("ten sach: " + raoBan.getTenSach());
			System.out.print(" --- ten nguoi dang: "
					+ raoBan.getHoTenNguoiBan());
			System.out.println(" --- nam sinh: " + raoBan.getNamSinhNguoiBan());

			raoBan.toString();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return raoBan;
	}

	public ArrayList<RaoBan> layDanhSachChoDuyet() {
		connect();
		String sql = "select * from v_danhsachchoduyet";
		RaoBan raoBan = null;
		ArrayList<RaoBan> list = new ArrayList<RaoBan>();
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			raoBan = new RaoBan();
			rs.next();
			while (rs.next()) {
				raoBan.setMaRaoBan(rs.getString("maraoban"));
				raoBan.setTenTinhBan(rs.getString("tentinhban"));
				raoBan.setGia(rs.getFloat("gia"));
				raoBan.setMoTa(rs.getString("mota"));
				raoBan.setLinkAnh1(rs.getString("linkanh1"));
				raoBan.setLinkAnh2(rs.getString("linkanh2"));
				raoBan.setLinkAnh3(rs.getString("linkanh3"));
				raoBan.setLinkAnh4(rs.getString("linkanh4"));
				raoBan.setLinkAnh5(rs.getString("linkanh5"));
				raoBan.setNgayBan(rs.getDate("ngayban"));
				raoBan.setTaiKhoanNguoiBan(rs.getString("taikhoan"));
				raoBan.setAnhNguoiBan(rs.getString("anh"));
				raoBan.setTenSach(rs.getString("tensach"));
				raoBan.setTenDanhMuc(rs.getString("tendanhmuc"));
				raoBan.setNamxb(rs.getInt("namxb"));
				raoBan.setNxb(rs.getString("nxb"));
				raoBan.setTacGia(rs.getString("tacgia"));
				list.add(raoBan);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<RaoBan> layDanhSachChoDuyet(String maNguoiDung) {
		connect();
		String sql = "select * from v_danhsachchoduyet where manguoiraoban='?'";
		RaoBan raoBan = null;
		ArrayList<RaoBan> list = new ArrayList<RaoBan>();
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, maNguoiDung);
			ResultSet rs = pstm.executeQuery();
			raoBan = new RaoBan();
			rs.next();
			while (rs.next()) {
				raoBan.setMaRaoBan(rs.getString("maraoban"));
				raoBan.setTenTinhBan(rs.getString("tentinhban"));
				raoBan.setGia(rs.getFloat("gia"));
				raoBan.setMoTa(rs.getString("mota"));
				raoBan.setLinkAnh1(rs.getString("linkanh1"));
				raoBan.setLinkAnh2(rs.getString("linkanh2"));
				raoBan.setLinkAnh3(rs.getString("linkanh3"));
				raoBan.setLinkAnh4(rs.getString("linkanh4"));
				raoBan.setLinkAnh5(rs.getString("linkanh5"));
				raoBan.setNgayBan(rs.getDate("ngayban"));
				raoBan.setTenSach(rs.getString("tensach"));
				raoBan.setTenDanhMuc(rs.getString("tendanhmuc"));
				raoBan.setNamxb(rs.getInt("namxb"));
				raoBan.setNxb(rs.getString("nxb"));
				raoBan.setTacGia(rs.getString("tacgia"));
				list.add(raoBan);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	public ArrayList<RaoBan> layDanhSachDangBan() {
		connect();
		String sql = "select * from v_danhsachdangban";
		RaoBan raoBan = null;
		ArrayList<RaoBan> list = new ArrayList<RaoBan>();
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			raoBan = new RaoBan();
			rs.next();
			while (rs.next()) {
				raoBan.setMaRaoBan(rs.getString("maraoban"));
				raoBan.setTenTinhBan(rs.getString("tentinhban"));
				raoBan.setGia(rs.getFloat("gia"));
				raoBan.setMoTa(rs.getString("mota"));
				raoBan.setLinkAnh1(rs.getString("linkanh1"));
				raoBan.setLinkAnh2(rs.getString("linkanh2"));
				raoBan.setLinkAnh3(rs.getString("linkanh3"));
				raoBan.setLinkAnh4(rs.getString("linkanh4"));
				raoBan.setLinkAnh5(rs.getString("linkanh5"));
				raoBan.setNgayBan(rs.getDate("ngayban"));
				raoBan.setTaiKhoanNguoiBan(rs.getString("taikhoan"));
				raoBan.setAnhNguoiBan(rs.getString("anh"));
				raoBan.setTenSach(rs.getString("tensach"));
				raoBan.setTenDanhMuc(rs.getString("tendanhmuc"));
				raoBan.setNamxb(rs.getInt("namxb"));
				raoBan.setNxb(rs.getString("nxb"));
				raoBan.setTacGia(rs.getString("tacgia"));
				list.add(raoBan);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<RaoBan> layDanhSachDangBan(String maNguoiDung) {
		connect();
		String sql = "select * from v_danhsachdangban where manguoidung ='?'";
		RaoBan raoBan = null;
		ArrayList<RaoBan> list = new ArrayList<RaoBan>();
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, maNguoiDung);
			ResultSet rs = pstm.executeQuery();
			raoBan = new RaoBan();
			rs.next();
			while (rs.next()) {
				raoBan.setMaRaoBan(rs.getString("maraoban"));
				raoBan.setTenTinhBan(rs.getString("tentinhban"));
				raoBan.setGia(rs.getFloat("gia"));
				raoBan.setMoTa(rs.getString("mota"));
				raoBan.setLinkAnh1(rs.getString("linkanh1"));
				raoBan.setLinkAnh2(rs.getString("linkanh2"));
				raoBan.setLinkAnh3(rs.getString("linkanh3"));
				raoBan.setLinkAnh4(rs.getString("linkanh4"));
				raoBan.setLinkAnh5(rs.getString("linkanh5"));
				raoBan.setNgayBan(rs.getDate("ngayban"));
				raoBan.setTenSach(rs.getString("tensach"));
				raoBan.setTenDanhMuc(rs.getString("tendanhmuc"));
				raoBan.setNamxb(rs.getInt("namxb"));
				raoBan.setNxb(rs.getString("nxb"));
				raoBan.setTacGia(rs.getString("tacgia"));
				list.add(raoBan);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<RaoBan> layDanhSachDaBan() {
		connect();
		String sql = "select * from v_danhsachdabanad";
		RaoBan raoBan = null;
		ArrayList<RaoBan> list = new ArrayList<RaoBan>();
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			raoBan = new RaoBan();
			rs.next();
			while (rs.next()) {
				raoBan.setMaRaoBan(rs.getString("maraoban"));
				raoBan.setTenTinhBan(rs.getString("tentinhban"));
				raoBan.setGia(rs.getFloat("gia"));
				raoBan.setMoTa(rs.getString("mota"));
				raoBan.setLinkAnh1(rs.getString("linkanh1"));
				raoBan.setLinkAnh2(rs.getString("linkanh2"));
				raoBan.setLinkAnh3(rs.getString("linkanh3"));
				raoBan.setLinkAnh4(rs.getString("linkanh4"));
				raoBan.setLinkAnh5(rs.getString("linkanh5"));
				raoBan.setNgayBan(rs.getDate("ngayban"));
				raoBan.setNgayDuocBan(rs.getDate("ngayduocban"));
				raoBan.setTaiKhoanNguoiBan(rs.getString("taikhoan"));
				raoBan.setAnhNguoiBan(rs.getString("anh"));
				raoBan.setTenSach(rs.getString("tensach"));
				raoBan.setTenDanhMuc(rs.getString("tendanhmuc"));
				raoBan.setNamxb(rs.getInt("namxb"));
				raoBan.setNxb(rs.getString("nxb"));
				raoBan.setTacGia(rs.getString("tacgia"));
				list.add(raoBan);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	public ArrayList<RaoBan> layDanhSachDaBan(String maNguoiDung) {
		connect();
		String sql = "select * from v_danhsachdabannd where manguoiraoban='?'";
		RaoBan raoBan = null;
		ArrayList<RaoBan> list = new ArrayList<RaoBan>();
		try {
			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, maNguoiDung);
			ResultSet rs = pstm.executeQuery();
			raoBan = new RaoBan();
			rs.next();
			while (rs.next()) {
				raoBan.setMaRaoBan(rs.getString("maraoban"));
				raoBan.setTenTinhBan(rs.getString("tentinhban"));
				raoBan.setGia(rs.getFloat("gia"));
				raoBan.setMoTa(rs.getString("mota"));
				raoBan.setLinkAnh1(rs.getString("linkanh1"));
				raoBan.setLinkAnh2(rs.getString("linkanh2"));
				raoBan.setLinkAnh3(rs.getString("linkanh3"));
				raoBan.setLinkAnh4(rs.getString("linkanh4"));
				raoBan.setLinkAnh5(rs.getString("linkanh5"));
				raoBan.setNgayBan(rs.getDate("ngayban"));
				raoBan.setNgayDuocBan(rs.getDate("ngayduocban"));
				raoBan.setTenSach(rs.getString("tensach"));
				raoBan.setTenDanhMuc(rs.getString("tendanhmuc"));
				raoBan.setNamxb(rs.getInt("namxb"));
				raoBan.setNxb(rs.getString("nxb"));
				raoBan.setTacGia(rs.getString("tacgia"));
				list.add(raoBan);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
