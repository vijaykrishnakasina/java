package sample.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sample.dto.User;

@Controller
public class MulDBController {
	
	@RequestMapping(value = "/show" , method = RequestMethod.GET)
	public ModelAndView getController(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelview = new ModelAndView("showMessage");
		Map<String, Object> map = new HashMap();
		map.put("message", "Hello world");
		modelview.addAllObjects(map);
		return modelview;
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav =  new ModelAndView("login");
		mav.addObject("user", new User());
		return mav;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView putLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute User user) {
		
		System.out.print(user);
		ModelAndView mav =  new ModelAndView("login");
		mav.addObject("user", user);
		return mav;
	}
	
}
