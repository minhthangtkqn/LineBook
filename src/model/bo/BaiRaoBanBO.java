package model.bo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.BaiRaoBan;
import model.dao.BaiRaoBanDAO;

public class BaiRaoBanBO {
	
	BaiRaoBanDAO baiRaoBanDAO= new BaiRaoBanDAO();
	public ArrayList<BaiRaoBan> layDanhSachMoiNhat()
	{	
		return baiRaoBanDAO.layDanhSachMoiNhat();
	}
	
	public ArrayList<BaiRaoBan> layDanhSachNgauNhien()
	{	
		return baiRaoBanDAO.layDanhSachNgauNhien();
	}
	
	public ArrayList<BaiRaoBan> layDanhSachDanhMucBanNhieuNhat()
	{	
		return baiRaoBanDAO.layDanhSachDanhMucBanNhieuNhat();
	}
	
	public ArrayList<BaiRaoBan> layDanhSachTimKiemTenSach(String tuKhoa)
	{	
		return baiRaoBanDAO.layDanhSachTimKiemTenSach(tuKhoa);
	}
	

	public ArrayList<BaiRaoBan> layDanhSachTimKiemTenTacGia(String tuKhoa)
	{	
		return baiRaoBanDAO.layDanhSachTimKiemTenTacGia(tuKhoa);
	}

	public ArrayList<BaiRaoBan> layDanhSachGoiY(String userID) {
		// TODO Auto-generated method stub
		return baiRaoBanDAO.layDanhSachGoiY(userID);
	}
}
