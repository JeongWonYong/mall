package com.mall.admin.category.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mall.admin.category.entity.CategoryList;

@Repository
public interface CategoryDao {
	public List<CategoryList> getCategoryList();
}
