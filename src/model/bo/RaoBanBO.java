package model.bo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.RaoBan;
import model.dao.RaoBanDAO;

public class RaoBanBO {
	RaoBanDAO raoBanDAO = new RaoBanDAO();

	public RaoBan layThongTinBaiDang(String maRaoBan) {
		return raoBanDAO.layThongTinBaiDang(maRaoBan);
	}

	public ArrayList<RaoBan> layDanhSachChoDuyet() {
		return raoBanDAO.layDanhSachChoDuyet();
	}

	public ArrayList<RaoBan> layDanhSachChoDuyet(String maNguoiDung) {
		return raoBanDAO.layDanhSachChoDuyet(maNguoiDung);

	}

	public ArrayList<RaoBan> layDanhSachDangBan() {
		return raoBanDAO.layDanhSachDangBan();
	}

	public ArrayList<RaoBan> layDanhSachDangBan(String maNguoiDung) {
		return raoBanDAO.layDanhSachDangBan(maNguoiDung);
	}

	public ArrayList<RaoBan> layDanhSachDaBan() {
		return raoBanDAO.layDanhSachDaBan();

	}

	public ArrayList<RaoBan> layDanhSachDaBan(String maNguoiDung) {
		return raoBanDAO.layDanhSachDaBan(maNguoiDung);
	}

	public boolean dangBai(RaoBan raoBan) {
		return raoBanDAO.dangBai(raoBan);
	}
}
