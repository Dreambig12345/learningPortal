package com.dreambig.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dreambig.model.Project;
import com.dreambig.model.User;
import com.dreambig.service.ProjectService;
import com.dreambig.service.UserService;

@Controller
public class InternalController {
	
	
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="referral/internalreferral", method = RequestMethod.GET)
	public ModelAndView viewAllProjects(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("listofProject", projectService.viewAllProjects());
		modelAndView.setViewName("referral/internalreferral");
		return modelAndView;
	}

}
