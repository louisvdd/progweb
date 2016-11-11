package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandLineDAO 
{
	@Autowired
	private CommandLineRepository commandLineRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
}
