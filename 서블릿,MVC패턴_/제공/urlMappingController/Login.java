package com.study.login.web;

import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.study.common.util.CookieUtils;
import com.study.exception.BizNotFoundException;
import com.study.exception.BizPasswordNotMatchedException;

import com.study.login.vo.UserVO;
import com.study.servlet.Handler;

public class Login implements Handler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		return null;
	}
}
