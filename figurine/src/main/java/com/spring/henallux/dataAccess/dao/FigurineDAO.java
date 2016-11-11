package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FigurineDAO 
{
	@Autowired
	private FigurineRepository figurineRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
}
