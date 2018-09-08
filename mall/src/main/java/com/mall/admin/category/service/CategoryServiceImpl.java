package com.mall.admin.category.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mall.admin.category.entity.CategoryList;
import com.mall.admin.category.mapper.CategoryDao;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Inject
	private CategoryDao CategoryMapper;
	
	@Override
	public List<CategoryList> getCategoryList(){
		List<CategoryList> categoryList = new ArrayList<CategoryList>();
		
		return categoryList;
	}
	

}
