package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslationFigurineDAO 
{
	@Autowired
	private TranslationFigurineRepository translationFigurineRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
}
