package com.mall.admin.category.service;

import java.util.ArrayList;

import com.mall.admin.category.entity.CategoryList;


public interface CategoryService {
	public ArrayList<CategoryList> getCategoryList();
	public void insertCategory(String catNm, String catCd, String catNavYn);
}
