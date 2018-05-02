package com.revature.servlets;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.revature.model.Bank;
import com.revature.services.RbsService;

public class RequestHelper {

	public static Object process(HttpServletRequest req) {
		switch(req.getRequestURI()) {
		case "/FrontController/thing.do":
			return RbsService.getBalance(new Bank(100, "Example"), req.getParameter("user"));
		case "/FrontController/display.do":
			return RbsService.returnArrayList();
		default:
			return RbsService.getBalance(new Bank(0, "No Balance"), req.getParameter("user"));
		}
//		System.out.println(req.getRequestURI());
//		System.out.println(req.getRequestURL());
//		return req.getRequestURI();
	}
	

}
