package form;

import java.util.ArrayList;

import model.bean.NguoiDung;
import model.bean.RaoBan;
import org.apache.struts.action.ActionForm;

public class TrangQuanLiForm extends ActionForm{
	
	/**
	 * 
	 */
		private ArrayList<NguoiDung> dsNguoiDung;
		private ArrayList<NguoiDung> dsNguoiDungBiKhoa;
		private ArrayList<RaoBan> dsChoDuyet;
		private ArrayList<RaoBan> dsDangBan;
		private ArrayList<RaoBan> dsDaBan;
		
		private String maNguoiDung ;
		private int loaiNguoiDung;
		private String taiKhoan;
		private	String hoTen;
		private String tenTinh;
		private	String dienThoai;
		private String email;
		private	int gioiTinh;
		private int namSinh;
		private String anh;
		public ArrayList<NguoiDung> getDsNguoiDung() {
			return dsNguoiDung;
		}
		public void setDsNguoiDung(ArrayList<NguoiDung> dsNguoiDung) {
			this.dsNguoiDung = dsNguoiDung;
		}
		public ArrayList<NguoiDung> getDsNguoiDungBiKhoa() {
			return dsNguoiDungBiKhoa;
		}
		public void setDsNguoiDungBiKhoa(ArrayList<NguoiDung> dsNguoiDungBiKhoa) {
			this.dsNguoiDungBiKhoa = dsNguoiDungBiKhoa;
		}
		public ArrayList<RaoBan> getDsChoDuyet() {
			return dsChoDuyet;
		}
		public void setDsChoDuyet(ArrayList<RaoBan> dsChoDuyet) {
			this.dsChoDuyet = dsChoDuyet;
		}
		public ArrayList<RaoBan> getDsDangBan() {
			return dsDangBan;
		}
		public void setDsDangBan(ArrayList<RaoBan> dsDangBan) {
			this.dsDangBan = dsDangBan;
		}
		public ArrayList<RaoBan> getDsDaBan() {
			return dsDaBan;
		}
		public void setDsDaBan(ArrayList<RaoBan> dsDaBan) {
			this.dsDaBan = dsDaBan;
		}
		public String getMaNguoiDung() {
			return maNguoiDung;
		}
		public void setMaNguoiDung(String maNguoiDung) {
			this.maNguoiDung = maNguoiDung;
		}
		public int getLoaiNguoiDung() {
			return loaiNguoiDung;
		}
		public void setLoaiNguoiDung(int loaiNguoiDung) {
			this.loaiNguoiDung = loaiNguoiDung;
		}
		public String getTaiKhoan() {
			return taiKhoan;
		}
		public void setTaiKhoan(String taiKhoan) {
			this.taiKhoan = taiKhoan;
		}
		public String getHoTen() {
			return hoTen;
		}
		public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}
		public String getTenTinh() {
			return tenTinh;
		}
		public void setTenTinh(String tenTinh) {
			this.tenTinh = tenTinh;
		}
		public String getDienThoai() {
			return dienThoai;
		}
		public void setDienThoai(String dienThoai) {
			this.dienThoai = dienThoai;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getGioiTinh() {
			return gioiTinh;
		}
		public void setGioiTinh(int gioiTinh) {
			this.gioiTinh = gioiTinh;
		}
		public int getNamSinh() {
			return namSinh;
		}
		public void setNamSinh(int namSinh) {
			this.namSinh = namSinh;
		}
		public String getAnh() {
			return anh;
		}
		public void setAnh(String anh) {
			this.anh = anh;
		}
		
		
		
		
		
		
		


}
