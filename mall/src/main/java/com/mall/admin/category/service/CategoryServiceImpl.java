package com.mall.admin.category.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mall.admin.category.entity.CategoryList;
import com.mall.admin.category.mapper.CategoryDao;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Inject
	private CategoryDao CategoryMapper;
	
	@Override
	public ArrayList<CategoryList> getCategoryList(){
		ArrayList<CategoryList> categoryList = new ArrayList<CategoryList>();
		
		return categoryList;
	}
	
	public void insertCategory(String catCd, String catNm, String catNavYn) {
		
		CategoryList catelist = new CategoryList();
		
		catelist.setCatCd(catCd);
		catelist.setCatNm(catNm);
		catelist.setCatNavYn(catNavYn);
		catelist.setInsertID("admin");
		catelist.setUpdateID("admin");
		
		CategoryMapper.insertCategory(catelist);
	}
	

}
