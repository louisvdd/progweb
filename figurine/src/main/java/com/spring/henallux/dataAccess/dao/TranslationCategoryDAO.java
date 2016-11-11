package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslationCategoryDAO 
{
	@Autowired
	private TranslationCategoryRepository translationCategoryRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
}
