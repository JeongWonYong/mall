package com.mall.admin.category.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.admin.category.service.CategoryService;


@Controller
@RequestMapping("category/")
public class CategoryContorller {
	
	private Logger logger = LoggerFactory.getLogger(CategoryContorller.class);
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("category")
	public String cateListPage (Model model) {
		logger.info("category LIST Page");
		
		model.addAttribute("categoryList",categoryService.getCategoryList());
        return "/admin/category/category";
	}

}
