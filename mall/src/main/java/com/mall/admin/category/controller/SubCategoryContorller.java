package com.mall.admin.category.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.admin.category.service.SubCategoryService;

@Controller
@RequestMapping("category/")
public class SubCategoryContorller {
	private Logger logger = LoggerFactory.getLogger(SubCategoryContorller.class);
	
	@Autowired
	private SubCategoryService subcategoryservice;
	
	@RequestMapping("subcategory")
	public String subcateListPage (Model model) {
		logger.info("subcategory LIST Page");
		
		model.addAttribute("subcategoryList",subcategoryservice.getSubCategoryList());
        return "/admin/category/subcategory";
	}
	
}
