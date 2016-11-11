package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryDAO 
{
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
}
