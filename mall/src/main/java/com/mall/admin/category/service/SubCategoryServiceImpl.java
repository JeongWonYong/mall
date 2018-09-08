package com.mall.admin.category.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import com.mall.admin.category.entity.SubCategoryList;
import com.mall.admin.category.mapper.SubCategoryDao;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
	@Inject
	private SubCategoryDao SubCategoryMapper;
	
	@Override
	public List<SubCategoryList> getSubCategoryList(){
		List<SubCategoryList> subcategoryList = new ArrayList<SubCategoryList>();
		
		return subcategoryList;
	}
}
