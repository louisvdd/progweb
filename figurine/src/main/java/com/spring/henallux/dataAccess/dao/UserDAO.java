package com.spring.henallux.dataAccess.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAO 
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
}
