package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandDAO 
{
	@Autowired
	private CommandRepository commandRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
}
