package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bo.NguoiDungBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DangKiForm;

/**
 * NguoiDungAction.java
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

public class DangKiAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		HttpSession session = request.getSession();

		
		if (session.getAttribute("userID") != null)			
			return mapping.findForward("trangchu"); // neu da dang nhap dua ve trang home.jsp
		
		
		 DangKiForm dangKiForm = (DangKiForm) form;
		
			 String taiKhoan=dangKiForm.getTaiKhoan();
			 String matKhau=dangKiForm.getMatKhau();
			 String nhapLaiMatKhau=dangKiForm.getNhapLaiMatKhau();
			 
			 String loiTaiKhoan;
			 String loiMaKhau;
			 String loiNhapLaiMatKhau;
			 
			NguoiDungBO nguoiDungBO = new NguoiDungBO();
			 
			 if(taiKhoan.length()==0)
			 {
				 dangKiForm.setLoiTaiKhoan("Tài khoản không được để trống >_<!");
				 return mapping.findForward("loi"); 
				 
			 }
			 if((matKhau.length()==0))
			 {
				 dangKiForm.setLoiMatKhau("Mật khẩu không phải là nơi để bỏ trống!");
				 return mapping.findForward("loi"); 
				 
			 }
			 if(nguoiDungBO.kiemTraTaiKhoanTonTai(taiKhoan))
			 {
				 dangKiForm.setLoiTaiKhoan("Tài khoản này đã tồn tại!");
				 return mapping.findForward("loi");
			 }
			 if(!(matKhau.equals(nhapLaiMatKhau)))
			 {
				 dangKiForm.setLoiNhapLaiMatKhau("Nhập lại mật khẩu không khớp!");
				 return mapping.findForward("loi");	 
			 }
			 nguoiDungBO.dangKi(taiKhoan, matKhau);
			 session.setAttribute("thongBao", "Đăng kí tài khoản thành công! Mời bạn đăng nhập.");
			 return mapping.findForward("thanhcong");
			 
    }

}

