package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.Users;
import model.bo.UsersBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ManagerForm;

/**
 * SinhVienAction.java
 * 
 * Version 1.0
 * 
 * Date: Jan 21, 2015
 * 
 * Copyright
 * 
 * Modification Logs: DATE AUTHOR DESCRIPTION
 * ----------------------------------------------------------------------- Jan
 * 21, 2015 DaiLV2 Create
 */

public class ManagerUserAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HttpSession session = request.getSession();

		
		if (session.getAttribute("userID") == null)			
			return mapping.findForward("dangnhaplai"); // neu chua dang nhap dua ve trang chu
		
		int userType = (Integer) session.getAttribute("type");
		String userID = (String) session.getAttribute("userID");
			
		if(userType==1)
				return mapping.findForward("trangcanhan");
		if(userType==2)
			return mapping.findForward("trangbichan");
		if(userType==0){
			//Bat Dau xu li
			
			//Lay thong tin ho so
			
			
			//Lay danh sach cho duyet
			//Lay danh sach dang ban
			//lay danh sach da ban
			//Lay danh sach nguoi dung
			//Lay danh sach banner
			
			return mapping.findForward("manager");
		}
		return mapping.findForward("dangnhaplai");

	}
}

