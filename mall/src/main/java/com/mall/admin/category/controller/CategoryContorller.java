package com.mall.admin.category.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mall.admin.category.entity.CategoryList;
import com.mall.admin.category.service.CategoryService;


@Controller
@RequestMapping("category/")
public class CategoryContorller {
	
	private Logger logger = LoggerFactory.getLogger(CategoryContorller.class);
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "category", method = RequestMethod.GET)
	public String cateListPage (Model model) {
		logger.info("category LIST Page");
		ArrayList<CategoryList> categoryList = categoryService.getCategoryList();
		model.addAttribute("categoryList", categoryList);
        return "/admin/category/category";
	}
	

	@RequestMapping(value="insertCate")
	public ModelAndView cateInsertPage(){
		logger.info("category INSERT Page");
		return new ModelAndView("/admin/category/insertCate");
	}
	
	@RequestMapping(value="/admin/category/insert.ajax", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> categoryInsertAjax(
			@RequestParam("catCd") String catCd,
			@RequestParam("catNm") String catNm,
			@RequestParam("catNavYn") String catNavYn
			){
		logger.info("categoryInsertAjax");
		Map<String,Object> result = new HashMap<String,Object>();
		try {
			categoryService.insertCategory(catCd,catNm,catNavYn);
			result.put("result", "success");
		} catch (Exception e){
			e.printStackTrace();
			result.put("result", "fail");
		}
		
		return result;
	}
	

}
