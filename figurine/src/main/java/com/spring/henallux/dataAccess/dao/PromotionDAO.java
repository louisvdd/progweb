package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromotionDAO 
{
	@Autowired
	private PromotionRepository promotionRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
}
