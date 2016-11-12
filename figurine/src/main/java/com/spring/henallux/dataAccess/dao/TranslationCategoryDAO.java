package com.spring.henallux.dataAccess.dao;
/*
import java.util.*;

import org.junit.experimental.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.*;

@Service
public class TranslationCategoryDAO 
{
	@Autowired
	private TranslationCategoryRepository translationCategoryRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	public TranslationCategory save(TranslationCategory translationCategory)
	{
		TranslationCategoryEntity translationCategoryEntity = providerConverter.translationCategoryModeltoTranslationCategoryEntity(translationCategory);
		translationCategoryEntity = translationCategoryRepository.save(translationCategoryEntity);
		return providerConverter.translationCategoryEntitytoTranslationCategoryModel(translationCategoryEntity);
	}
	
	public ArrayList<TranslationCategory> getAllTranslationCategories()
	{
		List <TranslationCategoryEntity> translationCategoryEntities = translationCategoryRepository.findAll();
		ArrayList <TranslationCategory> translationCategories = new ArrayList<>();
		for (TranslationCategoryEntity entity : translationCategoryEntities)
		{
			TranslationCategory translationCategory = providerConverter.translationCategoryEntitytoTranslationCategoryModel(entity);
			translationCategories.add(translationCategory);
		}
		return translationCategories;
	}
}
*/