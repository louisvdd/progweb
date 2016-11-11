package com.spring.henallux.dataAccess.dao;

import java.util.*;

import org.junit.experimental.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.util.ProviderConverter;
import com.spring.henallux.model.*;

@Service
public class UserDAO 
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProviderConverter providerConverter;
	
	public User save(User user)
	{
		UserEntity userEntity = providerConverter.userModeltoUserEntity(user);
		userEntity = userRepository.save(userEntity);
		return providerConverter.userEntitytonUserModel(userEntity);
	}
	
	public ArrayList<User> getAllUsers()
	{
		List <UserEntity> userEntities = userRepository.findAll();
		ArrayList <User> users = new ArrayList<>();
		for (UserEntity entity : userEntities)
		{
			User user = providerConverter.userEntitytonUserModel(entity);
			users.add(user);
		}
		return users;
	}
}
