package com.project.media4u.server.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.media4u.server.web.constants.PageNames;

@Controller
@RequestMapping("/home.htm")
public class MainController {

//	@RequestMapping(value = "/home.htm", method = RequestMethod.GET)
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getMainPage() {
		return new ModelAndView(PageNames.MAIN_PAGE);
	}

}
