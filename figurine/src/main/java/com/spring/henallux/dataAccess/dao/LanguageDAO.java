package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageDAO 
{
	@Autowired
	private LanguageRepository languageRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
}
