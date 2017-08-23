package form;

import java.util.ArrayList;


import model.bean.DanhMuc;
import model.bean.Tinh;

import org.apache.struts.action.ActionForm;

/**
 * SinhVienForm.java
 *
 * Version 1.0
 *
 * Date: Jan 21, 2015
 *
 * Copyright 
 *
 * Modification Logs:
 * DATE                 AUTHOR          DESCRIPTION
 * -----------------------------------------------------------------------
 * Jan 21, 2015        	DaiLV2          Create
 */

public class RaoBanForm extends ActionForm{
	
	private String tenSasch;
	private String maDanhMuc;
	private ArrayList<DanhMuc> dsDanhMuc;
	private int maTinh;
	private ArrayList<Tinh> dsTinh;
	private String tenTacGia;
	private String nxb;
	private int namxb;
	private float gia;
	private String moTa;
	private String anh1;
	private String anh2;
	private String anh3;
	private String anh4;
	private String anh5;
	private String submit;
	
	
	
	public String getTenSasch() {
		return tenSasch;
	}
	public void setTenSasch(String tenSasch) {
		this.tenSasch = tenSasch;
	}
	public String getMaDanhMuc() {
		return maDanhMuc;
	}
	public void setMaDanhMuc(String maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
	public ArrayList<DanhMuc> getDsDanhMuc() {
		return dsDanhMuc;
	}
	public void setDsDanhMuc(ArrayList<DanhMuc> dsDanhMuc) {
		this.dsDanhMuc = dsDanhMuc;
	}
	public int getMaTinh() {
		return maTinh;
	}
	public void setMaTinh(int maTinh) {
		this.maTinh = maTinh;
	}
	public ArrayList<Tinh> getDsTinh() {
		return dsTinh;
	}
	public void setDsTinh(ArrayList<Tinh> dsTinh) {
		this.dsTinh = dsTinh;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public String getNxb() {
		return nxb;
	}
	public void setNxb(String nxb) {
		this.nxb = nxb;
	}
	public int getNamxb() {
		return namxb;
	}
	public void setNamxb(int namxb) {
		this.namxb = namxb;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getAnh1() {
		return anh1;
	}
	public void setAnh1(String anh1) {
		this.anh1 = anh1;
	}
	public String getAnh2() {
		return anh2;
	}
	public void setAnh2(String anh2) {
		this.anh2 = anh2;
	}
	public String getAnh3() {
		return anh3;
	}
	public void setAnh3(String anh3) {
		this.anh3 = anh3;
	}
	public String getAnh4() {
		return anh4;
	}
	public void setAnh4(String anh4) {
		this.anh4 = anh4;
	}
	public String getAnh5() {
		return anh5;
	}
	public void setAnh5(String anh5) {
		this.anh5 = anh5;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	
	
	
	
	

}

