package com.github.ebnew.ki4so.client.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.ebnew.ki4so.app.custom.Ki4soAppClientHandlerImpl;

@Controller
public class HomeAction {
	
	@RequestMapping("home")
	public ModelAndView home(HttpServletRequest request, HttpSession session){
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", session.getAttribute(Ki4soAppClientHandlerImpl.USER_KEY));
		
		return mv;
	}

}
