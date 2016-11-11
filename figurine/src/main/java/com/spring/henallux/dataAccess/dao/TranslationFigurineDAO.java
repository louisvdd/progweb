package com.spring.henallux.dataAccess.dao;

import java.util.*;

import org.junit.experimental.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.*;

@Service
public class TranslationFigurineDAO 
{
	@Autowired
	private TranslationFigurineRepository translationFigurineRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	public Category save(Category category)
	{
		CategoryEntity categoryEntity = providerConverter.categoryModeltoCategoryEntity(category);
		categoryEntity = categoryRepository.save(categoryEntity);
		return providerConverter.categoryEntitytoCategoryModel(categoryEntity);
	}
	
	public ArrayList<Category> getAllCategories()
	{
		List <CategoryEntity> categoryEntities = categoryRepository.findAll();
		ArrayList <Category> categories = new ArrayList<>();
		for (CategoryEntity entity : categoryEntities)
		{
			Category category = providerConverter.categoryEntitytoCategoryModel(entity);
			categories.add(category);
		}
		return categories;
	}
}
