package com.spring.henallux.dataAccess.dao;

import java.util.*;

import org.junit.experimental.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.*;

@Service
public class LanguageDAO 
{
	@Autowired
	private LanguageRepository languageRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	public Language save(Language language)
	{
		LanguageEntity languageEntity = providerConverter.languageModeltoLanguageEntity(language);
		languageEntity = languageRepository.save(languageEntity);
		return providerConverter.languageEntitytoLanguageModel(languageEntity);
	}
	
	public ArrayList<Category> getAllLanguages()
	{
		List <LanguageEntity> languageEntities = languageRepository.findAll();
		ArrayList <Language> languages = new ArrayList<>();
		for (LanguageEntity entity : LanguageEntities)
		{
			Language language = providerConverter.languageEntitytoLanguageModel(entity);
			languages.add(language);
		}
		return languages;
	}
}
