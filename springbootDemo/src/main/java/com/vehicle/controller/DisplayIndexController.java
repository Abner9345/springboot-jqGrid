package com.vehicle.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.ApiOperation;

/**
  *展示静态资源
 * @author Kingde
 *
 */
@Controller
public class DisplayIndexController {
	
	private final static Logger logger = Logger.getLogger(DisplayIndexController.class);
	@Autowired
	
	@ApiOperation(value = "展示静态资源" ,  notes="展示静态资源")
	@RequestMapping(path = "/rest/fuxiaoyi/display", method = RequestMethod.GET)
	public String displayStatic() {
		logger.error("into DisplayIndexController..");
		return "index";
	}
}
