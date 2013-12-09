package com.lakven.web;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.struts.ActionSupport;

import com.lakven.service.UserServiceIntf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends ActionSupport {

	public ActionForward execute(ActionMapping map, ActionForm form,
			HttpServletRequest req, HttpServletResponse res)

	{

		LoginForm lform = (LoginForm) form;
		String user = lform.getUserName();
		String pass = lform.getPassword();

		WebApplicationContext context = getWebApplicationContext();
		UserServiceIntf service = context.getBean(UserServiceIntf.class);

		boolean isValid = service.validateLogin(user, pass);
		if (isValid) {
			return map.findForward("success");
		} else {
			return map.findForward("failure");
		}

	}
}